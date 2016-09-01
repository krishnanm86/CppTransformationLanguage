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
		String pattern = "__ttla__ = __ttlb__ + __ttlc__;";
		String transform = "mpz_add(__ttla__,__ttlb__,__ttlc__);";
		TTlExpression ttlPattern = new TTlExpression(pattern, NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(transform, NodeType.Statement);
		TTlExpression ttlFragmentToMatch = new TTlExpression("x = y + z;", NodeType.Statement);
		StringTemplate matcher = new StringTemplate(ttlPattern.nodeWithHoles);
		Map<String, String> holeMap = matcher.parse(ttlFragmentToMatch.nodeWithHoles);
		System.out.println(TTLUtils.constructUsingHoleMap(holeMap, ttlConstructExpression).getRawSignature());
		
		TTlExpression ttlForPattern = new TTlExpression(
				"for(int i = 0 ; i < __ttllimit__; __ttli__++ ) {__ttlforbody__;  }", NodeType.Statement);
		TTlExpression ttlForConstructExpression = new TTlExpression(
				"for(int __ttli__ = 0 ; __ttli__ < __ttllimit__/__tagttlvctypeloop__::size; __ttli__++ ) {__ttlforbody__;  }",
				NodeType.Statement);
	}
}
