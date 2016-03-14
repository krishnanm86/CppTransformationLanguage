package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.Map;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class TTlRule {
	NodeType type;
	TTlExpression lhs, rhs;
	Map<Scope, String> scopeFragmentMap;
	Map<Tag, String> tagValueMap;

	public TTlRule(TTlExpression lhs, TTlExpression rhs, NodeType type) throws Exception {
		if ((lhs.type == type) && (lhs.type == rhs.type)) {
			this.type = type;
			this.lhs = lhs;
			this.rhs = rhs;
		} else {
			throw new Exception("Rule types dont match");
		}
	}

	public TTlRule(TTlExpression lhs, TTlExpression rhs, NodeType type, Map<Scope, String> scopeFragmentMap,
			Map<Tag, String> tagValueMap) throws Exception {
		this(lhs, rhs, type);
		this.scopeFragmentMap = scopeFragmentMap;
		this.tagValueMap = tagValueMap;
	}

	public NodeType getType() {
		return type;
	}

	public void setType(NodeType type) {
		this.type = type;
	}

	public TTlExpression getLhs() {
		return lhs;
	}

	public void setLhs(TTlExpression lhs) {
		this.lhs = lhs;
	}

	public TTlExpression getRhs() {
		return rhs;
	}

	public void setRhs(TTlExpression rhs) {
		this.rhs = rhs;
	}

	public Map<Scope, String> getScopeFragmentMap() {
		return scopeFragmentMap;
	}

	public void setScopeFragmentMap(Map<Scope, String> scopeFragmentMap) {
		this.scopeFragmentMap = scopeFragmentMap;
	}

	public Map<Tag, String> getTagValueMap() {
		return tagValueMap;
	}

	public void setTagValueMap(Map<Tag, String> tagValueMap) {
		this.tagValueMap = tagValueMap;
	}

}
