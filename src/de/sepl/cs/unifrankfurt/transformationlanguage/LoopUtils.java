package de.sepl.cs.unifrankfurt.transformationlanguage;

import org.eclipse.cdt.core.parser.util.ASTPrinter;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTForStatement;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTLiteralExpression;

@SuppressWarnings("restriction")
public class LoopUtils {

	public static int findLimit(CPPASTForStatement forStat) {
		int limit = 0;
		CPPASTBinaryExpression expr = (CPPASTBinaryExpression) forStat.getConditionExpression();
		ASTPrinter.print(expr);
		System.out.println(((CPPASTLiteralExpression) expr.getOperand2()).getValue());
		String limStr = new String(((CPPASTLiteralExpression) expr.getOperand2()).getValue());
		limit = Integer.parseInt(limStr);
		return limit;
	}

	public static void setNewLimit(CPPASTForStatement replaceForStat, CPPASTLiteralExpression newLimitExpression) {
		CPPASTBinaryExpression condExpr = (CPPASTBinaryExpression) replaceForStat.getConditionExpression().copy();
		condExpr.setOperand2(newLimitExpression);
		replaceForStat.setConditionExpression(condExpr);
	}

}
