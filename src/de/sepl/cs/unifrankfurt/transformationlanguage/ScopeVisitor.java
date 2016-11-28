package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTArraySubscriptExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFieldReference;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionCallExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings("restriction")
public class ScopeVisitor extends ASTVisitor {

	Scope scope;
	private ASTRewrite astRewrite;
	Map<IASTNode, IASTNode> nodeReplacements;
	Map<String, String> referenceReplacements;

	public ASTRewrite getAstRewrite() {
		return astRewrite;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public Map<IASTNode, IASTNode> getNodeReplacements() {
		return nodeReplacements;
	}

	public void setNodeReplacements(Map<IASTNode, IASTNode> nodeReplacements) {
		this.nodeReplacements = nodeReplacements;
	}

	public Map<String, String> getReferenceReplacements() {
		return referenceReplacements;
	}

	public void setReferenceReplacements(Map<String, String> referenceReplacements) {
		this.referenceReplacements = referenceReplacements;
	}

	public void setAstRewrite(ASTRewrite astRewrite) {
		this.astRewrite = astRewrite;
	}

	public ScopeVisitor(Scope scope, ASTRewrite astRewrite) {
		this.scope = scope;
		this.astRewrite = astRewrite;
		nodeReplacements = new HashMap<IASTNode, IASTNode>();
		referenceReplacements = new HashMap<String, String>();
		shouldVisitDeclarations = true;
		shouldVisitStatements = true;
		shouldVisitExpressions = true;
		shouldVisitNames = true;
	}

	@Override
	public int visit(IASTDeclaration declaration) {
		System.out.println("visiting" + declaration.getRawSignature());
		applyRule(declaration, NodeType.Declaration);
		return super.visit(declaration);
	}

	@Override
	public int visit(IASTName name) {
		try {
			for (Pair<String, String> varMigration : SearchAlgorithm.migrations.varMigrations.keySet()) {
				if (name.toString().equals(varMigration.getLeft())) {
					referenceReplacements.put(name.toString(), varMigration.getRight());
					System.out.println("Migrating " + name.toString() + " to " + varMigration.getRight());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return super.visit(name);
	}

	@Override
	public int visit(IASTExpression expression) {
		System.out.println("visiting" + expression.getRawSignature());
		if (expression instanceof CPPASTFieldReference) {
			try {
				if (!SearchAlgorithm.migrations.getMigratedName(expression.getRawSignature())
						.equals(expression.getRawSignature())) {
					String migratedExpression = SearchAlgorithm.migrations
							.getMigratedName(expression.getRawSignature());
					referenceReplacements.put(expression.getRawSignature(), migratedExpression);
					System.out.println("Migrating " + expression.getRawSignature() + " to " + migratedExpression);

				}
				applyRule(expression, NodeType.Expression);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			applyRule(expression, NodeType.Expression);
		}
		try {
			getRHSofLHS(expression);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.visit(expression);
	}

	private IASTExpression getRHSofLHS(IASTNode expression) throws Exception {
		while (!(expression instanceof CPPASTBinaryExpression) && !(expression instanceof IASTTranslationUnit)
				&& (expression != null)) {
			expression = expression.getParent();
		}
		if (expression instanceof CPPASTBinaryExpression) {
			if ((((CPPASTBinaryExpression) expression).getOperator() == IASTBinaryExpression.op_assign)
					&& (((CPPASTBinaryExpression) expression).getOperand1() instanceof CPPASTFieldReference)) {
				CPPASTFieldReference ref = (CPPASTFieldReference) ((CPPASTBinaryExpression) expression).getOperand1();
				System.out.println("Need to find definition of " + ref.getRawSignature());
				IASTName name = null;
				if (ref.getFieldOwner() instanceof CPPASTArraySubscriptExpression) {
					// Array Subscript case
					if (((CPPASTArraySubscriptExpression) ref.getFieldOwner())
							.getArrayExpression() instanceof CPPASTIdExpression) {
						name = ((CPPASTIdExpression) ((CPPASTArraySubscriptExpression) ref.getFieldOwner())
								.getArrayExpression()).getName();
					}
				} else if (ref.getFieldOwner() instanceof CPPASTIdExpression) {
					// Normal field reference case
					name = ((CPPASTIdExpression) ref.getFieldOwner()).getName();
				}
				if (name != null) {
					findAndApplyRule(name);
				}
			}
		}
		return null;
	}

	private void findAndApplyRule(IASTName name) throws Exception {
		List<IASTNode> enclosingNode = new ArrayList<IASTNode>();
		for (IASTDeclaration decl : SearchAlgorithm.ast.getDeclarations()) {
			if (decl.getRawSignature().contains(name.toString())) {
				enclosingNode.add(decl);
				if (decl instanceof CPPASTSimpleDeclaration
						&& ((CPPASTSimpleDeclaration) decl).getDeclSpecifier() instanceof CPPASTNamedTypeSpecifier) {
					IASTName nameDecl = ((CPPASTNamedTypeSpecifier) ((CPPASTSimpleDeclaration) decl).getDeclSpecifier())
							.getName();
					enclosingNode.add(TransformationUtils.getDefns(nameDecl));
				}
			}
		}
		TTlRule rule = SearchAlgorithm.ruleApplicable(enclosingNode);
		if (SearchAlgorithm.applyRule(rule, enclosingNode) && rule != null) {
			SearchAlgorithm.AppliedRules.put(enclosingNode, rule);
		}
	}

	@Override
	public int visit(IASTStatement statement) {
		System.out.println("visiting" + statement.getRawSignature());
		applyRule(statement, NodeType.Statement);
		return super.visit(statement);
	}

	private void applyRule(IASTNode node, NodeType type) {
		for (ScopeRule r : scope.rules) {
			if (r.type == type) {
				TTlExpression ttlPattern = new TTlExpression(r.lhs, type);
				TTlExpression ttlConstructExpression = new TTlExpression(r.Rhs, type);
				TTlExpression ttlFragmentToMatch = new TTlExpression(node.getRawSignature(), type);
				Map<String, List<IASTNode>> holeMap = null;
				try {
					holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
					//addMaps(holeMap, scope.parametersMap);
					if (holeMap.size() > 0) {
						TTLUtils.printHoleMap(holeMap);
						scope.tagValueMap.put(node.getRawSignature(),
								TTLUtils.construct(holeMap, ttlConstructExpression).getRawSignature());
						if (r.tagUpdate != null) {
							for (WhereCondition whereClaus : r.tagUpdate.whereClauses) {
								whereClaus.setHoleMap(holeMap);
							}
							r.tagUpdate.setTagValue();
							String tagKey = r.tagUpdate.tagname;
							if (scope.tagValueMap.containsKey(tagKey)) {
								if (!scope.tagValueMap.get(tagKey).equals(r.tagUpdate.tagvalue)) {
									scope.tagValueMap.put(tagKey, ScopeRule.tagEmpty);
								}
							} else {
								if (r.tagUpdate.tagvalue.startsWith(TTLUtils.ttlHolePrefix)) {
									scope.tagValueMap.put(tagKey,
											holeMap.get(r.tagUpdate.tagvalue).get(0).getRawSignature());
								} else {
									scope.tagValueMap.put(tagKey, r.tagUpdate.tagvalue);
								}
							}

						} else {
							scope.tagValueMap.put(node.getRawSignature(),
									TTLUtils.construct(holeMap, ttlConstructExpression).getRawSignature());
							for (String tagKey : r.tagUpdates.keySet()) {
								String tagValue = r.tagUpdates.get(tagKey);
								if (tagValue.startsWith(TTLUtils.ttlHolePrefix)) {
									tagValue = holeMap.get(tagValue).get(0).getRawSignature();
								}
								if (scope.tagValueMap.containsKey(tagKey)) {
									if (!scope.tagValueMap.get(tagKey).equals(tagValue)) {
										scope.tagValueMap.put(tagKey, ScopeRule.tagEmpty);
									}
								} else {
									scope.tagValueMap.put(tagKey, tagValue);

								}
							}
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * private void applyRule(IASTNode node, NodeType type) { for (ScopeRule r :
	 * scope.rules) { if (r.type == type) { TTlExpression ttlPattern = new
	 * TTlExpression(r.lhs, type); TTlExpression ttlConstructExpression = new
	 * TTlExpression(r.Rhs, type); TTlExpression ttlFragmentToMatch = new
	 * TTlExpression(node.getRawSignature(), type); Map<String, String> holeMap
	 * = null; try { holeMap =
	 * TTLUtils.getHoleMapRemoveLastSemiColon(ttlPattern.nodeWithHoles,
	 * ttlFragmentToMatch.nodeWithHoles); if (holeMap.size() > 0) {
	 * System.out.println(holeMap);
	 * scope.tagValueMap.put(node.getRawSignature(),
	 * TTLUtils.constructUsingHoleMap(holeMap,
	 * ttlConstructExpression).getRawSignature()); if (r.tagUpdate != null) {
	 * for (WhereCondition whereClaus : r.tagUpdate.whereClauses) {
	 * //whereClaus.setHoleMap(holeMap); } r.tagUpdate.setTagValue(); String
	 * tagKey = r.tagUpdate.tagname; if (scope.tagValueMap.containsKey(tagKey))
	 * { if (!scope.tagValueMap.get(tagKey).equals(r.tagUpdate.tagvalue)) {
	 * scope.tagValueMap.put(tagKey, ScopeRule.tagEmpty); } } else { if
	 * (r.tagUpdate.tagvalue.startsWith(TTLUtils.ttlHolePrefix)) {
	 * scope.tagValueMap.put(tagKey, holeMap.get(r.tagUpdate.tagvalue)); } else
	 * { scope.tagValueMap.put(tagKey, r.tagUpdate.tagvalue); } }
	 * 
	 * } else { scope.tagValueMap.put(node.getRawSignature(),
	 * TTLUtils.constructUsingHoleMap(holeMap,
	 * ttlConstructExpression).getRawSignature()); for (String tagKey :
	 * r.tagUpdates.keySet()) { String tagValue = r.tagUpdates.get(tagKey); if
	 * (tagValue.startsWith(TTLUtils.ttlHolePrefix)) { tagValue =
	 * holeMap.get(tagValue); } if (scope.tagValueMap.containsKey(tagKey)) { if
	 * (!scope.tagValueMap.get(tagKey).equals(tagValue)) {
	 * scope.tagValueMap.put(tagKey, ScopeRule.tagEmpty); } } else {
	 * scope.tagValueMap.put(tagKey, tagValue);
	 * 
	 * } } } } } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } } }
	 */

	private void addMaps(Map<String, List<IASTNode>> holeMap, Map<String, List<IASTNode>> parametersMap) {
		for (String str : parametersMap.keySet()) {
			holeMap.put(str, parametersMap.get(str));
		}

	}

	public void refreshNodeReplacements() {
		nodeReplacements = new HashMap<IASTNode, IASTNode>();
	}

}
