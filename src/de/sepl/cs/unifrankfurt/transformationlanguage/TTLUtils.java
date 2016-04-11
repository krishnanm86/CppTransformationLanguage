package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.eclipse.cdt.core.dom.ast.IASTArrayDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTEqualsInitializer;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement;
import org.eclipse.cdt.core.dom.ast.IASTFunctionCallExpression;
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNamedTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTNode.CopyStyle;
import org.eclipse.cdt.core.dom.ast.IASTProblem;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.parser.IScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.ISourceCodeParser;
import org.eclipse.cdt.core.dom.parser.c.GCCScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.ANSICPPParserExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.GPPParserExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.GPPScannerExtensionConfiguration;
import org.eclipse.cdt.core.dom.parser.cpp.ICPPParserExtensionConfiguration;
import org.eclipse.cdt.core.parser.FileContent;
import org.eclipse.cdt.core.parser.IScanner;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.cdt.core.parser.IncludeFileContentProvider;
import org.eclipse.cdt.core.parser.NullLogService;
import org.eclipse.cdt.core.parser.ParserLanguage;
import org.eclipse.cdt.core.parser.ParserMode;
import org.eclipse.cdt.core.parser.ScannerInfo;
import org.eclipse.cdt.core.parser.util.ASTPrinter;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompoundStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTDeclarationStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTExpressionStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTStaticAssertionDeclaration;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTUsingDeclaration;
import org.eclipse.cdt.internal.core.dom.parser.cpp.GNUCPPSourceParser;
import org.eclipse.cdt.internal.core.dom.parser.cpp.semantics.CPPVisitor;
import org.eclipse.cdt.internal.core.parser.scanner.CPreprocessor;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class TTLUtils {

	public enum TTLHoleType {
		Expression, Statement, Name, Declarator, Type, NotHole;
	}

	public final static String ttlHolePrefix = "__ttl";
	public final static String ttlHoleSuffix = "__";
	public final static String ttlTagPrefix = "__tagttl";

	public static Map<String, List<IASTNode>> match(TTlExpression ttlPattern, TTlExpression ttlFragmentToMatch)
			throws Exception {
		Map<String, List<IASTNode>> holeMap = new HashMap<String, List<IASTNode>>();
		IASTNode patternNode = null, matchNode = null;
		patternNode = getNodeFromString(ttlPattern.nodeWithHoles, ttlPattern.type);
		matchNode = getNodeFromString(ttlFragmentToMatch.nodeWithHoles, ttlFragmentToMatch.type);
		if (isDeclarationAssignment(ttlPattern.nodeWithHoles, ttlFragmentToMatch.nodeWithHoles).size() > 0) {
			return isDeclarationAssignment(ttlPattern.nodeWithHoles, ttlFragmentToMatch.nodeWithHoles);
		}
		if (match(holeMap, patternNode, matchNode))
			return holeMap;
		return new HashMap<String, List<IASTNode>>();
	}

	private static Map<String, List<IASTNode>> isDeclarationAssignment(String nodeWithHoles, String nodeWithHoles2)
			throws Exception {
		Map<String, List<IASTNode>> retHoleMap = new HashMap<String, List<IASTNode>>();
		String[] lhs = nodeWithHoles.split("=");
		String[] rhs = nodeWithHoles2.split("=");
		if (lhs.length == 2 && rhs.length == 2) {
			if (lhs[0].split(" ").length == 2 && rhs[0].split(" ").length == 2) {
				if (lhs[0].split(" ")[0].equals(rhs[0].split(" ")[0])) {
					String holeName = lhs[0].split(" ")[1];
					String holeValue = rhs[0].split(" ")[1];
					IASTExpression expr = TTLUtils.getExpression(holeValue);
					if (holeName.startsWith(ttlHolePrefix) && holeName.endsWith(ttlHoleSuffix)) {
						retHoleMap.put(holeName, new ArrayList<IASTNode>(Arrays.asList(expr)));
						lhs[1] = lhs[1].replace(";", "");
						rhs[1] = rhs[1].replace(";", "");
						lhs[1] = lhs[1].trim();
						rhs[1] = rhs[1].trim();
						if (lhs[1].startsWith(ttlHolePrefix) && lhs[1].endsWith(ttlHoleSuffix)) {
							IASTExpression expr2 = TTLUtils.getExpression(rhs[1]);
							retHoleMap.put(lhs[1], new ArrayList<IASTNode>(Arrays.asList(expr2)));
						}

					}
				}
			}
		}
		return retHoleMap;
	}

	public static IASTNode getNodeFromString(String node, TTlExpression.NodeType type) throws Exception {
		IASTNode nodeToReturn = null;
		switch (type) {
		case Declaration:
			nodeToReturn = getDeclaration(node);
			break;
		case Expression:
			nodeToReturn = getExpression(node);
			break;
		case Statement:
			nodeToReturn = getStatement(node);
			break;
		case DeclSpecifier:
			nodeToReturn = getDeclSpecifier(node);
		default:
			break;
		}
		return nodeToReturn;
	}

	public static void printHoleMap(Map<String, List<IASTNode>> holeMap) {
		for (String key : holeMap.keySet()) {
			System.out.println("------------------");
			System.out.println("Hole Id " + key);
			for (IASTNode node : holeMap.get(key)) {
				System.out.println("Node =======");
				ASTPrinter.print(node);
			}
		}
		System.out.println("------------------");
	}

	private static boolean match(Map<String, List<IASTNode>> holeMap, IASTNode patternNode, IASTNode matchNode) {
		if (!isNodeEqual(patternNode, matchNode) || patternNode.getChildren().length > matchNode.getChildren().length) {
			return false;
		}
		if (isNodeEqual(patternNode, matchNode)) {
			int patternNodeChildIndex = 0, matchNodeChildIndex = 0;
			while (patternNodeChildIndex != patternNode.getChildren().length) {
				if (isTTlHole(patternNode.getChildren()[patternNodeChildIndex]) != TTLHoleType.NotHole) {
					List<IASTNode> holeNodes = new ArrayList<IASTNode>();
					holeNodes.add(matchNode.getChildren()[matchNodeChildIndex]);
					matchNodeChildIndex++;
					if (patternNodeChildIndex == patternNode.getChildren().length - 1) {
						while (matchNodeChildIndex < matchNode.getChildren().length) {
							holeNodes.add(matchNode.getChildren()[matchNodeChildIndex].copy(CopyStyle.withLocations));
							matchNodeChildIndex++;
						}
					}
					patternNodeChildIndex++;
					if (patternNodeChildIndex != patternNode.getChildren().length
							&& !isTreeWithHoles(patternNode.getChildren()[patternNodeChildIndex])) {
						if (matchNode.getChildren().length != matchNodeChildIndex) {
							while (!(isNodeEqualsWithChildren(patternNode.getChildren()[patternNodeChildIndex],
									matchNode.getChildren()[matchNodeChildIndex]))) {
								holeNodes.add(
										matchNode.getChildren()[matchNodeChildIndex].copy(CopyStyle.withLocations));
								matchNodeChildIndex++;
							}
						}
					}
					holeMap.put(getTTLHoleId(patternNode.getChildren()[patternNodeChildIndex - 1]), holeNodes);
				} else {
					if (match(holeMap, patternNode.getChildren()[patternNodeChildIndex],
							matchNode.getChildren()[matchNodeChildIndex])) {
						patternNodeChildIndex++;
						matchNodeChildIndex++;
					} else {
						return false;
					}
				}
			}

		}
		return true;
	}

	private static boolean isTreeWithHoles(IASTNode iastNode) {
		if (isTTlHole(iastNode) != TTLHoleType.NotHole) {
			return true;
		} else {
			boolean childrenHasHoles = false;
			for (IASTNode child : iastNode.getChildren()) {
				childrenHasHoles = childrenHasHoles || isTreeWithHoles(child);
			}
			return childrenHasHoles;
		}
	}

	public static IASTNode construct(Map<String, List<IASTNode>> holeMap, TTlExpression expr) throws Exception {
		Set<String> holes = getHoles(expr.nodeWithHoles);
		for (String hole : holes) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(hole, getNodeWithHoles(holeMap.get(hole)));
		}
		System.out.println(expr.nodeWithHoles);
		return getNodeFromString(expr.nodeWithHoles, expr.type);
	}

	public static IASTNode construct(Map<String, List<IASTNode>> holeMap, TTlExpression expr,
			Map<String, String> tagUpdates) throws Exception {
		Set<String> holes = getHoles(expr.nodeWithHoles);
		for (String hole : holes) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(hole, getNodeWithHoles(holeMap.get(hole)));
		}
		System.out.println(expr.nodeWithHoles);
		for (String tag : tagUpdates.keySet()) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(tag, tagUpdates.get(tag));
		}
		return getNodeFromString(expr.nodeWithHoles, expr.type);
	}

	private static CharSequence getNodeWithHoles(List<IASTNode> list) {
		String str = "";
		for (IASTNode node : list) {
			if (node instanceof CPPASTCompoundStatement) {
				for (IASTStatement stat : ((CPPASTCompoundStatement) node).getStatements()) {
					str = str + stat.getRawSignature();
				}
			} else {
				str = str + node.getRawSignature();
			}
		}
		return str;
	}

	private static Set<String> getHoles(String nodeWithHoles) {
		Set<String> holes = new HashSet<String>();
		int i = 0;
		while (i < nodeWithHoles.length()) {
			if (nodeWithHoles.substring(i).startsWith(ttlHolePrefix)) {
				String hole = "";
				while (!nodeWithHoles.substring(i + 1).startsWith(ttlHoleSuffix)) {
					hole = hole + nodeWithHoles.charAt(i);
					i++;
				}
				hole = hole + nodeWithHoles.charAt(i);
				holes.add(hole + ttlHoleSuffix);
				i++;
			}
			i++;
		}
		return holes;
	}

	private static boolean isNodeEqualsWithChildren(IASTNode iastNode, IASTNode iastNode2) {
		Object[] patternNodeDetails = getNameTypeHashCode(iastNode);
		Class<?> typePatternNode = (Class<?>) patternNodeDetails[0];
		char[] qnamePatternNode = (char[]) patternNodeDetails[1];
		String hash_code_PatternNode = String.valueOf(joinHashCodes(new int[] { getChildrenHashCode(iastNode),
				Arrays.hashCode(qnamePatternNode), ((typePatternNode == null) ? 0 : typePatternNode.hashCode()) }));

		Object[] matchNodeDetails = getNameTypeHashCode(iastNode2);
		Class<?> typeMatchNode = (Class<?>) matchNodeDetails[0];
		char[] qnameMatchNode = (char[]) matchNodeDetails[1];
		String hash_code_MatchNode = String.valueOf(joinHashCodes(new int[] { getChildrenHashCode(iastNode2),
				Arrays.hashCode(qnameMatchNode), ((typeMatchNode == null) ? 0 : typeMatchNode.hashCode()) }));

		return hash_code_PatternNode.equals(hash_code_MatchNode);
	}

	private static int getChildrenHashCode(IASTNode node) {
		int childrenHashCode = 0;
		for (IASTNode ndChild : node.getChildren()) {
			Object[] childNodeDetails = getNameTypeHashCode(ndChild);
			Class<?> typeChildNode = (Class<?>) childNodeDetails[0];
			char[] qnameChildNode = (char[]) childNodeDetails[1];
			String hash_code_Child = String.valueOf(joinHashCodes(new int[] { Arrays.hashCode(qnameChildNode),
					((typeChildNode == null) ? 0 : typeChildNode.hashCode()) }));
			childrenHashCode = joinHashCodes(new int[] { childrenHashCode, Integer.valueOf(hash_code_Child) });
		}
		return childrenHashCode;
	}

	private static boolean isNodeEqual(IASTNode patternNode, IASTNode matchNode) {
		if (patternNode instanceof IASTCompositeTypeSpecifier || patternNode instanceof IASTNamedTypeSpecifier
				|| patternNode instanceof IASTArrayDeclarator || patternNode instanceof IASTEqualsInitializer) {
			return true;
		}
		Object[] patternNodeDetails = getNameTypeHashCode(patternNode);
		Class<?> typePatternNode = (Class<?>) patternNodeDetails[0];
		char[] qnamePatternNode = (char[]) patternNodeDetails[1];
		String hash_code_PatternNode = String.valueOf(joinHashCodes(new int[] { Arrays.hashCode(qnamePatternNode),
				((typePatternNode == null) ? 0 : typePatternNode.hashCode()) }));

		Object[] matchNodeDetails = getNameTypeHashCode(matchNode);
		Class<?> typeMatchNode = (Class<?>) matchNodeDetails[0];
		char[] qnameMatchNode = (char[]) matchNodeDetails[1];
		String hash_code_MatchNode = String.valueOf(joinHashCodes(new int[] { Arrays.hashCode(qnameMatchNode),
				((typeMatchNode == null) ? 0 : typeMatchNode.hashCode()) }));

		return hash_code_PatternNode.equals(hash_code_MatchNode);
	}

	private static String getTTLHoleId(IASTNode patternNode) {
		if (patternNode instanceof CPPASTExpressionStatement) {
			if (((CPPASTExpressionStatement) patternNode).getExpression() instanceof CPPASTIdExpression) {
				return ((CPPASTIdExpression) ((CPPASTExpressionStatement) patternNode).getExpression()).getName()
						.toString();
			}
		} else if (patternNode instanceof CPPASTIdExpression) {
			return ((CPPASTIdExpression) patternNode).getName().toString();
		} else if (patternNode instanceof IASTName) {
			return ((IASTName) patternNode).toString();
		} else if (patternNode instanceof IASTDeclarator) {
			return ((IASTDeclarator) patternNode).getName().toString();
		} else if (patternNode instanceof CPPASTUsingDeclaration) {
			return ((CPPASTUsingDeclaration) patternNode).getName().toString();
		} else if (patternNode instanceof IASTDeclSpecifier) {
			return patternNode.getRawSignature().toString();
		}
		return "notahole";
	}

	private static TTLHoleType isTTlHole(IASTNode patternNode) {
		// Either an ExpressionStatement with just an ID Expression with the
		// name starting with the prefix
		if (patternNode instanceof IASTArrayDeclarator) {
			return TTLHoleType.NotHole;
		}
		if (patternNode instanceof CPPASTExpressionStatement) {
			if (((CPPASTExpressionStatement) patternNode).getExpression() instanceof CPPASTIdExpression) {
				if (((CPPASTIdExpression) ((CPPASTExpressionStatement) patternNode).getExpression()).getName()
						.toString().startsWith(ttlHolePrefix)) {
					return TTLHoleType.Statement;
				}
			}
		}
		if (patternNode instanceof CPPASTUsingDeclaration) {
			if (((CPPASTUsingDeclaration) patternNode).getName().toString().startsWith(ttlHolePrefix)) {
				{
					return TTLHoleType.Statement;
				}
			}
		}
		// Or simply an ID Expression with a name starting with the prefix
		if (patternNode instanceof CPPASTIdExpression) {
			if (((CPPASTIdExpression) patternNode).getName().toString().startsWith(ttlHolePrefix)) {
				return TTLHoleType.Expression;
			}
		}
		if (patternNode instanceof IASTDeclarator) {
			if (((IASTDeclarator) patternNode).getName().toString().startsWith(ttlHolePrefix)) {
				return TTLHoleType.Declarator;
			}
		}

		if (patternNode instanceof IASTName) {
			if (((IASTName) patternNode).toString().startsWith(ttlHolePrefix)) {
				return TTLHoleType.Name;
			}
		}
		if (patternNode instanceof IASTDeclSpecifier) {
			if (patternNode.getRawSignature().startsWith(ttlHolePrefix)) {
				return TTLHoleType.Type;
			}
		}
		return TTLHoleType.NotHole;
	}

	public static Integer joinHashCodes(int[] hashcodes) {
		HashCodeBuilder hd = new HashCodeBuilder();
		for (int i : hashcodes) {
			hd.append(i);
		}
		return hd.build();
	}

	public static Object[] getNameTypeHashCode(IASTNode node) {

		char[] name = new String().toCharArray();

		if (node instanceof IASTName) {
			name = ((IASTName) node).toCharArray();
		} else if (node instanceof IASTLiteralExpression) {
			name = ((IASTLiteralExpression) node).getValue();
		} else {
			// Find if the object has getName

			Method getName = null;
			try {
				getName = node.getClass().getMethod("getName", (Class<?>[]) null);
			} catch (NullPointerException | NoSuchMethodException | SecurityException e) {

			}

			if (getName != null) {
				IASTName nameObj = null;
				try {
					nameObj = (IASTName) getName.invoke(node, (Object[]) null);
				} catch (NullPointerException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {

				}
				if (nameObj != null) {
					name = nameObj.toCharArray();
				}
			} else {
				// Find if the object has getName

				Method getType = null;
				try {
					getType = node.getClass().getMethod("getType", (Class<?>[]) null);
				} catch (NullPointerException | NoSuchMethodException | SecurityException e) {

				}

				if (getType != null) {
					int typeObj = 0;
					try {
						typeObj = (int) getType.invoke(node, (Object[]) null);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

					}
					if (typeObj != 0) {
						name = String.valueOf(typeObj).toCharArray();
					}
				}
			}
		}
		if (node instanceof IASTExpressionStatement
				&& ((IASTExpressionStatement) node).getExpression() instanceof IASTFunctionCallExpression) {
			name = ((CPPASTIdExpression) ((IASTFunctionCallExpression) ((IASTExpressionStatement) node).getExpression())
					.getFunctionNameExpression()).getName().toCharArray();
		}
		return new Object[] { node.getClass(), name };
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
		parser2 = new GNUCPPSourceParser(scanner, ParserMode.COMPLETE_PARSE, new NullLogService(), config);
		IASTTranslationUnit tu = parser2.parse();
		if (parser2.encounteredError())
			throw new RuntimeException("PARSE FAILURE");
		IASTProblem[] problems = CPPVisitor.getProblems(tu);
		if (problems.length > 0) {
			throw new RuntimeException("Parse fails: " + Arrays.toString(problems));
		}
		return tu;
	}

	public static IASTExpression getExpression(String str) throws Exception {
		String compilableStr = "void fn(){" + str + ";}";
		IASTTranslationUnit tu = parse(compilableStr).copy();
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		if (((CPPASTCompoundStatement) defn.getBody()).getStatements()[0] instanceof CPPASTExpressionStatement) {
			return ((CPPASTExpressionStatement) ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0])
					.getExpression();
		}
		return null;
	}

	public static IASTStatement getStatement(String str) throws Exception {
		String compilableStr = "void fn(){" + str + "}";
		IASTTranslationUnit tu = parse(compilableStr);
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		if (((CPPASTCompoundStatement) defn.getBody()).getStatements().length > 0) {
			return ((CPPASTCompoundStatement) defn.getBody());
		}
		return ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0];
	}

	public static IASTDeclSpecifier getDeclSpecifier(String str) throws Exception {
		IASTTranslationUnit tu;
		if (!str.endsWith(";")) {
			tu = parse(str + ";");
		} else {
			tu = parse(str);
		}
		return ((CPPASTSimpleDeclaration) tu.getChildren()[0]).getDeclSpecifier();
	}

	public static IASTDeclaration getDeclaration(String str) throws Exception {
		String compilableStr = "void fn(){" + str + ";}";
		IASTTranslationUnit tu = parse(compilableStr);
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		return ((CPPASTDeclarationStatement) ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0])
				.getDeclaration();
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
		scanner = new CPreprocessor(codeReader, scannerInfo, lang, new NullLogService(), configuration,
				IncludeFileContentProvider.getSavedFilesProvider());
		return scanner;
	}

	public static Map<String, String> getDummyFilter() {
		Map<String, String> dummyMap = new HashMap<String, String>();
		dummyMap.put("int", "int_v");
		dummyMap.put("float", "float_v");
		return dummyMap;
	}

	public static boolean checkType(NodeType type, IASTNode enclosingNode) {
		if (type == NodeType.Statement) {
			return enclosingNode instanceof IASTStatement;
		}
		if (type == NodeType.Declaration) {
			return enclosingNode instanceof IASTDeclaration;
		}
		if (type == NodeType.Expression) {
			return enclosingNode instanceof IASTExpression;
		}
		if (type == NodeType.DeclSpecifier) {
			return enclosingNode instanceof IASTDeclSpecifier;
		}
		return false;
	}

	public static IASTNode construct(Map<String, List<IASTNode>> holeMap, TTlExpression expr,
			Map<String, String> tagValueMap, Map<String, String> referenceMap) throws Exception {
		Set<String> holes = getHoles(expr.nodeWithHoles);
		for (String hole : holes) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(hole, getNodeWithHoles(holeMap.get(hole)));
		}
		System.out.println(expr.nodeWithHoles);
		for (String tag : tagValueMap.keySet()) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(tag, tagValueMap.get(tag));
		}
		for (String tag : referenceMap.keySet()) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(tag, referenceMap.get(tag));
		}
		return getNodeFromString(expr.nodeWithHoles, expr.type);
	}

	public static String getHoleValue(String holeName, TTlExpression tTlExpression) {
		return "1000";
	}

}
