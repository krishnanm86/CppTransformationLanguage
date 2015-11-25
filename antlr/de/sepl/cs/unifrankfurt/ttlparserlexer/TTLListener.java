package de.sepl.cs.unifrankfurt.ttlparserlexer;

// Generated from TTL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TTLParser}.
 */
public interface TTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TTLParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiontryblock(@NotNull TTLParser.FunctiontryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiontryblock(@NotNull TTLParser.FunctiontryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(@NotNull TTLParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(@NotNull TTLParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#astname}.
	 * @param ctx the parse tree
	 */
	void enterAstname(@NotNull TTLParser.AstnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#astname}.
	 * @param ctx the parse tree
	 */
	void exitAstname(@NotNull TTLParser.AstnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(@NotNull TTLParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(@NotNull TTLParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifierseq(@NotNull TTLParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifierseq(@NotNull TTLParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(@NotNull TTLParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(@NotNull TTLParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#transformationexpression}.
	 * @param ctx the parse tree
	 */
	void enterTransformationexpression(@NotNull TTLParser.TransformationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#transformationexpression}.
	 * @param ctx the parse tree
	 */
	void exitTransformationexpression(@NotNull TTLParser.TransformationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageclassspecifier(@NotNull TTLParser.StorageclassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageclassspecifier(@NotNull TTLParser.StorageclassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(@NotNull TTLParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(@NotNull TTLParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacename(@NotNull TTLParser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacename(@NotNull TTLParser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamednamespacedefinition(@NotNull TTLParser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamednamespacedefinition(@NotNull TTLParser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(@NotNull TTLParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(@NotNull TTLParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifierseq(@NotNull TTLParser.VirtspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifierseq(@NotNull TTLParser.VirtspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueenumdeclaration(@NotNull TTLParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueenumdeclaration(@NotNull TTLParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealias(@NotNull TTLParser.NamespacealiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealias(@NotNull TTLParser.NamespacealiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterConversionfunctionid(@NotNull TTLParser.ConversionfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitConversionfunctionid(@NotNull TTLParser.ConversionfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionspecification(@NotNull TTLParser.ExceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionspecification(@NotNull TTLParser.ExceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(@NotNull TTLParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(@NotNull TTLParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void enterTypeidlist(@NotNull TTLParser.TypeidlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void exitTypeidlist(@NotNull TTLParser.TypeidlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classhead}.
	 * @param ctx the parse tree
	 */
	void enterClasshead(@NotNull TTLParser.ClassheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classhead}.
	 * @param ctx the parse tree
	 */
	void exitClasshead(@NotNull TTLParser.ClassheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorlist(@NotNull TTLParser.EnumeratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorlist(@NotNull TTLParser.EnumeratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(@NotNull TTLParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(@NotNull TTLParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(@NotNull TTLParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(@NotNull TTLParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void enterNamespacename(@NotNull TTLParser.NamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void exitNamespacename(@NotNull TTLParser.NamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void enterPmexpression(@NotNull TTLParser.PmexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void exitPmexpression(@NotNull TTLParser.PmexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(@NotNull TTLParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(@NotNull TTLParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(@NotNull TTLParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(@NotNull TTLParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull TTLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull TTLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerseq(@NotNull TTLParser.HandlerseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerseq(@NotNull TTLParser.HandlerseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(@NotNull TTLParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(@NotNull TTLParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(@NotNull TTLParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(@NotNull TTLParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassspecifier(@NotNull TTLParser.ClassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassspecifier(@NotNull TTLParser.ClassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(@NotNull TTLParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(@NotNull TTLParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockdeclaration(@NotNull TTLParser.BlockdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockdeclaration(@NotNull TTLParser.BlockdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(@NotNull TTLParser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(@NotNull TTLParser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantexpression(@NotNull TTLParser.ConstantexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantexpression(@NotNull TTLParser.ConstantexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclarator(@NotNull TTLParser.MemberdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclarator(@NotNull TTLParser.MemberdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull TTLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull TTLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassvirtspecifier(@NotNull TTLParser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassvirtspecifier(@NotNull TTLParser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptiondeclaration(@NotNull TTLParser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptiondeclaration(@NotNull TTLParser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#cc}.
	 * @param ctx the parse tree
	 */
	void enterCc(@NotNull TTLParser.CcContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#cc}.
	 * @param ctx the parse tree
	 */
	void exitCc(@NotNull TTLParser.CcContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealiasdefinition(@NotNull TTLParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealiasdefinition(@NotNull TTLParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull TTLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull TTLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(@NotNull TTLParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(@NotNull TTLParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedid(@NotNull TTLParser.UnqualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedid(@NotNull TTLParser.UnqualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void enterNewtypeid(@NotNull TTLParser.NewtypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void exitNewtypeid(@NotNull TTLParser.NewtypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(@NotNull TTLParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(@NotNull TTLParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void enterClassheadname(@NotNull TTLParser.ClassheadnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void exitClassheadname(@NotNull TTLParser.ClassheadnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(@NotNull TTLParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(@NotNull TTLParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void enterPtroperator(@NotNull TTLParser.PtroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void exitPtroperator(@NotNull TTLParser.PtroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull TTLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull TTLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void enterInitializerlist(@NotNull TTLParser.InitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void exitInitializerlist(@NotNull TTLParser.InitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeparameter(@NotNull TTLParser.TypeparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeparameter(@NotNull TTLParser.TypeparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(@NotNull TTLParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(@NotNull TTLParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(@NotNull TTLParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(@NotNull TTLParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifier(@NotNull TTLParser.CvqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifier(@NotNull TTLParser.CvqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargumentlist(@NotNull TTLParser.TemplateargumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargumentlist(@NotNull TTLParser.TemplateargumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpledeclaration(@NotNull TTLParser.SimpledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpledeclaration(@NotNull TTLParser.SimpledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull TTLParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull TTLParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(@NotNull TTLParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(@NotNull TTLParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void enterSimplecapture(@NotNull TTLParser.SimplecaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void exitSimplecapture(@NotNull TTLParser.SimplecaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractpackdeclarator(@NotNull TTLParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractpackdeclarator(@NotNull TTLParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull TTLParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull TTLParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdacapture(@NotNull TTLParser.LambdacaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdacapture(@NotNull TTLParser.LambdacaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assertdeclaration(@NotNull TTLParser.Static_assertdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assertdeclaration(@NotNull TTLParser.Static_assertdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(@NotNull TTLParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(@NotNull TTLParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkagespecification(@NotNull TTLParser.LinkagespecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkagespecification(@NotNull TTLParser.LinkagespecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(@NotNull TTLParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(@NotNull TTLParser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#tagname}.
	 * @param ctx the parse tree
	 */
	void enterTagname(@NotNull TTLParser.TagnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#tagname}.
	 * @param ctx the parse tree
	 */
	void exitTagname(@NotNull TTLParser.TagnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void enterPurespecifier(@NotNull TTLParser.PurespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void exitPurespecifier(@NotNull TTLParser.PurespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewexpression(@NotNull TTLParser.NewexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewexpression(@NotNull TTLParser.NewexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void enterUserdefinedliteral(@NotNull TTLParser.UserdefinedliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void exitUserdefinedliteral(@NotNull TTLParser.UserdefinedliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#listofpairs}.
	 * @param ctx the parse tree
	 */
	void enterListofpairs(@NotNull TTLParser.ListofpairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#listofpairs}.
	 * @param ctx the parse tree
	 */
	void exitListofpairs(@NotNull TTLParser.ListofpairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(@NotNull TTLParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(@NotNull TTLParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classkey}.
	 * @param ctx the parse tree
	 */
	void enterClasskey(@NotNull TTLParser.ClasskeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classkey}.
	 * @param ctx the parse tree
	 */
	void exitClasskey(@NotNull TTLParser.ClasskeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(@NotNull TTLParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(@NotNull TTLParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpstatement(@NotNull TTLParser.JumpstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpstatement(@NotNull TTLParser.JumpstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templateid}.
	 * @param ctx the parse tree
	 */
	void enterTemplateid(@NotNull TTLParser.TemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templateid}.
	 * @param ctx the parse tree
	 */
	void exitTemplateid(@NotNull TTLParser.TemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestednamespecifier(@NotNull TTLParser.NestednamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestednamespecifier(@NotNull TTLParser.NestednamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaintroducer(@NotNull TTLParser.LambdaintroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaintroducer(@NotNull TTLParser.LambdaintroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamednamespacedefinition(@NotNull TTLParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamednamespacedefinition(@NotNull TTLParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointerliteral(@NotNull TTLParser.PointerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointerliteral(@NotNull TTLParser.PointerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifierseq(@NotNull TTLParser.AttributespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifierseq(@NotNull TTLParser.AttributespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(@NotNull TTLParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(@NotNull TTLParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptexpression(@NotNull TTLParser.NoexceptexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptexpression(@NotNull TTLParser.NoexceptexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializer(@NotNull TTLParser.MeminitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializer(@NotNull TTLParser.MeminitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargument(@NotNull TTLParser.TemplateargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargument(@NotNull TTLParser.TemplateargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(@NotNull TTLParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(@NotNull TTLParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(@NotNull TTLParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(@NotNull TTLParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void enterCastexpression(@NotNull TTLParser.CastexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void exitCastexpression(@NotNull TTLParser.CastexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(@NotNull TTLParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(@NotNull TTLParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void enterForrangeinitializer(@NotNull TTLParser.ForrangeinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void exitForrangeinitializer(@NotNull TTLParser.ForrangeinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(@NotNull TTLParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(@NotNull TTLParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterOperatorfunctionid(@NotNull TTLParser.OperatorfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitOperatorfunctionid(@NotNull TTLParser.OperatorfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplatedeclaration(@NotNull TTLParser.TemplatedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplatedeclaration(@NotNull TTLParser.TemplatedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowexpression(@NotNull TTLParser.ThrowexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowexpression(@NotNull TTLParser.ThrowexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#taguse}.
	 * @param ctx the parse tree
	 */
	void enterTaguse(@NotNull TTLParser.TaguseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#taguse}.
	 * @param ctx the parse tree
	 */
	void exitTaguse(@NotNull TTLParser.TaguseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void enterNewplacement(@NotNull TTLParser.NewplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void exitNewplacement(@NotNull TTLParser.NewplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(@NotNull TTLParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(@NotNull TTLParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull TTLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull TTLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(@NotNull TTLParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(@NotNull TTLParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributetoken(@NotNull TTLParser.AttributetokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributetoken(@NotNull TTLParser.AttributetokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void enterPseudodestructorname(@NotNull TTLParser.PseudodestructornameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void exitPseudodestructorname(@NotNull TTLParser.PseudodestructornameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(@NotNull TTLParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(@NotNull TTLParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull TTLParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull TTLParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(@NotNull TTLParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(@NotNull TTLParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForrangedeclaration(@NotNull TTLParser.ForrangedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForrangedeclaration(@NotNull TTLParser.ForrangedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionnamespacedefinition(@NotNull TTLParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionnamespacedefinition(@NotNull TTLParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationstatement(@NotNull TTLParser.IterationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationstatement(@NotNull TTLParser.IterationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#tagdecl}.
	 * @param ctx the parse tree
	 */
	void enterTagdecl(@NotNull TTLParser.TagdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#tagdecl}.
	 * @param ctx the parse tree
	 */
	void exitTagdecl(@NotNull TTLParser.TagdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(@NotNull TTLParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(@NotNull TTLParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversiondeclarator(@NotNull TTLParser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversiondeclarator(@NotNull TTLParser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void enterEnumhead(@NotNull TTLParser.EnumheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void exitEnumhead(@NotNull TTLParser.EnumheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifier(@NotNull TTLParser.DeclspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifier(@NotNull TTLParser.DeclspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void enterBracedinitlist(@NotNull TTLParser.BracedinitlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void exitBracedinitlist(@NotNull TTLParser.BracedinitlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteexpression(@NotNull TTLParser.DeleteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteexpression(@NotNull TTLParser.DeleteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributescopedtoken(@NotNull TTLParser.AttributescopedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributescopedtoken(@NotNull TTLParser.AttributescopedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacedefinition(@NotNull TTLParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacedefinition(@NotNull TTLParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstatement(@NotNull TTLParser.DeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstatement(@NotNull TTLParser.DeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdadeclarator(@NotNull TTLParser.LambdadeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdadeclarator(@NotNull TTLParser.LambdadeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifier(@NotNull TTLParser.TrailingtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifier(@NotNull TTLParser.TrailingtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptspecification(@NotNull TTLParser.NoexceptspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptspecification(@NotNull TTLParser.NoexceptspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractdeclarator(@NotNull TTLParser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractdeclarator(@NotNull TTLParser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumspecifier(@NotNull TTLParser.EnumspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumspecifier(@NotNull TTLParser.EnumspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(@NotNull TTLParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(@NotNull TTLParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void enterTryblock(@NotNull TTLParser.TryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void exitTryblock(@NotNull TTLParser.TryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(@NotNull TTLParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(@NotNull TTLParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(@NotNull TTLParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(@NotNull TTLParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(@NotNull TTLParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(@NotNull TTLParser.TypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerlist(@NotNull TTLParser.MeminitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerlist(@NotNull TTLParser.MeminitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifier(@NotNull TTLParser.BasespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifier(@NotNull TTLParser.BasespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitspecialization(@NotNull TTLParser.ExplicitspecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitspecialization(@NotNull TTLParser.ExplicitspecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssign(@NotNull TTLParser.RightShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssign(@NotNull TTLParser.RightShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void enterCapturelist(@NotNull TTLParser.CapturelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void exitCapturelist(@NotNull TTLParser.CapturelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitinstantiation(@NotNull TTLParser.ExplicitinstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitinstantiation(@NotNull TTLParser.ExplicitinstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberspecification(@NotNull TTLParser.MemberspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberspecification(@NotNull TTLParser.MemberspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasetypespecifier(@NotNull TTLParser.BasetypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasetypespecifier(@NotNull TTLParser.BasetypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixexpression(@NotNull TTLParser.PostfixexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixexpression(@NotNull TTLParser.PostfixexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtokenseq(@NotNull TTLParser.BalancedtokenseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtokenseq(@NotNull TTLParser.BalancedtokenseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(@NotNull TTLParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(@NotNull TTLParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstatement(@NotNull TTLParser.CompoundstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstatement(@NotNull TTLParser.CompoundstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratordefinition(@NotNull TTLParser.EnumeratordefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratordefinition(@NotNull TTLParser.EnumeratordefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#transformationProgram}.
	 * @param ctx the parse tree
	 */
	void enterTransformationProgram(@NotNull TTLParser.TransformationProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#transformationProgram}.
	 * @param ctx the parse tree
	 */
	void exitTransformationProgram(@NotNull TTLParser.TransformationProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewdeclarator(@NotNull TTLParser.NewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewdeclarator(@NotNull TTLParser.NewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(@NotNull TTLParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(@NotNull TTLParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(@NotNull TTLParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(@NotNull TTLParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(@NotNull TTLParser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(@NotNull TTLParser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(@NotNull TTLParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(@NotNull TTLParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(@NotNull TTLParser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(@NotNull TTLParser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmdefinition(@NotNull TTLParser.AsmdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmdefinition(@NotNull TTLParser.AsmdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedid(@NotNull TTLParser.QualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedid(@NotNull TTLParser.QualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(@NotNull TTLParser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(@NotNull TTLParser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributedeclaration(@NotNull TTLParser.AttributedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributedeclaration(@NotNull TTLParser.AttributedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void enterNamespacebody(@NotNull TTLParser.NamespacebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void exitNamespacebody(@NotNull TTLParser.NamespacebodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewinitializer(@NotNull TTLParser.NewinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewinitializer(@NotNull TTLParser.NewinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterlist(@NotNull TTLParser.TemplateparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterlist(@NotNull TTLParser.TemplateparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(@NotNull TTLParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(@NotNull TTLParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptydeclaration(@NotNull TTLParser.EmptydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptydeclaration(@NotNull TTLParser.EmptydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingdeclaration(@NotNull TTLParser.UsingdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingdeclaration(@NotNull TTLParser.UsingdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifierseq(@NotNull TTLParser.DeclspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifierseq(@NotNull TTLParser.DeclspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#ttlcondition}.
	 * @param ctx the parse tree
	 */
	void enterTtlcondition(@NotNull TTLParser.TtlconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#ttlcondition}.
	 * @param ctx the parse tree
	 */
	void exitTtlcondition(@NotNull TTLParser.TtlconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void enterSimpletemplateid(@NotNull TTLParser.SimpletemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void exitSimpletemplateid(@NotNull TTLParser.SimpletemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(@NotNull TTLParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(@NotNull TTLParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(@NotNull TTLParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(@NotNull TTLParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(@NotNull TTLParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(@NotNull TTLParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(@NotNull TTLParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(@NotNull TTLParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(@NotNull TTLParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(@NotNull TTLParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifier(@NotNull TTLParser.VirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifier(@NotNull TTLParser.VirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasdeclaration(@NotNull TTLParser.AliasdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasdeclaration(@NotNull TTLParser.AliasdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(@NotNull TTLParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(@NotNull TTLParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void enterLiteraloperatorid(@NotNull TTLParser.LiteraloperatoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void exitLiteraloperatorid(@NotNull TTLParser.LiteraloperatoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void enterCapturedefault(@NotNull TTLParser.CapturedefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void exitCapturedefault(@NotNull TTLParser.CapturedefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(@NotNull TTLParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(@NotNull TTLParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrnewdeclarator(@NotNull TTLParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrnewdeclarator(@NotNull TTLParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(@NotNull TTLParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(@NotNull TTLParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexpression(@NotNull TTLParser.PrimaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexpression(@NotNull TTLParser.PrimaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumname}.
	 * @param ctx the parse tree
	 */
	void enterEnumname(@NotNull TTLParser.EnumnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumname}.
	 * @param ctx the parse tree
	 */
	void exitEnumname(@NotNull TTLParser.EnumnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void enterBaseclause(@NotNull TTLParser.BaseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void exitBaseclause(@NotNull TTLParser.BaseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(@NotNull TTLParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(@NotNull TTLParser.TypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull TTLParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull TTLParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(@NotNull TTLParser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(@NotNull TTLParser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeargumentclause(@NotNull TTLParser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeargumentclause(@NotNull TTLParser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(@NotNull TTLParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(@NotNull TTLParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributenamespace(@NotNull TTLParser.AttributenamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributenamespace(@NotNull TTLParser.AttributenamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(@NotNull TTLParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(@NotNull TTLParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedtypespecifier(@NotNull TTLParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedtypespecifier(@NotNull TTLParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(@NotNull TTLParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(@NotNull TTLParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void enterTypedefname(@NotNull TTLParser.TypedefnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void exitTypedefname(@NotNull TTLParser.TypedefnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionspecifier(@NotNull TTLParser.FunctionspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionspecifier(@NotNull TTLParser.FunctionspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull TTLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull TTLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifierlist(@NotNull TTLParser.BasespecifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifierlist(@NotNull TTLParser.BasespecifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaratorlist(@NotNull TTLParser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaratorlist(@NotNull TTLParser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessspecifier(@NotNull TTLParser.AccessspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessspecifier(@NotNull TTLParser.AccessspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(@NotNull TTLParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(@NotNull TTLParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypenamespecifier(@NotNull TTLParser.TypenamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypenamespecifier(@NotNull TTLParser.TypenamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameter(@NotNull TTLParser.TemplateparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameter(@NotNull TTLParser.TemplateparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifierseq(@NotNull TTLParser.TypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifierseq(@NotNull TTLParser.TypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(@NotNull TTLParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(@NotNull TTLParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingdirective(@NotNull TTLParser.UsingdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingdirective(@NotNull TTLParser.UsingdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#transformationrule}.
	 * @param ctx the parse tree
	 */
	void enterTransformationrule(@NotNull TTLParser.TransformationruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#transformationrule}.
	 * @param ctx the parse tree
	 */
	void exitTransformationrule(@NotNull TTLParser.TransformationruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(@NotNull TTLParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(@NotNull TTLParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaexpression(@NotNull TTLParser.LambdaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaexpression(@NotNull TTLParser.LambdaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForinitstatement(@NotNull TTLParser.ForinitstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForinitstatement(@NotNull TTLParser.ForinitstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#templatename}.
	 * @param ctx the parse tree
	 */
	void enterTemplatename(@NotNull TTLParser.TemplatenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#templatename}.
	 * @param ctx the parse tree
	 */
	void exitTemplatename(@NotNull TTLParser.TemplatenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#mapName}.
	 * @param ctx the parse tree
	 */
	void enterMapName(@NotNull TTLParser.MapNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#mapName}.
	 * @param ctx the parse tree
	 */
	void exitMapName(@NotNull TTLParser.MapNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicexceptionspecification(@NotNull TTLParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicexceptionspecification(@NotNull TTLParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(@NotNull TTLParser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(@NotNull TTLParser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#mapdecl}.
	 * @param ctx the parse tree
	 */
	void enterMapdecl(@NotNull TTLParser.MapdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#mapdecl}.
	 * @param ctx the parse tree
	 */
	void exitMapdecl(@NotNull TTLParser.MapdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(@NotNull TTLParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(@NotNull TTLParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(@NotNull TTLParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(@NotNull TTLParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledstatement(@NotNull TTLParser.LabeledstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledstatement(@NotNull TTLParser.LabeledstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void enterTrailingreturntype(@NotNull TTLParser.TrailingreturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void exitTrailingreturntype(@NotNull TTLParser.TrailingreturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(@NotNull TTLParser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(@NotNull TTLParser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void enterConversiontypeid(@NotNull TTLParser.ConversiontypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void exitConversiontypeid(@NotNull TTLParser.ConversiontypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypespecifier(@NotNull TTLParser.DecltypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypespecifier(@NotNull TTLParser.DecltypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(@NotNull TTLParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(@NotNull TTLParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TTLParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacedefinition(@NotNull TTLParser.NamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTLParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacedefinition(@NotNull TTLParser.NamespacedefinitionContext ctx);
}