package de.sepl.cs.unifrankfurt.transformationlanguage;

import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.internal.ui.refactoring.RefactoringRunner;
import org.eclipse.cdt.internal.ui.refactoring.RefactoringSaveHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.IShellProvider;

@SuppressWarnings("restriction")
public class transLangRefactoringRunner extends RefactoringRunner {

	public transLangRefactoringRunner(ICElement element, ISelection selection, IShellProvider provider,
			ICProject cProject) {
		super(element, selection, provider, cProject);
	}

	@Override
	public void run() {
		TTLRefactoring refactoring = new TTLRefactoring(element, selection, project);
		transLangRefactoringWizard wizard = new transLangRefactoringWizard(refactoring);
		run(wizard, refactoring, RefactoringSaveHelper.SAVE_REFACTORING);
	}

}
