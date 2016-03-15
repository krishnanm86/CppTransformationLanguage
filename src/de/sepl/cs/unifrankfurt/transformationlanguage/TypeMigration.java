package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;

public class TypeMigration {

	String oldTypeName, newTypeName;
	Map<Pair<String, String>, Pair<String, String>> fieldMapping = new HashMap<Pair<String, String>, Pair<String, String>>();

	public TypeMigration(String oldTypeName, String newTypeName,
			Map<Pair<String, String>, Pair<String, String>> fieldMapping) {
		super();
		this.oldTypeName = oldTypeName;
		this.newTypeName = newTypeName;
		this.fieldMapping = fieldMapping;
	}

	public String getOldTypeName() {
		return oldTypeName;
	}

	public void setOldTypeName(String oldTypeName) {
		this.oldTypeName = oldTypeName;
	}

	public String getNewTypeName() {
		return newTypeName;
	}

	public void setNewTypeName(String newTypeName) {
		this.newTypeName = newTypeName;
	}

	public Map<Pair<String, String>, Pair<String, String>> getFieldMapping() {
		return fieldMapping;
	}

	public void setFieldMapping(Map<Pair<String, String>, Pair<String, String>> fieldMapping) {
		this.fieldMapping = fieldMapping;
	}

	@Override
	public String toString() {
		return "TypeMigration [oldTypeName=" + oldTypeName + ", newTypeName=" + newTypeName + ", fieldMapping="
				+ fieldMapping + "]";
	}

	
}
