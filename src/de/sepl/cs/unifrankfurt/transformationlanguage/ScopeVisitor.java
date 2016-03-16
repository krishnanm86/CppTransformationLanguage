package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFieldReference;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionCallExpression;
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
	}

	@Override
	public int visit(IASTDeclaration declaration) {
		applyRule(declaration, NodeType.Declaration);
		return super.visit(declaration);
	}

	@Override
	public int visit(IASTExpression expression) {
		if(expression instanceof CPPASTFunctionCallExpression)
		{
			System.out.println();
		}
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

		return super.visit(expression);
	}

	@Override
	public int visit(IASTStatement statement) {
		applyRule(statement, NodeType.Statement);
		return super.visit(statement);
	}

	private void applyRule(IASTNode node, NodeType type) {
		for (ScopeRule r : scope.rules) {
			if (r.type == type) {
				System.out.println("Applying rule " + r.lhs + " to  " + node.getRawSignature());
				TTlExpression ttlPattern = new TTlExpression(r.lhs, type);
				TTlExpression ttlConstructExpression = new TTlExpression(r.Rhs, type);
				TTlExpression ttlFragmentToMatch = new TTlExpression(node.getRawSignature(), type);
				Map<String, List<IASTNode>> holeMap = null;
				try {
					holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
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
								scope.tagValueMap.put(tagKey, r.tagUpdate.tagvalue);
							}

						} else {
							scope.tagValueMap.put(node.getRawSignature(),
									TTLUtils.construct(holeMap, ttlConstructExpression).getRawSignature());
							for (String tagKey : r.tagUpdates.keySet()) {
								if (scope.tagValueMap.containsKey(tagKey)) {
									if (!scope.tagValueMap.get(tagKey).equals(r.tagUpdates.get(tagKey))) {
										scope.tagValueMap.put(tagKey, ScopeRule.tagEmpty);
									}
								} else {
									scope.tagValueMap.put(tagKey, r.tagUpdates.get(tagKey));
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

	public void refreshNodeReplacements() {
		nodeReplacements = new HashMap<IASTNode, IASTNode>();
	}

}
