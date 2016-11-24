package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTArraySubscriptExpression;
import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTParameterDeclaration;
import org.eclipse.cdt.internal.core.dom.parser.c.CParameter;
import org.eclipse.cdt.internal.core.dom.parser.c.CVariable;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPParameter;
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
		shouldVisitParameterDeclarations = true;
		visitedNames = new ArrayList<IASTName>();
		names = new ArrayList<IASTName>();
	}

	@Override
	public int visit(IASTName name) {
		if ((name.getParent().getParent() instanceof IASTArraySubscriptExpression)) {
			IASTArraySubscriptExpression expr = (IASTArraySubscriptExpression) name.getParent().getParent();
			if (expr.getChildren()[1].equals(name.getParent())) {
				return super.visit(name);
			}
		}
		names.add(name);
		if (name.getBinding() instanceof CPPClassType) {
			typerefs.add(name);
		}
		if (name.getBinding() instanceof CPPVariable) {
			objectrefs.add(name);
		}
		if (name.getBinding() instanceof CParameter) {
			objectrefs.add(name);
		}
		if (name.getBinding() instanceof CVariable) {
			objectrefs.add(name);
		}
		return super.visit(name);
	}
	
	@Override
	public int visit(IASTParameterDeclaration paramDecl) {
		if ((paramDecl.getParent().getParent() instanceof IASTArraySubscriptExpression)) {
			IASTArraySubscriptExpression expr = (IASTArraySubscriptExpression) paramDecl.getParent().getParent();
			if (expr.getChildren()[1].equals(paramDecl.getParent())) {
				return super.visit(paramDecl);
			}
		}
		names.add(paramDecl.getDeclarator().getName());
		if (paramDecl.getDeclarator().getName().getBinding() instanceof CPPClassType) {
			typerefs.add(paramDecl.getDeclarator().getName());
		}
		if (paramDecl.getDeclarator().getName().getBinding() instanceof CPPVariable) {
			objectrefs.add(paramDecl.getDeclarator().getName());
		}
		if (paramDecl.getDeclarator().getName().getBinding() instanceof CParameter) {
			objectrefs.add(paramDecl.getDeclarator().getName());
		}
		if (paramDecl.getDeclarator().getName().getBinding() instanceof CPPParameter) {
			objectrefs.add(paramDecl.getDeclarator().getName());
		}
		if (paramDecl.getDeclarator().getName().getBinding() instanceof CVariable) {
			objectrefs.add(paramDecl.getDeclarator().getName());
		}
		return super.visit(paramDecl.getDeclarator().getName());
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
