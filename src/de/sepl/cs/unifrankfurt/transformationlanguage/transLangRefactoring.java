package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNamedTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.IBinding;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTArrayDeclarator;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBaseDeclSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTClassVirtSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
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
	// private List<Integer> forLoopLineNos = new ArrayList<Integer>();
	private IASTNode selectedNode = null;
	private static Map<String, CPPASTBaseDeclSpecifier> typeDefinitionTransformations;

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
		processSelectedNode(selectedNode, pm);
		return super.checkInitialConditions(pm);
	}

	private void processSelectedNode(IASTNode selectedNode, IProgressMonitor pm)
			throws OperationCanceledException, CoreException {
		System.out.println(selectedNode.getClass().getName());
		System.out.println(selectedNode.getRawSignature());
		if (selectedNode instanceof IASTExpression) {
			System.out.println("Selected node is an expression ");
		} else if (selectedNode instanceof IASTDeclaration) {
			System.out.println("Selected node is a declaration ");
			getDefinition((CPPASTSimpleDeclaration) selectedNode);
			getUses((CPPASTSimpleDeclaration) selectedNode, pm);
		} else if (selectedNode instanceof IASTStatement) {
			System.out.println("Selected node is a statement");
		}

	}

	private void getUses(CPPASTSimpleDeclaration selectedNode, IProgressMonitor pm)
			throws OperationCanceledException, CoreException {
		for (IASTDeclarator declrtr : selectedNode.getDeclarators()) {
			if (declrtr instanceof CPPASTArrayDeclarator) {
				IASTName arrayName = ((CPPASTArrayDeclarator) declrtr).getName();
				IBinding binding = arrayName.getBinding();
				if (binding instanceof CPPVariable) {
					System.out.println(((CPPVariable) binding).toString());
					for (IASTName name : getAST(getTranslationUnit(), pm).getReferences(binding)) {
						System.out.println("loc " + name.getFileLocation().getNodeOffset() + " " + name.toString());
						System.out.println(name.getParent().getParent().getRawSignature());
					}
				}
			}
		}
	}

	private void getDefinition(CPPASTSimpleDeclaration selectedNode) {
		if (selectedNode.getDeclSpecifier() instanceof IASTNamedTypeSpecifier) {
			IASTName typeName = ((IASTNamedTypeSpecifier) selectedNode.getDeclSpecifier()).getName();
			if (typeName instanceof IASTName) {
				System.out.println("Resolving  Bindings");
				IBinding nameBinding = ((IASTName) typeName).getBinding();
				System.out.println(nameBinding.getClass().getName());
				if (nameBinding instanceof CPPClassType) {
					System.out.println(((CPPClassType) nameBinding).getDefinition().getParent().getRawSignature());
				}
			}
		}
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
