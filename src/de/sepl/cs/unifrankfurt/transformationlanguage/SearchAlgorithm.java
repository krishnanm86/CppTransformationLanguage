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

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.cdt.core.dom.ast.IASTCompositeTypeSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclSpecifier;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTDeclarator;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.IASTAmbiguityParent;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class SearchAlgorithm {

	private static final Map<List<IASTNode>, TTlRule> AppliedRules = new HashMap<List<IASTNode>, TTlRule>();
	private static Set<TTlRule> rules = new HashSet<TTlRule>();
	private static Queue<IASTNode> workQueue = new LinkedList<IASTNode>();
	private static NameVisitor visitor = new NameVisitor();
	private static IASTTranslationUnit ast;
	private static ASTRewrite astRewrite;
	public static Migrations migrations = new Migrations();

	public static void search(IASTNode selectedNode, IASTTranslationUnit ast, ASTRewrite astRewrite) throws Exception {
		migrations = new Migrations();
		SearchAlgorithm.ast = ast;
		SearchAlgorithm.astRewrite = astRewrite;
		rules = VCSpecs.populateRules();
		visitor = new NameVisitor();
		List<IASTNode> selectedNodeAsList = new ArrayList<IASTNode>(Arrays.asList(selectedNode));
		searchBlock(selectedNodeAsList);
		System.out.println(migrations);
	}

	private static void searchBlock(List<IASTNode> selectedNodeAsList) throws Exception {
		TTlRule rule = ruleApplicable(selectedNodeAsList);
		if (rule != null) {
			if (!isNodeHandled(selectedNodeAsList)) {
				workQueueBlock(rule, selectedNodeAsList);
			}
		} else {
			List<IASTNode> enclosingNode = getEnclosingNode(selectedNodeAsList);
			TTlRule ruleForEnclosingNode = ruleApplicable(enclosingNode);
			if (!isNodeHandled(enclosingNode)) {
				workQueueBlock(ruleForEnclosingNode, enclosingNode);
			}
		}
		if (!workQueue.isEmpty()) {
			IASTNode unresolved = workQueue.remove();
			searchBlock(new ArrayList<IASTNode>(Arrays.asList(unresolved)));
		}
	}

	private static List<IASTNode> getEnclosingNode(List<IASTNode> selectedNodeAsList) throws Exception {
		if (selectedNodeAsList.size() == 1) {
			List<IASTNode> returnNode = new ArrayList<IASTNode>();
			IASTNode enclosingNode = selectedNodeAsList.get(0);
			while (!(enclosingNode instanceof IASTTranslationUnit || enclosingNode == null
					|| enclosingNode.getParent() == null)) {
				enclosingNode = enclosingNode.getParent();
				if (ruleApplicableSingleNode(enclosingNode) != null) {
					returnNode.add(enclosingNode);
					return returnNode;
				}
			}
			enclosingNode = selectedNodeAsList.get(0);
			;
			if (enclosingNode instanceof CPPASTSimpleDeclaration && ((CPPASTSimpleDeclaration) enclosingNode)
					.getDeclSpecifier() instanceof CPPASTNamedTypeSpecifier) {
				IASTName name = ((CPPASTNamedTypeSpecifier) ((CPPASTSimpleDeclaration) enclosingNode)
						.getDeclSpecifier()).getName();
				returnNode.add(TransformationUtils.getDefns(name));
				returnNode.add(enclosingNode);
			}
			return returnNode;
		} else {
			// TODO: Handle case where selected node is an already compound
			// node.
		}
		return null;
	}

	private static void workQueueBlock(TTlRule rule, List<IASTNode> selectedNodeAsList) throws Exception {
		if (applyRule(rule, selectedNodeAsList) && rule != null) {
			AppliedRules.put(selectedNodeAsList, rule);
		}
		List<IASTNode> dependencies = getDependencies(selectedNodeAsList, true);
		workQueue.addAll(dependencies);
		for (IASTNode selectedNode : selectedNodeAsList) {
			workQueue.remove(selectedNode);
		}
	}

	private static boolean isNodeHandled(List<IASTNode> node) {
		Set<Object> set1 = new HashSet<Object>();
		set1.addAll(node);
		for (List<IASTNode> node2 : AppliedRules.keySet()) {
			Set<Object> set2 = new HashSet<Object>();
			set2.addAll(node2);
			if (set1.equals(set2)) {
				return true;
			}
		}
		return false;
	}

	private static boolean applyRule(TTlRule rule, List<IASTNode> selectedNodeAsList) throws Exception {
		// TODO: Make rule apply properly and perform the transformation
		System.out.println("applying rule to ");
		for (IASTNode node : selectedNodeAsList) {
			System.out.println(node.getRawSignature());
		}
		if (selectedNodeAsList.size() == 1) {
			TTlExpression ttlPattern = rule.lhs;
			TTlExpression ttlFragmentToMatch = new TTlExpression(selectedNodeAsList.get(0).getRawSignature(),
					rule.type);
			Map<String, List<IASTNode>> holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
			if (rule.scopeFragmentMap != null && rule.tagValueMap != null) {
				for (Scope scope : rule.scopeFragmentMap.keySet()) {
					ScopeVisitor s = new ScopeVisitor(scope, astRewrite);
					if (holeMap.get(rule.scopeFragmentMap.get(scope)) != null) {
						List<IASTNode> scopeMatches = holeMap.get(rule.scopeFragmentMap.get(scope));
						List<IASTNode> scopeMatchesNew = new ArrayList<IASTNode>();
						for (IASTNode node : scopeMatches) {
							node.accept(s);
							scopeMatchesNew.add(replaceNodes(node, s.nodeReplacements));
							for (String key : s.referenceReplacements.keySet()) {
								scope.tagValueMap.put(key, s.referenceReplacements.get(key));
							}
							s.refreshNodeReplacements();
						}
						holeMap.put(rule.scopeFragmentMap.get(scope), scopeMatchesNew);
					}
				}
			}
			TTlExpression ttlConstructExpression = rule.rhs;
			IASTNode nodeToReplace = null;
			for (Scope s : rule.scopeFragmentMap.keySet()) {
				if (!s.tagValueMap.isEmpty()) {
					nodeToReplace = TTLUtils.construct(holeMap, ttlConstructExpression, s.tagValueMap);
				}
			}
			if (nodeToReplace == null) {
				nodeToReplace = TTLUtils.construct(holeMap, ttlConstructExpression);
			}
			astRewrite.replace(selectedNodeAsList.get(0), nodeToReplace, new TextEditGroup("API Migration"));
		} else if (rule != null && rule.type == NodeType.DeclDefn) {
			String ruleLhsString = rule.lhs.nodeWithHoles;
			String strLhs[] = ruleLhsString.split("}");

			String ruleRhsString = rule.rhs.nodeWithHoles;
			String strRhs[] = ruleRhsString.split("}");

			// Get Hole Map for definition

			String definitionRule = strLhs[0] + "}";
			IASTNode definitionNode = getDefinition(selectedNodeAsList);
			Map<String, List<IASTNode>> definitionMatch = new HashMap<String, List<IASTNode>>();

			if (definitionNode != null) {
				definitionMatch = TTLUtils.match(new TTlExpression(definitionRule, NodeType.DeclSpecifier),
						new TTlExpression(definitionNode.getRawSignature(), NodeType.DeclSpecifier));
			}

			// Get Hole Map for declaration
			String declarationRule = "__ttltype__ " + strLhs[1];
			IASTNode declarationNode = getDeclaration(selectedNodeAsList);
			Map<String, List<IASTNode>> declarationMatch = new HashMap<String, List<IASTNode>>();

			if (declarationNode != null) {
				declarationMatch = TTLUtils.match(new TTlExpression(declarationRule, NodeType.Declaration),
						new TTlExpression(declarationNode.getRawSignature(), NodeType.Declaration));
			}

			// Apply tags and scope rules
			if (rule.scopeFragmentMap != null && rule.tagValueMap != null) {
				for (Scope scope : rule.scopeFragmentMap.keySet()) {
					ScopeVisitor s = new ScopeVisitor(scope, astRewrite);
					if (definitionMatch.get(rule.scopeFragmentMap.get(scope)) != null) {
						List<IASTNode> scopeMatches = definitionMatch.get(rule.scopeFragmentMap.get(scope));
						List<IASTNode> scopeMatchesNew = new ArrayList<IASTNode>();
						for (IASTNode node : scopeMatches) {
							node.accept(s);
							scopeMatchesNew.add(replaceNodes(node, s.nodeReplacements));
							s.refreshNodeReplacements();
						}
						definitionMatch.put(rule.scopeFragmentMap.get(scope), scopeMatchesNew);
					} else if (declarationMatch.get(rule.scopeFragmentMap.get(scope)) != null) {
						List<IASTNode> scopeMatches = declarationMatch.get(rule.scopeFragmentMap.get(scope));
						List<IASTNode> scopeMatchesNew = new ArrayList<IASTNode>();
						for (IASTNode node : scopeMatches) {
							node.accept(s);
							scopeMatchesNew.add(replaceNodes(node, s.nodeReplacements));
							s.refreshNodeReplacements();
						}
						declarationMatch.put(rule.scopeFragmentMap.get(scope), scopeMatchesNew);
					}
				}
			}

			TypeMigration typeMigration = null;
			// Apply Rule for definition
			if (definitionNode != null) {
				TTlExpression ttlConstructExpression = new TTlExpression(strRhs[0] + "}", NodeType.DeclSpecifier);
				IASTNode nodeToReplace = null;
				for (Scope s : rule.scopeFragmentMap.keySet()) {
					if (!s.tagValueMap.isEmpty()) {
						nodeToReplace = TTLUtils.construct(definitionMatch, ttlConstructExpression, s.tagValueMap);
					}
				}
				if (nodeToReplace == null) {
					nodeToReplace = TTLUtils.construct(definitionMatch, ttlConstructExpression);
				}
				astRewrite.replace(definitionNode, nodeToReplace, new TextEditGroup("API Migration"));
				typeMigration = getTypeMigration((CPPASTCompositeTypeSpecifier) definitionNode,
						(CPPASTCompositeTypeSpecifier) nodeToReplace);
			}

			// Apply rule for declaration
			if (declarationNode != null) {
				TTlExpression ttlConstructExpression = new TTlExpression(typeMigration.newTypeName + " " + strRhs[1],
						NodeType.Declaration);
				IASTNode nodeToReplace = null;
				for (Scope s : rule.scopeFragmentMap.keySet()) {
					if (!s.tagValueMap.isEmpty()) {
						nodeToReplace = TTLUtils.construct(declarationMatch, ttlConstructExpression, s.tagValueMap);
					}
				}
				if (nodeToReplace == null) {
					nodeToReplace = TTLUtils.construct(declarationMatch, ttlConstructExpression);
				}
				astRewrite.replace(declarationNode, nodeToReplace, new TextEditGroup("API Migration"));
				String oldName = getVarNameFromDeclaration((IASTDeclaration) declarationNode);
				String newName = getVarNameFromDeclaration((IASTDeclaration) nodeToReplace);
				;
				migrations.varMigrations.put(Pair.of(oldName, newName), typeMigration);
			}
		}
		return true;
	}

	private static String getVarNameFromDeclaration(IASTDeclaration declarationNode) {
		if (((CPPASTSimpleDeclaration) declarationNode).getDeclarators().length == 1) {
			return ((CPPASTSimpleDeclaration) declarationNode).getDeclarators()[0].getName().toString();
		}
		return null;
	}

	private static TypeMigration getTypeMigration(CPPASTCompositeTypeSpecifier definitionNode,
			CPPASTCompositeTypeSpecifier nodeToReplace) {
		String oldTypeName = definitionNode.getName().toString();
		String newTypeName = nodeToReplace.getName().toString();
		Map<Pair<String, String>, Pair<String, String>> fieldMapping = new HashMap<Pair<String, String>, Pair<String, String>>();
		if (definitionNode.getDeclarations(true).length <= nodeToReplace.getDeclarations(true).length) {
			for (int i = 0; i < definitionNode.getDeclarations(true).length; i++) {
				if (definitionNode.getDeclarations(true)[i] instanceof CPPASTSimpleDeclaration
						&& nodeToReplace.getDeclarations(true)[i] instanceof CPPASTSimpleDeclaration) {
					IASTDeclSpecifier oldSpecifier = ((CPPASTSimpleDeclaration) definitionNode.getDeclarations(true)[i])
							.getDeclSpecifier();
					String oldType = oldSpecifier.getRawSignature();
					String oldName = "";
					IASTDeclarator[] oldDeclarators = ((CPPASTSimpleDeclaration) definitionNode
							.getDeclarations(true)[i]).getDeclarators();
					if (oldDeclarators.length == 1) {
						oldName = oldDeclarators[0].getRawSignature();
					}

					IASTDeclSpecifier newSpecifier = ((CPPASTSimpleDeclaration) nodeToReplace.getDeclarations(true)[i])
							.getDeclSpecifier();
					String newType = newSpecifier.getRawSignature();
					String newName = "";
					IASTDeclarator[] newDeclarators = ((CPPASTSimpleDeclaration) nodeToReplace.getDeclarations(true)[i])
							.getDeclarators();
					if (newDeclarators.length == 1) {
						newName = newDeclarators[0].getRawSignature();
					}
					fieldMapping.put(Pair.of(oldType, oldName), Pair.of(newType, newName));
				}
			}
		}
		return new TypeMigration(oldTypeName, newTypeName, fieldMapping);
	}

	private static IASTNode replaceNodes(IASTNode node, Map<IASTNode, IASTNode> nodeReplacements) {
		for (IASTNode key : nodeReplacements.keySet()) {
			if (key == node) {
				IASTNode replacement = nodeReplacements.remove(key);
				return replacement;
			}
		}
		for (IASTNode child : node.getChildren()) {
			if (nodeReplacements.containsKey(child)) {
				if (node instanceof IASTAmbiguityParent) {
					IASTNode replacement = nodeReplacements.get(child);
					((IASTAmbiguityParent) node).replace(child, replacement);
					nodeReplacements.remove(child);
				}
				child = replaceNodes(child, nodeReplacements);
			}
		}
		return node;
	}

	private static TTlRule ruleApplicable(List<IASTNode> selectedNodeAsList) throws Exception {
		if (selectedNodeAsList.size() == 1) {
			return ruleApplicableSingleNode(selectedNodeAsList.get(0));
		} else {
			// only case decl definition
			return ruleApplicationEnclosingNode(selectedNodeAsList);
		}
	}

	private static TTlRule ruleApplicableSingleNode(IASTNode selectedNode) throws Exception {
		for (TTlRule rule : rules) {
			if (TTLUtils.checkType(rule.type, selectedNode)) {
				TTlExpression ttlFragmentToMatch = new TTlExpression(selectedNode.getRawSignature(), rule.type);
				if (TTLUtils.match(rule.lhs, ttlFragmentToMatch).size() > 0) {
					return rule;
				}
			}
		}
		return null;
	}

	private static TTlRule ruleApplicationEnclosingNode(List<IASTNode> selectedNodeAsList) throws Exception {
		for (TTlRule rule : rules) {
			if (rule.type == NodeType.DeclDefn) {
				String ruleString = rule.lhs.nodeWithHoles;
				String str[] = ruleString.split("}");

				// Match Definition
				String definitionRule = str[0] + "}";
				IASTNode definitionNode = getDefinition(selectedNodeAsList);
				Map<String, List<IASTNode>> definitionMatch = new HashMap<String, List<IASTNode>>();

				if (definitionNode != null) {
					definitionMatch = TTLUtils.match(new TTlExpression(definitionRule, NodeType.DeclSpecifier),
							new TTlExpression(definitionNode.getRawSignature(), NodeType.DeclSpecifier));
				}
				// Match Definition
				String declarationRule = "__ttltype__ " + str[1];
				IASTNode declarationNode = getDeclaration(selectedNodeAsList);
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

	private static List<IASTNode> getDependencies(List<IASTNode> selectedNodeAsList, boolean addDefns) {
		List<IASTNode> dependencies = new ArrayList<IASTNode>();
		for (IASTNode selectedNode : selectedNodeAsList) {
			selectedNode.accept(visitor);
			for (IASTName objectref : visitor.getObjectrefs()) {
				if (!visitor.visitedNames.contains(objectref)) {
					for (IASTNode use : TransformationUtils.getUses(objectref, ast)) {
						dependencies.add(use);
					}
					visitor.visitedNames.add(objectref);
				}
			}
			if (addDefns) {
				if (!(selectedNode instanceof CPPASTCompositeTypeSpecifier)) {
					for (IASTName typeref : visitor.getTyperefs()) {
						if (!visitor.visitedNames.contains(typeref)) {
							dependencies.add(TransformationUtils.getDefns(typeref));
							visitor.visitedNames.add(typeref);
						}
					}
				}
			}
		}
		return dependencies;
	}

}
