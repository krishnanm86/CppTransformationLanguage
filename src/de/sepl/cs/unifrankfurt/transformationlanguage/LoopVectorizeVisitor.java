package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.cdt.core.dom.ast.ASTNodeFactoryFactory;
import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPNodeFactory;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTForStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTLiteralExpression;
import org.eclipse.text.edits.TextEditGroup;

@SuppressWarnings("restriction")
public class LoopVectorizeVisitor extends ASTVisitor {
	private Log logger = LogFactory.getLog(getClass());
	private static ICPPNodeFactory nodeFactory = ASTNodeFactoryFactory.getDefaultCPPNodeFactory();
	private List<Integer> forLoopLineNos;
	private ASTRewrite rewriter;
	private TextEditGroup editGroup;

	public LoopVectorizeVisitor(List<Integer> forLoopLineNos, ASTRewrite rewriterForTranslationUnit,
			TextEditGroup editGroup) {
		this.forLoopLineNos = forLoopLineNos;
		rewriter = rewriterForTranslationUnit;
		this.editGroup = editGroup;
		shouldVisitStatements = true;
	}

	@Override
	public int visit(IASTStatement statement) {
		if (statement instanceof CPPASTForStatement) {
			int forLoopLocation = statement.getFileLocation().getStartingLineNumber();
			if (forLoopLineNos.contains(forLoopLocation - 1)) {
				CPPASTForStatement forStat = (CPPASTForStatement) statement;
				logger.info("The limit is " + LoopUtils.findLimit(forStat));
				CPPASTForStatement replaceForStat = forStat.copy();
				CPPASTLiteralExpression newLimitExpression = (CPPASTLiteralExpression) nodeFactory
						.newLiteralExpression(CPPASTLiteralExpression.lk_integer_constant, "0");
				try {
					LoopUtils.setNewVCExprAsLimit(replaceForStat);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rewriter.replace(statement, replaceForStat, editGroup);
			}
		}
		return super.visit(statement);
	}

}
