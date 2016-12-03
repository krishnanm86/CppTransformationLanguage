package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.Map;

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
