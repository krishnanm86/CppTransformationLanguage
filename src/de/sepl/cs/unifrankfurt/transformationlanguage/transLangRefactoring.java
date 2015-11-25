package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorStatement;
import org.eclipse.cdt.core.dom.ast.IASTSimpleDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.IBinding;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.parser.util.ASTPrinter;
import org.eclipse.cdt.internal.core.dom.parser.IASTAmbiguityParent;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPArrayType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPVariable;
import org.eclipse.cdt.internal.ui.refactoring.CRefactoring;
import org.eclipse.cdt.internal.ui.refactoring.ModificationCollector;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.text.edits.TextEditGroup;

@SuppressWarnings("restriction")
public class transLangRefactoring extends CRefactoring {
	private Log logger = LogFactory.getLog(getClass());
	private List<Integer> forLoopLineNos = new ArrayList<Integer>();
	private IASTNode selectedNode = null;

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
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		selectedNode = getAST(getTranslationUnit(), pm).getNodeSelector(null).findNode(selectedRegion.getOffset(),
				selectedRegion.getLength());
		/*
		 * System.out.println(selectedNode.getClass().getName()); if
		 * (selectedNode instanceof IASTSimpleDeclaration) { if
		 * (selectedNode.getChildren()[0] instanceof
		 * CPPASTCompositeTypeSpecifier) { CPPASTCompositeTypeSpecifier type =
		 * (CPPASTCompositeTypeSpecifier) selectedNode.getChildren()[0];
		 * CPPASTCompositeTypeSpecifier newType =
		 * TTLUtils.transformTypeUsingFilter(type, TTLUtils.getDummyFilter());
		 * if (selectedNode instanceof IASTAmbiguityParent) {
		 * ((IASTAmbiguityParent) selectedNode).replace(type, newType); } } }
		 */
		ASTPrinter.print(getAST(getTranslationUnit(), pm));
		if (selectedNode instanceof IASTName) {
			System.out.println("Resolving  Bindings");
			IBinding nameBinding = ((IASTName) selectedNode).getBinding();
			for (IASTName name : getAST(getTranslationUnit(), pm).getReferences(nameBinding)) {
				System.out.println("loc " + name.getFileLocation().getNodeOffset() + " " + name.toString());
			}
			if (nameBinding instanceof CPPVariable) {
				CPPVariable varBinding = (CPPVariable) nameBinding;
				if (varBinding.getType() instanceof CPPArrayType) {
					CPPArrayType arrTypeOfVar = (CPPArrayType) varBinding.getType();
					if (arrTypeOfVar.getType() instanceof CPPClassType) {
						CPPClassType typeOfVar = (CPPClassType) arrTypeOfVar.getType();
						System.out.println(typeOfVar.getDefinition().getParent().getClass().getName());
					}
				}
			}
		}
		return super.checkInitialConditions(pm);
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
				ast.accept(
						new LoopVectorizeVisitor(forLoopLineNos, collector.rewriterForTranslationUnit(ast), editGroup));
			}
		}
	}

}
