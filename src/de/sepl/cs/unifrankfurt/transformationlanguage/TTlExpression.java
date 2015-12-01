package de.sepl.cs.unifrankfurt.transformationlanguage;

public class TTlExpression {

	public enum NodeType {
		Expression, Declaration, Statement
	}

	String nodeWithHoles;
	NodeType type;

	public TTlExpression(String nodeWithHoles, NodeType type) {
		super();
		this.nodeWithHoles = nodeWithHoles;
		this.type = type;
	}

}
