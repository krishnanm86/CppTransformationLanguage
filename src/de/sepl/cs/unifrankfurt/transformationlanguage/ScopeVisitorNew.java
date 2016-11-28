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
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTArraySubscriptExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFieldReference;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;
import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings({ "restriction" })
public class ScopeVisitorNew extends ASTVisitor {

	Scope scope;
	Map<String, String> nodeReplacements;
	Map<String, String> referenceReplacements;
	Map<String, String> returnedTagValues;

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public Map<String, String> getNodeReplacements() {
		return nodeReplacements;
	}

	public void setNodeReplacements(Map<String, String> nodeReplacements) {
		this.nodeReplacements = nodeReplacements;
	}

	public Map<String, String> getReferenceReplacements() {
		return referenceReplacements;
	}

	public void setReferenceReplacements(Map<String, String> referenceReplacements) {
		this.referenceReplacements = referenceReplacements;
	}

	public ScopeVisitorNew(Scope scope) {
		this.scope = scope;
		nodeReplacements = new HashMap<String, String>();
		referenceReplacements = new HashMap<String, String>();
		returnedTagValues = new HashMap<String, String>();
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
		if (expression instanceof CPPASTFieldReference) {
			try {
				if (!SearchAlgorithmNew.migrations.getMigratedName(expression.getRawSignature())
						.equals(expression.getRawSignature())) {
					String migratedExpression = SearchAlgorithmNew.migrations
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
		return super.visit(expression);
	}

	private void addMaps(Map<String, String> holeMap, Map<String, String> parametersMap) {
		if (parametersMap != null) {
			for (String str : parametersMap.keySet()) {
				holeMap.put(str, parametersMap.get(str));
			}
		}
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
				String pattern = r.lhs;
				String constructExpression = r.Rhs;
				String fragmentToMatch = node.getRawSignature();
				Map<String, String> holeMap = null;
				try {
					holeMap = TTLUtils.getHoleMapRemoveLastSemiColon(pattern, fragmentToMatch);
					addMaps(holeMap, scope.parametersMap);
					if (holeMap.size() > 0) {
						// Transform the code
						String transformedFragment = TTLUtils
								.constructUsingHoleMap(holeMap, new TTlExpression(constructExpression, r.type))
								.getRawSignature();
						nodeReplacements.put(fragmentToMatch, transformedFragment);
						// Update the tags without where clause
						updateTagWithoutWhereClaus(r.tagUpdates);

						// Update the tags with where clause
						updateTagWithWhereClause(r.tagUpdate, holeMap);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private void updateTagWithWhereClause(TagUpdate tagUpdate, Map<String, String> holeMap) {
		if (tagUpdate != null) {
			for (WhereCondition whereClaus : tagUpdate.whereClauses) {
				whereClaus.setHoleMapNew(holeMap);
			}
			try {
				tagUpdate.setTagValueNew();
			} catch (Exception e) {
				e.printStackTrace();
			}
			String tagKey = tagUpdate.tagname;
			if (returnedTagValues.containsKey(tagKey)) {
				if (!returnedTagValues.get(tagKey).equals(tagUpdate.tagvalue)) {
					returnedTagValues.put(tagKey, ScopeRule.tagEmpty);
				}
			} else {
				if (tagUpdate.tagvalue.startsWith(TTLUtils.ttlHolePrefix)) {
					returnedTagValues.put(tagKey, holeMap.get(tagUpdate.tagvalue));
				} else {
					returnedTagValues.put(tagKey, tagUpdate.tagvalue);
				}
			}

		}

	}

	private void updateTagWithoutWhereClaus(Map<String, String> tagUpdates) {
		if (tagUpdates != null) {
			for (String tag : tagUpdates.keySet()) {
				// Find out if tag value has existing update
				if (returnedTagValues.containsKey(tag)) {
					if (!returnedTagValues.get(tag).equals(tagUpdates.get(tag))) {
						returnedTagValues.put(tag, ScopeRule.tagEmpty);
					}
				} else {
					returnedTagValues.put(tag, tagUpdates.get(tag));
				}
			}
		}
	}

	public void refreshNodeReplacements() {
		nodeReplacements = new HashMap<String, String>();
	}

}
