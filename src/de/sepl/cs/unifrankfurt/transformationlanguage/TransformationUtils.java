package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.IBinding;
import org.eclipse.cdt.internal.core.dom.parser.c.CParameter;
import org.eclipse.cdt.internal.core.dom.parser.c.CVariable;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPVariable;
import org.eclipse.cdt.internal.core.pdom.dom.cpp.IPDOMCPPClassType;
import org.eclipse.cdt.internal.core.pdom.dom.cpp.PDOMCPPClassTemplate;

@SuppressWarnings("restriction")
public class TransformationUtils {

	public static IASTNode getDefns(IASTName typeNode) {
		// Assuming that this function gathers only a type node
		IASTNode defn = null;
		IBinding nameBinding = typeNode.getBinding();
		if (nameBinding instanceof IPDOMCPPClassType) {

		}
		if (nameBinding instanceof CPPClassType) {
			defn = ((CPPClassType) nameBinding).getDefinition().getParent();
		}
		if (nameBinding instanceof CPPVariable) {
			defn = ((CPPVariable) nameBinding).getDefinition().getParent();
		}
		return defn;
	}

	public static List<IASTNode> getUses(IASTName objectRef, IASTTranslationUnit ast) {
		ArrayList<IASTNode> uses = new ArrayList<IASTNode>();
		IBinding binding = objectRef.getBinding();
		if (binding instanceof CPPVariable || binding instanceof CVariable || binding instanceof CParameter) {
			for (IASTName name : ast.getReferences(binding)) {
				uses.add(name.getParent().getParent());
			}
			for (IASTName name : ast.getDeclarationsInAST(binding)) {
				uses.add(name.getParent().getParent());
			}
		}
		return uses;
	}

}
