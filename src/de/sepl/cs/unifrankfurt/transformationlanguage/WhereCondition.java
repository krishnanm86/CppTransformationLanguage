package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTNode;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class WhereCondition {
	String condition, value;
	private Map<String, List<IASTNode>> holeMap;
	private Map<String, String> holeMapNew;

	public Map<String, String> getHoleMapNew() {
		return holeMapNew;
	}

	public void setHoleMapNew(Map<String, String> holeMapNew) {
		this.holeMapNew = holeMapNew;
	}

	public WhereCondition(String condition, String value) {
		super();
		this.condition = condition;
		this.value = value;
	}

	public Map<String, List<IASTNode>> getHoleMap() {
		return holeMap;
	}

	public void setHoleMap(Map<String, List<IASTNode>> holeMap) {
		this.holeMap = holeMap;
	}

	public boolean check() throws Exception {
		if (condition.startsWith("decltype")) {
			String typeToCheckWith = condition.substring(condition.indexOf("==") + 2, condition.length()).trim();
			String nameOfVar = condition.substring(condition.indexOf("(") + 1, condition.indexOf(")")).trim();
			if (holeMap != null) {
				nameOfVar = TTLUtils.construct(holeMap, new TTlExpression(nameOfVar, NodeType.Expression))
						.getRawSignature();
			}
			System.out.println(
					"Where condition check " + condition + " == " + SearchAlgorithm.migrations.getType(nameOfVar));
			return SearchAlgorithm.migrations.getType(nameOfVar).equals(typeToCheckWith);
		} else {
			return false;
		}
	}
	
	public boolean checkNew() throws Exception {
		if (condition.startsWith("decltype")) {
			String typeToCheckWith = condition.substring(condition.indexOf("==") + 2, condition.length()).trim();
			String nameOfVar = condition.substring(condition.indexOf("(") + 1, condition.indexOf(")")).trim();
			if (holeMapNew != null) {
				nameOfVar = TTLUtils.constructUsingHoleMap(holeMapNew, new TTlExpression(nameOfVar, NodeType.Expression))
						.getRawSignature();
			}
			System.out.println(
					"Where condition check " + condition + " == " + SearchAlgorithm.migrations.getType(nameOfVar));
			return SearchAlgorithmNew.migrations.getType(nameOfVar).equals(typeToCheckWith);
		} else {
			return false;
		}
	}

}
