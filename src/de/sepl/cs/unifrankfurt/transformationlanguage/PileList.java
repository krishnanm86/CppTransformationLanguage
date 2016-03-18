package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTNode;

import de.sepl.cs.unifrankfurt.transformationlanguage.TTlExpression.NodeType;

public class PileList {

	String notpile, pile; // of the format x,y,.... or notpile: x,y,....
	List<String> unacceptableExpressions;
	List<String> acceptableExpressions;
	private Map<String, List<IASTNode>> holeMap;
	private NodeType ruleType;

	public void setRuleType(NodeType ruleType) {
		this.ruleType = ruleType;
	}

	public void setHoleMap(Map<String, List<IASTNode>> holeMap) {
		this.holeMap = holeMap;
	}

	public List<String> getUnacceptableExpressions() {
		return unacceptableExpressions;
	}

	public List<String> getAcceptableExpressions() {
		return acceptableExpressions;
	}

	public void setPile(String pile) {
		this.pile = pile;
	}

	public void updateUntouchables(String expression) throws Exception {
		if (holeMap != null) {
			expression = TTLUtils.construct(holeMap, new TTlExpression(expression, ruleType)).getRawSignature();
		}
		unacceptableExpressions = new ArrayList<String>();
		if (notpile != null) {
			notpile = notpile.trim();
			String[] uewm = notpile.split(",");
			if (holeMap != null) {
				for (int i = 0; i < uewm.length; i++) {
					uewm[i] = TTLUtils.construct(holeMap, new TTlExpression(uewm[i], NodeType.Expression))
							.getRawSignature();
				}
			}
			unacceptableExpressions = Arrays.asList(uewm);

			uewm = notpile.split(",");
			String holedExpression = new String(expression);
			for (String str : uewm) {
				// Replace the acceptable expressions with a hole
				holedExpression = holedExpression.replace(str, "__unacceptableHole__");
			}
			uewm = holedExpression.split("__unacceptableHole__");
			acceptableExpressions = Arrays.asList(uewm);

		} else if (pile != null) {
			pile = pile.trim();

			String[] aewm = pile.split(",");
			if (holeMap != null) {
				for (int i = 0; i < aewm.length; i++) {
					aewm[i] = TTLUtils.construct(holeMap, new TTlExpression(aewm[i], NodeType.Expression))
							.getRawSignature();
				}
			}
			acceptableExpressions = Arrays.asList(aewm);

			aewm = pile.split(",");
			String holedExpression = new String(expression);
			for (String str : aewm) {
				// Replace the acceptable expressions with a hole
				holedExpression = holedExpression.replace(str, "__acceptableHole__");
			}
			aewm = holedExpression.split("__acceptableHole__");
			unacceptableExpressions = Arrays.asList(aewm);
		}
	}

	public PileList(String list, boolean ispile) {
		super();
		if (ispile) {
			this.pile = list;
		} else {
			this.notpile = list;
		}
	}
}
