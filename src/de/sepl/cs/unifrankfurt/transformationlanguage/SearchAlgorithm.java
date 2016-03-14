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

import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class SearchAlgorithm {

	private static final Map<List<IASTNode>, TTlRule> AppliedRules = new HashMap<List<IASTNode>, TTlRule>();
	private static Set<TTlRule> rules = new HashSet<TTlRule>();
	private static Queue<IASTNode> workQueue = new LinkedList<IASTNode>();
	private static NameVisitor visitor = new NameVisitor();
	private static IASTTranslationUnit ast;
	private static ASTRewrite astRewrite;

	private static void populateRules() throws Exception {
		rules = new HashSet<TTlRule>();
		TTlExpression ttlPattern = new TTlExpression("for(int i = 0 ; i < __ttllimit__; __ttli__++ ) {__ttla__;  }",
				NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"for(int __ttli__ = 0 ; __ttli__ < __ttllimit__/float_v::size; __ttli__++ ) {__ttla__;  }",
				NodeType.Statement);
		TTlExpression ttlPattern1 = new TTlExpression(
				"struct __ttlstructname__ { float __ttla__;} __ttlaobj__[__ttllimit__];", NodeType.DeclDefn);
		TTlExpression ttlConstructExpression1 = new TTlExpression(
				"struct __ttlstructname___v { float_v __ttla___v;} __ttlaobj___v[__ttllimit__/float_v::size];",
				NodeType.DeclDefn);
		rules.add(new TTlRule(ttlPattern, ttlConstructExpression, NodeType.Statement));
		rules.add(new TTlRule(ttlPattern1, ttlConstructExpression1, NodeType.DeclDefn));
	}

	public static void search(IASTNode selectedNode, IASTTranslationUnit ast, ASTRewrite astRewrite) throws Exception {
		SearchAlgorithm.ast = ast;
		SearchAlgorithm.astRewrite = astRewrite;
		populateRules();
		visitor = new NameVisitor();
		List<IASTNode> selectedNodeAsList = new ArrayList<IASTNode>(Arrays.asList(selectedNode));
		searchBlock(selectedNodeAsList);
	}

	private static void searchBlock(List<IASTNode> selectedNodeAsList) throws Exception {
		TTlRule rule = ruleApplicable(selectedNodeAsList);
		if (rule != null) {
			if (!isNodeHandled(selectedNodeAsList)) {
				workQueueBlock(rule, selectedNodeAsList);
			}
		} else {
			List<IASTNode> enclosingNode = getEnclosingNode(selectedNodeAsList);
			TTlRule ruleForEnclosingNode = ruleApplicable(enclosingNode);
			if (!isNodeHandled(enclosingNode)) {
				workQueueBlock(ruleForEnclosingNode, enclosingNode);
			}
		}
		if (!workQueue.isEmpty()) {
			IASTNode unresolved = workQueue.remove();
			searchBlock(new ArrayList<IASTNode>(Arrays.asList(unresolved)));
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

	private static void workQueueBlock(TTlRule rule, List<IASTNode> selectedNodeAsList) throws Exception {
		if (applyRule(rule, selectedNodeAsList) && rule != null) {
			AppliedRules.put(selectedNodeAsList, rule);
		}
		workQueue.addAll(getDependencies(selectedNodeAsList, true));
		for (IASTNode selectedNode : selectedNodeAsList) {
			workQueue.remove(selectedNode);
		}
	}

	private static boolean isNodeHandled(List<IASTNode> node) {
		Set<Object> set1 = new HashSet<Object>();
		set1.addAll(node);
		for (List<IASTNode> node2 : AppliedRules.keySet()) {
			Set<Object> set2 = new HashSet<Object>();
			set2.addAll(node2);
			if (set1.equals(set2)) {
				return true;
			}
		}
		return false;
	}

	private static boolean applyRule(TTlRule rule, List<IASTNode> selectedNodeAsList) throws Exception {
		// TODO: Make rule apply properly and perform the transformation
		System.out.println("applying rule to ");
		for (IASTNode node : selectedNodeAsList) {
			System.out.println(node.getRawSignature());
		}
		if (selectedNodeAsList.size() == 1) {
			TTlExpression ttlPattern = rule.lhs;
			TTlExpression ttlFragmentToMatch = new TTlExpression(selectedNodeAsList.get(0).getRawSignature(),
					rule.type);
			Map<String, List<IASTNode>> holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
			TTlExpression ttlConstructExpression = rule.rhs;
			IASTNode nodeToReplace = TTLUtils.construct(holeMap, ttlConstructExpression);
			astRewrite.replace(selectedNodeAsList.get(0), nodeToReplace, new TextEditGroup("API Migration"));
		}
		else
		{	
			String ruleLhsString = rule.lhs.nodeWithHoles;
			String strLhs[] = ruleLhsString.split("}");
			
			String ruleRhsString = rule.rhs.nodeWithHoles;
			String strRhs[] = ruleRhsString.split("}");
			
			//Apply rule for definition
			String definitionRule = strLhs[0] + "}";
			IASTNode definitionNode = getDefinition(selectedNodeAsList);
			Map<String, List<IASTNode>> definitionMatch = new HashMap<String, List<IASTNode>>();

			if (definitionNode != null) {
				definitionMatch = TTLUtils.match(new TTlExpression(definitionRule, NodeType.DeclSpecifier),
						new TTlExpression(definitionNode.getRawSignature(), NodeType.DeclSpecifier));
				TTlExpression ttlConstructExpression = new TTlExpression(strRhs[0] + "}", NodeType.DeclSpecifier);
				IASTNode nodeToReplace = TTLUtils.construct(definitionMatch, ttlConstructExpression);
				astRewrite.replace(definitionNode, nodeToReplace, new TextEditGroup("API Migration"));
			}

			//Apply rule for declaration
			String declarationRule = "__ttltype__ " + strLhs[1];
			IASTNode declarationNode = getDeclaration(selectedNodeAsList);
			Map<String, List<IASTNode>> declarationMatch = new HashMap<String, List<IASTNode>>();

			if (declarationNode != null) {
				declarationMatch = TTLUtils.match(new TTlExpression(declarationRule, NodeType.Declaration),
						new TTlExpression(declarationNode.getRawSignature(), NodeType.Declaration));
				TTlExpression ttlConstructExpression = new TTlExpression("new___ttltype__ " + strRhs[1], NodeType.Declaration);
				IASTNode nodeToReplace = TTLUtils.construct(declarationMatch, ttlConstructExpression);
				astRewrite.replace(declarationNode, nodeToReplace, new TextEditGroup("API Migration"));
			}
		}
		return true;
	}

	private static TTlRule ruleApplicable(List<IASTNode> selectedNodeAsList) throws Exception {
		if (selectedNodeAsList.size() == 1) {
			return ruleApplicableSingleNode(selectedNodeAsList.get(0));
		} else {
			// only case decl definition
			return ruleApplicationEnclosingNode(selectedNodeAsList);
		}
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

	private static TTlRule ruleApplicationEnclosingNode(List<IASTNode> selectedNodeAsList) throws Exception {
		for (TTlRule rule : rules) {
			if (rule.type == NodeType.DeclDefn) {
				String ruleString = rule.lhs.nodeWithHoles;
				String str[] = ruleString.split("}");

				// Match Definition
				String definitionRule = str[0] + "}";
				IASTNode definitionNode = getDefinition(selectedNodeAsList);
				Map<String, List<IASTNode>> definitionMatch = new HashMap<String, List<IASTNode>>();

				if (definitionNode != null) {
					definitionMatch = TTLUtils.match(new TTlExpression(definitionRule, NodeType.DeclSpecifier),
							new TTlExpression(definitionNode.getRawSignature(), NodeType.DeclSpecifier));
				}
				// Match Definition
				String declarationRule = "__ttltype__ " + str[1];
				IASTNode declarationNode = getDeclaration(selectedNodeAsList);
				Map<String, List<IASTNode>> declarationMatch = new HashMap<String, List<IASTNode>>();
				if (declarationNode != null) {
					declarationMatch = TTLUtils.match(new TTlExpression(declarationRule, NodeType.Declaration),
							new TTlExpression(declarationNode.getRawSignature(), NodeType.Declaration));
				}

				if (definitionMatch.size() > 0 && declarationMatch.size() > 0)
					return rule;
			}
		}
		return null;
	}

	private static IASTNode getDeclaration(List<IASTNode> selectedNodeAsList) {
		for (IASTNode node : selectedNodeAsList) {
			if (node instanceof IASTDeclaration) {
				return node;
			}
		}
		return null;
	}

	private static IASTNode getDefinition(List<IASTNode> selectedNodeAsList) {
		for (IASTNode node : selectedNodeAsList) {
			if (node instanceof IASTCompositeTypeSpecifier) {
				return node;
			}
		}
		return null;
	}

	private static List<IASTNode> getDependencies(List<IASTNode> selectedNodeAsList, boolean addDefns) {
		List<IASTNode> dependencies = new ArrayList<IASTNode>();
		for (IASTNode selectedNode : selectedNodeAsList) {
			selectedNode.accept(visitor);
			for (IASTName objectref : visitor.getObjectrefs()) {
				if (!visitor.visitedNames.contains(objectref)) {
					for (IASTNode use : TransformationUtils.getUses(objectref, ast)) {
						dependencies.add(use);
					}
					visitor.visitedNames.add(objectref);
				}
			}
			if (addDefns) {
				if (!(selectedNode instanceof CPPASTCompositeTypeSpecifier)) {
					for (IASTName typeref : visitor.getTyperefs()) {
						if (!visitor.visitedNames.contains(typeref)) {
							dependencies.add(TransformationUtils.getDefns(typeref));
							visitor.visitedNames.add(typeref);
						}
					}
				}
			}
		}
		return dependencies;
	}

}
