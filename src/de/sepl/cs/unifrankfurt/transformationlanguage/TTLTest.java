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

		TTlExpression ruleConstructExpression2 = new TTlExpression(
				"poly->coefficients = (int*) malloc(sizeof(int));", NodeType.Statement);
		TTlExpression rulePattern2 = new TTlExpression(
				"__ttlname__ = (int*) malloc(sizeof(int));",
				NodeType.Statement);

	
		StringTemplate matcher = new StringTemplate(rulePattern2.nodeWithHoles);
		Map<String, String> holeMap = matcher.parse(ruleConstructExpression2.nodeWithHoles);
		System.out.println(holeMap);	
	}
}
