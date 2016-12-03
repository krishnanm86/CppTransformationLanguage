package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cdt.core.dom.ast.IASTName;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.IBinding;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.cdt.internal.core.dom.parser.c.CParameter;
import org.eclipse.cdt.internal.core.dom.parser.c.CVariable;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPClassType;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPParameter;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPVariable;
import org.eclipse.cdt.internal.core.pdom.dom.cpp.IPDOMCPPClassType;

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
		if (binding instanceof CPPVariable || binding instanceof CVariable || binding instanceof CParameter
				|| binding instanceof CPPParameter) {
			for (IASTName name : ast.getReferences(binding)) {
				addUses(uses, name);
			}
			for (IASTName name : ast.getDeclarationsInAST(binding)) {
				addUses(uses, name);
			}
		}
		return uses;
	}

	public static void addUses(ArrayList<IASTNode> uses, IASTName name) {
		IASTNode use = name;
		while (use.getParent() != null && !(use.getParent() instanceof ITranslationUnit)
				&& !(use.getParent() instanceof IASTStatement)) {
			uses.add(use.getParent());
			use = use.getParent();
		}
		if (use.getParent() instanceof IASTStatement) {
			uses.add(use.getParent());
		}
	}

}
