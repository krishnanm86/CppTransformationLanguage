package de.sepl.cs.unifrankfurt.transformationlanguage;

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
		 * 
		 * TTlExpression ttlPattern = new TTlExpression(
		 * "for(int i = 0 ; i < 10; i++ ) {__ttla();fnd();__ttlc();}",
		 * NodeType.Statement); TTlExpression ttlFragmentToMatch = new
		 * TTlExpression(
		 * "for(int i = 0 ; i < 10; i++ ) {fna();fnc();fnd();holec();}",
		 * NodeType.Statement); TTLUtils.printHoleMap(TTLUtils.match(ttlPattern,
		 * ttlFragmentToMatch));
		 */
		String str = "abc__ttla();kdjsahkasdhfkh__ttlb();ksjdhfakjhf__ttla();lsdjakjh";
		System.out.println(str.replace("__ttla();", "replacement"));
	}
}
