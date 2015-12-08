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

public class TTLRuleApplicator extends ASTVisitor {

	private Map<TTlExpression, TTlExpression> ttlRule;
	private ASTRewrite rewriter;
	private TextEditGroup editGroup;
	Map<String, List<IASTNode>> holeMap;

	public TTLRuleApplicator(Map<TTlExpression, TTlExpression> ttlRule, ASTRewrite rewriterForTranslationUnit,
			TextEditGroup editGroup) {
		this.ttlRule = ttlRule;
		this.rewriter = rewriterForTranslationUnit;
		this.editGroup = editGroup;
		shouldVisitStatements = true;
		shouldVisitDeclarations = true;
		shouldVisitExpressions = true;
	}

	@Override
	public int visit(IASTDeclaration declaration) {
		for (TTlExpression ttlPattern : ttlRule.keySet()) {
			if (ttlPattern.type == NodeType.Declaration) {
				TTlExpression fragmentToMatch = new TTlExpression(declaration.getRawSignature(), NodeType.Declaration);
				IASTNode replaceMentNode = null;
				try {
					holeMap = TTLUtils.match(ttlPattern, fragmentToMatch);
					if (holeMap != null && holeMap.size() != 0) {
						replaceMentNode = TTLUtils.construct(holeMap, ttlRule.get(ttlPattern));
						rewriter.replace(declaration, replaceMentNode, editGroup);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return super.visit(declaration);
	}

	@Override
	public int visit(IASTExpression expression) {
		for (TTlExpression ttlPattern : ttlRule.keySet()) {
			if (ttlPattern.type == NodeType.Expression) {
				TTlExpression fragmentToMatch = new TTlExpression(expression.getRawSignature(), NodeType.Expression);
				IASTNode replaceMentNode = null;
				try {
					holeMap = TTLUtils.match(ttlPattern, fragmentToMatch);
					if (holeMap != null && holeMap.size() != 0) {
						replaceMentNode = TTLUtils.construct(holeMap, ttlRule.get(ttlPattern));
						rewriter.replace(expression, replaceMentNode, editGroup);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
		return super.visit(expression);
	}

	@Override
	public int visit(IASTStatement statement) {
		for (TTlExpression ttlPattern : ttlRule.keySet()) {
			if (ttlPattern.type == NodeType.Statement) {
				TTlExpression fragmentToMatch = new TTlExpression(statement.getRawSignature(), NodeType.Statement);
				IASTNode replaceMentNode = null;
				try {
					holeMap = TTLUtils.match(ttlPattern, fragmentToMatch);
					if (holeMap != null && holeMap.size() != 0) {
						replaceMentNode = TTLUtils.construct(holeMap, ttlRule.get(ttlPattern));
						rewriter.replace(statement, replaceMentNode, editGroup);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return super.visit(statement);
	}

}
