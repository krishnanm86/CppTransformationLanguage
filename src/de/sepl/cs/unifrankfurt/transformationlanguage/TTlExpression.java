package de.sepl.cs.unifrankfurt.transformationlanguage;

import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;

public class TTlExpression {

	public enum NodeType {
		Expression, Declaration, Statement, DeclDefn, DeclSpecifier
	}

	String nodeWithHoles;
	NodeType type;

	public TTlExpression(String nodeWithHoles, NodeType type) {
		super();
		try {
			this.nodeWithHoles = normalize(nodeWithHoles);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.type = type;
	}

	private String normalize(String nodeWithHoles2) throws Exception {
		IASTNode node = TTLUtils.getNodeFromString(nodeWithHoles2);
		String returnNode = null;

		returnNode = node.getRawSignature();

		return returnNode;
	}

}
