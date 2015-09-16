package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.Arrays;

import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTProblem;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.parser.IScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.ISourceCodeParser;
import org.eclipse.cdt.core.dom.parser.c.GCCScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.ANSICPPParserExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.GPPParserExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.GPPScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.ICPPParserExtensionConfiguration;
import org.eclipse.cdt.core.parser.FileContent;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.IScanner;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.cdt.core.parser.IncludeFileContentProvider;
import org.eclipse.cdt.core.parser.NullLogService;
import org.eclipse.cdt.core.parser.ParserLanguage;
import org.eclipse.cdt.core.parser.ParserMode;
import org.eclipse.cdt.core.parser.ScannerInfo;
import org.eclipse.cdt.core.parser.util.ASTPrinter;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompoundStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTExpressionStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTForStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTLiteralExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.GNUCPPSourceParser;
import org.eclipse.cdt.internal.core.dom.parser.cpp.semantics.CPPVisitor;
import org.eclipse.cdt.internal.core.parser.scanner.CPreprocessor;

@SuppressWarnings("restriction")
public class LoopUtils {

	protected static final IParserLogService NULL_LOG = new NullLogService();

	public static int findLimit(CPPASTForStatement forStat) {
		int limit = 0;
		CPPASTBinaryExpression expr = (CPPASTBinaryExpression) forStat.getConditionExpression();
		ASTPrinter.print(expr);
		System.out.println(((CPPASTLiteralExpression) expr.getOperand2()).getValue());
		String limStr = new String(((CPPASTLiteralExpression) expr.getOperand2()).getValue());
		limit = Integer.parseInt(limStr);
		return limit;
	}

	public static void setNewLimit(CPPASTForStatement replaceForStat, CPPASTLiteralExpression newLimitExpression) {
		CPPASTBinaryExpression condExpr = (CPPASTBinaryExpression) replaceForStat.getConditionExpression().copy();
		condExpr.setOperand2(newLimitExpression);
		replaceForStat.setConditionExpression(condExpr);
	}

	public static void setNewVCExprAsLimit(CPPASTForStatement replaceForStat) throws Exception {
		CPPASTBinaryExpression condExpr = (CPPASTBinaryExpression) replaceForStat.getConditionExpression().copy();
		condExpr.setOperand2(constructExpression(findLimit(replaceForStat)));
		replaceForStat.setConditionExpression(condExpr);
	}

	public static IASTExpression constructExpression(int limit) throws Exception {
		String str = limit + "/float_v::Size";
		return getStringExpression(str);
	}

	private static IASTExpression getStringExpression(String str) throws Exception {
		String compilableStr = "void fn(){" + str + ";}";
		IASTTranslationUnit tu = parse(compilableStr);
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		return ((CPPASTExpressionStatement) ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0])
				.getExpression().copy();
	}

	public static IASTTranslationUnit parse(String code) throws Exception {
		final boolean gcc = true;
		FileContent codeReader = FileContent.create("<test-code>", code.toCharArray());
		ScannerInfo scannerInfo = new ScannerInfo();
		ISourceCodeParser parser2 = null;
		IScanner scanner = createScanner(codeReader, ParserLanguage.CPP, ParserMode.COMPLETE_PARSE, scannerInfo);
		ICPPParserExtensionConfiguration config = null;
		if (gcc) {
			config = new GPPParserExtensionConfiguration();
		} else {
			config = new ANSICPPParserExtensionConfiguration();
		}
		parser2 = new GNUCPPSourceParser(scanner, ParserMode.COMPLETE_PARSE, NULL_LOG, config);
		IASTTranslationUnit tu = parser2.parse();
		if (parser2.encounteredError())
			throw new RuntimeException("PARSE FAILURE");
		IASTProblem[] problems = CPPVisitor.getProblems(tu);
		if (problems.length > 0) {
			throw new RuntimeException("Parse fails: " + Arrays.toString(problems));
		}
		return tu;
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

}
