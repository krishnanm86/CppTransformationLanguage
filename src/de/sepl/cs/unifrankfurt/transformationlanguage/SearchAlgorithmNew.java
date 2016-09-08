package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

class NodewRule {
	List<IASTNode> nodes; // List is only for decldefn rules.
	TTlRule rule;

	public NodewRule(List<IASTNode> nodes, TTlRule rule) {
		super();
		this.nodes = nodes;
		this.rule = rule;
	}

}

@SuppressWarnings("restriction")
public class SearchAlgorithmNew {

	public static Map<List<IASTNode>, TTlRule> AppliedRules = new HashMap<List<IASTNode>, TTlRule>();
	private static Set<TTlRule> rules = new HashSet<TTlRule>();
	private static Queue<IASTNode> WORKLIST = new LinkedList<IASTNode>();
	private static Queue<IASTNode> DONE = new LinkedList<IASTNode>();
	private static NameVisitor visitor = new NameVisitor();
	public static IASTTranslationUnit ast;
	private static ASTRewrite astRewrite;
	public static Migrations migrations = new Migrations();

	public static void search(IASTNode selectedNode, IASTTranslationUnit ast, ASTRewrite astRewrite) throws Exception {
		System.out.println("Beginning Search.....");
		migrations = new Migrations();
		SearchAlgorithmNew.ast = ast;
		SearchAlgorithmNew.astRewrite = astRewrite;
		setRules();
		visitor = new NameVisitor();
		AppliedRules = new HashMap<List<IASTNode>, TTlRule>();
		Global(selectedNode);
		System.out.println(migrations);
	}

	private static void Global(IASTNode SN) throws Exception {
		WorkBlock(SN);
		while (!WORKLIST.isEmpty()) {
			IASTNode UNRESOLVED = WORKLIST.remove();
			WorkBlock(UNRESOLVED);
		}
	}

	private static void WorkBlock(IASTNode SN) throws Exception {
		NodewRule Nr = FindRule(SN);
		List<IASTNode> Ndash = SUBST(Nr.nodes, Nr.rule);
	}

	private static List<IASTNode> SUBST(List<IASTNode> nodes, TTlRule rule) throws Exception {

		if (rule.type != NodeType.DeclDefn) {
			if (nodes.size() == 1) {
				IASTNode node = nodes.get(0);
				Map<String, String> holeMap = TTLUtils.getHoleMap(rule.lhs.nodeWithHoles, node.getRawSignature());
				applyScopedRule(rule.scopeFragmentMap, holeMap);
				IASTNode nodeToReplace = TTLUtils.constructUsingHoleMap(holeMap, rule.rhs);
				astRewrite.replace(node, nodeToReplace, new TextEditGroup("Transformation language"));
			}
		} else {
			IASTNode definition = getDefinition(nodes);
			IASTNode declaration = getDeclaration(nodes);

			String ruleString = rule.lhs.nodeWithHoles;
			String str[] = ruleString.split("}");

			// Match Definition
			String definitionRule = str[0] + "}";
			definitionRule = definitionRule.replaceAll("\\s+", " ");

			Map<String, String> holeMapDefinition = TTLUtils.getHoleMap(definitionRule, definition.getRawSignature());
			applyScopedRule(rule.scopeFragmentMap, holeMapDefinition);

			// Match Declaration
			String declarationRule = "__ttltype__ " + str[1];
			declarationRule = declarationRule.replaceAll("\\s+", " ");

			Map<String, String> holeMapDeclaration = TTLUtils.getHoleMap(declarationRule,
					declaration.getRawSignature());
			applyScopedRule(rule.scopeFragmentMap, holeMapDeclaration);

			// Merge the holeMaps
			Map<String, String> holeMap = new HashMap<String, String>();
			for (String key : holeMapDefinition.keySet()) {
				holeMap.put(key, holeMapDefinition.get(key));
			}

			for (String key : holeMapDeclaration.keySet()) {
				holeMap.put(key, holeMapDeclaration.get(key));
			}

			String ruleStringRHS = rule.rhs.nodeWithHoles;
			String strRHS[] = ruleStringRHS.split("}");

			// Match Definition
			String definitionRuleRHS = strRHS[0] + "}";
			definitionRuleRHS = definitionRuleRHS.replaceAll("\\s+", " ");
			// Match Declaration
			String declarationRuleRHS = "__ttltype__ " + strRHS[1];
			declarationRuleRHS = declarationRuleRHS.replaceAll("\\s+", " ");

			IASTNode definitionToReplace = TTLUtils.constructUsingHoleMap(holeMap,
					new TTlExpression(definitionRuleRHS, NodeType.DeclSpecifier));
			System.out.println("Replacing ");
			System.out.println(definition.getRawSignature());
			System.out.println("With");
			System.out.println(definitionToReplace.getRawSignature());

			IASTNode declarationToReplace = TTLUtils.constructUsingHoleMap(holeMap,
					new TTlExpression(declarationRuleRHS, NodeType.Declaration));
			System.out.println("Replacing ");
			System.out.println(declaration.getRawSignature());
			System.out.println("With");
			System.out.println(declarationToReplace.getRawSignature());

			astRewrite.replace(definition, definitionToReplace, new TextEditGroup("Transformation language"));
			astRewrite.replace(declaration, declarationToReplace, new TextEditGroup("Transformation language"));

		}
		return null;
	}

	private static void applyScopedRule(Map<Scope, String> scopeFragmentMap, Map<String, String> holeMap)
			throws Exception {
		for (Scope scope : scopeFragmentMap.keySet()) {
			String holeFragment = scopeFragmentMap.get(scope);
			if (holeMap.containsKey(holeFragment)) {
				String codeFragmentString = holeMap.get(holeFragment);
				IASTNode codeFragment = TTLUtils.getNodeFromString(codeFragmentString);
				ScopeVisitorNew scopeVisitor = new ScopeVisitorNew(scope);
				codeFragment.accept(scopeVisitor);
				Map<String, String> nodeReplacements = scopeVisitor.getNodeReplacements();
				Map<String, String> referenceReplacements = scopeVisitor.getReferenceReplacements();
				Map<String, String> returnedTagValues = scopeVisitor.returnedTagValues;

				for (String tagKey : returnedTagValues.keySet()) {
					holeMap.put(tagKey, returnedTagValues.get(tagKey));
				}

				for (String codeToFind : nodeReplacements.keySet()) {
					String replaceString = nodeReplacements.get(codeToFind);
					codeFragmentString = codeFragmentString.replace(codeToFind, replaceString);
				}

				holeMap.put(holeFragment, codeFragmentString);
			}
		}
	}

	private static NodewRule FindRule(IASTNode sN) {
		List<IASTNode> nodes = new ArrayList<IASTNode>(Arrays.asList(sN));
		TTlRule rule = null;
		for (TTlRule rl : rules) {
			String pattern = rl.lhs.nodeWithHoles;
			String codeToMatch = sN.getRawSignature();
			if (TTLUtils.getHoleMap(pattern.replaceAll("\\s+", " "), codeToMatch.replaceAll("\\s+", " ")).size() > 0) {
				rule = rl;
			}
		}
		if (rule == null) {
			// Check for possibility of DeclDefn Rule
			nodes = getDeclDefnNode(sN);
			if (nodes.size() > 0) {
				try {
					rule = ruleForDeclDefn(nodes);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		if (nodes.size() > 0 && rule != null) {
			return new NodewRule(nodes, rule);
		}
		return null;
	}

	private static List<IASTNode> getDeclDefnNode(IASTNode sN) {
		List<IASTNode> returnNode = new ArrayList<IASTNode>();
		if (sN instanceof CPPASTSimpleDeclaration
				&& ((CPPASTSimpleDeclaration) sN).getDeclSpecifier() instanceof CPPASTNamedTypeSpecifier) {
			IASTName name = ((CPPASTNamedTypeSpecifier) ((CPPASTSimpleDeclaration) sN).getDeclSpecifier()).getName();
			returnNode.add(TransformationUtils.getDefns(name));
			returnNode.add(sN);
		}
		return returnNode;
	}

	private static TTlRule ruleForDeclDefn(List<IASTNode> nodeAsList) throws Exception {
		for (TTlRule rule : rules) {
			if (rule.type == NodeType.DeclDefn) {
				String ruleString = rule.lhs.nodeWithHoles;
				String str[] = ruleString.split("}");

				// Match Definition
				String definitionRule = str[0] + "}";
				IASTNode definitionNode = getDefinition(nodeAsList);
				Map<String, List<IASTNode>> definitionMatch = new HashMap<String, List<IASTNode>>();

				if (definitionNode != null) {
					definitionMatch = TTLUtils.match(new TTlExpression(definitionRule, NodeType.DeclSpecifier),
							new TTlExpression(definitionNode.getRawSignature(), NodeType.DeclSpecifier));
				}
				// Match Definition
				String declarationRule = "__ttltype__ " + str[1];
				declarationRule = declarationRule.replaceAll("\\s+", " ");
				IASTNode declarationNode = getDeclaration(nodeAsList);
				Map<String, List<IASTNode>> declarationMatch = new HashMap<String, List<IASTNode>>();
				if (declarationNode != null) {
					declarationMatch = TTLUtils.match(new TTlExpression(declarationRule, NodeType.Declaration),
							new TTlExpression(declarationNode.getRawSignature(), NodeType.Declaration));
				}

				if (definitionMatch.size() > 0 && declarationMatch.size() > 0)
					return rule;
			}
		}
		return null;
	}

	private static IASTNode getDeclaration(List<IASTNode> selectedNodeAsList) {
		for (IASTNode node : selectedNodeAsList) {
			if (node instanceof IASTDeclaration) {
				return node;
			}
		}
		return null;
	}

	private static IASTNode getDefinition(List<IASTNode> selectedNodeAsList) {
		for (IASTNode node : selectedNodeAsList) {
			if (node instanceof IASTCompositeTypeSpecifier) {
				return node;
			}
		}
		return null;
	}

	private static void setRules() throws Exception {
		rules = VCSpecs.populateRules();
		// rules = GMPSpecs.populateRules();
		// rules = AOSSOASpecs.populateRules();
		// rules = LoopTilingSpecs.populateRules();
	}
}