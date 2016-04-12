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
		/*
		 * TTlExpression ttlPattern = new TTlExpression(
		 * "for(int i = 0 ; i < 10; i++ ) {__ttla();fnd();__ttlc();}",
		 * NodeType.Statement); TTlExpression ttlFragmentToMatch = new
		 * TTlExpression(
		 * "for(int i = 0 ; i < 10; i++ ) {fna();fnd(); fnc();fnx();}",
		 * NodeType.Statement); TTLUtils.printHoleMap(TTLUtils.match(ttlPattern,
		 * ttlFragmentToMatch));
		 */
		/*
		 * String ruleExpression = "x = y +  __ttlconstant__ + 25*z;";
		 * List<String> pileList = new ArrayList<String>(); PileList pileL = new
		 * PileList("25*z, __ttlconstant__", true);
		 * pileL.updateUntouchables(ruleExpression); for(String str :
		 * pileL.unacceptableExpressions) { System.out.println("un " + str); }
		 * 
		 * for(String str : pileL.acceptableExpressions) { System.out.println(
		 * "ac " + str); }
		 */


		TTlExpression ttlPattern = new TTlExpression(
				"for(int i = 0; i < __ttlouterlimit__; __ttlouterindex__++) {__ttlouterbody__; for(int j = 0; j < __ttlinnerlimit__; __ttlinnerindex__++) { __ttlinnerbody__; }}",
				NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"for(int __ttlouterindex__ = 0; __ttlouterindex__ < __ttlouterlimit__; __ttlouterindex__+=2) {__ttlouterbody__; for(int __ttlinnerindex__ = 0; __ttlinnerindex__ < __ttlinnerlimit__; __ttlinnerindex__+=2) { for(int x = __ttlouterindex__; x < min( __ttlouterindex__ +2. __ttlouterlimit__) ; x++){ for(int y = __ttlinnerindex__; x < min( __ttlinnerindex__+2. __ttlouterlimit__) ; y++){ __ttlinnerbody__; }}}}",
				NodeType.Statement);
		TTlExpression ttlFragmentToMatch = new TTlExpression(
				"for (int i = 0; i < n; i++) { c[i] = 0; for (int j = 0; j < n; j++) { c[i] = c[i] + a[i][j] * b[j]; } }",
				NodeType.Statement);
		Map<String, List<IASTNode>> holeMap = TTLUtils.match(ttlPattern, ttlFragmentToMatch);
		TTLUtils.printHoleMap(holeMap);
		System.out.println(TTLUtils.construct(holeMap, ttlConstructExpression).getRawSignature());

		/*
		 * Map<Pair<String, String>, TypeMigration> varMigrations = new
		 * HashMap<Pair<String, String>, TypeMigration>(); Map<Pair<String,
		 * String>, Pair<String, String>> fieldMapping = new
		 * HashMap<Pair<String, String>, Pair<String, String>>();
		 * fieldMapping.put(Pair.of("int", "a"), Pair.of("int_v", "a_v"));
		 * TypeMigration typeMigr = new TypeMigration("A", "A_v", fieldMapping);
		 * varMigrations.put(Pair.of("aobj", "aobj_v"), typeMigr); Migrations
		 * migr = new Migrations(varMigrations);
		 */
		// System.out.println(migr.getMigratedName("aobj[90].a"));
	}
}
