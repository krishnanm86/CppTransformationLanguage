package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTNode;

public class Scope {

	public Scope(List<ScopeRule> scopeRules, Map<String, String> tagValueMap) {
		this.rules = scopeRules;
		this.tagValueMap = tagValueMap;
	}

	List<ScopeRule> rules;
	Map<String, String> tagValueMap, referenceMap;
	Map<String, List<IASTNode>> parametersMap;

	public void setReferenceMap(Map<String, String> referenceMap) {
		this.referenceMap = referenceMap;
	}

	public Map<String, List<IASTNode>> getParametersMap() {
		return parametersMap;
	}

	public void setParametersMap(Map<String, List<IASTNode>> parametersMap) {
		this.parametersMap = parametersMap;
	}
}
