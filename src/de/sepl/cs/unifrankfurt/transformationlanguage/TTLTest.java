package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.cdt.core.dom.ast.IASTBinaryExpression;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.parser.util.ASTPrinter;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBinaryExpression;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class TTLTest {

	public static void main(String[] args) throws Exception {
		
		TTlExpression rulePattern2 = new TTlExpression("if (__ttlc__) __ttlx__ += __ttle__;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("__ttlx__(__ttlc__) += __ttle__", NodeType.Statement);
		
		
		TTlExpression addExpr = new TTlExpression("if (output[i].phi < 0.f) output[i].phi  += 360.f;", NodeType.Statement);
		StringTemplate matcher = new StringTemplate(rulePattern2.nodeWithHoles);
		Map<String, String> holeMap = matcher.parse(addExpr.nodeWithHoles);
		System.out.println(holeMap);
		System.out.println(TTLUtils.constructUsingHoleMap(holeMap, ruleConstructExpression2).getRawSignature());
	}
}
