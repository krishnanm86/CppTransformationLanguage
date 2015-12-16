package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.internal.ui.refactoring.CRefactoring;
import org.eclipse.cdt.internal.ui.refactoring.ModificationCollector;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class TTLRefactoring extends CRefactoring {

	static Map<TTlExpression, TTlExpression> ttlRule = new HashMap<TTlExpression, TTlExpression>();

	public TTLRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
		TTlExpression ttlFragmentToMatch = new TTlExpression(
				"for(int i = 0 ; i < 10; i++ ) {__ttla__;fnd();__ttlc__;}", NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"while(x < 10) {__ttlc__; __ttla__; fnd();}", NodeType.Statement);
		ttlRule.put(ttlFragmentToMatch, ttlConstructExpression);
	}

	@Override
	protected RefactoringDescriptor getRefactoringDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void collectModifications(IProgressMonitor pm, ModificationCollector collector)
			throws CoreException, OperationCanceledException {
		final TextEditGroup editGroup = new TextEditGroup("Api Refactoring final modifications");
		IASTTranslationUnit ast = getAST(tu, pm);
		ast.accept(new TTLRuleApplicator(ttlRule, collector.rewriterForTranslationUnit(ast), editGroup));

	}

}
