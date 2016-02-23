package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPVariable;

@SuppressWarnings("restriction")
public class NameVisitor extends ASTVisitor {

	private static List<IASTName> objectrefs, typerefs;

	public NameVisitor() {
		objectrefs = new ArrayList<IASTName>();
		typerefs = new ArrayList<IASTName>();
		shouldVisitNames = true;
	}

	@Override
	public int visit(IASTName name) {
		if (name.getBinding() instanceof CPPClassType) {
			typerefs.add(name);
		}
		if (name.getBinding() instanceof CPPVariable) {
			objectrefs.add(name);
		}
		return super.visit(name);
	}

	public static List<IASTName> getObjectrefs() {
		return objectrefs;
	}

	public static void setObjectrefs(List<IASTName> objectrefs) {
		NameVisitor.objectrefs = objectrefs;
	}

	public static List<IASTName> getTyperefs() {
		return typerefs;
	}

	public static void setTyperefs(List<IASTName> typerefs) {
		NameVisitor.typerefs = typerefs;
	}

}
