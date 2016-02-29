package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
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
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.NullLogService;
import org.eclipse.cdt.core.parser.util.ASTPrinter;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTForStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.cdt.internal.ui.refactoring.CRefactoring;
import org.eclipse.cdt.internal.ui.refactoring.ModificationCollector;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class transLangRefactoring extends CRefactoring {
	private static List<Class<?>> tempRules = new ArrayList<Class<?>>();
	private static Map<TTlExpression, TTlExpression> rules = new HashMap<TTlExpression, TTlExpression>();
	private static Set<IASTNode> touchedNodes = new HashSet<IASTNode>();
	protected static final IParserLogService NULL_LOG = new NullLogService();
	private IASTNode selectedNode = null;
	private static Queue<IASTNode> workQueue = new LinkedList<IASTNode>();
	private static IASTTranslationUnit ast = null;

	public transLangRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
	}

	private static void populateRules() {
		TTlExpression ttlPattern = new TTlExpression(
				"for(int _tti_ = 0 ; _ttli_ < _ttllimit_; _ttli_++ ) {__ttla__;  }", NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"for(int _tti_ = 0 ; _ttli_ < _ttllimit_/float_v::size; _ttli_++ ) {__ttla__;  }", NodeType.Statement);
		rules.put(ttlPattern, ttlConstructExpression);
	}

	@Override
	protected RefactoringDescriptor getRefactoringDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	private void populateTempRules() {
		tempRules.add(CPPASTForStatement.class);
	}

	private static List<IASTNode> createEnclosingNode(IASTNode node) throws Exception {
		List<IASTNode> returnNode = new ArrayList<IASTNode>();
		IASTNode enclosingNode = node;
		while (!(enclosingNode instanceof IASTTranslationUnit || enclosingNode == null
				|| enclosingNode.getParent() == null)) {
			enclosingNode = enclosingNode.getParent();
			if (ruleApplicable(enclosingNode) != null) {
				returnNode.add(enclosingNode);
				return returnNode;
			}
		}
		enclosingNode = node;
		if (enclosingNode instanceof CPPASTSimpleDeclaration
				&& ((CPPASTSimpleDeclaration) enclosingNode).getDeclSpecifier() instanceof CPPASTNamedTypeSpecifier) {
			IASTName name = ((CPPASTNamedTypeSpecifier) ((CPPASTSimpleDeclaration) enclosingNode).getDeclSpecifier())
					.getName();
			returnNode.add(TransformationUtils.getDefns(name));
			returnNode.add(enclosingNode);
		}
		return returnNode;
	}

	private static TTlExpression ruleApplicable(IASTNode enclosingNode) throws Exception {
		for (TTlExpression rule : rules.keySet()) {
			if (TTLUtils.checkType(rule.type, enclosingNode)) {
				TTlExpression ttlFragmentToMatch = new TTlExpression(enclosingNode.getRawSignature(), rule.type);
				if (TTLUtils.match(rule, ttlFragmentToMatch).size() > 0) {
					return rule;
				}
			}

		}
		/*
		 * for (Class<?> cls : tempRules) { if
		 * (enclosingNode.getClass().equals(cls)) { return true; } }
		 */
		return null;
	}

	@Override
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		ast = getAST(getTranslationUnit(), pm);
		selectedNode = ast.getNodeSelector(null).findNode(selectedRegion.getOffset(), selectedRegion.getLength());
		populateTempRules();
		populateRules();
		try {
			workQueue.add(selectedNode);
			search(selectedNode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.checkInitialConditions(pm);
	}

	private static List<IASTNode> getDependencies(IASTNode selectedNode, boolean addDefns) {
		List<IASTNode> dependencies = new ArrayList<IASTNode>();
		selectedNode.accept(new NameVisitor());
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

	private static void search(IASTNode selectedNode) throws Exception {
		touchedNodes.add(selectedNode);
		if (ruleApplicable(selectedNode) != null) {
			// apply rule on selectedNode
			TTlExpression ttlPattern = ruleApplicable(selectedNode);
			Map<String, List<IASTNode>> holeMap = TTLUtils.match(ttlPattern,
					new TTlExpression(selectedNode.getRawSignature(), ttlPattern.type));
			TTLUtils.printHoleMap(holeMap);
			TTlExpression ttlConstructExpression = rules.get(ttlPattern);
			IASTNode construct = TTLUtils.construct(holeMap, ttlConstructExpression);
			ASTPrinter.print(construct);
			System.out.println(construct.getRawSignature());
			workQueue.remove(selectedNode);
			if (!touchedNodes.contains(selectedNode)) {
				workQueue.addAll(getDependencies(selectedNode, true));
			}
		} else {
			List<IASTNode> enclosingNode = createEnclosingNode(selectedNode);
			// apply rule on enclosing node
			if (!touchedNodes.contains(selectedNode)) {
				workQueue.addAll(getDependencies(selectedNode, false));
			}
			for (IASTNode node : enclosingNode) {
				workQueue.remove(node);
				// workQueue.addAll(getDependencies(node));
			}
		}
		if (!workQueue.isEmpty()) {
			IASTNode unresolved = workQueue.remove();
			search(unresolved);
		}
	}

	@Override
	protected void collectModifications(IProgressMonitor pm, ModificationCollector collector)
			throws CoreException, OperationCanceledException {

	}

}
