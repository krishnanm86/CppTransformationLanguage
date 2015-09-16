package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorStatement;
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


@SuppressWarnings("restriction")
public class transLangRefactoring extends CRefactoring {
	private Log logger = LogFactory.getLog(getClass());
	private List<Integer> forLoopLineNos = new ArrayList<Integer>();

	public transLangRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
		// TODO Auto-generated constructor stub
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
		for (IASTPreprocessorStatement stat : ast.getAllPreprocessorStatements()) {
			if (stat instanceof IASTPreprocessorPragmaStatement) {
				String[] messages = ((IASTPreprocessorPragmaStatement) stat).getRawSignature().split(" ");
				logger.info("Preprocessor message : " + ((IASTPreprocessorPragmaStatement) stat).getRawSignature());
				if (messages[1].equalsIgnoreCase("vectorizeloop")) {
					try {
						forLoopLineNos.add(stat.getFileLocation().getStartingLineNumber());
					} catch (Exception e) {
						logger.error("Pragma cannot be processed. Please supply number after #pragma vectorizeLoop");
					}
				}
				ast.accept(new LoopVectorizeVisitor(forLoopLineNos, collector.rewriterForTranslationUnit(ast), editGroup));
			}
		}
	}

}
