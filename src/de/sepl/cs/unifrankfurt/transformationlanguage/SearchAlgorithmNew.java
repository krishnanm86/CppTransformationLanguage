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
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
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
	private static Set<IASTNode> DONE = new HashSet<IASTNode>();
	private static NameVisitor visitor = new NameVisitor();
	public static IASTTranslationUnit ast;
	private static ASTRewrite astRewrite;
	public static Migrations migrations = new Migrations();
	public static boolean isLastRuleFail = false;

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
		List<IASTNode> Ndash = null;
		if (Nr != null) {
			Ndash = SUBST(Nr.nodes, Nr.rule);
			addToSet(DONE, Nr.nodes, Ndash);

		}
		if (!isLastRuleFail) // N' not equals Fail scenario
		{
			if (Nr != null && Ndash != null) {
				recordInAST(Nr, Ndash);
			}
			List<IASTNode> N = new ArrayList<IASTNode>();
			N.add(SN);
			List<IASTNode> D = getDependencies(N);

			for (IASTNode d : D) {
				if (d != null && !WORKLIST.contains(d) && !DONE.contains(d)) {
					WORKLIST.add(d);
				}
			}
		}

	}

	private static List<IASTNode> getDependencies(List<IASTNode> nodes) {
		List<IASTNode> dependencies = new ArrayList<IASTNode>();
		for (IASTNode node : nodes) {
			node.accept(visitor);
			addParent(node, dependencies);
			for (IASTName objectref : visitor.getObjectrefs()) {
				if (!visitor.visitedNames.contains(objectref)) {
					for (IASTNode use : TransformationUtils.getUses(objectref, ast)) {
						dependencies.add(use);
					}
					visitor.visitedNames.add(objectref);
				}
			}
			if (!(node instanceof CPPASTCompositeTypeSpecifier)) {
				for (IASTName typeref : visitor.getTyperefs()) {
					if (!visitor.visitedNames.contains(typeref)) {
						dependencies.add(TransformationUtils.getDefns(typeref));
						visitor.visitedNames.add(typeref);
					}
				}
			}
		}
		return dependencies;
	}

	private static void addParent(IASTNode node, List<IASTNode> dependencies) {
		if (!(node.getParent() instanceof IASTTranslationUnit))
			dependencies.add(node.getParent());
		{
			if (node.getParent() != null) {
				dependencies.add(node.getParent().getParent());
			}
		}
	}

	private static void addToSet(Set<IASTNode> done, List<IASTNode> nodes, List<IASTNode> ndash) {
		for (IASTNode node : nodes) {
			done.add(node);
		}
		for (IASTNode node : ndash) {
			done.add(node);
		}
	}

	private static void recordInAST(NodewRule Nr, List<IASTNode> Ndash) {
		if (Nr.nodes.size() == 1 && Ndash.size() == 1) {
			//printReplacingString(Nr.nodes.get(0), Ndash.get(0));
			astRewrite.replace(Nr.nodes.get(0), Ndash.get(0), new TextEditGroup("Transformation Language"));
		} else if (Nr.rule.type == NodeType.DeclDefn && Nr.nodes.size() == 2 && Ndash.size() == 2) {
			IASTNode definitionNr = getDefinition(Nr.nodes);
			IASTNode definitionNdash = getDefinition(Ndash);
			IASTNode declarationNr = getDeclaration(Nr.nodes);
			IASTNode declarationNdash = getDeclaration(Ndash);

			//printReplacingString(declarationNr, declarationNdash);
			//printReplacingString(definitionNr, declarationNdash);

			astRewrite.replace(definitionNr, definitionNdash, new TextEditGroup("Transformation Language"));
			astRewrite.replace(declarationNr, declarationNdash, new TextEditGroup("Transformation Language"));
		}
	}

	private static List<IASTNode> SUBST(List<IASTNode> nodes, TTlRule rule) throws Exception {

		List<IASTNode> returnNode = new ArrayList<IASTNode>();
		if (rule.type != NodeType.DeclDefn) {
			if (nodes.size() == 1) {
				IASTNode node = nodes.get(0);
				Map<String, String> holeMap = TTLUtils.getHoleMap(rule.lhs.nodeWithHoles, node.getRawSignature());
				applyScopedRule(rule.scopeFragmentMap, holeMap);
				IASTNode nodeToReplace = node;
				try {
					nodeToReplace = TTLUtils.constructUsingHoleMap(holeMap, rule.rhs);
				} catch (Exception e) {
					System.out.println("Failed to replace " + node.getRawSignature() + " with "
							+ TTLUtils.constructStringUsingHoleMap(holeMap, rule.rhs));
				}
				returnNode.add(nodeToReplace);
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

			IASTNode declarationToReplace = TTLUtils.constructUsingHoleMap(holeMap,
					new TTlExpression(declarationRuleRHS, NodeType.Declaration));

			returnNode.add(definitionToReplace);
			returnNode.add(declarationToReplace);

		}
		return returnNode;
	}

	private static void printReplacingString(IASTNode toReplace, IASTNode replaceWith) {
		System.out.println("Attempting to replace");
		System.out.println(toReplace.getRawSignature());
		System.out.println("With");
		System.out.println(replaceWith.getRawSignature());
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
		if (sN != null) {
			List<IASTNode> nodes = new ArrayList<IASTNode>(Arrays.asList(sN));
			TTlRule rule = null;
			for (TTlRule rl : rules) {
				String pattern = rl.lhs.nodeWithHoles;
				String codeToMatch = sN.getRawSignature();
				if (TTLUtils.getHoleMap(pattern.replaceAll("\\s+", " "), codeToMatch.replaceAll("\\s+", " "))
						.size() > 0) {
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
		// rules = VCSpecs.populateRules();
		rules = GMPSpecs2.populateRules();
		// rules = AOSSOASpecs.populateRules();
		// rules = LoopTilingSpecs.populateRules();
	}
}