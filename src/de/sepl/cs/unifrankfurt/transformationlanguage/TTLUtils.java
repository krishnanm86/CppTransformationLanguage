package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.ASTNodeFactoryFactory;
import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.cpp.ICPPNodeFactory;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTNamedTypeSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTSimpleDeclaration;

@SuppressWarnings("restriction")
public class TTLUtils {

	private static ICPPNodeFactory nodeFactory = ASTNodeFactoryFactory.getDefaultCPPNodeFactory();

	public static CPPASTCompositeTypeSpecifier transformTypeUsingFilter(CPPASTCompositeTypeSpecifier type,
			Map<String, String> filter) {
		CPPASTCompositeTypeSpecifier newType = type.copy();
		for (IASTDeclaration member : newType.getMembers()) {
			if (member instanceof CPPASTSimpleDeclaration) {
				CPPASTSimpleDeclaration memberDeclaration = (CPPASTSimpleDeclaration) member;
				if (memberDeclaration.getDeclSpecifier() instanceof CPPASTSimpleDeclSpecifier) {
					CPPASTSimpleDeclSpecifier memberSpecifier = (CPPASTSimpleDeclSpecifier) memberDeclaration
							.getDeclSpecifier();
					String declSpecifierName = memberSpecifier.toString().trim();
					if (filter.containsKey(declSpecifierName)) {
						System.out.println("Key Found");
						CPPASTNamedTypeSpecifier newSpecifier = (CPPASTNamedTypeSpecifier) nodeFactory
								.newTypedefNameSpecifier(
										nodeFactory.newName(filter.get(declSpecifierName).toCharArray()));
						CPPASTSimpleDeclaration newMemberDeclaration = memberDeclaration.copy();
						newMemberDeclaration.setDeclSpecifier(newSpecifier);
						newType.replace(member, newMemberDeclaration);
					}
				}
			}

		}
		return newType;
	}

	public static Map<String, String> getDummyFilter() {
		Map<String, String> dummyMap = new HashMap<String, String>();
		dummyMap.put("int", "int_v");
		dummyMap.put("float", "float_v");
		return dummyMap;
	}

}
