package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.text.edits.TextEditGroup;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class ScopeVisitor extends ASTVisitor {

	Scope scope;
	private ASTRewrite astRewrite;

	public ASTRewrite getAstRewrite() {
		return astRewrite;
	}

	public void setAstRewrite(ASTRewrite astRewrite) {
		this.astRewrite = astRewrite;
	}

	public ScopeVisitor(Scope scope, ASTRewrite astRewrite) {
		this.scope = scope;
		this.astRewrite = astRewrite;
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
		applyRule(expression, NodeType.Expression);
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
				TTlExpression ttlPattern = new TTlExpression(r.lhs, type);
				TTlExpression ttlConstructExpression = new TTlExpression(r.Rhs, type);
				TTlExpression ttlFragmentToMatch = new TTlExpression(node.getRawSignature(), type);
				Map<String, List<IASTNode>> holeMap = null;
				try {
					System.out.println("Applying Scope Rule");
					holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
					if (holeMap.size() > 0) {
						TTLUtils.printHoleMap(holeMap);
						System.out.println(TTLUtils.construct(holeMap, ttlConstructExpression).getRawSignature());

						for (String tagKey : r.tagUpdates.keySet()) {
							// scope.tagValueMap.put(tagKey,
							// r.tagUpdates.get(tagKey));
							if (scope.tagValueMap.containsKey(tagKey)) {
								if (!scope.tagValueMap.get(tagKey).equals(r.tagUpdates.get(tagKey))) {
									scope.tagValueMap.put(tagKey, ScopeRule.tagEmpty);
								}
							} else {
								scope.tagValueMap.put(tagKey, r.tagUpdates.get(tagKey));
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

}
