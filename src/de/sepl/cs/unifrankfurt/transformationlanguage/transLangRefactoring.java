package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.NullLogService;
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

@SuppressWarnings("restriction")
public class transLangRefactoring extends CRefactoring {
	private static List<Class<?>> tempRules = new ArrayList<Class<?>>();
	protected static final IParserLogService NULL_LOG = new NullLogService();
	private IASTNode selectedNode = null;
	private static Queue<IASTNode> workQueue = new LinkedList<IASTNode>();
	private static IASTTranslationUnit ast = null;

	public transLangRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
	}

	@Override
	protected RefactoringDescriptor getRefactoringDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	private void populateTempRules() {
		tempRules.add(CPPASTForStatement.class);
	}

	private static List<IASTNode> createEnclosingNode(IASTNode node) {
		List<IASTNode> returnNode = new ArrayList<IASTNode>();
		IASTNode enclosingNode = node;
		while (!(enclosingNode instanceof IASTTranslationUnit)) {
			enclosingNode = enclosingNode.getParent();
			if (ruleApplicable(enclosingNode)) {
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

	private static boolean ruleApplicable(IASTNode enclosingNode) {
		for (Class<?> cls : tempRules) {
			if (enclosingNode.getClass().equals(cls)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		ast = getAST(getTranslationUnit(), pm);
		selectedNode = ast.getNodeSelector(null).findNode(selectedRegion.getOffset(), selectedRegion.getLength());
		populateTempRules();
		search(selectedNode);
		return super.checkInitialConditions(pm);
	}

	private static List<IASTNode> getDependencies(IASTNode selectedNode) {
		List<IASTNode> dependencies = new ArrayList<IASTNode>();
		selectedNode.accept(new NameVisitor());
		for (IASTName objectref : NameVisitor.getObjectrefs()) {
			for (IASTNode use : TransformationUtils.getUses(objectref, ast)) {
				dependencies.add(use);
			}
		}
		for (IASTName typeref : NameVisitor.getTyperefs()) {
			dependencies.add(TransformationUtils.getDefns(typeref));

		}
		return dependencies;
	}

	private static void search(IASTNode selectedNode) {
		workQueue.add(selectedNode);
		if (ruleApplicable(selectedNode)) {
			// apply rule
			workQueue.remove(selectedNode);
			workQueue.addAll(getDependencies(selectedNode));
		} else {
			List<IASTNode> enclosingNode = createEnclosingNode(selectedNode);
			// apply rule on enclosing node
			for (IASTNode node : enclosingNode) {
				workQueue.remove(node);
				workQueue.addAll(getDependencies(node));
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
