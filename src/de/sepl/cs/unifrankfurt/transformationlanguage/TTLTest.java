package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTNode;
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
	
		 TTlExpression ttlPattern = new TTlExpression("for(int i = 0 ; i < 10; i++ ) {__ttla__; fnd(); __ttlc__; }",
				NodeType.Statement);
		TTlExpression ttlFragmentToMatch = new TTlExpression(
				"for(int i = 0 ; i < 10; i++ ) {fna();fnc();fnd();holec();}", NodeType.Statement);
		Map<String, List<IASTNode>> holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
		TTLUtils.printHoleMap(holeMap);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"for(int i = 0 ; i < 10; i++ ) {__ttla__;  __ttlc__; fnd();}", NodeType.Statement);
		ASTPrinter.print(TTLUtils.construct(holeMap, ttlConstructExpression));
	}
}
