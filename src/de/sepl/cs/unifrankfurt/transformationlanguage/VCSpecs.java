package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class VCSpecs {

	public static Set<TTlRule> populateRules() throws Exception {
		Set<TTlRule> rules = new HashSet<TTlRule>();

		TTlExpression ttlPattern = new TTlExpression(
				"for(int i = 0 ; i < __ttllimit__; __ttli__++ ) {__ttlforbody__;  }", NodeType.Statement);
		TTlExpression ttlConstructExpression = new TTlExpression(
				"for(int __ttli__ = 0 ; __ttli__ < __ttllimit__/float_v::size; __ttli__++ ) {__ttlforbody__;  }",
				NodeType.Statement);

		TTlExpression ttlPattern1 = new TTlExpression(
				"struct __ttlstructname__ { __ttlstructbody__; } __ttlaobj__[__ttllimit__];", NodeType.DeclDefn);
		TTlExpression ttlConstructExpression1 = new TTlExpression(
				"struct __ttlstructname___v { __ttlstructbody__; } __ttlaobj___v[__ttllimit__/__tagttlvctype__::size];",
				NodeType.DeclDefn);

		rules.add(new TTlRule(ttlPattern1, ttlConstructExpression1, NodeType.DeclDefn, getScopeFragMentMapStruct(),
				getTagValueMapStruct()));

		rules.add(new TTlRule(ttlPattern, ttlConstructExpression, NodeType.Statement, getScopeFragmentMapForStatement(),
				getTagValueMapFor()));

		return rules;
	}

	private static Map<Tag, String> getTagValueMapFor() {
		Map<Tag, String> tagValueMap = new HashMap<Tag, String>();
		return tagValueMap;
	}

	private static Map<Tag, String> getTagValueMapStruct() {
		Map<Tag, String> tagValueMap = new HashMap<Tag, String>();
		return tagValueMap;
	}

	private static Map<Scope, String> getScopeFragmentMapForStatement() {
		List<ScopeRule> forScopeRules = new ArrayList<ScopeRule>();

		Map<String, String> forTagValueMap = new HashMap<String, String>();
		Scope forScope = new Scope(forScopeRules, forTagValueMap);
		Map<Scope, String> scopeFragMentMap = new HashMap<Scope, String>();
		scopeFragMentMap.put(forScope, "__ttlforbody__");
		return scopeFragMentMap;
	}

	private static Map<Scope, String> getScopeFragMentMapStruct() {

		Map<String, String> inttagUpdates = new HashMap<String, String>();
		inttagUpdates.put("__tagttlvctype__", "int_v");
		List<ScopeRule> structScopeRules = new ArrayList<ScopeRule>();
		String lhs = "int __ttla__;";
		String rhs = inttagUpdates.get("__tagttlvctype__") + "   __ttla__v";
		ScopeRule intRule = new ScopeRule(lhs, rhs, NodeType.Declaration, inttagUpdates);
		structScopeRules.add(intRule);

		Map<String, String> floattagUpdate = new HashMap<String, String>();
		floattagUpdate.put("__tagttlvctype__", "float_v");
		String lhsfloat = "float __ttla__;";
		String rhsfloat = floattagUpdate.get("__tagttlvctype__") + "   __ttla__v";
		ScopeRule floatRule = new ScopeRule(lhsfloat, rhsfloat, NodeType.Declaration, floattagUpdate);
		structScopeRules.add(floatRule);

		Map<String, String> structTagValueMap = new HashMap<String, String>();
		Scope structScope = new Scope(structScopeRules, structTagValueMap);
		Map<Scope, String> scopeFragMentMap = new HashMap<Scope, String>();
		scopeFragMentMap.put(structScope, "__ttlstructbody__");
		return scopeFragMentMap;
	}

}
