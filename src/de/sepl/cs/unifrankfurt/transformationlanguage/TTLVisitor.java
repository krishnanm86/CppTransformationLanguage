package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.Map;

import org.eclipse.cdt.core.dom.ast.ASTVisitor;
import org.eclipse.cdt.core.dom.ast.IASTDeclSpecifier;
import org.eclipse.cdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTBaseDeclSpecifier;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTCompositeTypeSpecifier;
import org.eclipse.text.edits.TextEditGroup;

@SuppressWarnings({ "restriction" })
public class TTLVisitor extends ASTVisitor {

	private ASTRewrite rewriter;
	private Map<String, CPPASTBaseDeclSpecifier> typeDefinitionTransformations;
	private TextEditGroup editGroup;

	public TTLVisitor(Map<String, CPPASTBaseDeclSpecifier> typeDefinitionTransformations,
			ASTRewrite rewriterForTranslationUnit, TextEditGroup editGroup) {
		this.rewriter = rewriterForTranslationUnit;
		this.typeDefinitionTransformations = typeDefinitionTransformations;
		this.editGroup = editGroup;
		shouldVisitDeclSpecifiers = true;
	}

	@Override
	public int visit(IASTDeclSpecifier baseSpecifier) {
		if (baseSpecifier instanceof CPPASTCompositeTypeSpecifier) {
			CPPASTCompositeTypeSpecifier baseDeclSpecifier = (CPPASTCompositeTypeSpecifier) baseSpecifier;
			if (typeDefinitionTransformations.containsKey(baseDeclSpecifier.getName().toString())) {
				rewriter.replace(baseSpecifier,
						typeDefinitionTransformations.get(baseDeclSpecifier.getName().toString()), editGroup);
			}
		}
		return super.visit(baseSpecifier);
	}

}
