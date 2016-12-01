package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFieldReference;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

@SuppressWarnings({ "restriction" })
public class ScopeVisitorNew extends ASTVisitor {

	Scope scope;
	Map<String, String> nodeReplacements;
	Map<String, String> referenceReplacements;
	Map<String, String> returnedTagValues;
	private TTlRule rule;

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

	public ScopeVisitorNew(Scope scope, TTlRule rule) {
		this.scope = scope;
		nodeReplacements = new HashMap<String, String>();
		referenceReplacements = new HashMap<String, String>();
		returnedTagValues = new HashMap<String, String>();
		shouldVisitDeclarations = true;
		shouldVisitStatements = true;
		shouldVisitExpressions = true;
		shouldVisitNames = true;
		this.rule = rule;
	}

	@Override
	public int visit(IASTDeclaration declaration) {
		applyRule(declaration, NodeType.Declaration);
		return super.visit(declaration);
	}

	@Override
	public int visit(IASTName name) {
		try {
			for (Pair<String, String> varMigration : SearchAlgorithmNew.migrations.varMigrations.keySet()) {
				if (name.toString().equals(varMigration.getLeft())) {
					referenceReplacements.put(name.toString(), varMigration.getRight());
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

	@Override
	public int visit(IASTStatement statement) {
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
					rule.isRuleApplicationFail = true;
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
						rule.isRuleApplicationFail = true;
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
