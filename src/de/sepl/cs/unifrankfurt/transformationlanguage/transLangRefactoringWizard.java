package de.sepl.cs.unifrankfurt.transformationlanguage;

import org.eclipse.cdt.internal.ui.refactoring.CRefactoring;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

@SuppressWarnings({ "unused", "restriction" })
public class transLangRefactoringWizard extends RefactoringWizard {

	public transLangRefactoringWizard(CRefactoring refactoring) {
		super(refactoring, RefactoringWizard.NONE);
	}

	@Override
	protected void addUserInputPages() {

	}

}
