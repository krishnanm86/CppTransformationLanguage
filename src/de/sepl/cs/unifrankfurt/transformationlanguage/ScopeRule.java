package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.Map;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class ScopeRule {

	String lhs, Rhs;
	NodeType type;
	Map<String, String> tagUpdates;
	public static String tagEmpty = "tagEmpty";
	TagUpdate tagUpdate;

	public ScopeRule(String lhs, String rhs, NodeType type, Map<String, String> tagUpdates) {
		super();
		this.lhs = lhs;
		Rhs = rhs;
		this.type = type;
		this.tagUpdates = tagUpdates;
	}

	public ScopeRule(String lhs, String rhs, NodeType type, TagUpdate tagUpdates) {
		super();
		this.lhs = lhs;
		Rhs = rhs;
		this.type = type;
		this.tagUpdate = tagUpdates;
	}

}
