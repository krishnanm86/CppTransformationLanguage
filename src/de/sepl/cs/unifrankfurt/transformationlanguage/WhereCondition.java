package de.sepl.cs.unifrankfurt.transformationlanguage;

public class WhereCondition {
	String condition, value;

	public boolean check() {
		if (condition.startsWith("decltype")) {
			String typeToCheckWith = condition.substring(condition.indexOf("==") + 2, condition.length()).trim();
			String nameOfVar = condition.substring(condition.indexOf("(") + 1, condition.indexOf(")")).trim();
			if(nameOfVar.contains("].") && nameOfVar.contains("[") && nameOfVar.indexOf("[") < nameOfVar.indexOf("]."))
			{
				// Array Field reference. Find the type of the field in the array 
			}

		}
		return false;
	}

}
