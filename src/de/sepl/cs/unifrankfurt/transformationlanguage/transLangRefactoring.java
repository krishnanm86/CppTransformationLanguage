package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.ASTNodeFactoryFactory;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPNodeFactory;
import org.eclipse.cdt.core.dom.parser.IScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.ISourceCodeParser;
import org.eclipse.cdt.core.dom.parser.c.GCCScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.GPPScannerExtensionConfiguration;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.parser.FileContent;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.IScanner;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.cdt.core.parser.IncludeFileContentProvider;
import org.eclipse.cdt.core.parser.NullLogService;
import org.eclipse.cdt.core.parser.ParserLanguage;
import org.eclipse.cdt.core.parser.ParserMode;
import org.eclipse.cdt.core.parser.ScannerInfo;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBaseDeclSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTForStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.cdt.internal.core.parser.scanner.CPreprocessor;
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
	private static List<Class> tempRules = new ArrayList<Class>();
	private static ICPPNodeFactory nodeFactory = ASTNodeFactoryFactory.getDefaultCPPNodeFactory();
	protected static final IParserLogService NULL_LOG = new NullLogService();
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
		for (Class cls : tempRules) {
			if (enclosingNode.getClass().equals(cls)) {
				return true;
			}
		}
		return false;
	}

	public static IScanner getDummyScanner() {
		FileContent codeReader = FileContent.create("<test-code>", "".toCharArray());
		ScannerInfo scannerInfo = new ScannerInfo();
		ISourceCodeParser parser2 = null;
		IScanner scanner = createScanner(codeReader, ParserLanguage.CPP, ParserMode.COMPLETE_PARSE, scannerInfo);
		return scanner;

	}

	public static IScanner createScanner(FileContent codeReader, ParserLanguage lang, ParserMode mode,
			IScannerInfo scannerInfo) {
		IScannerExtensionConfiguration configuration = null;
		if (lang == ParserLanguage.C) {
			configuration = GCCScannerExtensionConfiguration.getInstance(scannerInfo);
		} else {
			configuration = GPPScannerExtensionConfiguration.getInstance(scannerInfo);
		}
		IScanner scanner;
		scanner = new CPreprocessor(codeReader, scannerInfo, lang, NULL_LOG, configuration,
				IncludeFileContentProvider.getSavedFilesProvider());
		return scanner;
	}

	@Override
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		selectedNode = getAST(getTranslationUnit(), pm).getNodeSelector(null).findNode(selectedRegion.getOffset(),
				selectedRegion.getLength());
		/*selectedNode.accept(new NameVisitor());
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

		}*/
		populateTempRules();
		List<IASTNode> enclosingNodes =  createEnclosingNode(selectedNode);
		for(IASTNode node : enclosingNodes)
		{
			System.out.println("------------------------");
			System.out.println(node.getRawSignature());
		}
		return super.checkInitialConditions(pm);
	}

	@Override
	protected void collectModifications(IProgressMonitor pm, ModificationCollector collector)
			throws CoreException, OperationCanceledException {

	}

}
