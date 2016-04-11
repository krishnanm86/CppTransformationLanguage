package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class AOSSOASpecs {

	public static Set<TTlRule> populateRules() throws Exception {
		Set<TTlRule> rules = new HashSet<TTlRule>();

		TTlExpression ttlPattern1 = new TTlExpression("struct __ttlstructname__ { __ttlstructbody__; } __ttlaobj__;",
				NodeType.DeclDefn);
		TTlExpression ttlConstructExpression1 = new TTlExpression(
				"struct __ttlstructname___v { __ttlstructbody__; } __ttlaobj___v[__tagttlsize__];", NodeType.DeclDefn);

		rules.add(new TTlRule(ttlPattern1, ttlConstructExpression1, NodeType.DeclDefn, getScopeFragMentMapStruct(),
				getTagValueMapStruct()));

		return rules;
	}

	private static Map<Tag, String> getTagValueMapStruct() {
		Map<Tag, String> tagValueMap = new HashMap<Tag, String>();
		return tagValueMap;
	}

	private static Map<Scope, String> getScopeFragMentMapStruct() {

		String lhs = "__ttltype__ __ttla__[__ttlarraylimit__];";
		NodeType ruleType = NodeType.Declaration;
		Map<String, String> arraysubscripttagUpdates = new HashMap<String, String>();
		arraysubscripttagUpdates.put("__tagttlsize__","__ttlarraylimit__");
		List<ScopeRule> structScopeRules = new ArrayList<ScopeRule>();
		String rhs = "__ttltype__ __ttla__;";
		ScopeRule arraysubscriptRule = new ScopeRule(lhs, rhs, ruleType, arraysubscripttagUpdates);
		structScopeRules.add(arraysubscriptRule);

		Map<String, String> structTagValueMap = new HashMap<String, String>();
		Scope structScope = new Scope(structScopeRules, structTagValueMap);
		Map<Scope, String> scopeFragMentMap = new HashMap<Scope, String>();
		scopeFragMentMap.put(structScope, "__ttlstructbody__");
		return scopeFragMentMap;
	}

}
