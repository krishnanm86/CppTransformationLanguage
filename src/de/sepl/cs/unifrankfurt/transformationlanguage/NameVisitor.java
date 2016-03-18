package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPVariable;

@SuppressWarnings("restriction")
public class NameVisitor extends ASTVisitor {

	private List<IASTName> objectrefs, typerefs;
	public List<IASTName> visitedNames;
	public List<IASTName> names; // For the purpose of getting all names from an
									// expression. Updating piles

	public NameVisitor() {
		objectrefs = new ArrayList<IASTName>();
		typerefs = new ArrayList<IASTName>();
		shouldVisitNames = true;
		visitedNames = new ArrayList<IASTName>();
		names = new ArrayList<IASTName>();
	}

	@Override
	public int visit(IASTName name) {
		names.add(name);
		if (name.getBinding() instanceof CPPClassType) {
			typerefs.add(name);
		}
		if (name.getBinding() instanceof CPPVariable) {
			objectrefs.add(name);
		}
		return super.visit(name);
	}

	public List<IASTName> getNames() {
		return names;
	}

	public List<IASTName> getObjectrefs() {
		return objectrefs;
	}

	public void setObjectrefs(List<IASTName> objectrefs) {
		this.objectrefs = objectrefs;
	}

	public List<IASTName> getTyperefs() {
		return typerefs;
	}

	public void setTyperefs(List<IASTName> typerefs) {
		this.typerefs = typerefs;
	}

}
