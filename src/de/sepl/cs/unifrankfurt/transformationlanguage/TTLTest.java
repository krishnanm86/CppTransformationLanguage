package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.parser.util.ASTPrinter;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class TTLTest {

	public static void main(String[] args) throws Exception {
		/*
		 * TTlExpression ttlPattern = new TTlExpression(
		 * "for(int i = 0 ; i < 10; i++ ) {__ttla();fnd();__ttlc();}",
		 * NodeType.Statement); TTlExpression ttlFragmentToMatch = new
		 * TTlExpression(
		 * "for(int i = 0 ; i < 10; i++ ) {fna();fnd(); fnc();fnx();}",
		 * NodeType.Statement); TTLUtils.printHoleMap(TTLUtils.match(ttlPattern,
		 * ttlFragmentToMatch));
		 */
		
		//ASTPrinter.print(TTLUtils.getStatement("for(int i = 0 ; i < 10; i++ ) {__ttla__; }"));
		//ASTPrinter.print(TTLUtils.getExpression("a[__ttla__]"));
	
		 TTlExpression ttlPattern = new TTlExpression("struct __ttlstructname__ { float __ttlx__;};",
				NodeType.DeclSpecifier);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"struct __ttlstructname___v { float_v __ttlx___v;};", NodeType.DeclSpecifier);

		TTlExpression ttlFragmentToMatch = new TTlExpression(
				"struct A { float x;}; ", NodeType.DeclSpecifier);
		Map<String, List<IASTNode>> holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
		TTLUtils.printHoleMap(holeMap);
		System.out.println(TTLUtils.construct(holeMap, ttlConstructExpression).getRawSignature());
	}
}
