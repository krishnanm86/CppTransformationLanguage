package de.sepl.cs.unifrankfurt.transformationlanguage;

import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.NullLogService;
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
	protected static final IParserLogService NULL_LOG = new NullLogService();
	private IASTNode selectedNode = null;
	private static IASTTranslationUnit ast = null;

	public transLangRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
	}

	@Override
	protected RefactoringDescriptor getRefactoringDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		return super.checkInitialConditions(pm);
	}

	@Override
	protected void collectModifications(IProgressMonitor pm, ModificationCollector collector)
			throws CoreException, OperationCanceledException {
		ast = getAST(getTranslationUnit(), pm);
		selectedNode = ast.getNodeSelector(null).findNode(selectedRegion.getOffset(), selectedRegion.getLength());
		try {
			SearchAlgorithm.search(selectedNode, ast, collector.rewriterForTranslationUnit(ast));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
