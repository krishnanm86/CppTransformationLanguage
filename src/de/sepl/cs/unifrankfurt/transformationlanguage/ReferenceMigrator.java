package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFieldReference;

@SuppressWarnings("restriction")
public class ReferenceMigrator extends ASTVisitor {

	Scope scope;
	Map<String, String> nodeReplacements;
	Map<String, String> referenceReplacements;
	Map<String, String> returnedTagValues;

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public Map<String, String> getNodeReplacements() {
		return nodeReplacements;
	}

	public void setNodeReplacements(Map<String, String> nodeReplacements) {
		this.nodeReplacements = nodeReplacements;
	}

	public Map<String, String> getReferenceReplacements() {
		return referenceReplacements;
	}

	public void setReferenceReplacements(Map<String, String> referenceReplacements) {
		this.referenceReplacements = referenceReplacements;
	}

	public ReferenceMigrator() {
		referenceReplacements = new HashMap<String, String>();
		shouldVisitExpressions = true;
		shouldVisitNames = true;
	}

	@Override
	public int visit(IASTName name) {
		try {
			for (Pair<String, String> varMigration : SearchAlgorithm.migrations.varMigrations.keySet()) {
				if (name.toString().equals(varMigration.getLeft())) {
					referenceReplacements.put(name.toString(), varMigration.getRight());
					System.out.println("Migrating " + name.toString() + " to " + varMigration.getRight());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return super.visit(name);
	}

	@Override
	public int visit(IASTExpression expression) {
		if (expression instanceof CPPASTFieldReference) {
			try {
				if (!SearchAlgorithmNew.migrations.getMigratedName(expression.getRawSignature())
						.equals(expression.getRawSignature())) {
					String migratedExpression = SearchAlgorithmNew.migrations
							.getMigratedName(expression.getRawSignature());
					referenceReplacements.put(expression.getRawSignature(), migratedExpression);
					System.out.println("To migrate  " + expression.getRawSignature()  + " at " + expression.getFileLocation().getStartingLineNumber() + "to " + migratedExpression);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return super.visit(expression);
	}

}