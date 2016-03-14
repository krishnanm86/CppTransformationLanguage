package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;
import java.util.Map;

public class Scope {

	public Scope(List<ScopeRule> scopeRules, Map<String, String> tagValueMap) {
		this.rules = scopeRules;
		this.tagValueMap = tagValueMap;
	}

	List<ScopeRule> rules;
	Map<String, String> tagValueMap;
}
