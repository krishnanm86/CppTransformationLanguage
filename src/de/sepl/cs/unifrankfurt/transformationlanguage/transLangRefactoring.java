package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBaseDeclSpecifier;
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
	// private List<Integer> forLoopLineNos = new ArrayList<Integer>();
	private IASTNode selectedNode = null;
	private static Map<String, CPPASTBaseDeclSpecifier> typeDefinitionTransformations;
	private static List<IASTNode> workQueue = new ArrayList<IASTNode>();

	public transLangRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
		typeDefinitionTransformations = new HashMap<String, CPPASTBaseDeclSpecifier>();
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
		// processSelectedNode(selectedNode, pm);
		
		selectedNode.accept(new NameVisitor());
		System.out.println("Object Refs");
		for (IASTName objectref : NameVisitor.getObjectrefs()) {
			System.out.println(objectref.getRawSignature());
			System.out.println("Uses");
			for (IASTNode use : TransformationUtils.getUses(objectref, getAST(tu, pm))) {
				System.out.println(use.getRawSignature());
			}
			System.out.println("Defn");
			System.out.println(TransformationUtils.getDefns(objectref).getRawSignature());
		}
		System.out.println("Type Refs");
		for (IASTName typeref : NameVisitor.getTyperefs()) {
			System.out.println(typeref.getRawSignature());
			System.out.println("Defn");
			System.out.println(TransformationUtils.getDefns(typeref).getRawSignature());

		}
		return super.checkInitialConditions(pm);
	}

	@Override
	protected void collectModifications(IProgressMonitor pm, ModificationCollector collector)
			throws CoreException, OperationCanceledException {
		final TextEditGroup editGroup = new TextEditGroup("Api Refactoring final modifications");
		IASTTranslationUnit ast = getAST(tu, pm);
		// ast.accept(new TTLVisitor(typeDefinitionTransformations,
		// collector.rewriterForTranslationUnit(ast), editGroup));
		/*
		 * for (IASTPreprocessorStatement stat :
		 * ast.getAllPreprocessorStatements()) { if (stat instanceof
		 * IASTPreprocessorPragmaStatement) { String[] messages =
		 * ((IASTPreprocessorPragmaStatement) stat).getRawSignature().split(" "
		 * ); logger.info("Preprocessor message : " +
		 * ((IASTPreprocessorPragmaStatement) stat).getRawSignature()); if
		 * (messages[1].equalsIgnoreCase("vectorizeloop")) { try {
		 * forLoopLineNos.add(stat.getFileLocation().getStartingLineNumber()); }
		 * catch (Exception e) { logger.error(
		 * "Pragma cannot be processed. Please supply number after #pragma vectorizeLoop"
		 * ); } } ast.accept( new LoopVectorizeVisitor(forLoopLineNos,
		 * collector.rewriterForTranslationUnit(ast), editGroup)); } }
		 */
	}

}
