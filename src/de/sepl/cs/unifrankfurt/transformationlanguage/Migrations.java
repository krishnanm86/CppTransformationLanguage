package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTArraySubscriptExpression;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFieldReference;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTIdExpression;

@SuppressWarnings("restriction")
public class Migrations {

	Map<Pair<String, String>, TypeMigration> varMigrations = new HashMap<Pair<String, String>, TypeMigration>();

	public Migrations() {
		varMigrations = new HashMap<Pair<String, String>, TypeMigration>();
	}

	public Migrations(Map<Pair<String, String>, TypeMigration> varMigrations) {
		super();
		this.varMigrations = varMigrations;
	}

	public String getType(String reference) throws Exception {
		String type = "";
		String varName = null, fieldName = null;
		IASTExpression expr = TTLUtils.getExpression(reference);
		if (expr instanceof CPPASTFieldReference) {
			if (((CPPASTFieldReference) expr).getFieldOwner() instanceof CPPASTArraySubscriptExpression) {
				// Array Subscript case
				if (((CPPASTArraySubscriptExpression) ((CPPASTFieldReference) expr).getFieldOwner())
						.getArrayExpression() instanceof CPPASTIdExpression) {
					varName = ((CPPASTIdExpression) ((CPPASTArraySubscriptExpression) ((CPPASTFieldReference) expr)
							.getFieldOwner()).getArrayExpression()).getName().toString();
				}
			} else if (((CPPASTFieldReference) expr).getFieldOwner() instanceof CPPASTIdExpression) {
				// Normal field reference case
				varName = ((CPPASTIdExpression) ((CPPASTFieldReference) expr).getFieldOwner()).getName().toString();
			}
			fieldName = ((CPPASTFieldReference) expr).getFieldName().toString();
		}

		for (Pair<String, String> pair : varMigrations.keySet()) {
			if (pair.getLeft().equals(varName)) {
				TypeMigration typeMigration = varMigrations.get(pair);
				for (Pair<String, String> fieldPair : typeMigration.fieldMapping.keySet()) {
					if (fieldPair.getRight().equals(fieldName)) {
						return fieldPair.getLeft();
					}
				}
			}
		}
		return type;
	}

	public String getMigratedName(String oldName) throws Exception {
		String varName = null, fieldName = null;
		IASTExpression expr = TTLUtils.getExpression(oldName);
		if (expr instanceof CPPASTFieldReference) {
			if (((CPPASTFieldReference) expr).getFieldOwner() instanceof CPPASTArraySubscriptExpression) {
				// Array Subscript case
				if (((CPPASTArraySubscriptExpression) ((CPPASTFieldReference) expr).getFieldOwner())
						.getArrayExpression() instanceof CPPASTIdExpression) {
					varName = ((CPPASTIdExpression) ((CPPASTArraySubscriptExpression) ((CPPASTFieldReference) expr)
							.getFieldOwner()).getArrayExpression()).getName().toString();
				}
			} else if (((CPPASTFieldReference) expr).getFieldOwner() instanceof CPPASTIdExpression) {
				// Normal field reference case
				varName = ((CPPASTIdExpression) ((CPPASTFieldReference) expr).getFieldOwner()).getName().toString();
			}
			fieldName = ((CPPASTFieldReference) expr).getFieldName().toString();
		}
		if (varName != null && fieldName != null) {
			for (Pair<String, String> varMigration : varMigrations.keySet()) {
				if (varMigration.getLeft().equals(varName)) {
					oldName = oldName.replace(varName, varMigration.getValue());
				}
				TypeMigration typeMigration = varMigrations.get(varMigration);
				for (Pair<String, String> oldField : typeMigration.fieldMapping.keySet()) {
					if (oldField.getRight().equals(fieldName)) {
						oldName = oldName.replace("." + fieldName,
								"." + typeMigration.fieldMapping.get(oldField).getRight());
					}
				}
			}
		}
		return oldName;
	}

	@Override
	public String toString() {
		return "Migrations [varMigrations=" + varMigrations + "]";
	}

}
