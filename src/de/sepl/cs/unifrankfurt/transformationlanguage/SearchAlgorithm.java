package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class SearchAlgorithm {

	private static final Map<List<IASTNode>, TTlRule> AppliedRules = new HashMap<List<IASTNode>, TTlRule>();
	private static Set<TTlRule> rules = new HashSet<TTlRule>();
	private static Queue<IASTNode> workQueue = new LinkedList<IASTNode>();
	private static NameVisitor visitor = new NameVisitor();
	private static IASTTranslationUnit ast;
	
	private static void populateRules() throws Exception {
		rules = new HashSet<TTlRule>();
		TTlExpression ttlPattern = new TTlExpression(
				"for(int _tti_ = 0 ; _ttli_ < _ttllimit_; _ttli_++ ) {__ttla__;  }", NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"for(int _tti_ = 0 ; _ttli_ < _ttllimit_/float_v::size; _ttli_++ ) {__ttla__;  }", NodeType.Statement);
		rules.add(new TTlRule(ttlPattern, ttlConstructExpression, NodeType.Statement));
	}

	public static void search(IASTNode selectedNode, IASTTranslationUnit ast) throws Exception {
		SearchAlgorithm.ast = ast;
		populateRules();
		visitor = new NameVisitor();
		List<IASTNode> selectedNodeAsList = new ArrayList<IASTNode>(Arrays.asList(selectedNode));
		searchBlock(selectedNodeAsList);
	}

	private static void searchBlock(List<IASTNode> selectedNodeAsList) throws Exception {
		TTlRule rule = ruleApplicable(selectedNodeAsList);
		if (rule != null) {
			workQueueBlock(rule, selectedNodeAsList);
		} else {
			List<IASTNode> enclosingNode = getEnclosingNode(selectedNodeAsList);
			TTlRule ruleForEnclosingNode = ruleApplicable(selectedNodeAsList);
			if (ruleForEnclosingNode != null) {
				workQueueBlock(ruleForEnclosingNode, enclosingNode);
			}
		}
		if (!workQueue.isEmpty()) {
			IASTNode unresolved = workQueue.remove();
			search(unresolved, ast);
		}
	}

	private static List<IASTNode> getEnclosingNode(List<IASTNode> selectedNodeAsList) throws Exception {
		if (selectedNodeAsList.size() == 1) {
			List<IASTNode> returnNode = new ArrayList<IASTNode>();
			IASTNode enclosingNode = selectedNodeAsList.get(0);
			while (!(enclosingNode instanceof IASTTranslationUnit || enclosingNode == null
					|| enclosingNode.getParent() == null)) {
				enclosingNode = enclosingNode.getParent();
				if (ruleApplicableSingleNode(enclosingNode) != null) {
					returnNode.add(enclosingNode);
					return returnNode;
				}
			}
			enclosingNode = selectedNodeAsList.get(0);
			;
			if (enclosingNode instanceof CPPASTSimpleDeclaration && ((CPPASTSimpleDeclaration) enclosingNode)
					.getDeclSpecifier() instanceof CPPASTNamedTypeSpecifier) {
				IASTName name = ((CPPASTNamedTypeSpecifier) ((CPPASTSimpleDeclaration) enclosingNode)
						.getDeclSpecifier()).getName();
				returnNode.add(TransformationUtils.getDefns(name));
				returnNode.add(enclosingNode);
			}
			return returnNode;
		} else {
			// TODO: Handle case where selected node is an already compound
			// node.
		}
		return null;
	}

	private static void workQueueBlock(TTlRule rule, List<IASTNode> selectedNodeAsList) {
		if (applyRule(rule, selectedNodeAsList)) {
			AppliedRules.put(selectedNodeAsList, rule);
			
		}
	}

	private static boolean applyRule(TTlRule rule, List<IASTNode> selectedNodeAsList) {
		// TODO Auto-generated method stub
		return false;
	}

	private static TTlRule ruleApplicable(List<IASTNode> selectedNodeAsList) throws Exception {
		if (selectedNodeAsList.size() == 1) {
			ruleApplicableSingleNode(selectedNodeAsList.get(0));
		} else {
			// TODO: Handle the case when its a enclosing Node
		}
		return null;
	}

	private static TTlRule ruleApplicableSingleNode(IASTNode selectedNode) throws Exception {
		for (TTlRule rule : rules) {
			if (TTLUtils.checkType(rule.type, selectedNode)) {
				TTlExpression ttlFragmentToMatch = new TTlExpression(selectedNode.getRawSignature(), rule.type);
				if (TTLUtils.match(rule.lhs, ttlFragmentToMatch).size() > 0) {
					return rule;
				}
			}
		}
		return null;
	}
	
	private static List<IASTNode> getDependencies(IASTNode selectedNode, boolean addDefns) {
		List<IASTNode> dependencies = new ArrayList<IASTNode>();
		selectedNode.accept(visitor);
		for (IASTName objectref : NameVisitor.getObjectrefs()) {
			for (IASTNode use : TransformationUtils.getUses(objectref, ast)) {
				dependencies.add(use);
			}
		}
		if (addDefns) {
			if (!(selectedNode instanceof CPPASTCompositeTypeSpecifier)) {
				for (IASTName typeref : NameVisitor.getTyperefs()) {
					dependencies.add(TransformationUtils.getDefns(typeref));

				}
			}
		}
		return dependencies;
	}

}
