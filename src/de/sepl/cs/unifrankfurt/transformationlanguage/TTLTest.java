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
		String pattern = "__ttltype__  __ttlaobj__[__ttllimit__];";
		String transform = "__ttltype___v __ttlaobj___v[__ttllimit__/float_v::size];";
		TTlExpression ttlPattern = new TTlExpression(pattern, NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(transform, NodeType.Statement);
		TTlExpression ttlFragmentToMatch = new TTlExpression("PolarCoordinate output[1000];", NodeType.Statement);
		

		TTlExpression ttlForPattern = new TTlExpression(
				"for(int i = 0 ; i < __ttllimit__ ; __ttli__++ ) { __ttlforbody__; }", NodeType.Statement);
		TTlExpression ttlForConstructExpression = new TTlExpression(
				"for(int __ttli__ = 0 ; __ttli__ < __ttllimit__/float_v::size; __ttli__++ ) { __ttlforbody__;  }",
				NodeType.Statement);
		TTlExpression ttlFragmentToMatchFor = new TTlExpression(
				"for(int i = 0 ; i < 1000 ; i++ ) { float temp1 = input[i].x; float temp2 = input[i].y; output[i].r = std::sqrt((x * x) + (y * y)); output[i].phi = std::atan2(y, x) * 57.295780181884765625f; }",
				NodeType.Statement);
		
		TTlExpression ttlFragmentToMatchFor1 = new TTlExpression(
				"for(int i = 0 ; i < 1000 ; i++ ) { FN1(); }",
				NodeType.Statement);
		TTlExpression rulePattern1 = new TTlExpression("__ttlp__ = __ttlp2__ + __ttlp3__;", NodeType.Statement);
		TTlExpression ruleConstructExpression1 = new TTlExpression("mpz_add(__ttlp__,__ttlp2__,__ttlp3__);",
				NodeType.Statement);
		
		TTlExpression rulePattern2 = new TTlExpression("__ttlp__ = __ttlp2__;", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression("mpz_set(__ttlp__,__ttlp2__);", NodeType.Statement);
		
		
		TTlExpression addExpr = new TTlExpression("arr[j+1] = arr[j];", NodeType.Statement);
		StringTemplate matcher = new StringTemplate(rulePattern2.nodeWithHoles);
		Map<String, String> holeMap = matcher.parse(addExpr.nodeWithHoles);
		System.out.println(holeMap);
		System.out.println(TTLUtils.constructUsingHoleMap(holeMap, ruleConstructExpression2).getRawSignature());
	}
}
