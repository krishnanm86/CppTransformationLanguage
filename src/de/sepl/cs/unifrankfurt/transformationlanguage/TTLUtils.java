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
import org.eclipse.cdt.core.dom.ast.ASTNodeFactoryFactory;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTExpressionStatement;
import org.eclipse.cdt.core.dom.ast.IASTLiteralExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTProblem;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPNodeFactory;
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
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompoundStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTDeclarationStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTExpressionStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionCallExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.cdt.internal.core.dom.parser.cpp.GNUCPPSourceParser;
import org.eclipse.cdt.internal.core.dom.parser.cpp.semantics.CPPVisitor;
import org.eclipse.cdt.internal.core.parser.scanner.CPreprocessor;

@SuppressWarnings("restriction")
public class TTLUtils {

	private final static String ttlHolePrefix = "__ttl";

	private static ICPPNodeFactory nodeFactory = ASTNodeFactoryFactory.getDefaultCPPNodeFactory();

	public static CPPASTCompositeTypeSpecifier transformTypeUsingFilter(CPPASTCompositeTypeSpecifier type,
			Map<String, String> filter) {
		CPPASTCompositeTypeSpecifier newType = type.copy();
		for (IASTDeclaration member : newType.getMembers()) {
			if (member instanceof CPPASTSimpleDeclaration) {
				CPPASTSimpleDeclaration memberDeclaration = (CPPASTSimpleDeclaration) member;
				if (memberDeclaration.getDeclSpecifier() instanceof CPPASTSimpleDeclSpecifier) {
					CPPASTSimpleDeclSpecifier memberSpecifier = (CPPASTSimpleDeclSpecifier) memberDeclaration
							.getDeclSpecifier();
					String declSpecifierName = memberSpecifier.toString().trim();
					if (filter.containsKey(declSpecifierName)) {
						CPPASTNamedTypeSpecifier newSpecifier = (CPPASTNamedTypeSpecifier) nodeFactory
								.newTypedefNameSpecifier(
										nodeFactory.newName(filter.get(declSpecifierName).toCharArray()));
						CPPASTSimpleDeclaration newMemberDeclaration = memberDeclaration.copy();
						newMemberDeclaration.setDeclSpecifier(newSpecifier);
						newType.replace(member, newMemberDeclaration);
					}
				}
			}

		}
		return newType;
	}

	public static Map<String, List<IASTNode>> match(TTlExpression ttlPattern, TTlExpression ttlFragmentToMatch)
			throws Exception {
		Map<String, List<IASTNode>> holeMap = new HashMap<String, List<IASTNode>>();
		IASTNode patternNode = null, matchNode = null;
		patternNode = getNodeFromString(ttlPattern.nodeWithHoles, ttlPattern.type);
		matchNode = getNodeFromString(ttlFragmentToMatch.nodeWithHoles, ttlFragmentToMatch.type);
		if (match(holeMap, patternNode, matchNode))
			return holeMap;
		return new HashMap<String, List<IASTNode>>();
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
				if (isTTlHole(patternNode.getChildren()[patternNodeChildIndex])) {
					List<IASTNode> holeNodes = new ArrayList<IASTNode>();
					holeNodes.add(matchNode.getChildren()[matchNodeChildIndex]);
					matchNodeChildIndex++;
					if (patternNodeChildIndex == patternNode.getChildren().length - 1) {
						while (matchNodeChildIndex < matchNode.getChildren().length) {
							holeNodes.add(matchNode.getChildren()[matchNodeChildIndex]);
							matchNodeChildIndex++;
						}
					}
					patternNodeChildIndex++;
					if (patternNodeChildIndex != patternNode.getChildren().length
							&& matchNode.getChildren().length != matchNodeChildIndex) {
						while (isNodeEqualsWithChildren(patternNode.getParent().getChildren()[patternNodeChildIndex],
								matchNode.getParent().getChildren()[matchNodeChildIndex])) {
							holeNodes.add(matchNode.getChildren()[matchNodeChildIndex]);
							matchNodeChildIndex++;
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

	public static IASTNode construct(Map<String, List<IASTNode>> holeMap, TTlExpression expr) throws Exception {
		Set<String> holes = getHoles(expr.nodeWithHoles);
		for (String hole : holes) {
			expr.nodeWithHoles = expr.nodeWithHoles.replace(hole, getNodeWithHoles(holeMap.get(hole)));
		}
		return getNodeFromString(expr.nodeWithHoles, expr.type);
	}

	private static CharSequence getNodeWithHoles(List<IASTNode> list) {
		String str = "";
		for (IASTNode node : list) {
			str = str + node.getRawSignature();
		}
		return str;
	}

	private static Set<String> getHoles(String nodeWithHoles) {
		Set<String> holes = new HashSet<String>();
		int i = 0;
		while (i < nodeWithHoles.length()) {
			if (nodeWithHoles.substring(i).startsWith("__ttl")) {
				String hole = "";
				while (nodeWithHoles.charAt(i) == ';') {
					hole = hole + nodeWithHoles.charAt(i);
					i++;
				}
				holes.add(hole);
				i++;
			}
			i++;
		}
		return null;
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
		String funcName = ((CPPASTIdExpression) ((CPPASTFunctionCallExpression) ((IASTExpressionStatement) patternNode)
				.getExpression()).getFunctionNameExpression()).getName().toString();
		return funcName.substring(ttlHolePrefix.length(), funcName.length());

	}

	private static boolean isTTlHole(IASTNode patternNode) {
		if (patternNode instanceof IASTExpressionStatement) {
			if (((IASTExpressionStatement) patternNode).getExpression() instanceof CPPASTFunctionCallExpression) {
				if (((CPPASTIdExpression) ((CPPASTFunctionCallExpression) ((IASTExpressionStatement) patternNode)
						.getExpression()).getFunctionNameExpression()).getName().toString().startsWith(ttlHolePrefix)) {
					return true;
				}
			}
		}
		return false;
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
		IASTTranslationUnit tu = parse(compilableStr);
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		return ((CPPASTExpressionStatement) ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0])
				.getExpression().copy();
	}

	public static IASTStatement getStatement(String str) throws Exception {
		String compilableStr = "void fn(){" + str + "}";
		IASTTranslationUnit tu = parse(compilableStr);
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		return ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0].copy();
	}

	public static IASTDeclaration getDeclaration(String str) throws Exception {
		String compilableStr = "void fn(){" + str + ";}";
		IASTTranslationUnit tu = parse(compilableStr);
		CPPASTFunctionDefinition defn = (CPPASTFunctionDefinition) tu.getChildren()[0];
		return ((CPPASTDeclarationStatement) ((CPPASTCompoundStatement) defn.getBody()).getStatements()[0])
				.getDeclaration().copy();
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

}
