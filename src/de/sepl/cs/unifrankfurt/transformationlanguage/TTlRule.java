package de.sepl.cs.unifrankfurt.transformationlanguage;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class TTlRule {
	NodeType type;
	TTlExpression lhs, rhs;

	public TTlRule(TTlExpression lhs, TTlExpression rhs, NodeType type) throws Exception {
		if ((lhs.type == type) && (lhs.type == rhs.type)) {
			this.type = type;
			this.lhs = lhs;
			this.rhs = rhs;
		} else {
			throw new Exception("Rule types dont match");
		}
	}

}
