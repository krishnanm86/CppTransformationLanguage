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

		TTlExpression rulePattern2 = new TTlExpression(
				"for (int i = 0; i < __ttllimit__; __ttli__++) { __ttlforbody__ }", NodeType.Statement);
		TTlExpression ruleConstructExpression2 = new TTlExpression(
				"for (int i = 0; i < 1000; i++) { float temp1 = input[i].x; float temp2 = input[i].y; output[i].r = std::sqrt((x * x) + (y * y)); output[i].phi = std::atan2(y, x) * 57.29578018188476f; if (output[i].phi < 0.f) { output[i].phi += 360.f; } }",
				NodeType.Statement);

	
		StringTemplate matcher = new StringTemplate(rulePattern2.nodeWithHoles);
		Map<String, String> holeMap = matcher.parse(ruleConstructExpression2.nodeWithHoles);
		System.out.println(holeMap);	
	}
}
