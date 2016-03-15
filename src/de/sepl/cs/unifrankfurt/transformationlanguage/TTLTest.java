package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
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

		// ASTPrinter.print(TTLUtils.getStatement("for(int i = 0 ; i < 10; i++ )
		// {__ttla__; }"));
		// ASTPrinter.print(TTLUtils.getExpression("a[__ttla__]"));

		/*
		 * TTlExpression ttlPattern = new TTlExpression(
		 * "struct __ttlstructname__ {  __ttlstructbody__; }",
		 * NodeType.DeclSpecifier); TTlExpression ttlConstructExpression = new
		 * TTlExpression( "struct __ttlstructname___v {  __ttlstructbody__; }",
		 * NodeType.DeclSpecifier);
		 * 
		 * TTlExpression ttlFragmentToMatch = new TTlExpression(
		 * "struct A{ int  a; int b;} ", NodeType.DeclSpecifier); Map<String,
		 * List<IASTNode>> holeMap = TTLUtils.match(ttlPattern,
		 * ttlFragmentToMatch); TTLUtils.printHoleMap(holeMap);
		 * System.out.println(TTLUtils.construct(holeMap,
		 * ttlConstructExpression).getRawSignature());
		 */

		Map<Pair<String, String>, TypeMigration> varMigrations = new HashMap<Pair<String, String>, TypeMigration>();
		Map<Pair<String, String>, Pair<String, String>> fieldMapping = new HashMap<Pair<String, String>, Pair<String, String>>();
		fieldMapping.put(Pair.of("int", "a"), Pair.of("int_v", "a_v"));
		TypeMigration typeMigr = new TypeMigration("A", "A_v", fieldMapping);
		varMigrations.put(Pair.of("aobj", "aobj_v"), typeMigr);
		Migrations migr = new Migrations(varMigrations);

		System.out.println(migr.getMigratedName("aobj[90].a"));
	}
}
