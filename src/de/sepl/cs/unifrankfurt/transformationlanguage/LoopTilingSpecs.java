package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class LoopTilingSpecs {

	public static Set<TTlRule> populateRules() throws Exception {
		Set<TTlRule> rules = new HashSet<TTlRule>();

		TTlExpression ttlPattern1 = new TTlExpression(
				"for(int i = 0; i < __ttlouterlimit__; __ttlouterindex__++) {__ttlouterbody__; for(int j = 0; j < __ttlinnerlimit__; __ttlinnerindex__++) { __ttlinnerbody__; }}",
				NodeType.Statement);
		TTlExpression ttlConstructExpression1 = new TTlExpression(
				"for(int __ttlouterindex__ = 0; __ttlouterindex__ < __ttlouterlimit__; __ttlouterindex__+=2) {__ttlouterbody__; for(int __ttlinnerindex__ = 0; __ttlinnerindex__ < __ttlinnerlimit__; __ttlinnerindex__+=2) { for(int x = __ttlouterindex__; x < min( __ttlouterindex__ +2, __ttlouterlimit__) ; x++){ for(int y = __ttlinnerindex__; x < min( __ttlinnerindex__+2, __ttlouterlimit__) ; y++){ __ttlinnerbody__; }}}}",
				NodeType.Statement);
		rules.add(new TTlRule(ttlPattern1, ttlConstructExpression1, NodeType.Statement, getScopeFragMentMapFor(),
				getTagValueMapStruct()));
		return rules;
	}

	private static Map<Tag, String> getTagValueMapStruct() {
		Map<Tag, String> tagValueMap = new HashMap<Tag, String>();
		return tagValueMap;
	}

	private static Map<Scope, String> getScopeFragMentMapFor() {

		String outerscopeLHS = "__ttlvarname__[__ttlvarindex__] = __ttlconstant__;";
		String outerscopeRHS = "__ttlvarname__[__ttlvarindex__] = __ttlconstant__; __ttlvarname__[__ttlvarindex__ + 1] = __ttlconstant__;";
		NodeType ruleType = NodeType.Statement;
		List<ScopeRule> outerScopeRules = new ArrayList<ScopeRule>();
		ScopeRule outerscopeRule = new ScopeRule(outerscopeLHS, outerscopeRHS, ruleType, new HashMap<String, String>());

		outerScopeRules.add(outerscopeRule);

		Map<String, String> forTagValueMap = new HashMap<String, String>();
		Scope outerScope = new Scope(outerScopeRules, forTagValueMap);
		Map<Scope, String> scopeFragMentMap = new HashMap<Scope, String>();
		scopeFragMentMap.put(outerScope, "__ttlouterbody__");

		List<ScopeRule> innerScopeRules = new ArrayList<ScopeRule>();

		String innerScopeRule1LHS = "__ttlvar__[__ttlouter__][__ttlinner__]";
		String innerScopeRule1RHS = "__ttlvar__[x][y]";
		NodeType ruleTypeInnerScope = NodeType.Expression;
		ScopeRule innerScopeRule1 = new ScopeRule(innerScopeRule1LHS, innerScopeRule1RHS, ruleTypeInnerScope,
				new HashMap<String, String>());
		String innerScopeRule2LHS = "__ttlvar__[__ttlouter__]";
		String innerScopeRule2RHS = "__ttlvar__[x]";
		ScopeRule innerScopeRule2 = new ScopeRule(innerScopeRule2LHS, innerScopeRule2RHS, ruleTypeInnerScope,
				new HashMap<String, String>());
		innerScopeRules.add(innerScopeRule2);
		innerScopeRules.add(innerScopeRule1);
		Scope innerScope = new Scope(innerScopeRules, forTagValueMap);
		scopeFragMentMap.put(innerScope, "__ttlinnerbody__");

		return scopeFragMentMap;
	}

}
