package de.sepl.cs.unifrankfurt.ttlparserlexer;

// Generated from TTL.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, INCLUDE=15, NAMESPACE=16, 
		Identifier=17, StringLiteral=18, LineDirective=19, PragmaDirective=20, 
		Whitespace=21, Newline=22, BlockComment=23, LineComment=24, Directive=25, 
		Alignas=26, Alignof=27, Asm=28, Auto=29, Bool=30, Break=31, Case=32, Catch=33, 
		Char=34, Char16=35, Char32=36, Class=37, Const=38, Constexpr=39, Const_cast=40, 
		Continue=41, Decltype=42, Default=43, Delete=44, Do=45, Double=46, Dynamic_cast=47, 
		Else=48, Enum=49, Explicit=50, Export=51, Extern=52, False=53, Final=54, 
		Float=55, For=56, Friend=57, Goto=58, If=59, Inline=60, Int=61, Long=62, 
		Mutable=63, Namespace=64, New=65, Noexcept=66, Nullptr=67, Operator=68, 
		Override=69, Private=70, Protected=71, Public=72, Register=73, Reinterpret_cast=74, 
		Return=75, Short=76, Signed=77, Sizeof=78, Static=79, Static_assert=80, 
		Static_cast=81, Struct=82, Switch=83, Template=84, This=85, Thread_local=86, 
		Throw=87, True=88, Try=89, Typedef=90, Typeid=91, Typename=92, Union=93, 
		Unsigned=94, Using=95, Virtual=96, Void=97, Volatile=98, Wchar=99, While=100, 
		LeftParen=101, RightParen=102, LeftBracket=103, RightBracket=104, LeftBrace=105, 
		RightBrace=106, Plus=107, Minus=108, Star=109, Div=110, Mod=111, Caret=112, 
		And=113, Or=114, Tilde=115, Not=116, Assign=117, Less=118, Greater=119, 
		PlusAssign=120, MinusAssign=121, StarAssign=122, DivAssign=123, ModAssign=124, 
		XorAssign=125, AndAssign=126, OrAssign=127, LeftShift=128, LeftShiftAssign=129, 
		Equal=130, NotEqual=131, LessEqual=132, GreaterEqual=133, AndAnd=134, 
		OrOr=135, PlusPlus=136, MinusMinus=137, Comma=138, ArrowStar=139, Arrow=140, 
		Question=141, Colon=142, Doublecolon=143, Semi=144, Dot=145, DotStar=146, 
		Ellipsis=147, Integerliteral=148, Decimalliteral=149, Octalliteral=150, 
		Hexadecimalliteral=151, Binaryliteral=152, Integersuffix=153, Characterliteral=154, 
		Floatingliteral=155, Stringliteral=156, Userdefinedintegerliteral=157, 
		Userdefinedfloatingliteral=158, Userdefinedstringliteral=159, Userdefinedcharacterliteral=160;
	public static final String[] tokenNames = {
		"<INVALID>", "'id'", "'$'", "'expr'", "'{{'", "';;'", "'type'", "'decl'", 
		"'tag'", "'map '", "'}}'", "'==='", "'stmt'", "'where'", "'in'", "'#include '", 
		"NAMESPACE", "Identifier", "StringLiteral", "LineDirective", "PragmaDirective", 
		"Whitespace", "Newline", "BlockComment", "LineComment", "Directive", "'alignas'", 
		"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
		"'char'", "'char16_t'", "'char32_t'", "'class'", "'const'", "'constexpr'", 
		"'const_cast'", "'continue'", "'decltype'", "'default'", "'delete'", "'do'", 
		"'double'", "'dynamic_cast'", "'else'", "'enum'", "'explicit'", "'export'", 
		"'extern'", "'false'", "'final'", "'float'", "'for'", "'friend'", "'goto'", 
		"'if'", "'inline'", "'int'", "'long'", "'mutable'", "Namespace", "'new'", 
		"'noexcept'", "'nullptr'", "'operator'", "'override'", "'private'", "'protected'", 
		"'public'", "'register'", "'reinterpret_cast'", "'return'", "'short'", 
		"'signed'", "'sizeof'", "'static'", "'static_assert'", "'static_cast'", 
		"'struct'", "'switch'", "'template'", "'this'", "'thread_local'", "'throw'", 
		"'true'", "'try'", "'typedef'", "'typeid'", "'typename'", "'union'", "'unsigned'", 
		"'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", "'while'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'&'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'<<='", 
		"'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", 
		"'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'", 
		"Integerliteral", "Decimalliteral", "Octalliteral", "Hexadecimalliteral", 
		"Binaryliteral", "Integersuffix", "Characterliteral", "Floatingliteral", 
		"Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
		"Userdefinedstringliteral", "Userdefinedcharacterliteral"
	};
	public static final int
		RULE_transformationProgram = 0, RULE_spec = 1, RULE_decl = 2, RULE_transformationrule = 3, 
		RULE_transformationexpression = 4, RULE_taguse = 5, RULE_conditions = 6, 
		RULE_ttlcondition = 7, RULE_mapElement = 8, RULE_mapName = 9, RULE_astname = 10, 
		RULE_mapdecl = 11, RULE_listofpairs = 12, RULE_tagdecl = 13, RULE_formals = 14, 
		RULE_tag = 15, RULE_tagname = 16, RULE_cc = 17, RULE_translationunit = 18, 
		RULE_primaryexpression = 19, RULE_idexpression = 20, RULE_unqualifiedid = 21, 
		RULE_qualifiedid = 22, RULE_nestednamespecifier = 23, RULE_lambdaexpression = 24, 
		RULE_lambdaintroducer = 25, RULE_lambdacapture = 26, RULE_capturedefault = 27, 
		RULE_capturelist = 28, RULE_capture = 29, RULE_simplecapture = 30, RULE_initcapture = 31, 
		RULE_lambdadeclarator = 32, RULE_postfixexpression = 33, RULE_expressionlist = 34, 
		RULE_pseudodestructorname = 35, RULE_unaryexpression = 36, RULE_unaryoperator = 37, 
		RULE_newexpression = 38, RULE_newplacement = 39, RULE_newtypeid = 40, 
		RULE_newdeclarator = 41, RULE_noptrnewdeclarator = 42, RULE_newinitializer = 43, 
		RULE_deleteexpression = 44, RULE_noexceptexpression = 45, RULE_castexpression = 46, 
		RULE_pmexpression = 47, RULE_multiplicativeexpression = 48, RULE_additiveexpression = 49, 
		RULE_shiftexpression = 50, RULE_relationalexpression = 51, RULE_equalityexpression = 52, 
		RULE_andexpression = 53, RULE_exclusiveorexpression = 54, RULE_inclusiveorexpression = 55, 
		RULE_logicalandexpression = 56, RULE_logicalorexpression = 57, RULE_conditionalexpression = 58, 
		RULE_assignmentexpression = 59, RULE_assignmentoperator = 60, RULE_expression = 61, 
		RULE_constantexpression = 62, RULE_statement = 63, RULE_labeledstatement = 64, 
		RULE_expressionstatement = 65, RULE_compoundstatement = 66, RULE_statementseq = 67, 
		RULE_selectionstatement = 68, RULE_condition = 69, RULE_iterationstatement = 70, 
		RULE_forinitstatement = 71, RULE_forrangedeclaration = 72, RULE_forrangeinitializer = 73, 
		RULE_jumpstatement = 74, RULE_declarationstatement = 75, RULE_declarationseq = 76, 
		RULE_declaration = 77, RULE_blockdeclaration = 78, RULE_aliasdeclaration = 79, 
		RULE_simpledeclaration = 80, RULE_static_assertdeclaration = 81, RULE_emptydeclaration = 82, 
		RULE_attributedeclaration = 83, RULE_declspecifier = 84, RULE_declspecifierseq = 85, 
		RULE_storageclassspecifier = 86, RULE_functionspecifier = 87, RULE_typedefname = 88, 
		RULE_typespecifier = 89, RULE_trailingtypespecifier = 90, RULE_typespecifierseq = 91, 
		RULE_trailingtypespecifierseq = 92, RULE_simpletypespecifier = 93, RULE_typename = 94, 
		RULE_decltypespecifier = 95, RULE_elaboratedtypespecifier = 96, RULE_enumname = 97, 
		RULE_enumspecifier = 98, RULE_enumhead = 99, RULE_opaqueenumdeclaration = 100, 
		RULE_enumkey = 101, RULE_enumbase = 102, RULE_enumeratorlist = 103, RULE_enumeratordefinition = 104, 
		RULE_enumerator = 105, RULE_namespacename = 106, RULE_originalnamespacename = 107, 
		RULE_namespacedefinition = 108, RULE_namednamespacedefinition = 109, RULE_originalnamespacedefinition = 110, 
		RULE_extensionnamespacedefinition = 111, RULE_unnamednamespacedefinition = 112, 
		RULE_namespacebody = 113, RULE_namespacealias = 114, RULE_namespacealiasdefinition = 115, 
		RULE_qualifiednamespacespecifier = 116, RULE_usingdeclaration = 117, RULE_usingdirective = 118, 
		RULE_asmdefinition = 119, RULE_linkagespecification = 120, RULE_attributespecifierseq = 121, 
		RULE_attributespecifier = 122, RULE_alignmentspecifier = 123, RULE_attributelist = 124, 
		RULE_attribute = 125, RULE_attributetoken = 126, RULE_attributescopedtoken = 127, 
		RULE_attributenamespace = 128, RULE_attributeargumentclause = 129, RULE_balancedtokenseq = 130, 
		RULE_balancedtoken = 131, RULE_initdeclaratorlist = 132, RULE_initdeclarator = 133, 
		RULE_declarator = 134, RULE_ptrdeclarator = 135, RULE_noptrdeclarator = 136, 
		RULE_parametersandqualifiers = 137, RULE_trailingreturntype = 138, RULE_ptroperator = 139, 
		RULE_cvqualifierseq = 140, RULE_cvqualifier = 141, RULE_refqualifier = 142, 
		RULE_declaratorid = 143, RULE_typeid = 144, RULE_abstractdeclarator = 145, 
		RULE_ptrabstractdeclarator = 146, RULE_noptrabstractdeclarator = 147, 
		RULE_abstractpackdeclarator = 148, RULE_noptrabstractpackdeclarator = 149, 
		RULE_parameterdeclarationclause = 150, RULE_parameterdeclarationlist = 151, 
		RULE_parameterdeclaration = 152, RULE_functiondefinition = 153, RULE_functionbody = 154, 
		RULE_initializer = 155, RULE_braceorequalinitializer = 156, RULE_initializerclause = 157, 
		RULE_initializerlist = 158, RULE_bracedinitlist = 159, RULE_classname = 160, 
		RULE_classspecifier = 161, RULE_classhead = 162, RULE_classheadname = 163, 
		RULE_classvirtspecifier = 164, RULE_classkey = 165, RULE_memberspecification = 166, 
		RULE_memberdeclaration = 167, RULE_memberdeclaratorlist = 168, RULE_memberdeclarator = 169, 
		RULE_virtspecifierseq = 170, RULE_virtspecifier = 171, RULE_purespecifier = 172, 
		RULE_baseclause = 173, RULE_basespecifierlist = 174, RULE_basespecifier = 175, 
		RULE_classordecltype = 176, RULE_basetypespecifier = 177, RULE_accessspecifier = 178, 
		RULE_conversionfunctionid = 179, RULE_conversiontypeid = 180, RULE_conversiondeclarator = 181, 
		RULE_ctorinitializer = 182, RULE_meminitializerlist = 183, RULE_meminitializer = 184, 
		RULE_meminitializerid = 185, RULE_operatorfunctionid = 186, RULE_literaloperatorid = 187, 
		RULE_templatedeclaration = 188, RULE_templateparameterlist = 189, RULE_templateparameter = 190, 
		RULE_typeparameter = 191, RULE_simpletemplateid = 192, RULE_templateid = 193, 
		RULE_templatename = 194, RULE_templateargumentlist = 195, RULE_templateargument = 196, 
		RULE_typenamespecifier = 197, RULE_explicitinstantiation = 198, RULE_explicitspecialization = 199, 
		RULE_tryblock = 200, RULE_functiontryblock = 201, RULE_handlerseq = 202, 
		RULE_handler = 203, RULE_exceptiondeclaration = 204, RULE_throwexpression = 205, 
		RULE_exceptionspecification = 206, RULE_dynamicexceptionspecification = 207, 
		RULE_typeidlist = 208, RULE_noexceptspecification = 209, RULE_rightShift = 210, 
		RULE_rightShiftAssign = 211, RULE_operator = 212, RULE_literal = 213, 
		RULE_booleanliteral = 214, RULE_pointerliteral = 215, RULE_userdefinedliteral = 216;
	public static final String[] ruleNames = {
		"transformationProgram", "spec", "decl", "transformationrule", "transformationexpression", 
		"taguse", "conditions", "ttlcondition", "mapElement", "mapName", "astname", 
		"mapdecl", "listofpairs", "tagdecl", "formals", "tag", "tagname", "cc", 
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "expressionlist", 
		"pseudodestructorname", "unaryexpression", "unaryoperator", "newexpression", 
		"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
		"deleteexpression", "noexceptexpression", "castexpression", "pmexpression", 
		"multiplicativeexpression", "additiveexpression", "shiftexpression", "relationalexpression", 
		"equalityexpression", "andexpression", "exclusiveorexpression", "inclusiveorexpression", 
		"logicalandexpression", "logicalorexpression", "conditionalexpression", 
		"assignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"statement", "labeledstatement", "expressionstatement", "compoundstatement", 
		"statementseq", "selectionstatement", "condition", "iterationstatement", 
		"forinitstatement", "forrangedeclaration", "forrangeinitializer", "jumpstatement", 
		"declarationstatement", "declarationseq", "declaration", "blockdeclaration", 
		"aliasdeclaration", "simpledeclaration", "static_assertdeclaration", "emptydeclaration", 
		"attributedeclaration", "declspecifier", "declspecifierseq", "storageclassspecifier", 
		"functionspecifier", "typedefname", "typespecifier", "trailingtypespecifier", 
		"typespecifierseq", "trailingtypespecifierseq", "simpletypespecifier", 
		"typename", "decltypespecifier", "elaboratedtypespecifier", "enumname", 
		"enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", "enumbase", 
		"enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
		"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "typeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "rightShift", "rightShiftAssign", 
		"operator", "literal", "booleanliteral", "pointerliteral", "userdefinedliteral"
	};

	@Override
	public String getGrammarFileName() { return "TTL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TransformationProgramContext extends ParserRuleContext {
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public TransformationProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformationProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTransformationProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTransformationProgram(this);
		}
	}

	public final TransformationProgramContext transformationProgram() throws RecognitionException {
		TransformationProgramContext _localctx = new TransformationProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_transformationProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434); spec();
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAMESPACE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TTLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TTLParser.Identifier, i);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public TerminalNode NAMESPACE() { return getToken(TTLParser.NAMESPACE, 0); }
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitSpec(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(NAMESPACE);
			setState(440); match(Identifier);
			setState(441); match(Colon);
			setState(442); match(Identifier);
			setState(443); match(T__3);
			setState(444); match(Identifier);
			setState(445); match(T__10);
			setState(447); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(446); decl();
				}
				}
				setState(449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__2) | (1L << INCLUDE) | (1L << Identifier) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Noexcept - 64)) | (1L << (Nullptr - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Reinterpret_cast - 64)) | (1L << (Return - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (PlusPlus - 134)) | (1L << (MinusMinus - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Integerliteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0) );
			setState(451); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public TransformationruleContext transformationrule() {
			return getRuleContext(TransformationruleContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(TTLParser.StringLiteral, 0); }
		public TerminalNode INCLUDE() { return getToken(TTLParser.INCLUDE, 0); }
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453); match(INCLUDE);
				setState(454); match(StringLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); match(INCLUDE);
				setState(456); match(Less);
				setState(457); cc(0);
				setState(458); match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460); transformationrule();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformationruleContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TagnameContext tagname() {
			return getRuleContext(TagnameContext.class,0);
		}
		public TransformationruleContext transformationrule(int i) {
			return getRuleContext(TransformationruleContext.class,i);
		}
		public List<TransformationruleContext> transformationrule() {
			return getRuleContexts(TransformationruleContext.class);
		}
		public TagdeclContext tagdecl() {
			return getRuleContext(TagdeclContext.class,0);
		}
		public List<TransformationexpressionContext> transformationexpression() {
			return getRuleContexts(TransformationexpressionContext.class);
		}
		public MapdeclContext mapdecl() {
			return getRuleContext(MapdeclContext.class,0);
		}
		public TransformationexpressionContext transformationexpression(int i) {
			return getRuleContext(TransformationexpressionContext.class,i);
		}
		public TransformationruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformationrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTransformationrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTransformationrule(this);
		}
	}

	public final TransformationruleContext transformationrule() throws RecognitionException {
		TransformationruleContext _localctx = new TransformationruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transformationrule);
		int _la;
		try {
			setState(513);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463); tagname();
				setState(464); match(T__10);
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(465); transformationrule();
					}
					}
					setState(468); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__2) | (1L << Identifier) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Noexcept - 64)) | (1L << (Nullptr - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Reinterpret_cast - 64)) | (1L << (Return - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (PlusPlus - 134)) | (1L << (MinusMinus - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Integerliteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0) );
				setState(470); match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472); tagname();
				setState(473); match(Less);
				setState(474); match(Identifier);
				setState(475); match(Greater);
				setState(476); match(T__10);
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(477); transformationrule();
					}
					}
					setState(480); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__2) | (1L << Identifier) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Noexcept - 64)) | (1L << (Nullptr - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Reinterpret_cast - 64)) | (1L << (Return - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (PlusPlus - 134)) | (1L << (MinusMinus - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Integerliteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0) );
				setState(482); match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484); tagdecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485); mapdecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486); transformationexpression();
				setState(487); match(T__3);
				setState(488); match(Identifier);
				setState(489); match(LeftParen);
				setState(490); transformationexpression();
				setState(491); match(RightParen);
				setState(492); match(T__9);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(494); transformationexpression();
				setState(495); match(T__3);
				setState(496); match(Identifier);
				setState(497); match(LeftParen);
				setState(498); transformationexpression();
				setState(499); match(RightParen);
				setState(500); conditions();
				setState(501); match(T__9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(503); transformationexpression();
				setState(504); match(T__3);
				setState(505); match(Identifier);
				setState(506); match(LeftParen);
				setState(507); transformationexpression();
				setState(508); match(RightParen);
				setState(509); match(T__10);
				setState(510); conditions();
				setState(511); match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformationexpressionContext extends ParserRuleContext {
		public AstnameContext astname() {
			return getRuleContext(AstnameContext.class,0);
		}
		public TaguseContext taguse() {
			return getRuleContext(TaguseContext.class,0);
		}
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public TransformationexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformationexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTransformationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTransformationexpression(this);
		}
	}

	public final TransformationexpressionContext transformationexpression() throws RecognitionException {
		TransformationexpressionContext _localctx = new TransformationexpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transformationexpression);
		try {
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515); astname();
				setState(516); cc(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518); astname();
				setState(519); cc(0);
				setState(520); taguse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522); cc(0);
				setState(523); taguse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(525); cc(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(526); taguse();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaguseContext extends ParserRuleContext {
		public TagnameContext tagname() {
			return getRuleContext(TagnameContext.class,0);
		}
		public TaguseContext taguse() {
			return getRuleContext(TaguseContext.class,0);
		}
		public List<CcContext> cc() {
			return getRuleContexts(CcContext.class);
		}
		public CcContext cc(int i) {
			return getRuleContext(CcContext.class,i);
		}
		public TaguseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taguse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTaguse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTaguse(this);
		}
	}

	public final TaguseContext taguse() throws RecognitionException {
		TaguseContext _localctx = new TaguseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_taguse);
		try {
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); tagname();
				setState(530); match(Less);
				setState(531); taguse();
				setState(532); match(Greater);
				setState(533); match(LeftParen);
				setState(534); cc(0);
				setState(535); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537); tagname();
				setState(538); match(Less);
				setState(539); cc(0);
				setState(540); match(Greater);
				setState(541); match(LeftParen);
				setState(542); cc(0);
				setState(543); match(RightParen);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545); tagname();
				setState(546); match(LeftParen);
				setState(547); cc(0);
				setState(548); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public List<TtlconditionContext> ttlcondition() {
			return getRuleContexts(TtlconditionContext.class);
		}
		public TtlconditionContext ttlcondition(int i) {
			return getRuleContext(TtlconditionContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditions);
		int _la;
		try {
			setState(558);
			switch (_input.LA(1)) {
			case T__1:
			case Mutable:
			case Using:
				enterOuterAlt(_localctx, 1);
				{
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(552); ttlcondition();
					}
					}
					setState(555); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 || _la==Mutable || _la==Using );
				}
				break;
			case T__9:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlconditionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public MapElementContext mapElement() {
			return getRuleContext(MapElementContext.class,0);
		}
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public MapNameContext mapName() {
			return getRuleContext(MapNameContext.class,0);
		}
		public TtlconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTtlcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTtlcondition(this);
		}
	}

	public final TtlconditionContext ttlcondition() throws RecognitionException {
		TtlconditionContext _localctx = new TtlconditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ttlcondition);
		try {
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560); match(T__1);
				setState(561); cc(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562); match(T__1);
				setState(563); mapElement();
				setState(564); match(T__0);
				setState(565); mapName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567); match(Using);
				setState(568); cc(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569); match(Mutable);
				setState(570); match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(571); match(T__1);
				setState(572); match(T__10);
				setState(573); cc(0);
				setState(574); match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(576); match(Using);
				setState(577); match(T__10);
				setState(578); cc(0);
				setState(579); match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(581); match(Mutable);
				setState(582); match(T__10);
				setState(583); match(Identifier);
				setState(584); match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapElementContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TTLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TTLParser.Identifier, i);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMapElement(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mapElement);
		try {
			setState(592);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588); match(Identifier);
				setState(589); match(LeftParen);
				setState(590); match(Identifier);
				setState(591); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TTLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TTLParser.Identifier, i);
		}
		public MapNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMapName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMapName(this);
		}
	}

	public final MapNameContext mapName() throws RecognitionException {
		MapNameContext _localctx = new MapNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mapName);
		try {
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595); match(Identifier);
				setState(596); match(Dot);
				setState(597); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AstnameContext extends ParserRuleContext {
		public AstnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_astname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAstname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAstname(this);
		}
	}

	public final AstnameContext astname() throws RecognitionException {
		AstnameContext _localctx = new AstnameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_astname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__7) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapdeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public ListofpairsContext listofpairs() {
			return getRuleContext(ListofpairsContext.class,0);
		}
		public MapdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMapdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMapdecl(this);
		}
	}

	public final MapdeclContext mapdecl() throws RecognitionException {
		MapdeclContext _localctx = new MapdeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mapdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); match(T__5);
			setState(603); match(Identifier);
			setState(604); match(LeftParen);
			setState(605); listofpairs();
			setState(606); match(RightParen);
			setState(607); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListofpairsContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(TTLParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TTLParser.StringLiteral, i);
		}
		public ListofpairsContext listofpairs() {
			return getRuleContext(ListofpairsContext.class,0);
		}
		public ListofpairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listofpairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterListofpairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitListofpairs(this);
		}
	}

	public final ListofpairsContext listofpairs() throws RecognitionException {
		ListofpairsContext _localctx = new ListofpairsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listofpairs);
		try {
			setState(615);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(609); match(StringLiteral);
				setState(610); match(Colon);
				setState(611); match(StringLiteral);
				setState(612); match(Comma);
				setState(613); listofpairs();
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagdeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public TagdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTagdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTagdecl(this);
		}
	}

	public final TagdeclContext tagdecl() throws RecognitionException {
		TagdeclContext _localctx = new TagdeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); match(T__6);
			setState(618); match(Identifier);
			setState(623);
			_la = _input.LA(1);
			if (_la==Less) {
				{
				setState(619); match(Less);
				setState(620); formals();
				setState(621); match(Greater);
				}
			}

			setState(625); match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AstnameContext astname() {
			return getRuleContext(AstnameContext.class,0);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitFormals(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); astname();
			setState(628); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TagnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTagname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTagname(this);
		}
	}

	public final TagnameContext tagname() throws RecognitionException {
		TagnameContext _localctx = new TagnameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tagname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TTLParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TTLParser.Identifier, i);
		}
		public TaguseContext taguse() {
			return getRuleContext(TaguseContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CcContext cc() {
			return getRuleContext(CcContext.class,0);
		}
		public CcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCc(this);
		}
	}

	public final CcContext cc() throws RecognitionException {
		return cc(0);
	}

	private CcContext cc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CcContext _localctx = new CcContext(_ctx, _parentState);
		CcContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_cc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(635); match(Identifier);
				setState(636); match(LeftParen);
				setState(637); match(Identifier);
				setState(638); match(RightParen);
				setState(639); cc(6);
				}
				break;
			case 2:
				{
				setState(640); taguse();
				}
				break;
			case 3:
				{
				setState(641); match(Identifier);
				setState(642); match(Identifier);
				}
				break;
			case 4:
				{
				setState(643); match(T__12);
				setState(644); match(Identifier);
				}
				break;
			case 5:
				{
				setState(645); match(Struct);
				setState(646); match(LeftBrace);
				setState(647); taguse();
				setState(648); match(RightBrace);
				setState(653);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(649); match(LeftBracket);
					setState(650); cc(0);
					setState(651); match(RightBracket);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(655); expression(0);
				}
				break;
			case 7:
				{
				setState(656); statement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CcContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cc);
					setState(659);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(660); taguse();
					}
					} 
				}
				setState(665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TranslationunitContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TTLParser.EOF, 0); }
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)))) != 0)) {
				{
				setState(666); declarationseq(0);
				}
			}

			setState(669); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(TTLParser.This, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primaryexpression);
		try {
			setState(679);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(671); literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(672); match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(673); match(LeftParen);
				setState(674); expression(0);
				setState(675); match(RightParen);
				}
				break;
			case Identifier:
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
				enterOuterAlt(_localctx, 4);
				{
				setState(677); idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(678); lambdaexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexpressionContext extends ParserRuleContext {
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idexpression);
		try {
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); qualifiedid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unqualifiedid);
		try {
			setState(694);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(686); operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687); conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(688); literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(689); match(Tilde);
				setState(690); classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(691); match(Tilde);
				setState(692); decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(693); templateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedidContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696); nestednamespecifier(0);
			setState(698);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(697); match(Template);
				}
			}

			setState(700); unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(703); match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(704); typename();
				setState(705); match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(707); namespacename();
				setState(708); match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(710); decltypespecifier();
				setState(711); match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(727);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(725);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(715);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(716); match(Identifier);
						setState(717); match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(718);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(720);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(719); match(Template);
							}
						}

						setState(722); simpletemplateid();
						setState(723); match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); lambdaintroducer();
			setState(732);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(731); lambdadeclarator();
				}
			}

			setState(734); compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736); match(LeftBracket);
			setState(738);
			_la = _input.LA(1);
			if (_la==Identifier || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (This - 85)) | (1L << (And - 85)) | (1L << (Assign - 85)))) != 0)) {
				{
				setState(737); lambdacapture();
				}
			}

			setState(740); match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lambdacapture);
		try {
			setState(748);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742); capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743); capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744); capturedefault();
				setState(745); match(Comma);
				setState(746); capturelist(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturelistContext extends ParserRuleContext {
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(753); capture();
			setState(755);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(754); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(757);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(758); match(Comma);
					setState(759); capture();
					setState(761);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(760); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_capture);
		try {
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769); initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode This() { return getToken(TTLParser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simplecapture);
		try {
			setState(776);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(772); match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(773); match(And);
				setState(774); match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(775); match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_initcapture);
		try {
			setState(783);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(778); match(Identifier);
				setState(779); initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(780); match(And);
				setState(781); match(Identifier);
				setState(782); initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(TTLParser.Mutable, 0); }
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785); match(LeftParen);
			setState(786); parameterdeclarationclause();
			setState(787); match(RightParen);
			setState(789);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(788); match(Mutable);
				}
			}

			setState(792);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(791); exceptionspecification();
				}
			}

			setState(795);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(794); attributespecifierseq(0);
				}
			}

			setState(798);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(797); trailingreturntype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public TerminalNode Dynamic_cast() { return getToken(TTLParser.Dynamic_cast, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public TerminalNode Reinterpret_cast() { return getToken(TTLParser.Reinterpret_cast, 0); }
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public TerminalNode Const_cast() { return getToken(TTLParser.Const_cast, 0); }
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(TTLParser.Static_cast, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode Typeid() { return getToken(TTLParser.Typeid, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(801); primaryexpression();
				}
				break;
			case 2:
				{
				setState(802); simpletypespecifier();
				setState(803); match(LeftParen);
				setState(805);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(804); expressionlist();
					}
				}

				setState(807); match(RightParen);
				}
				break;
			case 3:
				{
				setState(809); typenamespecifier();
				setState(810); match(LeftParen);
				setState(812);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(811); expressionlist();
					}
				}

				setState(814); match(RightParen);
				}
				break;
			case 4:
				{
				setState(816); simpletypespecifier();
				setState(817); bracedinitlist();
				}
				break;
			case 5:
				{
				setState(819); typenamespecifier();
				setState(820); bracedinitlist();
				}
				break;
			case 6:
				{
				setState(822); match(Dynamic_cast);
				setState(823); match(Less);
				setState(824); typeid();
				setState(825); match(Greater);
				setState(826); match(LeftParen);
				setState(827); expression(0);
				setState(828); match(RightParen);
				}
				break;
			case 7:
				{
				setState(830); match(Static_cast);
				setState(831); match(Less);
				setState(832); typeid();
				setState(833); match(Greater);
				setState(834); match(LeftParen);
				setState(835); expression(0);
				setState(836); match(RightParen);
				}
				break;
			case 8:
				{
				setState(838); match(Reinterpret_cast);
				setState(839); match(Less);
				setState(840); typeid();
				setState(841); match(Greater);
				setState(842); match(LeftParen);
				setState(843); expression(0);
				setState(844); match(RightParen);
				}
				break;
			case 9:
				{
				setState(846); match(Const_cast);
				setState(847); match(Less);
				setState(848); typeid();
				setState(849); match(Greater);
				setState(850); match(LeftParen);
				setState(851); expression(0);
				setState(852); match(RightParen);
				}
				break;
			case 10:
				{
				setState(854); match(Typeid);
				setState(855); match(LeftParen);
				setState(856); expression(0);
				setState(857); match(RightParen);
				}
				break;
			case 11:
				{
				setState(859); match(Typeid);
				setState(860); match(LeftParen);
				setState(861); typeid();
				setState(862); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(904);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(866);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(867); match(LeftBracket);
						setState(868); expression(0);
						setState(869); match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(871);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(872); match(LeftBracket);
						setState(873); bracedinitlist();
						setState(874); match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(876);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(877); match(LeftParen);
						setState(879);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
							{
							setState(878); expressionlist();
							}
						}

						setState(881); match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(882);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(883); match(Dot);
						setState(885);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(884); match(Template);
							}
						}

						setState(887); idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(888);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(889); match(Arrow);
						setState(891);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(890); match(Template);
							}
						}

						setState(893); idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(894);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(895); match(Dot);
						setState(896); pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(897);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(898); match(Arrow);
						setState(899); pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(900);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(901); match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(902);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(903); match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909); initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_pseudodestructorname);
		int _la;
		try {
			setState(933);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(911); nestednamespecifier(0);
					}
					break;
				}
				setState(914); typename();
				setState(915); match(Doublecolon);
				setState(916); match(Tilde);
				setState(917); typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919); nestednamespecifier(0);
				setState(920); match(Template);
				setState(921); simpletemplateid();
				setState(922); match(Doublecolon);
				setState(923); match(Tilde);
				setState(924); typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				_la = _input.LA(1);
				if (_la==Identifier || _la==Decltype || _la==Doublecolon) {
					{
					setState(926); nestednamespecifier(0);
					}
				}

				setState(929); match(Tilde);
				setState(930); typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(931); match(Tilde);
				setState(932); decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Alignof() { return getToken(TTLParser.Alignof, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(TTLParser.Sizeof, 0); }
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unaryexpression);
		try {
			setState(963);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935); postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(936); match(PlusPlus);
				setState(937); castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(938); match(MinusMinus);
				setState(939); castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(940); unaryoperator();
				setState(941); castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(943); match(Sizeof);
				setState(944); unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(945); match(Sizeof);
				setState(946); match(LeftParen);
				setState(947); typeid();
				setState(948); match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(950); match(Sizeof);
				setState(951); match(Ellipsis);
				setState(952); match(LeftParen);
				setState(953); match(Identifier);
				setState(954); match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(955); match(Alignof);
				setState(956); match(LeftParen);
				setState(957); typeid();
				setState(958); match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(960); noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(961); newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(962); deleteexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (Plus - 107)) | (1L << (Minus - 107)) | (1L << (Star - 107)) | (1L << (And - 107)) | (1L << (Or - 107)) | (1L << (Tilde - 107)) | (1L << (Not - 107)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewexpressionContext extends ParserRuleContext {
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public TerminalNode New() { return getToken(TTLParser.New, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_newexpression);
		int _la;
		try {
			setState(991);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(967); match(Doublecolon);
					}
				}

				setState(970); match(New);
				setState(972);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(971); newplacement();
					}
				}

				setState(974); newtypeid();
				setState(976);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(975); newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(978); match(Doublecolon);
					}
				}

				setState(981); match(New);
				setState(983);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(982); newplacement();
					}
					break;
				}
				setState(985); match(LeftParen);
				setState(986); typeid();
				setState(987); match(RightParen);
				setState(989);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(988); newinitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); match(LeftParen);
			setState(994); expressionlist();
			setState(995); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); typespecifierseq();
			setState(999);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(998); newdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewdeclaratorContext extends ParserRuleContext {
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_newdeclarator);
		try {
			setState(1006);
			switch (_input.LA(1)) {
			case Identifier:
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001); ptroperator();
				setState(1003);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(1002); newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005); noptrnewdeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1009); match(LeftBracket);
			setState(1010); expression(0);
			setState(1011); match(RightBracket);
			setState(1013);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(1012); attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1024);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(1015);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1016); match(LeftBracket);
					setState(1017); constantexpression();
					setState(1018); match(RightBracket);
					setState(1020);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(1019); attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(1026);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_newinitializer);
		int _la;
		try {
			setState(1033);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027); match(LeftParen);
				setState(1029);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(1028); expressionlist();
					}
				}

				setState(1031); match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Delete() { return getToken(TTLParser.Delete, 0); }
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_deleteexpression);
		int _la;
		try {
			setState(1047);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(1035); match(Doublecolon);
					}
				}

				setState(1038); match(Delete);
				setState(1039); castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(1040); match(Doublecolon);
					}
				}

				setState(1043); match(Delete);
				setState(1044); match(LeftBracket);
				setState(1045); match(RightBracket);
				setState(1046); castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(TTLParser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049); match(Noexcept);
			setState(1050); match(LeftParen);
			setState(1051); expression(0);
			setState(1052); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_castexpression);
		try {
			setState(1060);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054); unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055); match(LeftParen);
				setState(1056); typeid();
				setState(1057); match(RightParen);
				setState(1058); castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1063); castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1071);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(1065);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1066); match(DotStar);
						setState(1067); castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(1068);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1069); match(ArrowStar);
						setState(1070); castexpression();
						}
						break;
					}
					} 
				}
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1077); pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1088);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(1079);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1080); match(Star);
						setState(1081); pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(1082);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1083); match(Div);
						setState(1084); pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(1085);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1086); match(Mod);
						setState(1087); pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1094); multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1102);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(1096);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1097); match(Plus);
						setState(1098); multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(1099);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1100); match(Minus);
						setState(1101); multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1108); additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1117);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(1110);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1111); match(LeftShift);
						setState(1112); additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(1113);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1114); rightShift();
						setState(1115); additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(1121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1123); shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1137);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(1125);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1126); match(Less);
						setState(1127); shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(1128);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1129); match(Greater);
						setState(1130); shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(1131);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1132); match(LessEqual);
						setState(1133); shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(1134);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1135); match(GreaterEqual);
						setState(1136); shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1143); relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1151);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(1145);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1146); match(Equal);
						setState(1147); relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(1148);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1149); match(NotEqual);
						setState(1150); relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(1155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1157); equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(1159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1160); match(And);
					setState(1161); equalityexpression(0);
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1168); andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(1170);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1171); match(Caret);
					setState(1172); andexpression(0);
					}
					} 
				}
				setState(1177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1179); exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(1181);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1182); match(Or);
					setState(1183); exclusiveorexpression(0);
					}
					} 
				}
				setState(1188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1190); inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(1192);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1193); match(AndAnd);
					setState(1194); inclusiveorexpression(0);
					}
					} 
				}
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1201); logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(1203);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1204); match(OrOr);
					setState(1205); logicalandexpression(0);
					}
					} 
				}
				setState(1210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_conditionalexpression);
		try {
			setState(1218);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211); logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212); logicalorexpression(0);
				setState(1213); match(Question);
				setState(1214); expression(0);
				setState(1215); match(Colon);
				setState(1216); assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_assignmentexpression);
		try {
			setState(1226);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1220); conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221); logicalorexpression(0);
				setState(1222); assignmentoperator();
				setState(1223); initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225); throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignmentoperator);
		try {
			setState(1239);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1228); match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(1229); match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230); match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(1231); match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(1232); match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(1233); match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(1234); rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(1235); match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(1236); match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(1237); match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(1238); match(OrAssign);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1242); assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1245); match(Comma);
					setState(1246); assignmentexpression();
					}
					} 
				}
				setState(1251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252); conditionalexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_statement);
		int _la;
		try {
			setState(1280);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254); labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1255); attributespecifierseq(0);
					}
					break;
				}
				setState(1258); expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1260);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1259); attributespecifierseq(0);
					}
				}

				setState(1262); compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1264);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1263); attributespecifierseq(0);
					}
				}

				setState(1266); selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1268);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1267); attributespecifierseq(0);
					}
				}

				setState(1270); iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1272);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1271); attributespecifierseq(0);
					}
				}

				setState(1274); jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1275); declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1277);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1276); attributespecifierseq(0);
					}
				}

				setState(1279); tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Default() { return getToken(TTLParser.Default, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(TTLParser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLabeledstatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_labeledstatement);
		int _la;
		try {
			setState(1302);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1282); attributespecifierseq(0);
					}
				}

				setState(1285); match(Identifier);
				setState(1286); match(Colon);
				setState(1287); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1288); attributespecifierseq(0);
					}
				}

				setState(1291); match(Case);
				setState(1292); constantexpression();
				setState(1293); match(Colon);
				setState(1294); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1296); attributespecifierseq(0);
					}
				}

				setState(1299); match(Default);
				setState(1300); match(Colon);
				setState(1301); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
				{
				setState(1304); expression(0);
				}
			}

			setState(1307); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309); match(LeftBrace);
			setState(1311);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Noexcept - 64)) | (1L << (Nullptr - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Reinterpret_cast - 64)) | (1L << (Return - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (PlusPlus - 134)) | (1L << (MinusMinus - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Integerliteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
				{
				setState(1310); statementseq(0);
				}
			}

			setState(1313); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1316); statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1318);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1319); statement();
					}
					} 
				}
				setState(1324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(TTLParser.Switch, 0); }
		public TerminalNode Else() { return getToken(TTLParser.Else, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode If() { return getToken(TTLParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_selectionstatement);
		try {
			setState(1345);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325); match(If);
				setState(1326); match(LeftParen);
				setState(1327); condition();
				setState(1328); match(RightParen);
				setState(1329); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1331); match(If);
				setState(1332); match(LeftParen);
				setState(1333); condition();
				setState(1334); match(RightParen);
				setState(1335); statement();
				setState(1336); match(Else);
				setState(1337); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339); match(Switch);
				setState(1340); match(LeftParen);
				setState(1341); condition();
				setState(1342); match(RightParen);
				setState(1343); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_condition);
		int _la;
		try {
			setState(1363);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1348); attributespecifierseq(0);
					}
				}

				setState(1351); declspecifierseq();
				setState(1352); declarator();
				setState(1353); match(Assign);
				setState(1354); initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1356); attributespecifierseq(0);
					}
				}

				setState(1359); declspecifierseq();
				setState(1360); declarator();
				setState(1361); bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(TTLParser.While, 0); }
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public TerminalNode Do() { return getToken(TTLParser.Do, 0); }
		public TerminalNode For() { return getToken(TTLParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_iterationstatement);
		int _la;
		try {
			setState(1400);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1365); match(While);
				setState(1366); match(LeftParen);
				setState(1367); condition();
				setState(1368); match(RightParen);
				setState(1369); statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371); match(Do);
				setState(1372); statement();
				setState(1373); match(While);
				setState(1374); match(LeftParen);
				setState(1375); expression(0);
				setState(1376); match(RightParen);
				setState(1377); match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1379); match(For);
				setState(1380); match(LeftParen);
				setState(1381); forinitstatement();
				setState(1383);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Register - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static - 65)) | (1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(1382); condition();
					}
				}

				setState(1385); match(Semi);
				setState(1387);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(1386); expression(0);
					}
				}

				setState(1389); match(RightParen);
				setState(1390); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1392); match(For);
				setState(1393); match(LeftParen);
				setState(1394); forrangedeclaration();
				setState(1395); match(Colon);
				setState(1396); forrangeinitializer();
				setState(1397); match(RightParen);
				setState(1398); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitForinitstatement(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_forinitstatement);
		try {
			setState(1404);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402); expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1403); simpledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1406); attributespecifierseq(0);
				}
			}

			setState(1409); declspecifierseq();
			setState(1410); declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_forrangeinitializer);
		try {
			setState(1414);
			switch (_input.LA(1)) {
			case Identifier:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412); expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode Continue() { return getToken(TTLParser.Continue, 0); }
		public TerminalNode Return() { return getToken(TTLParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Break() { return getToken(TTLParser.Break, 0); }
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Goto() { return getToken(TTLParser.Goto, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitJumpstatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_jumpstatement);
		int _la;
		try {
			setState(1432);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416); match(Break);
				setState(1417); match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418); match(Continue);
				setState(1419); match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420); match(Return);
				setState(1422);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(1421); expression(0);
					}
				}

				setState(1424); match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1425); match(Return);
				setState(1426); bracedinitlist();
				setState(1427); match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1429); match(Goto);
				setState(1430); match(Identifier);
				setState(1431); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434); blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1437); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1439);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1440); declaration();
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_declaration);
		try {
			setState(1455);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446); blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447); functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448); templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1449); explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1450); explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1451); linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1452); namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1453); emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1454); attributedeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockdeclarationContext extends ParserRuleContext {
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_blockdeclaration);
		try {
			setState(1465);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1457); simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458); asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1459); namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1460); usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1461); usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1462); static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1463); aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1464); opaqueenumdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode Using() { return getToken(TTLParser.Using, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467); match(Using);
			setState(1468); match(Identifier);
			setState(1470);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1469); attributespecifierseq(0);
				}
			}

			setState(1472); match(Assign);
			setState(1473); typeid();
			setState(1474); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_simpledeclaration);
		int _la;
		try {
			setState(1490);
			switch (_input.LA(1)) {
			case Identifier:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1476); declspecifierseq();
					}
					break;
				}
				setState(1480);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Identifier - 17)) | (1L << (Decltype - 17)) | (1L << (Operator - 17)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LeftParen - 101)) | (1L << (Star - 101)) | (1L << (And - 101)) | (1L << (Tilde - 101)) | (1L << (AndAnd - 101)) | (1L << (Doublecolon - 101)) | (1L << (Ellipsis - 101)))) != 0)) {
					{
					setState(1479); initdeclaratorlist(0);
					}
				}

				setState(1482); match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483); attributespecifierseq(0);
				setState(1485);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1484); declspecifierseq();
					}
					break;
				}
				setState(1487); initdeclaratorlist(0);
				setState(1488); match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(TTLParser.Static_assert, 0); }
		public TerminalNode Stringliteral() { return getToken(TTLParser.Stringliteral, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492); match(Static_assert);
			setState(1493); match(LeftParen);
			setState(1494); constantexpression();
			setState(1495); match(Comma);
			setState(1496); match(Stringliteral);
			setState(1497); match(RightParen);
			setState(1498); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502); attributespecifierseq(0);
			setState(1503); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TerminalNode Constexpr() { return getToken(TTLParser.Constexpr, 0); }
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(TTLParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(TTLParser.Typedef, 0); }
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_declspecifier);
		try {
			setState(1511);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505); storageclassspecifier();
				}
				break;
			case Identifier:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506); typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507); functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508); match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1509); match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1510); match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_declspecifierseq);
		try {
			setState(1520);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513); declspecifier();
				setState(1515);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1514); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517); declspecifier();
				setState(1518); declspecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(TTLParser.Extern, 0); }
		public TerminalNode Register() { return getToken(TTLParser.Register, 0); }
		public TerminalNode Thread_local() { return getToken(TTLParser.Thread_local, 0); }
		public TerminalNode Static() { return getToken(TTLParser.Static, 0); }
		public TerminalNode Mutable() { return getToken(TTLParser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Extern - 52)) | (1L << (Mutable - 52)) | (1L << (Register - 52)) | (1L << (Static - 52)) | (1L << (Thread_local - 52)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Explicit() { return getToken(TTLParser.Explicit, 0); }
		public TerminalNode Inline() { return getToken(TTLParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(TTLParser.Virtual, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (Explicit - 50)) | (1L << (Inline - 50)) | (1L << (Virtual - 50)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_typespecifier);
		try {
			setState(1531);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528); trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529); classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1530); enumspecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_trailingtypespecifier);
		try {
			setState(1537);
			switch (_input.LA(1)) {
			case Identifier:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533); simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534); elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535); typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1536); cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_typespecifierseq);
		try {
			setState(1546);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539); typespecifier();
				setState(1541);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1540); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543); typespecifier();
				setState(1544); typespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_trailingtypespecifierseq);
		try {
			setState(1555);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548); trailingtypespecifier();
				setState(1550);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1549); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1552); trailingtypespecifier();
				setState(1553); trailingtypespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TerminalNode Long() { return getToken(TTLParser.Long, 0); }
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public TerminalNode Bool() { return getToken(TTLParser.Bool, 0); }
		public TerminalNode Float() { return getToken(TTLParser.Float, 0); }
		public TerminalNode Char16() { return getToken(TTLParser.Char16, 0); }
		public TerminalNode Int() { return getToken(TTLParser.Int, 0); }
		public TerminalNode Double() { return getToken(TTLParser.Double, 0); }
		public TerminalNode Char() { return getToken(TTLParser.Char, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TerminalNode Auto() { return getToken(TTLParser.Auto, 0); }
		public TerminalNode Short() { return getToken(TTLParser.Short, 0); }
		public TerminalNode Signed() { return getToken(TTLParser.Signed, 0); }
		public TerminalNode Void() { return getToken(TTLParser.Void, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Char32() { return getToken(TTLParser.Char32, 0); }
		public TerminalNode Unsigned() { return getToken(TTLParser.Unsigned, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Wchar() { return getToken(TTLParser.Wchar, 0); }
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_simpletypespecifier);
		try {
			setState(1580);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1557); nestednamespecifier(0);
					}
					break;
				}
				setState(1560); typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561); nestednamespecifier(0);
				setState(1562); match(Template);
				setState(1563); simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1565); match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1566); match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1567); match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1568); match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1569); match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1570); match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1571); match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1572); match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1573); match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1574); match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1575); match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1576); match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1577); match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1578); match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1579); decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenameContext extends ParserRuleContext {
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_typename);
		try {
			setState(1586);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1582); classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1583); enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1584); typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1585); simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Auto() { return getToken(TTLParser.Auto, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Decltype() { return getToken(TTLParser.Decltype, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_decltypespecifier);
		try {
			setState(1597);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1588); match(Decltype);
				setState(1589); match(LeftParen);
				setState(1590); expression(0);
				setState(1591); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593); match(Decltype);
				setState(1594); match(LeftParen);
				setState(1595); match(Auto);
				setState(1596); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public TerminalNode Enum() { return getToken(TTLParser.Enum, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1623);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599); classkey();
				setState(1601);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1600); attributespecifierseq(0);
					}
				}

				setState(1604);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1603); nestednamespecifier(0);
					}
					break;
				}
				setState(1606); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1608); classkey();
				setState(1609); simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611); classkey();
				setState(1612); nestednamespecifier(0);
				setState(1614);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1613); match(Template);
					}
				}

				setState(1616); simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1618); match(Enum);
				setState(1620);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1619); nestednamespecifier(0);
					}
					break;
				}
				setState(1622); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumspecifier);
		int _la;
		try {
			setState(1640);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627); enumhead();
				setState(1628); match(LeftBrace);
				setState(1630);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1629); enumeratorlist(0);
					}
				}

				setState(1632); match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634); enumhead();
				setState(1635); match(LeftBrace);
				setState(1636); enumeratorlist(0);
				setState(1637); match(Comma);
				setState(1638); match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumhead);
		int _la;
		try {
			setState(1661);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642); enumkey();
				setState(1644);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1643); attributespecifierseq(0);
					}
				}

				setState(1647);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1646); match(Identifier);
					}
				}

				setState(1650);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1649); enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652); enumkey();
				setState(1654);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1653); attributespecifierseq(0);
					}
				}

				setState(1656); nestednamespecifier(0);
				setState(1657); match(Identifier);
				setState(1659);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1658); enumbase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663); enumkey();
			setState(1665);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1664); attributespecifierseq(0);
				}
			}

			setState(1667); match(Identifier);
			setState(1669);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1668); enumbase();
				}
			}

			setState(1671); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(TTLParser.Enum, 0); }
		public TerminalNode Struct() { return getToken(TTLParser.Struct, 0); }
		public TerminalNode Class() { return getToken(TTLParser.Class, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enumkey);
		try {
			setState(1678);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673); match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674); match(Enum);
				setState(1675); match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676); match(Enum);
				setState(1677); match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); match(Colon);
			setState(1681); typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1684); enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1686);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1687); match(Comma);
					setState(1688); enumeratordefinition();
					}
					} 
				}
				setState(1693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_enumeratordefinition);
		try {
			setState(1699);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1694); enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1695); enumerator();
				setState(1696); match(Assign);
				setState(1697); constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_namespacename);
		try {
			setState(1705);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1703); originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704); namespacealias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_namespacedefinition);
		try {
			setState(1711);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1709); namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1710); unnamednamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_namednamespacedefinition);
		try {
			setState(1715);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713); originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714); extensionnamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(TTLParser.Inline, 0); }
		public TerminalNode Namespace() { return getToken(TTLParser.Namespace, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1717); match(Inline);
				}
			}

			setState(1720); match(Namespace);
			setState(1721); match(Identifier);
			setState(1722); match(LeftBrace);
			setState(1723); namespacebody();
			setState(1724); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(TTLParser.Inline, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(TTLParser.Namespace, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1726); match(Inline);
				}
			}

			setState(1729); match(Namespace);
			setState(1730); originalnamespacename();
			setState(1731); match(LeftBrace);
			setState(1732); namespacebody();
			setState(1733); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(TTLParser.Inline, 0); }
		public TerminalNode Namespace() { return getToken(TTLParser.Namespace, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1735); match(Inline);
				}
			}

			setState(1738); match(Namespace);
			setState(1739); match(LeftBrace);
			setState(1740); namespacebody();
			setState(1741); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)))) != 0)) {
				{
				setState(1743); declarationseq(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(TTLParser.Namespace, 0); }
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); match(Namespace);
			setState(1749); match(Identifier);
			setState(1750); match(Assign);
			setState(1751); qualifiednamespacespecifier();
			setState(1752); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1754); nestednamespecifier(0);
				}
				break;
			}
			setState(1757); namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(TTLParser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(TTLParser.Typename, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_usingdeclaration);
		int _la;
		try {
			setState(1772);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1759); match(Using);
				setState(1761);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1760); match(Typename);
					}
				}

				setState(1763); nestednamespecifier(0);
				setState(1764); unqualifiedid();
				setState(1765); match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1767); match(Using);
				setState(1768); match(Doublecolon);
				setState(1769); unqualifiedid();
				setState(1770); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(TTLParser.Using, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(TTLParser.Namespace, 0); }
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1774); attributespecifierseq(0);
				}
			}

			setState(1777); match(Using);
			setState(1778); match(Namespace);
			setState(1780);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1779); nestednamespecifier(0);
				}
				break;
			}
			setState(1782); namespacename();
			setState(1783); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Stringliteral() { return getToken(TTLParser.Stringliteral, 0); }
		public TerminalNode Asm() { return getToken(TTLParser.Asm, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785); match(Asm);
			setState(1786); match(LeftParen);
			setState(1787); match(Stringliteral);
			setState(1788); match(RightParen);
			setState(1789); match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TerminalNode Extern() { return getToken(TTLParser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(TTLParser.Stringliteral, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_linkagespecification);
		int _la;
		try {
			setState(1801);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791); match(Extern);
				setState(1792); match(Stringliteral);
				setState(1793); match(LeftBrace);
				setState(1795);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Namespace - 64)) | (1L << (Operator - 64)) | (1L << (Register - 64)) | (1L << (Short - 64)) | (1L << (Signed - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)))) != 0)) {
					{
					setState(1794); declarationseq(0);
					}
				}

				setState(1797); match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1798); match(Extern);
				setState(1799); match(Stringliteral);
				setState(1800); declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1804); attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1810);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1806);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1807); attributespecifier();
					}
					} 
				}
				setState(1812);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_attributespecifier);
		try {
			setState(1820);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1813); match(LeftBracket);
				setState(1814); match(LeftBracket);
				setState(1815); attributelist(0);
				setState(1816); match(RightBracket);
				setState(1817); match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1819); alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(TTLParser.Alignas, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1838);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1822); match(Alignas);
				setState(1823); match(LeftParen);
				setState(1824); typeid();
				setState(1826);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1825); match(Ellipsis);
					}
				}

				setState(1828); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830); match(Alignas);
				setState(1831); match(LeftParen);
				setState(1832); constantexpression();
				setState(1834);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1833); match(Ellipsis);
					}
				}

				setState(1836); match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1842);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1841); attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1844); attribute();
				setState(1845); match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1859);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1849);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1850); match(Comma);
						setState(1852);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1851); attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1854);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1855); match(Comma);
						setState(1856); attribute();
						setState(1857); match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864); attributetoken();
			setState(1866);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1865); attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_attributetoken);
		try {
			setState(1870);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1868); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1869); attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872); attributenamespace();
			setState(1873); match(Doublecolon);
			setState(1874); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878); match(LeftParen);
			setState(1879); balancedtokenseq(0);
			setState(1880); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1884);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1883); balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1886);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1887); balancedtoken();
					}
					} 
				}
				setState(1892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_balancedtoken);
		try {
			setState(1905);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1893); match(LeftParen);
				setState(1894); balancedtokenseq(0);
				setState(1895); match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1897); match(LeftBracket);
				setState(1898); balancedtokenseq(0);
				setState(1899); match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1901); match(LeftBrace);
				setState(1902); balancedtokenseq(0);
				setState(1903); match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1908); initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1910);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1911); match(Comma);
					setState(1912); initdeclarator();
					}
					} 
				}
				setState(1917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918); declarator();
			setState(1920);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1919); initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_declarator);
		try {
			setState(1927);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1922); ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1923); noptrdeclarator(0);
				setState(1924); parametersandqualifiers();
				setState(1925); trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_ptrdeclarator);
		try {
			setState(1933);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1929); noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1930); ptroperator();
				setState(1931); ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			switch (_input.LA(1)) {
			case Identifier:
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
				{
				setState(1936); declaratorid();
				setState(1938);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1937); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1940); match(LeftParen);
				setState(1941); ptrdeclarator();
				setState(1942); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1957);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1946);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1947); parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1948);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1949); match(LeftBracket);
						setState(1951);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
							{
							setState(1950); constantexpression();
							}
						}

						setState(1953); match(RightBracket);
						setState(1955);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1954); attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962); match(LeftParen);
			setState(1963); parameterdeclarationclause();
			setState(1964); match(RightParen);
			setState(1966);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1965); cvqualifierseq();
				}
				break;
			}
			setState(1969);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1968); refqualifier();
				}
				break;
			}
			setState(1972);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1971); exceptionspecification();
				}
				break;
			}
			setState(1975);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1974); attributespecifierseq(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977); match(Arrow);
			setState(1978); trailingtypespecifierseq();
			setState(1980);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1979); abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ptroperator);
		try {
			setState(2005);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1982); match(Star);
				setState(1984);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1983); attributespecifierseq(0);
					}
					break;
				}
				setState(1987);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1986); cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989); match(And);
				setState(1991);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1990); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1993); match(AndAnd);
				setState(1995);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1994); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Identifier:
			case Decltype:
			case Doublecolon:
				enterOuterAlt(_localctx, 4);
				{
				setState(1997); nestednamespecifier(0);
				setState(1998); match(Star);
				setState(2000);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1999); attributespecifierseq(0);
					}
					break;
				}
				setState(2003);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(2002); cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007); cvqualifier();
			setState(2009);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(2008); cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Volatile() { return getToken(TTLParser.Volatile, 0); }
		public TerminalNode Const() { return getToken(TTLParser.Const, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2013);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(2015); match(Ellipsis);
				}
			}

			setState(2018); idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypeid(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020); typespecifierseq();
			setState(2022);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(2021); abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_abstractdeclarator);
		try {
			setState(2032);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024); ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2026);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(2025); noptrabstractdeclarator(0);
					}
					break;
				}
				setState(2028); parametersandqualifiers();
				setState(2029); trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2031); abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_ptrabstractdeclarator);
		try {
			setState(2039);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(2034); noptrabstractdeclarator(0);
				}
				break;
			case Identifier:
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035); ptroperator();
				setState(2037);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(2036); ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 294;
		enterRecursionRule(_localctx, 294, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(2042); parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(2043); match(LeftBracket);
				setState(2045);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(2044); constantexpression();
					}
				}

				setState(2047); match(RightBracket);
				setState(2049);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(2048); attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(2051); match(LeftParen);
				setState(2052); ptrabstractdeclarator();
				setState(2053); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2070);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2068);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(2057);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2058); parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(2059);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2060); match(LeftBracket);
						setState(2062);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
							{
							setState(2061); constantexpression();
							}
						}

						setState(2064); match(RightBracket);
						setState(2066);
						switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
						case 1:
							{
							setState(2065); attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2072);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_abstractpackdeclarator);
		try {
			setState(2077);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(2073); noptrabstractpackdeclarator(0);
				}
				break;
			case Identifier:
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(2074); ptroperator();
				setState(2075); abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 298;
		enterRecursionRule(_localctx, 298, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2080); match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(2095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2093);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(2082);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2083); parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(2084);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2085); match(LeftBracket);
						setState(2087);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
							{
							setState(2086); constantexpression();
							}
						}

						setState(2089); match(RightBracket);
						setState(2091);
						switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
						case 1:
							{
							setState(2090); attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(2108);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Identifier - 17)) | (1L << (Alignas - 17)) | (1L << (Auto - 17)) | (1L << (Bool - 17)) | (1L << (Char - 17)) | (1L << (Char16 - 17)) | (1L << (Char32 - 17)) | (1L << (Class - 17)) | (1L << (Const - 17)) | (1L << (Constexpr - 17)) | (1L << (Decltype - 17)) | (1L << (Double - 17)) | (1L << (Enum - 17)) | (1L << (Explicit - 17)) | (1L << (Extern - 17)) | (1L << (Float - 17)) | (1L << (Friend - 17)) | (1L << (Inline - 17)) | (1L << (Int - 17)) | (1L << (Long - 17)) | (1L << (Mutable - 17)) | (1L << (Register - 17)) | (1L << (Short - 17)) | (1L << (Signed - 17)) | (1L << (Static - 17)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Struct - 82)) | (1L << (Thread_local - 82)) | (1L << (Typedef - 82)) | (1L << (Typename - 82)) | (1L << (Union - 82)) | (1L << (Unsigned - 82)) | (1L << (Virtual - 82)) | (1L << (Void - 82)) | (1L << (Volatile - 82)) | (1L << (Wchar - 82)) | (1L << (LeftBracket - 82)) | (1L << (Doublecolon - 82)))) != 0)) {
					{
					setState(2098); parameterdeclarationlist(0);
					}
				}

				setState(2102);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2101); match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2104); parameterdeclarationlist(0);
				setState(2105); match(Comma);
				setState(2106); match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2111); parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(2118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(2113);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2114); match(Comma);
					setState(2115); parameterdeclaration();
					}
					} 
				}
				setState(2120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_parameterdeclaration);
		int _la;
		try {
			setState(2152);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2122);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2121); attributespecifierseq(0);
					}
				}

				setState(2124); declspecifierseq();
				setState(2125); declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2128);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2127); attributespecifierseq(0);
					}
				}

				setState(2130); declspecifierseq();
				setState(2131); declarator();
				setState(2132); match(Assign);
				setState(2133); initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2136);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2135); attributespecifierseq(0);
					}
				}

				setState(2138); declspecifierseq();
				setState(2140);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(2139); abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2143);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2142); attributespecifierseq(0);
					}
				}

				setState(2145); declspecifierseq();
				setState(2147);
				_la = _input.LA(1);
				if (_la==Identifier || _la==Decltype || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LeftParen - 101)) | (1L << (LeftBracket - 101)) | (1L << (Star - 101)) | (1L << (And - 101)) | (1L << (AndAnd - 101)) | (1L << (Doublecolon - 101)) | (1L << (Ellipsis - 101)))) != 0)) {
					{
					setState(2146); abstractdeclarator();
					}
				}

				setState(2149); match(Assign);
				setState(2150); initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2154); attributespecifierseq(0);
				}
			}

			setState(2158);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(2157); declspecifierseq();
				}
				break;
			}
			setState(2160); declarator();
			setState(2162);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2161); virtspecifierseq(0);
				}
			}

			setState(2164); functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode Default() { return getToken(TTLParser.Default, 0); }
		public TerminalNode Delete() { return getToken(TTLParser.Delete, 0); }
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_functionbody);
		int _la;
		try {
			setState(2177);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2166); ctorinitializer();
					}
				}

				setState(2169); compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2170); functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2171); match(Assign);
				setState(2172); match(Default);
				setState(2173); match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2174); match(Assign);
				setState(2175); match(Delete);
				setState(2176); match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_initializer);
		try {
			setState(2184);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179); braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2180); match(LeftParen);
				setState(2181); expressionlist();
				setState(2182); match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_braceorequalinitializer);
		try {
			setState(2189);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186); match(Assign);
				setState(2187); initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2188); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_initializerclause);
		try {
			setState(2193);
			switch (_input.LA(1)) {
			case Identifier:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2191); assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2192); bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2196); initializerclause();
			setState(2198);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(2197); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2201); match(Comma);
					setState(2202); initializerclause();
					setState(2204);
					switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
					case 1:
						{
						setState(2203); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_bracedinitlist);
		int _la;
		try {
			setState(2220);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211); match(LeftBrace);
				setState(2212); initializerlist(0);
				setState(2214);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2213); match(Comma);
					}
				}

				setState(2216); match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218); match(LeftBrace);
				setState(2219); match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_classname);
		try {
			setState(2224);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2222); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223); simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226); classhead();
			setState(2227); match(LeftBrace);
			setState(2229);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Operator - 68)) | (1L << (Private - 68)) | (1L << (Protected - 68)) | (1L << (Public - 68)) | (1L << (Register - 68)) | (1L << (Short - 68)) | (1L << (Signed - 68)) | (1L << (Static - 68)) | (1L << (Static_assert - 68)) | (1L << (Struct - 68)) | (1L << (Template - 68)) | (1L << (Thread_local - 68)) | (1L << (Typedef - 68)) | (1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Using - 68)) | (1L << (Virtual - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (LeftParen - 68)) | (1L << (LeftBracket - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (Tilde - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (Colon - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)))) != 0)) {
				{
				setState(2228); memberspecification();
				}
			}

			setState(2231); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_classhead);
		int _la;
		try {
			setState(2251);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2233); classkey();
				setState(2235);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2234); attributespecifierseq(0);
					}
				}

				setState(2237); classheadname();
				setState(2239);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2238); classvirtspecifier();
					}
				}

				setState(2242);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2241); baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2244); classkey();
				setState(2246);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2245); attributespecifierseq(0);
					}
				}

				setState(2249);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2248); baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2254);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2253); nestednamespecifier(0);
				}
				break;
			}
			setState(2256); classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(TTLParser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258); match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Union() { return getToken(TTLParser.Union, 0); }
		public TerminalNode Struct() { return getToken(TTLParser.Struct, 0); }
		public TerminalNode Class() { return getToken(TTLParser.Class, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Class - 37)) | (1L << (Struct - 37)) | (1L << (Union - 37)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_memberspecification);
		int _la;
		try {
			setState(2271);
			switch (_input.LA(1)) {
			case Identifier:
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(2262); memberdeclaration();
				setState(2264);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Operator - 68)) | (1L << (Private - 68)) | (1L << (Protected - 68)) | (1L << (Public - 68)) | (1L << (Register - 68)) | (1L << (Short - 68)) | (1L << (Signed - 68)) | (1L << (Static - 68)) | (1L << (Static_assert - 68)) | (1L << (Struct - 68)) | (1L << (Template - 68)) | (1L << (Thread_local - 68)) | (1L << (Typedef - 68)) | (1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Using - 68)) | (1L << (Virtual - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (LeftParen - 68)) | (1L << (LeftBracket - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (Tilde - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (Colon - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)))) != 0)) {
					{
					setState(2263); memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2266); accessspecifier();
				setState(2267); match(Colon);
				setState(2269);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Operator - 68)) | (1L << (Private - 68)) | (1L << (Protected - 68)) | (1L << (Public - 68)) | (1L << (Register - 68)) | (1L << (Short - 68)) | (1L << (Signed - 68)) | (1L << (Static - 68)) | (1L << (Static_assert - 68)) | (1L << (Struct - 68)) | (1L << (Template - 68)) | (1L << (Thread_local - 68)) | (1L << (Typedef - 68)) | (1L << (Typename - 68)) | (1L << (Union - 68)) | (1L << (Unsigned - 68)) | (1L << (Using - 68)) | (1L << (Virtual - 68)) | (1L << (Void - 68)) | (1L << (Volatile - 68)) | (1L << (Wchar - 68)) | (1L << (LeftParen - 68)) | (1L << (LeftBracket - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (Tilde - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (AndAnd - 134)) | (1L << (Colon - 134)) | (1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)))) != 0)) {
					{
					setState(2268); memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_memberdeclaration);
		int _la;
		try {
			setState(2289);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2273); attributespecifierseq(0);
					}
					break;
				}
				setState(2277);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2276); declspecifierseq();
					}
					break;
				}
				setState(2280);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Identifier - 17)) | (1L << (Alignas - 17)) | (1L << (Decltype - 17)) | (1L << (Operator - 17)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LeftParen - 101)) | (1L << (LeftBracket - 101)) | (1L << (Star - 101)) | (1L << (And - 101)) | (1L << (Tilde - 101)) | (1L << (AndAnd - 101)) | (1L << (Colon - 101)) | (1L << (Doublecolon - 101)) | (1L << (Ellipsis - 101)))) != 0)) {
					{
					setState(2279); memberdeclaratorlist(0);
					}
				}

				setState(2282); match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2283); functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2284); usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2285); static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2286); templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2287); aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2288); emptydeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 336;
		enterRecursionRule(_localctx, 336, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2292); memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2294);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2295); match(Comma);
					setState(2296); memberdeclarator();
					}
					} 
				}
				setState(2301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMemberdeclarator(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_memberdeclarator);
		int _la;
		try {
			setState(2321);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2302); declarator();
				setState(2304);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2303); virtspecifierseq(0);
					}
					break;
				}
				setState(2307);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2306); purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2309); declarator();
				setState(2311);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2310); braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2314);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2313); match(Identifier);
					}
				}

				setState(2317);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2316); attributespecifierseq(0);
					}
				}

				setState(2319); match(Colon);
				setState(2320); constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 340;
		enterRecursionRule(_localctx, 340, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2324); virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2327); virtspecifier();
					}
					} 
				}
				setState(2332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(TTLParser.Final, 0); }
		public TerminalNode Override() { return getToken(TTLParser.Override, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2333);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(TTLParser.Assign, 0); }
		public TerminalNode Integerliteral() { return getToken(TTLParser.Integerliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335); match(Assign);
			setState(2336); ((PurespecifierContext)_localctx).val = match(Integerliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339); match(Colon);
			setState(2340); basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2343); basespecifier();
			setState(2345);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2344); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2347);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2348); match(Comma);
					setState(2349); basespecifier();
					setState(2351);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(2350); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(TTLParser.Virtual, 0); }
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_basespecifier);
		int _la;
		try {
			setState(2379);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2359);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2358); attributespecifierseq(0);
					}
				}

				setState(2361); basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2362); attributespecifierseq(0);
					}
				}

				setState(2365); match(Virtual);
				setState(2367);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Private - 70)) | (1L << (Protected - 70)) | (1L << (Public - 70)))) != 0)) {
					{
					setState(2366); accessspecifier();
					}
				}

				setState(2369); basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2371);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2370); attributespecifierseq(0);
					}
				}

				setState(2373); accessspecifier();
				setState(2375);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2374); match(Virtual);
					}
				}

				setState(2377); basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_classordecltype);
		try {
			setState(2386);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2382);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2381); nestednamespecifier(0);
					}
					break;
				}
				setState(2384); classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2385); decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388); classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Protected() { return getToken(TTLParser.Protected, 0); }
		public TerminalNode Public() { return getToken(TTLParser.Public, 0); }
		public TerminalNode Private() { return getToken(TTLParser.Private, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2390);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Private - 70)) | (1L << (Protected - 70)) | (1L << (Public - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public TerminalNode Operator() { return getToken(TTLParser.Operator, 0); }
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2392); match(Operator);
			setState(2393); conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395); typespecifierseq();
			setState(2397);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2396); conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399); ptroperator();
			setState(2401);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2400); conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403); match(Colon);
			setState(2404); meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_meminitializerlist);
		int _la;
		try {
			setState(2417);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406); meminitializer();
				setState(2408);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2407); match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2410); meminitializer();
				setState(2412);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2411); match(Ellipsis);
					}
				}

				setState(2414); match(Comma);
				setState(2415); meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_meminitializer);
		int _la;
		try {
			setState(2429);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2419); meminitializerid();
				setState(2420); match(LeftParen);
				setState(2422);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(2421); expressionlist();
					}
				}

				setState(2424); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2426); meminitializerid();
				setState(2427); bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_meminitializerid);
		try {
			setState(2433);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2431); classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode Operator() { return getToken(TTLParser.Operator, 0); }
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2435); match(Operator);
			setState(2436); operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode Stringliteral() { return getToken(TTLParser.Stringliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(TTLParser.Userdefinedstringliteral, 0); }
		public TerminalNode Operator() { return getToken(TTLParser.Operator, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_literaloperatorid);
		try {
			setState(2443);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2438); match(Operator);
				setState(2439); match(Stringliteral);
				setState(2440); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441); match(Operator);
				setState(2442); match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2445); match(Template);
			setState(2446); match(Less);
			setState(2447); templateparameterlist(0);
			setState(2448); match(Greater);
			setState(2449); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2452); templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2454);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2455); match(Comma);
					setState(2456); templateparameter();
					}
					} 
				}
				setState(2461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_templateparameter);
		try {
			setState(2464);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2462); typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2463); parameterdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Class() { return getToken(TTLParser.Class, 0); }
		public TerminalNode Typename() { return getToken(TTLParser.Typename, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_typeparameter);
		int _la;
		try {
			setState(2514);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2466); match(Class);
				setState(2468);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2467); match(Ellipsis);
					}
					break;
				}
				setState(2471);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2470); match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2473); match(Class);
				setState(2475);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2474); match(Identifier);
					}
				}

				setState(2477); match(Assign);
				setState(2478); typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2479); match(Typename);
				setState(2481);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2480); match(Ellipsis);
					}
					break;
				}
				setState(2484);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2483); match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2486); match(Typename);
				setState(2488);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2487); match(Identifier);
					}
				}

				setState(2490); match(Assign);
				setState(2491); typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2492); match(Template);
				setState(2493); match(Less);
				setState(2494); templateparameterlist(0);
				setState(2495); match(Greater);
				setState(2496); match(Class);
				setState(2498);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2497); match(Ellipsis);
					}
					break;
				}
				setState(2501);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2500); match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2503); match(Template);
				setState(2504); match(Less);
				setState(2505); templateparameterlist(0);
				setState(2506); match(Greater);
				setState(2507); match(Class);
				setState(2509);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2508); match(Identifier);
					}
				}

				setState(2511); match(Assign);
				setState(2512); idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516); templatename();
			setState(2517); match(Less);
			setState(2519);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
				{
				setState(2518); templateargumentlist(0);
				}
			}

			setState(2521); match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_templateid);
		int _la;
		try {
			setState(2538);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2523); simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2524); operatorfunctionid();
				setState(2525); match(Less);
				setState(2527);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(2526); templateargumentlist(0);
					}
				}

				setState(2529); match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2531); literaloperatorid();
				setState(2532); match(Less);
				setState(2534);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (New - 65)) | (1L << (Noexcept - 65)) | (1L << (Nullptr - 65)) | (1L << (Operator - 65)) | (1L << (Reinterpret_cast - 65)) | (1L << (Short - 65)) | (1L << (Signed - 65)) | (1L << (Sizeof - 65)) | (1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (PlusPlus - 136)) | (1L << (MinusMinus - 136)) | (1L << (Doublecolon - 136)) | (1L << (Integerliteral - 136)) | (1L << (Characterliteral - 136)) | (1L << (Floatingliteral - 136)) | (1L << (Stringliteral - 136)) | (1L << (Userdefinedintegerliteral - 136)) | (1L << (Userdefinedfloatingliteral - 136)) | (1L << (Userdefinedstringliteral - 136)) | (1L << (Userdefinedcharacterliteral - 136)))) != 0)) {
					{
					setState(2533); templateargumentlist(0);
					}
				}

				setState(2536); match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 390;
		enterRecursionRule(_localctx, 390, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2543); templateargument();
			setState(2545);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2544); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2547);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2548); match(Comma);
					setState(2549); templateargument();
					setState(2551);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2550); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_templateargument);
		try {
			setState(2561);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2558); constantexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2559); typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2560); idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TTLParser.Identifier, 0); }
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(TTLParser.Typename, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_typenamespecifier);
		int _la;
		try {
			setState(2574);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2563); match(Typename);
				setState(2564); nestednamespecifier(0);
				setState(2565); match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2567); match(Typename);
				setState(2568); nestednamespecifier(0);
				setState(2570);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2569); match(Template);
					}
				}

				setState(2572); simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public TerminalNode Extern() { return getToken(TTLParser.Extern, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2576); match(Extern);
				}
			}

			setState(2579); match(Template);
			setState(2580); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(TTLParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582); match(Template);
			setState(2583); match(Less);
			setState(2584); match(Greater);
			setState(2585); declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode Try() { return getToken(TTLParser.Try, 0); }
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587); match(Try);
			setState(2588); compoundstatement();
			setState(2589); handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public TerminalNode Try() { return getToken(TTLParser.Try, 0); }
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591); match(Try);
			setState(2593);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2592); ctorinitializer();
				}
			}

			setState(2595); compoundstatement();
			setState(2596); handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2598); handler();
			setState(2600);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2599); handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(TTLParser.Catch, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2602); match(Catch);
			setState(2603); match(LeftParen);
			setState(2604); exceptiondeclaration();
			setState(2605); match(RightParen);
			setState(2606); compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2622);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2609);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2608); attributespecifierseq(0);
					}
				}

				setState(2611); typespecifierseq();
				setState(2612); declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2615);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2614); attributespecifierseq(0);
					}
				}

				setState(2617); typespecifierseq();
				setState(2619);
				_la = _input.LA(1);
				if (_la==Identifier || _la==Decltype || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (LeftParen - 101)) | (1L << (LeftBracket - 101)) | (1L << (Star - 101)) | (1L << (And - 101)) | (1L << (AndAnd - 101)) | (1L << (Doublecolon - 101)) | (1L << (Ellipsis - 101)))) != 0)) {
					{
					setState(2618); abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2621); match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(TTLParser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2624); match(Throw);
			setState(2626);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2625); assignmentexpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_exceptionspecification);
		try {
			setState(2630);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2628); dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2629); noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(TTLParser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2632); match(Throw);
			setState(2633); match(LeftParen);
			setState(2635);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (Identifier - 17)) | (1L << (Auto - 17)) | (1L << (Bool - 17)) | (1L << (Char - 17)) | (1L << (Char16 - 17)) | (1L << (Char32 - 17)) | (1L << (Class - 17)) | (1L << (Const - 17)) | (1L << (Decltype - 17)) | (1L << (Double - 17)) | (1L << (Enum - 17)) | (1L << (Float - 17)) | (1L << (Int - 17)) | (1L << (Long - 17)) | (1L << (Short - 17)) | (1L << (Signed - 17)))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (Struct - 82)) | (1L << (Typename - 82)) | (1L << (Union - 82)) | (1L << (Unsigned - 82)) | (1L << (Void - 82)) | (1L << (Volatile - 82)) | (1L << (Wchar - 82)) | (1L << (Doublecolon - 82)))) != 0)) {
				{
				setState(2634); typeidlist(0);
				}
			}

			setState(2637); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 416;
		enterRecursionRule(_localctx, 416, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2640); typeid();
			setState(2642);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2641); match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2644);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2645); match(Comma);
					setState(2646); typeid();
					setState(2648);
					switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
					case 1:
						{
						setState(2647); match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(TTLParser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_noexceptspecification);
		try {
			setState(2661);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2655); match(Noexcept);
				setState(2656); match(LeftParen);
				setState(2657); constantexpression();
				setState(2658); match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2660); match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(TTLParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(TTLParser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2663); match(Greater);
			setState(2664); match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftAssignContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(TTLParser.Assign, 0); }
		public List<TerminalNode> Greater() { return getTokens(TTLParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(TTLParser.Greater, i);
		}
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitRightShiftAssign(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666); match(Greater);
			setState(2667); match(Greater);
			setState(2668); match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(TTLParser.Delete, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public TerminalNode New() { return getToken(TTLParser.New, 0); }
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_operator);
		try {
			setState(2718);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2670); match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2671); match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2672); match(New);
				setState(2673); match(LeftBracket);
				setState(2674); match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2675); match(Delete);
				setState(2676); match(LeftBracket);
				setState(2677); match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2678); match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2679); match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2680); match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2681); match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2682); match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2683); match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2684); match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2685); match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2686); match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2687); match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2688); match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2689); match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2690); match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2691); match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2692); match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2693); match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2694); match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2695); match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2696); match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2697); match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2698); match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2699); match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2700); rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2701); rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2702); match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2703); match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2704); match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2705); match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2706); match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2707); match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2708); match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2709); match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2710); match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2711); match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2712); match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2713); match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2714); match(LeftParen);
				setState(2715); match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2716); match(LeftBracket);
				setState(2717); match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Floatingliteral() { return getToken(TTLParser.Floatingliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(TTLParser.Stringliteral, 0); }
		public TerminalNode Integerliteral() { return getToken(TTLParser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(TTLParser.Characterliteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_literal);
		try {
			setState(2727);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2720); match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2721); match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2722); match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2723); match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2724); booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2725); pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2726); userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(TTLParser.False, 0); }
		public TerminalNode True() { return getToken(TTLParser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2729);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(TTLParser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2731); match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedstringliteral() { return getToken(TTLParser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(TTLParser.Userdefinedcharacterliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(TTLParser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedintegerliteral() { return getToken(TTLParser.Userdefinedintegerliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TTLListener ) ((TTLListener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2733);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (Userdefinedintegerliteral - 157)) | (1L << (Userdefinedfloatingliteral - 157)) | (1L << (Userdefinedstringliteral - 157)) | (1L << (Userdefinedcharacterliteral - 157)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17: return cc_sempred((CcContext)_localctx, predIndex);
		case 23: return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 28: return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 33: return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 42: return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 47: return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 48: return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 49: return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 50: return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 51: return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 52: return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 53: return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 54: return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 55: return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 56: return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 57: return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 61: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 67: return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 76: return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 103: return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 121: return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 124: return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 130: return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 132: return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 136: return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 147: return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 149: return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 151: return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 158: return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 168: return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 170: return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 174: return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 189: return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 195: return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 208: return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14: return precpred(_ctx, 2);
		case 15: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43: return precpred(_ctx, 3);
		case 44: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19: return precpred(_ctx, 2);
		case 20: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39: return precpred(_ctx, 3);
		case 40: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return precpred(_ctx, 2);
		case 22: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cc_sempred(CcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48: return precpred(_ctx, 2);
		case 47: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45: return precpred(_ctx, 5);
		case 46: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27: return precpred(_ctx, 2);
		case 28: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 19);
		case 5: return precpred(_ctx, 18);
		case 6: return precpred(_ctx, 17);
		case 7: return precpred(_ctx, 12);
		case 8: return precpred(_ctx, 11);
		case 9: return precpred(_ctx, 10);
		case 10: return precpred(_ctx, 9);
		case 11: return precpred(_ctx, 8);
		case 12: return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23: return precpred(_ctx, 4);
		case 24: return precpred(_ctx, 3);
		case 25: return precpred(_ctx, 2);
		case 26: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 3);
		case 17: return precpred(_ctx, 2);
		case 18: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a2\u0ab2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\3\2\6\2\u01b6\n\2\r\2\16\2\u01b7\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"\u01c2\n\3\r\3\16\3\u01c3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u01d0\n\4\3\5\3\5\3\5\6\5\u01d5\n\5\r\5\16\5\u01d6\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\6\5\u01e1\n\5\r\5\16\5\u01e2\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0204\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u0212\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0229\n\7\3\b\6\b"+
		"\u022c\n\b\r\b\16\b\u022d\3\b\5\b\u0231\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u024c\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0253\n\n\3\13\3\13\3\13\3"+
		"\13\5\13\u0259\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u026a\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0272"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0290\n\23\3\23\3\23\5\23\u0294\n\23\3\23\3\23\7\23\u0298\n"+
		"\23\f\23\16\23\u029b\13\23\3\24\5\24\u029e\n\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u02aa\n\25\3\26\3\26\5\26\u02ae\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02b9\n\27\3\30\3\30"+
		"\5\30\u02bd\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u02cc\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u02d3\n\31\3"+
		"\31\3\31\3\31\7\31\u02d8\n\31\f\31\16\31\u02db\13\31\3\32\3\32\5\32\u02df"+
		"\n\32\3\32\3\32\3\33\3\33\5\33\u02e5\n\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u02ef\n\34\3\35\3\35\3\36\3\36\3\36\5\36\u02f6\n\36\3"+
		"\36\3\36\3\36\3\36\5\36\u02fc\n\36\7\36\u02fe\n\36\f\36\16\36\u0301\13"+
		"\36\3\37\3\37\5\37\u0305\n\37\3 \3 \3 \3 \5 \u030b\n \3!\3!\3!\3!\3!\5"+
		"!\u0312\n!\3\"\3\"\3\"\3\"\5\"\u0318\n\"\3\"\5\"\u031b\n\"\3\"\5\"\u031e"+
		"\n\"\3\"\5\"\u0321\n\"\3#\3#\3#\3#\3#\5#\u0328\n#\3#\3#\3#\3#\3#\5#\u032f"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\5#\u0363\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u0372\n#\3#\3#\3#\3#\5#\u0378\n#\3#\3#\3#\3#\5#\u037e\n#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\7#\u038b\n#\f#\16#\u038e\13#\3$\3$\3%\5%\u0393\n"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u03a2\n%\3%\3%\3%\3%\5%\u03a8"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\5&\u03c6\n&\3\'\3\'\3(\5(\u03cb\n(\3(\3(\5(\u03cf\n"+
		"(\3(\3(\5(\u03d3\n(\3(\5(\u03d6\n(\3(\3(\5(\u03da\n(\3(\3(\3(\3(\5(\u03e0"+
		"\n(\5(\u03e2\n(\3)\3)\3)\3)\3*\3*\5*\u03ea\n*\3+\3+\5+\u03ee\n+\3+\5+"+
		"\u03f1\n+\3,\3,\3,\3,\3,\5,\u03f8\n,\3,\3,\3,\3,\3,\5,\u03ff\n,\7,\u0401"+
		"\n,\f,\16,\u0404\13,\3-\3-\5-\u0408\n-\3-\3-\5-\u040c\n-\3.\5.\u040f\n"+
		".\3.\3.\3.\5.\u0414\n.\3.\3.\3.\3.\5.\u041a\n.\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0427\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u0432\n\61\f\61\16\61\u0435\13\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0443\n\62\f\62\16\62\u0446"+
		"\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0451\n\63\f"+
		"\63\16\63\u0454\13\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\7\64\u0460\n\64\f\64\16\64\u0463\13\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0474\n\65\f\65\16"+
		"\65\u0477\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0482"+
		"\n\66\f\66\16\66\u0485\13\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u048d"+
		"\n\67\f\67\16\67\u0490\13\67\38\38\38\38\38\38\78\u0498\n8\f8\168\u049b"+
		"\138\39\39\39\39\39\39\79\u04a3\n9\f9\169\u04a6\139\3:\3:\3:\3:\3:\3:"+
		"\7:\u04ae\n:\f:\16:\u04b1\13:\3;\3;\3;\3;\3;\3;\7;\u04b9\n;\f;\16;\u04bc"+
		"\13;\3<\3<\3<\3<\3<\3<\3<\5<\u04c5\n<\3=\3=\3=\3=\3=\3=\5=\u04cd\n=\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u04da\n>\3?\3?\3?\3?\3?\3?\7?\u04e2"+
		"\n?\f?\16?\u04e5\13?\3@\3@\3A\3A\5A\u04eb\nA\3A\3A\5A\u04ef\nA\3A\3A\5"+
		"A\u04f3\nA\3A\3A\5A\u04f7\nA\3A\3A\5A\u04fb\nA\3A\3A\3A\5A\u0500\nA\3"+
		"A\5A\u0503\nA\3B\5B\u0506\nB\3B\3B\3B\3B\5B\u050c\nB\3B\3B\3B\3B\3B\3"+
		"B\5B\u0514\nB\3B\3B\3B\5B\u0519\nB\3C\5C\u051c\nC\3C\3C\3D\3D\5D\u0522"+
		"\nD\3D\3D\3E\3E\3E\3E\3E\7E\u052b\nE\fE\16E\u052e\13E\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0544\nF\3G\3G\5G\u0548"+
		"\nG\3G\3G\3G\3G\3G\3G\5G\u0550\nG\3G\3G\3G\3G\5G\u0556\nG\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u056a\nH\3H\3H\5H\u056e"+
		"\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u057b\nH\3I\3I\5I\u057f\nI\3J"+
		"\5J\u0582\nJ\3J\3J\3J\3K\3K\5K\u0589\nK\3L\3L\3L\3L\3L\3L\5L\u0591\nL"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\5L\u059b\nL\3M\3M\3N\3N\3N\3N\3N\7N\u05a4\nN"+
		"\fN\16N\u05a7\13N\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u05b2\nO\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\5P\u05bc\nP\3Q\3Q\3Q\5Q\u05c1\nQ\3Q\3Q\3Q\3Q\3R\5R\u05c8\n"+
		"R\3R\5R\u05cb\nR\3R\3R\3R\5R\u05d0\nR\3R\3R\3R\5R\u05d5\nR\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3V\3V\3V\5V\u05ea\nV\3W\3W\5W\u05ee"+
		"\nW\3W\3W\3W\5W\u05f3\nW\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\5[\u05fe\n[\3\\\3"+
		"\\\3\\\3\\\5\\\u0604\n\\\3]\3]\5]\u0608\n]\3]\3]\3]\5]\u060d\n]\3^\3^"+
		"\5^\u0611\n^\3^\3^\3^\5^\u0616\n^\3_\5_\u0619\n_\3_\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u062f\n_\3`\3`\3`\3`\5`\u0635"+
		"\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u0640\na\3b\3b\5b\u0644\nb\3b\5b\u0647"+
		"\nb\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0651\nb\3b\3b\3b\3b\5b\u0657\nb\3b\5b"+
		"\u065a\nb\3c\3c\3d\3d\3d\5d\u0661\nd\3d\3d\3d\3d\3d\3d\3d\3d\5d\u066b"+
		"\nd\3e\3e\5e\u066f\ne\3e\5e\u0672\ne\3e\5e\u0675\ne\3e\3e\5e\u0679\ne"+
		"\3e\3e\3e\5e\u067e\ne\5e\u0680\ne\3f\3f\5f\u0684\nf\3f\3f\5f\u0688\nf"+
		"\3f\3f\3g\3g\3g\3g\3g\5g\u0691\ng\3h\3h\3h\3i\3i\3i\3i\3i\3i\7i\u069c"+
		"\ni\fi\16i\u069f\13i\3j\3j\3j\3j\3j\5j\u06a6\nj\3k\3k\3l\3l\5l\u06ac\n"+
		"l\3m\3m\3n\3n\5n\u06b2\nn\3o\3o\5o\u06b6\no\3p\5p\u06b9\np\3p\3p\3p\3"+
		"p\3p\3p\3q\5q\u06c2\nq\3q\3q\3q\3q\3q\3q\3r\5r\u06cb\nr\3r\3r\3r\3r\3"+
		"r\3s\5s\u06d3\ns\3t\3t\3u\3u\3u\3u\3u\3u\3v\5v\u06de\nv\3v\3v\3w\3w\5"+
		"w\u06e4\nw\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u06ef\nw\3x\5x\u06f2\nx\3x\3"+
		"x\3x\5x\u06f7\nx\3x\3x\3x\3y\3y\3y\3y\3y\3y\3z\3z\3z\3z\5z\u0706\nz\3"+
		"z\3z\3z\3z\5z\u070c\nz\3{\3{\3{\3{\3{\7{\u0713\n{\f{\16{\u0716\13{\3|"+
		"\3|\3|\3|\3|\3|\3|\5|\u071f\n|\3}\3}\3}\3}\5}\u0725\n}\3}\3}\3}\3}\3}"+
		"\3}\5}\u072d\n}\3}\3}\5}\u0731\n}\3~\3~\5~\u0735\n~\3~\3~\3~\5~\u073a"+
		"\n~\3~\3~\3~\5~\u073f\n~\3~\3~\3~\3~\3~\7~\u0746\n~\f~\16~\u0749\13~\3"+
		"\177\3\177\5\177\u074d\n\177\3\u0080\3\u0080\5\u0080\u0751\n\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\5\u0084\u075f\n\u0084\3\u0084\3\u0084\7\u0084\u0763\n"+
		"\u0084\f\u0084\16\u0084\u0766\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u0774\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086"+
		"\u077c\n\u0086\f\u0086\16\u0086\u077f\13\u0086\3\u0087\3\u0087\5\u0087"+
		"\u0783\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u078a\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0790\n\u0089\3\u008a\3"+
		"\u008a\3\u008a\5\u008a\u0795\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5"+
		"\u008a\u079b\n\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u07a2"+
		"\n\u008a\3\u008a\3\u008a\5\u008a\u07a6\n\u008a\7\u008a\u07a8\n\u008a\f"+
		"\u008a\16\u008a\u07ab\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u07b1\n\u008b\3\u008b\5\u008b\u07b4\n\u008b\3\u008b\5\u008b\u07b7\n\u008b"+
		"\3\u008b\5\u008b\u07ba\n\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u07bf\n"+
		"\u008c\3\u008d\3\u008d\5\u008d\u07c3\n\u008d\3\u008d\5\u008d\u07c6\n\u008d"+
		"\3\u008d\3\u008d\5\u008d\u07ca\n\u008d\3\u008d\3\u008d\5\u008d\u07ce\n"+
		"\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u07d3\n\u008d\3\u008d\5\u008d\u07d6"+
		"\n\u008d\5\u008d\u07d8\n\u008d\3\u008e\3\u008e\5\u008e\u07dc\n\u008e\3"+
		"\u008f\3\u008f\3\u0090\3\u0090\3\u0091\5\u0091\u07e3\n\u0091\3\u0091\3"+
		"\u0091\3\u0092\3\u0092\5\u0092\u07e9\n\u0092\3\u0093\3\u0093\5\u0093\u07ed"+
		"\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u07f3\n\u0093\3\u0094"+
		"\3\u0094\3\u0094\5\u0094\u07f8\n\u0094\5\u0094\u07fa\n\u0094\3\u0095\3"+
		"\u0095\3\u0095\3\u0095\5\u0095\u0800\n\u0095\3\u0095\3\u0095\5\u0095\u0804"+
		"\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u080a\n\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0811\n\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0815\n\u0095\7\u0095\u0817\n\u0095\f\u0095\16\u0095\u081a\13"+
		"\u0095\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0820\n\u0096\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u082a\n"+
		"\u0097\3\u0097\3\u0097\5\u0097\u082e\n\u0097\7\u0097\u0830\n\u0097\f\u0097"+
		"\16\u0097\u0833\13\u0097\3\u0098\5\u0098\u0836\n\u0098\3\u0098\5\u0098"+
		"\u0839\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u083f\n\u0098\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099\u0847\n\u0099\f"+
		"\u0099\16\u0099\u084a\13\u0099\3\u009a\5\u009a\u084d\n\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\5\u009a\u0853\n\u009a\3\u009a\3\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\5\u009a\u085b\n\u009a\3\u009a\3\u009a\5\u009a\u085f"+
		"\n\u009a\3\u009a\5\u009a\u0862\n\u009a\3\u009a\3\u009a\5\u009a\u0866\n"+
		"\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u086b\n\u009a\3\u009b\5\u009b\u086e"+
		"\n\u009b\3\u009b\5\u009b\u0871\n\u009b\3\u009b\3\u009b\5\u009b\u0875\n"+
		"\u009b\3\u009b\3\u009b\3\u009c\5\u009c\u087a\n\u009c\3\u009c\3\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0884\n\u009c\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u088b\n\u009d\3\u009e\3"+
		"\u009e\3\u009e\5\u009e\u0890\n\u009e\3\u009f\3\u009f\5\u009f\u0894\n\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0899\n\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u089f\n\u00a0\7\u00a0\u08a1\n\u00a0\f\u00a0\16\u00a0"+
		"\u08a4\13\u00a0\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08a9\n\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u08af\n\u00a1\3\u00a2\3\u00a2\5\u00a2"+
		"\u08b3\n\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u08b8\n\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a4\3\u00a4\5\u00a4\u08be\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u08c2"+
		"\n\u00a4\3\u00a4\5\u00a4\u08c5\n\u00a4\3\u00a4\3\u00a4\5\u00a4\u08c9\n"+
		"\u00a4\3\u00a4\5\u00a4\u08cc\n\u00a4\5\u00a4\u08ce\n\u00a4\3\u00a5\5\u00a5"+
		"\u08d1\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8"+
		"\3\u00a8\5\u00a8\u08db\n\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u08e0\n"+
		"\u00a8\5\u00a8\u08e2\n\u00a8\3\u00a9\5\u00a9\u08e5\n\u00a9\3\u00a9\5\u00a9"+
		"\u08e8\n\u00a9\3\u00a9\5\u00a9\u08eb\n\u00a9\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u08f4\n\u00a9\3\u00aa\3\u00aa\3"+
		"\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u08fc\n\u00aa\f\u00aa\16\u00aa"+
		"\u08ff\13\u00aa\3\u00ab\3\u00ab\5\u00ab\u0903\n\u00ab\3\u00ab\5\u00ab"+
		"\u0906\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u090a\n\u00ab\3\u00ab\5\u00ab\u090d"+
		"\n\u00ab\3\u00ab\5\u00ab\u0910\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u0914\n"+
		"\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u091b\n\u00ac\f"+
		"\u00ac\16\u00ac\u091e\13\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u092c"+
		"\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0932\n\u00b0\7\u00b0"+
		"\u0934\n\u00b0\f\u00b0\16\u00b0\u0937\13\u00b0\3\u00b1\5\u00b1\u093a\n"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u093e\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u0942"+
		"\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u0946\n\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u094a\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u094e\n\u00b1\3\u00b2\5\u00b2\u0951"+
		"\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u0955\n\u00b2\3\u00b3\3\u00b3\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\5\u00b6\u0960\n\u00b6"+
		"\3\u00b7\3\u00b7\5\u00b7\u0964\n\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\5\u00b9\u096b\n\u00b9\3\u00b9\3\u00b9\5\u00b9\u096f\n\u00b9\3"+
		"\u00b9\3\u00b9\3\u00b9\5\u00b9\u0974\n\u00b9\3\u00ba\3\u00ba\3\u00ba\5"+
		"\u00ba\u0979\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0980"+
		"\n\u00ba\3\u00bb\3\u00bb\5\u00bb\u0984\n\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u098e\n\u00bd\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\7\u00bf\u099c\n\u00bf\f\u00bf\16\u00bf\u099f\13\u00bf"+
		"\3\u00c0\3\u00c0\5\u00c0\u09a3\n\u00c0\3\u00c1\3\u00c1\5\u00c1\u09a7\n"+
		"\u00c1\3\u00c1\5\u00c1\u09aa\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u09ae\n\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u09b4\n\u00c1\3\u00c1\5\u00c1"+
		"\u09b7\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u09bb\n\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u09c5\n\u00c1\3"+
		"\u00c1\5\u00c1\u09c8\n\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\5\u00c1\u09d0\n\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u09d5\n\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u09da\n\u00c2\3\u00c2\3\u00c2\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u09e2\n\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u09e9\n\u00c3\3\u00c3\3\u00c3\5\u00c3\u09ed\n"+
		"\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u09f4\n\u00c5\3"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u09fa\n\u00c5\7\u00c5\u09fc\n\u00c5"+
		"\f\u00c5\16\u00c5\u09ff\13\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0a04"+
		"\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u0a0d\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0a11\n\u00c7\3\u00c8\5\u00c8\u0a14"+
		"\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb\3\u00cb\5\u00cb\u0a24\n\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\5\u00cc\u0a2b\n\u00cc\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00ce\5\u00ce\u0a34\n\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0a3a\n\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u0a3e\n\u00ce\3\u00ce\5\u00ce\u0a41\n\u00ce\3\u00cf\3\u00cf\5"+
		"\u00cf\u0a45\n\u00cf\3\u00d0\3\u00d0\5\u00d0\u0a49\n\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d1\5\u00d1\u0a4e\n\u00d1\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2"+
		"\5\u00d2\u0a55\n\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0a5b\n"+
		"\u00d2\7\u00d2\u0a5d\n\u00d2\f\u00d2\16\u00d2\u0a60\13\u00d2\3\u00d3\3"+
		"\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a68\n\u00d3\3\u00d4\3"+
		"\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u0aa1\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\5\u00d7\u0aaa\n\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00da"+
		"\3\u00da\3\u00da\2%$\60:DV`bdfhjlnprt|\u0088\u009a\u00d0\u00f4\u00fa\u0106"+
		"\u010a\u0112\u0128\u012c\u0130\u013e\u0152\u0156\u015e\u017c\u0188\u01a2"+
		"\u00db\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a"+
		"\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132"+
		"\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a"+
		"\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162"+
		"\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a"+
		"\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192"+
		"\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa"+
		"\u01ac\u01ae\u01b0\u01b2\2\16\6\2\3\3\5\5\b\t\16\16\4\2ssww\4\2mosv\7"+
		"\2\66\66AAKKQQXX\5\2\64\64>>bb\4\2((dd\4\2ss\u0088\u0088\5\2\'\'TT__\4"+
		"\288GG\3\2HJ\4\2\67\67ZZ\3\2\u009f\u00a2\u0be7\2\u01b5\3\2\2\2\4\u01b9"+
		"\3\2\2\2\6\u01cf\3\2\2\2\b\u0203\3\2\2\2\n\u0211\3\2\2\2\f\u0228\3\2\2"+
		"\2\16\u0230\3\2\2\2\20\u024b\3\2\2\2\22\u0252\3\2\2\2\24\u0258\3\2\2\2"+
		"\26\u025a\3\2\2\2\30\u025c\3\2\2\2\32\u0269\3\2\2\2\34\u026b\3\2\2\2\36"+
		"\u0275\3\2\2\2 \u0278\3\2\2\2\"\u027a\3\2\2\2$\u0293\3\2\2\2&\u029d\3"+
		"\2\2\2(\u02a9\3\2\2\2*\u02ad\3\2\2\2,\u02b8\3\2\2\2.\u02ba\3\2\2\2\60"+
		"\u02cb\3\2\2\2\62\u02dc\3\2\2\2\64\u02e2\3\2\2\2\66\u02ee\3\2\2\28\u02f0"+
		"\3\2\2\2:\u02f2\3\2\2\2<\u0304\3\2\2\2>\u030a\3\2\2\2@\u0311\3\2\2\2B"+
		"\u0313\3\2\2\2D\u0362\3\2\2\2F\u038f\3\2\2\2H\u03a7\3\2\2\2J\u03c5\3\2"+
		"\2\2L\u03c7\3\2\2\2N\u03e1\3\2\2\2P\u03e3\3\2\2\2R\u03e7\3\2\2\2T\u03f0"+
		"\3\2\2\2V\u03f2\3\2\2\2X\u040b\3\2\2\2Z\u0419\3\2\2\2\\\u041b\3\2\2\2"+
		"^\u0426\3\2\2\2`\u0428\3\2\2\2b\u0436\3\2\2\2d\u0447\3\2\2\2f\u0455\3"+
		"\2\2\2h\u0464\3\2\2\2j\u0478\3\2\2\2l\u0486\3\2\2\2n\u0491\3\2\2\2p\u049c"+
		"\3\2\2\2r\u04a7\3\2\2\2t\u04b2\3\2\2\2v\u04c4\3\2\2\2x\u04cc\3\2\2\2z"+
		"\u04d9\3\2\2\2|\u04db\3\2\2\2~\u04e6\3\2\2\2\u0080\u0502\3\2\2\2\u0082"+
		"\u0518\3\2\2\2\u0084\u051b\3\2\2\2\u0086\u051f\3\2\2\2\u0088\u0525\3\2"+
		"\2\2\u008a\u0543\3\2\2\2\u008c\u0555\3\2\2\2\u008e\u057a\3\2\2\2\u0090"+
		"\u057e\3\2\2\2\u0092\u0581\3\2\2\2\u0094\u0588\3\2\2\2\u0096\u059a\3\2"+
		"\2\2\u0098\u059c\3\2\2\2\u009a\u059e\3\2\2\2\u009c\u05b1\3\2\2\2\u009e"+
		"\u05bb\3\2\2\2\u00a0\u05bd\3\2\2\2\u00a2\u05d4\3\2\2\2\u00a4\u05d6\3\2"+
		"\2\2\u00a6\u05de\3\2\2\2\u00a8\u05e0\3\2\2\2\u00aa\u05e9\3\2\2\2\u00ac"+
		"\u05f2\3\2\2\2\u00ae\u05f4\3\2\2\2\u00b0\u05f6\3\2\2\2\u00b2\u05f8\3\2"+
		"\2\2\u00b4\u05fd\3\2\2\2\u00b6\u0603\3\2\2\2\u00b8\u060c\3\2\2\2\u00ba"+
		"\u0615\3\2\2\2\u00bc\u062e\3\2\2\2\u00be\u0634\3\2\2\2\u00c0\u063f\3\2"+
		"\2\2\u00c2\u0659\3\2\2\2\u00c4\u065b\3\2\2\2\u00c6\u066a\3\2\2\2\u00c8"+
		"\u067f\3\2\2\2\u00ca\u0681\3\2\2\2\u00cc\u0690\3\2\2\2\u00ce\u0692\3\2"+
		"\2\2\u00d0\u0695\3\2\2\2\u00d2\u06a5\3\2\2\2\u00d4\u06a7\3\2\2\2\u00d6"+
		"\u06ab\3\2\2\2\u00d8\u06ad\3\2\2\2\u00da\u06b1\3\2\2\2\u00dc\u06b5\3\2"+
		"\2\2\u00de\u06b8\3\2\2\2\u00e0\u06c1\3\2\2\2\u00e2\u06ca\3\2\2\2\u00e4"+
		"\u06d2\3\2\2\2\u00e6\u06d4\3\2\2\2\u00e8\u06d6\3\2\2\2\u00ea\u06dd\3\2"+
		"\2\2\u00ec\u06ee\3\2\2\2\u00ee\u06f1\3\2\2\2\u00f0\u06fb\3\2\2\2\u00f2"+
		"\u070b\3\2\2\2\u00f4\u070d\3\2\2\2\u00f6\u071e\3\2\2\2\u00f8\u0730\3\2"+
		"\2\2\u00fa\u0739\3\2\2\2\u00fc\u074a\3\2\2\2\u00fe\u0750\3\2\2\2\u0100"+
		"\u0752\3\2\2\2\u0102\u0756\3\2\2\2\u0104\u0758\3\2\2\2\u0106\u075c\3\2"+
		"\2\2\u0108\u0773\3\2\2\2\u010a\u0775\3\2\2\2\u010c\u0780\3\2\2\2\u010e"+
		"\u0789\3\2\2\2\u0110\u078f\3\2\2\2\u0112\u079a\3\2\2\2\u0114\u07ac\3\2"+
		"\2\2\u0116\u07bb\3\2\2\2\u0118\u07d7\3\2\2\2\u011a\u07d9\3\2\2\2\u011c"+
		"\u07dd\3\2\2\2\u011e\u07df\3\2\2\2\u0120\u07e2\3\2\2\2\u0122\u07e6\3\2"+
		"\2\2\u0124\u07f2\3\2\2\2\u0126\u07f9\3\2\2\2\u0128\u0809\3\2\2\2\u012a"+
		"\u081f\3\2\2\2\u012c\u0821\3\2\2\2\u012e\u083e\3\2\2\2\u0130\u0840\3\2"+
		"\2\2\u0132\u086a\3\2\2\2\u0134\u086d\3\2\2\2\u0136\u0883\3\2\2\2\u0138"+
		"\u088a\3\2\2\2\u013a\u088f\3\2\2\2\u013c\u0893\3\2\2\2\u013e\u0895\3\2"+
		"\2\2\u0140\u08ae\3\2\2\2\u0142\u08b2\3\2\2\2\u0144\u08b4\3\2\2\2\u0146"+
		"\u08cd\3\2\2\2\u0148\u08d0\3\2\2\2\u014a\u08d4\3\2\2\2\u014c\u08d6\3\2"+
		"\2\2\u014e\u08e1\3\2\2\2\u0150\u08f3\3\2\2\2\u0152\u08f5\3\2\2\2\u0154"+
		"\u0913\3\2\2\2\u0156\u0915\3\2\2\2\u0158\u091f\3\2\2\2\u015a\u0921\3\2"+
		"\2\2\u015c\u0925\3\2\2\2\u015e\u0928\3\2\2\2\u0160\u094d\3\2\2\2\u0162"+
		"\u0954\3\2\2\2\u0164\u0956\3\2\2\2\u0166\u0958\3\2\2\2\u0168\u095a\3\2"+
		"\2\2\u016a\u095d\3\2\2\2\u016c\u0961\3\2\2\2\u016e\u0965\3\2\2\2\u0170"+
		"\u0973\3\2\2\2\u0172\u097f\3\2\2\2\u0174\u0983\3\2\2\2\u0176\u0985\3\2"+
		"\2\2\u0178\u098d\3\2\2\2\u017a\u098f\3\2\2\2\u017c\u0995\3\2\2\2\u017e"+
		"\u09a2\3\2\2\2\u0180\u09d4\3\2\2\2\u0182\u09d6\3\2\2\2\u0184\u09ec\3\2"+
		"\2\2\u0186\u09ee\3\2\2\2\u0188\u09f0\3\2\2\2\u018a\u0a03\3\2\2\2\u018c"+
		"\u0a10\3\2\2\2\u018e\u0a13\3\2\2\2\u0190\u0a18\3\2\2\2\u0192\u0a1d\3\2"+
		"\2\2\u0194\u0a21\3\2\2\2\u0196\u0a28\3\2\2\2\u0198\u0a2c\3\2\2\2\u019a"+
		"\u0a40\3\2\2\2\u019c\u0a42\3\2\2\2\u019e\u0a48\3\2\2\2\u01a0\u0a4a\3\2"+
		"\2\2\u01a2\u0a51\3\2\2\2\u01a4\u0a67\3\2\2\2\u01a6\u0a69\3\2\2\2\u01a8"+
		"\u0a6c\3\2\2\2\u01aa\u0aa0\3\2\2\2\u01ac\u0aa9\3\2\2\2\u01ae\u0aab\3\2"+
		"\2\2\u01b0\u0aad\3\2\2\2\u01b2\u0aaf\3\2\2\2\u01b4\u01b6\5\4\3\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\3\3\2\2\2\u01b9\u01ba\7\22\2\2\u01ba\u01bb\7\23\2\2\u01bb\u01bc"+
		"\7\u0090\2\2\u01bc\u01bd\7\23\2\2\u01bd\u01be\7\r\2\2\u01be\u01bf\7\23"+
		"\2\2\u01bf\u01c1\7\6\2\2\u01c0\u01c2\5\6\4\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c6\7\f\2\2\u01c6\5\3\2\2\2\u01c7\u01c8\7\21\2\2\u01c8\u01d0"+
		"\7\24\2\2\u01c9\u01ca\7\21\2\2\u01ca\u01cb\7x\2\2\u01cb\u01cc\5$\23\2"+
		"\u01cc\u01cd\7y\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01d0\5\b\5\2\u01cf\u01c7"+
		"\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\7\3\2\2\2\u01d1"+
		"\u01d2\5\"\22\2\u01d2\u01d4\7\6\2\2\u01d3\u01d5\5\b\5\2\u01d4\u01d3\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\7\f\2\2\u01d9\u0204\3\2\2\2\u01da\u01db\5\""+
		"\22\2\u01db\u01dc\7x\2\2\u01dc\u01dd\7\23\2\2\u01dd\u01de\7y\2\2\u01de"+
		"\u01e0\7\6\2\2\u01df\u01e1\5\b\5\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\7\f\2\2\u01e5\u0204\3\2\2\2\u01e6\u0204\5\34\17\2\u01e7\u0204\5"+
		"\30\r\2\u01e8\u01e9\5\n\6\2\u01e9\u01ea\7\r\2\2\u01ea\u01eb\7\23\2\2\u01eb"+
		"\u01ec\7g\2\2\u01ec\u01ed\5\n\6\2\u01ed\u01ee\7h\2\2\u01ee\u01ef\7\7\2"+
		"\2\u01ef\u0204\3\2\2\2\u01f0\u01f1\5\n\6\2\u01f1\u01f2\7\r\2\2\u01f2\u01f3"+
		"\7\23\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\5\n\6\2\u01f5\u01f6\7h\2\2\u01f6"+
		"\u01f7\5\16\b\2\u01f7\u01f8\7\7\2\2\u01f8\u0204\3\2\2\2\u01f9\u01fa\5"+
		"\n\6\2\u01fa\u01fb\7\r\2\2\u01fb\u01fc\7\23\2\2\u01fc\u01fd\7g\2\2\u01fd"+
		"\u01fe\5\n\6\2\u01fe\u01ff\7h\2\2\u01ff\u0200\7\6\2\2\u0200\u0201\5\16"+
		"\b\2\u0201\u0202\7\f\2\2\u0202\u0204\3\2\2\2\u0203\u01d1\3\2\2\2\u0203"+
		"\u01da\3\2\2\2\u0203\u01e6\3\2\2\2\u0203\u01e7\3\2\2\2\u0203\u01e8\3\2"+
		"\2\2\u0203\u01f0\3\2\2\2\u0203\u01f9\3\2\2\2\u0204\t\3\2\2\2\u0205\u0206"+
		"\5\26\f\2\u0206\u0207\5$\23\2\u0207\u0212\3\2\2\2\u0208\u0209\5\26\f\2"+
		"\u0209\u020a\5$\23\2\u020a\u020b\5\f\7\2\u020b\u0212\3\2\2\2\u020c\u020d"+
		"\5$\23\2\u020d\u020e\5\f\7\2\u020e\u0212\3\2\2\2\u020f\u0212\5$\23\2\u0210"+
		"\u0212\5\f\7\2\u0211\u0205\3\2\2\2\u0211\u0208\3\2\2\2\u0211\u020c\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\13\3\2\2\2\u0213\u0214"+
		"\5\"\22\2\u0214\u0215\7x\2\2\u0215\u0216\5\f\7\2\u0216\u0217\7y\2\2\u0217"+
		"\u0218\7g\2\2\u0218\u0219\5$\23\2\u0219\u021a\7h\2\2\u021a\u0229\3\2\2"+
		"\2\u021b\u021c\5\"\22\2\u021c\u021d\7x\2\2\u021d\u021e\5$\23\2\u021e\u021f"+
		"\7y\2\2\u021f\u0220\7g\2\2\u0220\u0221\5$\23\2\u0221\u0222\7h\2\2\u0222"+
		"\u0229\3\2\2\2\u0223\u0224\5\"\22\2\u0224\u0225\7g\2\2\u0225\u0226\5$"+
		"\23\2\u0226\u0227\7h\2\2\u0227\u0229\3\2\2\2\u0228\u0213\3\2\2\2\u0228"+
		"\u021b\3\2\2\2\u0228\u0223\3\2\2\2\u0229\r\3\2\2\2\u022a\u022c\5\20\t"+
		"\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022b\3\2\2\2\u0230"+
		"\u022f\3\2\2\2\u0231\17\3\2\2\2\u0232\u0233\7\17\2\2\u0233\u024c\5$\23"+
		"\2\u0234\u0235\7\17\2\2\u0235\u0236\5\22\n\2\u0236\u0237\7\20\2\2\u0237"+
		"\u0238\5\24\13\2\u0238\u024c\3\2\2\2\u0239\u023a\7a\2\2\u023a\u024c\5"+
		"$\23\2\u023b\u023c\7A\2\2\u023c\u024c\7\23\2\2\u023d\u023e\7\17\2\2\u023e"+
		"\u023f\7\6\2\2\u023f\u0240\5$\23\2\u0240\u0241\7\f\2\2\u0241\u024c\3\2"+
		"\2\2\u0242\u0243\7a\2\2\u0243\u0244\7\6\2\2\u0244\u0245\5$\23\2\u0245"+
		"\u0246\7\f\2\2\u0246\u024c\3\2\2\2\u0247\u0248\7A\2\2\u0248\u0249\7\6"+
		"\2\2\u0249\u024a\7\23\2\2\u024a\u024c\7\f\2\2\u024b\u0232\3\2\2\2\u024b"+
		"\u0234\3\2\2\2\u024b\u0239\3\2\2\2\u024b\u023b\3\2\2\2\u024b\u023d\3\2"+
		"\2\2\u024b\u0242\3\2\2\2\u024b\u0247\3\2\2\2\u024c\21\3\2\2\2\u024d\u0253"+
		"\7\23\2\2\u024e\u024f\7\23\2\2\u024f\u0250\7g\2\2\u0250\u0251\7\23\2\2"+
		"\u0251\u0253\7h\2\2\u0252\u024d\3\2\2\2\u0252\u024e\3\2\2\2\u0253\23\3"+
		"\2\2\2\u0254\u0259\7\23\2\2\u0255\u0256\7\23\2\2\u0256\u0257\7\u0093\2"+
		"\2\u0257\u0259\7\23\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0259"+
		"\25\3\2\2\2\u025a\u025b\t\2\2\2\u025b\27\3\2\2\2\u025c\u025d\7\13\2\2"+
		"\u025d\u025e\7\23\2\2\u025e\u025f\7g\2\2\u025f\u0260\5\32\16\2\u0260\u0261"+
		"\7h\2\2\u0261\u0262\7\7\2\2\u0262\31\3\2\2\2\u0263\u0264\7\24\2\2\u0264"+
		"\u0265\7\u0090\2\2\u0265\u0266\7\24\2\2\u0266\u0267\7\u008c\2\2\u0267"+
		"\u026a\5\32\16\2\u0268\u026a\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0268\3"+
		"\2\2\2\u026a\33\3\2\2\2\u026b\u026c\7\n\2\2\u026c\u0271\7\23\2\2\u026d"+
		"\u026e\7x\2\2\u026e\u026f\5\36\20\2\u026f\u0270\7y\2\2\u0270\u0272\3\2"+
		"\2\2\u0271\u026d\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\7\7\2\2\u0274\35\3\2\2\2\u0275\u0276\5\26\f\2\u0276\u0277\7\23"+
		"\2\2\u0277\37\3\2\2\2\u0278\u0279\7\23\2\2\u0279!\3\2\2\2\u027a\u027b"+
		"\7\23\2\2\u027b#\3\2\2\2\u027c\u027d\b\23\1\2\u027d\u027e\7\23\2\2\u027e"+
		"\u027f\7g\2\2\u027f\u0280\7\23\2\2\u0280\u0281\7h\2\2\u0281\u0294\5$\23"+
		"\b\u0282\u0294\5\f\7\2\u0283\u0284\7\23\2\2\u0284\u0294\7\23\2\2\u0285"+
		"\u0286\7\4\2\2\u0286\u0294\7\23\2\2\u0287\u0288\7T\2\2\u0288\u0289\7k"+
		"\2\2\u0289\u028a\5\f\7\2\u028a\u028f\7l\2\2\u028b\u028c\7i\2\2\u028c\u028d"+
		"\5$\23\2\u028d\u028e\7j\2\2\u028e\u0290\3\2\2\2\u028f\u028b\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0294\3\2\2\2\u0291\u0294\5|?\2\u0292\u0294\5\u0080"+
		"A\2\u0293\u027c\3\2\2\2\u0293\u0282\3\2\2\2\u0293\u0283\3\2\2\2\u0293"+
		"\u0285\3\2\2\2\u0293\u0287\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0292\3\2"+
		"\2\2\u0294\u0299\3\2\2\2\u0295\u0296\f\t\2\2\u0296\u0298\5\f\7\2\u0297"+
		"\u0295\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a%\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\5\u009aN\2\u029d\u029c"+
		"\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\7\2\2\3\u02a0"+
		"\'\3\2\2\2\u02a1\u02aa\5\u01ac\u00d7\2\u02a2\u02aa\7W\2\2\u02a3\u02a4"+
		"\7g\2\2\u02a4\u02a5\5|?\2\u02a5\u02a6\7h\2\2\u02a6\u02aa\3\2\2\2\u02a7"+
		"\u02aa\5*\26\2\u02a8\u02aa\5\62\32\2\u02a9\u02a1\3\2\2\2\u02a9\u02a2\3"+
		"\2\2\2\u02a9\u02a3\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8\3\2\2\2\u02aa"+
		")\3\2\2\2\u02ab\u02ae\5,\27\2\u02ac\u02ae\5.\30\2\u02ad\u02ab\3\2\2\2"+
		"\u02ad\u02ac\3\2\2\2\u02ae+\3\2\2\2\u02af\u02b9\7\23\2\2\u02b0\u02b9\5"+
		"\u0176\u00bc\2\u02b1\u02b9\5\u0168\u00b5\2\u02b2\u02b9\5\u0178\u00bd\2"+
		"\u02b3\u02b4\7u\2\2\u02b4\u02b9\5\u0142\u00a2\2\u02b5\u02b6\7u\2\2\u02b6"+
		"\u02b9\5\u00c0a\2\u02b7\u02b9\5\u0184\u00c3\2\u02b8\u02af\3\2\2\2\u02b8"+
		"\u02b0\3\2\2\2\u02b8\u02b1\3\2\2\2\u02b8\u02b2\3\2\2\2\u02b8\u02b3\3\2"+
		"\2\2\u02b8\u02b5\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9-\3\2\2\2\u02ba\u02bc"+
		"\5\60\31\2\u02bb\u02bd\7V\2\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2"+
		"\u02bd\u02be\3\2\2\2\u02be\u02bf\5,\27\2\u02bf/\3\2\2\2\u02c0\u02c1\b"+
		"\31\1\2\u02c1\u02cc\7\u0091\2\2\u02c2\u02c3\5\u00be`\2\u02c3\u02c4\7\u0091"+
		"\2\2\u02c4\u02cc\3\2\2\2\u02c5\u02c6\5\u00d6l\2\u02c6\u02c7\7\u0091\2"+
		"\2\u02c7\u02cc\3\2\2\2\u02c8\u02c9\5\u00c0a\2\u02c9\u02ca\7\u0091\2\2"+
		"\u02ca\u02cc\3\2\2\2\u02cb\u02c0\3\2\2\2\u02cb\u02c2\3\2\2\2\u02cb\u02c5"+
		"\3\2\2\2\u02cb\u02c8\3\2\2\2\u02cc\u02d9\3\2\2\2\u02cd\u02ce\f\4\2\2\u02ce"+
		"\u02cf\7\23\2\2\u02cf\u02d8\7\u0091\2\2\u02d0\u02d2\f\3\2\2\u02d1\u02d3"+
		"\7V\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\5\u0182\u00c2\2\u02d5\u02d6\7\u0091\2\2\u02d6\u02d8\3\2\2\2\u02d7"+
		"\u02cd\3\2\2\2\u02d7\u02d0\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\61\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02de"+
		"\5\64\33\2\u02dd\u02df\5B\"\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2"+
		"\u02df\u02e0\3\2\2\2\u02e0\u02e1\5\u0086D\2\u02e1\63\3\2\2\2\u02e2\u02e4"+
		"\7i\2\2\u02e3\u02e5\5\66\34\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2"+
		"\u02e5\u02e6\3\2\2\2\u02e6\u02e7\7j\2\2\u02e7\65\3\2\2\2\u02e8\u02ef\5"+
		"8\35\2\u02e9\u02ef\5:\36\2\u02ea\u02eb\58\35\2\u02eb\u02ec\7\u008c\2\2"+
		"\u02ec\u02ed\5:\36\2\u02ed\u02ef\3\2\2\2\u02ee\u02e8\3\2\2\2\u02ee\u02e9"+
		"\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ef\67\3\2\2\2\u02f0\u02f1\t\3\2\2\u02f1"+
		"9\3\2\2\2\u02f2\u02f3\b\36\1\2\u02f3\u02f5\5<\37\2\u02f4\u02f6\7\u0095"+
		"\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02ff\3\2\2\2\u02f7"+
		"\u02f8\f\3\2\2\u02f8\u02f9\7\u008c\2\2\u02f9\u02fb\5<\37\2\u02fa\u02fc"+
		"\7\u0095\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2"+
		"\2\u02fd\u02f7\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300;\3\2\2\2\u0301\u02ff\3\2\2\2\u0302\u0305\5> \2\u0303\u0305"+
		"\5@!\2\u0304\u0302\3\2\2\2\u0304\u0303\3\2\2\2\u0305=\3\2\2\2\u0306\u030b"+
		"\7\23\2\2\u0307\u0308\7s\2\2\u0308\u030b\7\23\2\2\u0309\u030b\7W\2\2\u030a"+
		"\u0306\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0309\3\2\2\2\u030b?\3\2\2\2"+
		"\u030c\u030d\7\23\2\2\u030d\u0312\5\u0138\u009d\2\u030e\u030f\7s\2\2\u030f"+
		"\u0310\7\23\2\2\u0310\u0312\5\u0138\u009d\2\u0311\u030c\3\2\2\2\u0311"+
		"\u030e\3\2\2\2\u0312A\3\2\2\2\u0313\u0314\7g\2\2\u0314\u0315\5\u012e\u0098"+
		"\2\u0315\u0317\7h\2\2\u0316\u0318\7A\2\2\u0317\u0316\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u031b\5\u019e\u00d0\2\u031a\u0319\3"+
		"\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031e\5\u00f4{\2"+
		"\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u0321"+
		"\5\u0116\u008c\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321C\3\2\2"+
		"\2\u0322\u0323\b#\1\2\u0323\u0363\5(\25\2\u0324\u0325\5\u00bc_\2\u0325"+
		"\u0327\7g\2\2\u0326\u0328\5F$\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2"+
		"\2\u0328\u0329\3\2\2\2\u0329\u032a\7h\2\2\u032a\u0363\3\2\2\2\u032b\u032c"+
		"\5\u018c\u00c7\2\u032c\u032e\7g\2\2\u032d\u032f\5F$\2\u032e\u032d\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\7h\2\2\u0331"+
		"\u0363\3\2\2\2\u0332\u0333\5\u00bc_\2\u0333\u0334\5\u0140\u00a1\2\u0334"+
		"\u0363\3\2\2\2\u0335\u0336\5\u018c\u00c7\2\u0336\u0337\5\u0140\u00a1\2"+
		"\u0337\u0363\3\2\2\2\u0338\u0339\7\61\2\2\u0339\u033a\7x\2\2\u033a\u033b"+
		"\5\u0122\u0092\2\u033b\u033c\7y\2\2\u033c\u033d\7g\2\2\u033d\u033e\5|"+
		"?\2\u033e\u033f\7h\2\2\u033f\u0363\3\2\2\2\u0340\u0341\7S\2\2\u0341\u0342"+
		"\7x\2\2\u0342\u0343\5\u0122\u0092\2\u0343\u0344\7y\2\2\u0344\u0345\7g"+
		"\2\2\u0345\u0346\5|?\2\u0346\u0347\7h\2\2\u0347\u0363\3\2\2\2\u0348\u0349"+
		"\7L\2\2\u0349\u034a\7x\2\2\u034a\u034b\5\u0122\u0092\2\u034b\u034c\7y"+
		"\2\2\u034c\u034d\7g\2\2\u034d\u034e\5|?\2\u034e\u034f\7h\2\2\u034f\u0363"+
		"\3\2\2\2\u0350\u0351\7*\2\2\u0351\u0352\7x\2\2\u0352\u0353\5\u0122\u0092"+
		"\2\u0353\u0354\7y\2\2\u0354\u0355\7g\2\2\u0355\u0356\5|?\2\u0356\u0357"+
		"\7h\2\2\u0357\u0363\3\2\2\2\u0358\u0359\7]\2\2\u0359\u035a\7g\2\2\u035a"+
		"\u035b\5|?\2\u035b\u035c\7h\2\2\u035c\u0363\3\2\2\2\u035d\u035e\7]\2\2"+
		"\u035e\u035f\7g\2\2\u035f\u0360\5\u0122\u0092\2\u0360\u0361\7h\2\2\u0361"+
		"\u0363\3\2\2\2\u0362\u0322\3\2\2\2\u0362\u0324\3\2\2\2\u0362\u032b\3\2"+
		"\2\2\u0362\u0332\3\2\2\2\u0362\u0335\3\2\2\2\u0362\u0338\3\2\2\2\u0362"+
		"\u0340\3\2\2\2\u0362\u0348\3\2\2\2\u0362\u0350\3\2\2\2\u0362\u0358\3\2"+
		"\2\2\u0362\u035d\3\2\2\2\u0363\u038c\3\2\2\2\u0364\u0365\f\25\2\2\u0365"+
		"\u0366\7i\2\2\u0366\u0367\5|?\2\u0367\u0368\7j\2\2\u0368\u038b\3\2\2\2"+
		"\u0369\u036a\f\24\2\2\u036a\u036b\7i\2\2\u036b\u036c\5\u0140\u00a1\2\u036c"+
		"\u036d\7j\2\2\u036d\u038b\3\2\2\2\u036e\u036f\f\23\2\2\u036f\u0371\7g"+
		"\2\2\u0370\u0372\5F$\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373"+
		"\3\2\2\2\u0373\u038b\7h\2\2\u0374\u0375\f\16\2\2\u0375\u0377\7\u0093\2"+
		"\2\u0376\u0378\7V\2\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379"+
		"\3\2\2\2\u0379\u038b\5*\26\2\u037a\u037b\f\r\2\2\u037b\u037d\7\u008e\2"+
		"\2\u037c\u037e\7V\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u038b\5*\26\2\u0380\u0381\f\f\2\2\u0381\u0382\7\u0093\2"+
		"\2\u0382\u038b\5H%\2\u0383\u0384\f\13\2\2\u0384\u0385\7\u008e\2\2\u0385"+
		"\u038b\5H%\2\u0386\u0387\f\n\2\2\u0387\u038b\7\u008a\2\2\u0388\u0389\f"+
		"\t\2\2\u0389\u038b\7\u008b\2\2\u038a\u0364\3\2\2\2\u038a\u0369\3\2\2\2"+
		"\u038a\u036e\3\2\2\2\u038a\u0374\3\2\2\2\u038a\u037a\3\2\2\2\u038a\u0380"+
		"\3\2\2\2\u038a\u0383\3\2\2\2\u038a\u0386\3\2\2\2\u038a\u0388\3\2\2\2\u038b"+
		"\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038dE\3\2\2\2"+
		"\u038e\u038c\3\2\2\2\u038f\u0390\5\u013e\u00a0\2\u0390G\3\2\2\2\u0391"+
		"\u0393\5\60\31\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3"+
		"\2\2\2\u0394\u0395\5\u00be`\2\u0395\u0396\7\u0091\2\2\u0396\u0397\7u\2"+
		"\2\u0397\u0398\5\u00be`\2\u0398\u03a8\3\2\2\2\u0399\u039a\5\60\31\2\u039a"+
		"\u039b\7V\2\2\u039b\u039c\5\u0182\u00c2\2\u039c\u039d\7\u0091\2\2\u039d"+
		"\u039e\7u\2\2\u039e\u039f\5\u00be`\2\u039f\u03a8\3\2\2\2\u03a0\u03a2\5"+
		"\60\31\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a4\7u\2\2\u03a4\u03a8\5\u00be`\2\u03a5\u03a6\7u\2\2\u03a6\u03a8\5"+
		"\u00c0a\2\u03a7\u0392\3\2\2\2\u03a7\u0399\3\2\2\2\u03a7\u03a1\3\2\2\2"+
		"\u03a7\u03a5\3\2\2\2\u03a8I\3\2\2\2\u03a9\u03c6\5D#\2\u03aa\u03ab\7\u008a"+
		"\2\2\u03ab\u03c6\5^\60\2\u03ac\u03ad\7\u008b\2\2\u03ad\u03c6\5^\60\2\u03ae"+
		"\u03af\5L\'\2\u03af\u03b0\5^\60\2\u03b0\u03c6\3\2\2\2\u03b1\u03b2\7P\2"+
		"\2\u03b2\u03c6\5J&\2\u03b3\u03b4\7P\2\2\u03b4\u03b5\7g\2\2\u03b5\u03b6"+
		"\5\u0122\u0092\2\u03b6\u03b7\7h\2\2\u03b7\u03c6\3\2\2\2\u03b8\u03b9\7"+
		"P\2\2\u03b9\u03ba\7\u0095\2\2\u03ba\u03bb\7g\2\2\u03bb\u03bc\7\23\2\2"+
		"\u03bc\u03c6\7h\2\2\u03bd\u03be\7\35\2\2\u03be\u03bf\7g\2\2\u03bf\u03c0"+
		"\5\u0122\u0092\2\u03c0\u03c1\7h\2\2\u03c1\u03c6\3\2\2\2\u03c2\u03c6\5"+
		"\\/\2\u03c3\u03c6\5N(\2\u03c4\u03c6\5Z.\2\u03c5\u03a9\3\2\2\2\u03c5\u03aa"+
		"\3\2\2\2\u03c5\u03ac\3\2\2\2\u03c5\u03ae\3\2\2\2\u03c5\u03b1\3\2\2\2\u03c5"+
		"\u03b3\3\2\2\2\u03c5\u03b8\3\2\2\2\u03c5\u03bd\3\2\2\2\u03c5\u03c2\3\2"+
		"\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c4\3\2\2\2\u03c6K\3\2\2\2\u03c7\u03c8"+
		"\t\4\2\2\u03c8M\3\2\2\2\u03c9\u03cb\7\u0091\2\2\u03ca\u03c9\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\7C\2\2\u03cd\u03cf\5P)"+
		"\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2"+
		"\5R*\2\u03d1\u03d3\5X-\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03e2\3\2\2\2\u03d4\u03d6\7\u0091\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\7C\2\2\u03d8\u03da\5P)\2\u03d9"+
		"\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7g"+
		"\2\2\u03dc\u03dd\5\u0122\u0092\2\u03dd\u03df\7h\2\2\u03de\u03e0\5X-\2"+
		"\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03ca"+
		"\3\2\2\2\u03e1\u03d5\3\2\2\2\u03e2O\3\2\2\2\u03e3\u03e4\7g\2\2\u03e4\u03e5"+
		"\5F$\2\u03e5\u03e6\7h\2\2\u03e6Q\3\2\2\2\u03e7\u03e9\5\u00b8]\2\u03e8"+
		"\u03ea\5T+\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03eaS\3\2\2\2\u03eb"+
		"\u03ed\5\u0118\u008d\2\u03ec\u03ee\5T+\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee"+
		"\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03f1\5V,\2\u03f0\u03eb\3\2\2\2\u03f0"+
		"\u03ef\3\2\2\2\u03f1U\3\2\2\2\u03f2\u03f3\b,\1\2\u03f3\u03f4\7i\2\2\u03f4"+
		"\u03f5\5|?\2\u03f5\u03f7\7j\2\2\u03f6\u03f8\5\u00f4{\2\u03f7\u03f6\3\2"+
		"\2\2\u03f7\u03f8\3\2\2\2\u03f8\u0402\3\2\2\2\u03f9\u03fa\f\3\2\2\u03fa"+
		"\u03fb\7i\2\2\u03fb\u03fc\5~@\2\u03fc\u03fe\7j\2\2\u03fd\u03ff\5\u00f4"+
		"{\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\3\2\2\2\u0400"+
		"\u03f9\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2"+
		"\2\2\u0403W\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0407\7g\2\2\u0406\u0408"+
		"\5F$\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040c\7h\2\2\u040a\u040c\5\u0140\u00a1\2\u040b\u0405\3\2\2\2\u040b\u040a"+
		"\3\2\2\2\u040cY\3\2\2\2\u040d\u040f\7\u0091\2\2\u040e\u040d\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7.\2\2\u0411\u041a\5^\60"+
		"\2\u0412\u0414\7\u0091\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\7.\2\2\u0416\u0417\7i\2\2\u0417\u0418\7j\2"+
		"\2\u0418\u041a\5^\60\2\u0419\u040e\3\2\2\2\u0419\u0413\3\2\2\2\u041a["+
		"\3\2\2\2\u041b\u041c\7D\2\2\u041c\u041d\7g\2\2\u041d\u041e\5|?\2\u041e"+
		"\u041f\7h\2\2\u041f]\3\2\2\2\u0420\u0427\5J&\2\u0421\u0422\7g\2\2\u0422"+
		"\u0423\5\u0122\u0092\2\u0423\u0424\7h\2\2\u0424\u0425\5^\60\2\u0425\u0427"+
		"\3\2\2\2\u0426\u0420\3\2\2\2\u0426\u0421\3\2\2\2\u0427_\3\2\2\2\u0428"+
		"\u0429\b\61\1\2\u0429\u042a\5^\60\2\u042a\u0433\3\2\2\2\u042b\u042c\f"+
		"\4\2\2\u042c\u042d\7\u0094\2\2\u042d\u0432\5^\60\2\u042e\u042f\f\3\2\2"+
		"\u042f\u0430\7\u008d\2\2\u0430\u0432\5^\60\2\u0431\u042b\3\2\2\2\u0431"+
		"\u042e\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2"+
		"\2\2\u0434a\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\b\62\1\2\u0437\u0438"+
		"\5`\61\2\u0438\u0444\3\2\2\2\u0439\u043a\f\5\2\2\u043a\u043b\7o\2\2\u043b"+
		"\u0443\5`\61\2\u043c\u043d\f\4\2\2\u043d\u043e\7p\2\2\u043e\u0443\5`\61"+
		"\2\u043f\u0440\f\3\2\2\u0440\u0441\7q\2\2\u0441\u0443\5`\61\2\u0442\u0439"+
		"\3\2\2\2\u0442\u043c\3\2\2\2\u0442\u043f\3\2\2\2\u0443\u0446\3\2\2\2\u0444"+
		"\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445c\3\2\2\2\u0446\u0444\3\2\2\2"+
		"\u0447\u0448\b\63\1\2\u0448\u0449\5b\62\2\u0449\u0452\3\2\2\2\u044a\u044b"+
		"\f\4\2\2\u044b\u044c\7m\2\2\u044c\u0451\5b\62\2\u044d\u044e\f\3\2\2\u044e"+
		"\u044f\7n\2\2\u044f\u0451\5b\62\2\u0450\u044a\3\2\2\2\u0450\u044d\3\2"+
		"\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"e\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0456\b\64\1\2\u0456\u0457\5d\63\2"+
		"\u0457\u0461\3\2\2\2\u0458\u0459\f\4\2\2\u0459\u045a\7\u0082\2\2\u045a"+
		"\u0460\5d\63\2\u045b\u045c\f\3\2\2\u045c\u045d\5\u01a6\u00d4\2\u045d\u045e"+
		"\5d\63\2\u045e\u0460\3\2\2\2\u045f\u0458\3\2\2\2\u045f\u045b\3\2\2\2\u0460"+
		"\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462g\3\2\2\2"+
		"\u0463\u0461\3\2\2\2\u0464\u0465\b\65\1\2\u0465\u0466\5f\64\2\u0466\u0475"+
		"\3\2\2\2\u0467\u0468\f\6\2\2\u0468\u0469\7x\2\2\u0469\u0474\5f\64\2\u046a"+
		"\u046b\f\5\2\2\u046b\u046c\7y\2\2\u046c\u0474\5f\64\2\u046d\u046e\f\4"+
		"\2\2\u046e\u046f\7\u0086\2\2\u046f\u0474\5f\64\2\u0470\u0471\f\3\2\2\u0471"+
		"\u0472\7\u0087\2\2\u0472\u0474\5f\64\2\u0473\u0467\3\2\2\2\u0473\u046a"+
		"\3\2\2\2\u0473\u046d\3\2\2\2\u0473\u0470\3\2\2\2\u0474\u0477\3\2\2\2\u0475"+
		"\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476i\3\2\2\2\u0477\u0475\3\2\2\2"+
		"\u0478\u0479\b\66\1\2\u0479\u047a\5h\65\2\u047a\u0483\3\2\2\2\u047b\u047c"+
		"\f\4\2\2\u047c\u047d\7\u0084\2\2\u047d\u0482\5h\65\2\u047e\u047f\f\3\2"+
		"\2\u047f\u0480\7\u0085\2\2\u0480\u0482\5h\65\2\u0481\u047b\3\2\2\2\u0481"+
		"\u047e\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2"+
		"\2\2\u0484k\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0487\b\67\1\2\u0487\u0488"+
		"\5j\66\2\u0488\u048e\3\2\2\2\u0489\u048a\f\3\2\2\u048a\u048b\7s\2\2\u048b"+
		"\u048d\5j\66\2\u048c\u0489\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2"+
		"\2\2\u048e\u048f\3\2\2\2\u048fm\3\2\2\2\u0490\u048e\3\2\2\2\u0491\u0492"+
		"\b8\1\2\u0492\u0493\5l\67\2\u0493\u0499\3\2\2\2\u0494\u0495\f\3\2\2\u0495"+
		"\u0496\7r\2\2\u0496\u0498\5l\67\2\u0497\u0494\3\2\2\2\u0498\u049b\3\2"+
		"\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049ao\3\2\2\2\u049b\u0499"+
		"\3\2\2\2\u049c\u049d\b9\1\2\u049d\u049e\5n8\2\u049e\u04a4\3\2\2\2\u049f"+
		"\u04a0\f\3\2\2\u04a0\u04a1\7t\2\2\u04a1\u04a3\5n8\2\u04a2\u049f\3\2\2"+
		"\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5q"+
		"\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04a8\b:\1\2\u04a8\u04a9\5p9\2\u04a9"+
		"\u04af\3\2\2\2\u04aa\u04ab\f\3\2\2\u04ab\u04ac\7\u0088\2\2\u04ac\u04ae"+
		"\5p9\2\u04ad\u04aa\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0s\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b3\b;\1\2\u04b3"+
		"\u04b4\5r:\2\u04b4\u04ba\3\2\2\2\u04b5\u04b6\f\3\2\2\u04b6\u04b7\7\u0089"+
		"\2\2\u04b7\u04b9\5r:\2\u04b8\u04b5\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8"+
		"\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bbu\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd"+
		"\u04c5\5t;\2\u04be\u04bf\5t;\2\u04bf\u04c0\7\u008f\2\2\u04c0\u04c1\5|"+
		"?\2\u04c1\u04c2\7\u0090\2\2\u04c2\u04c3\5x=\2\u04c3\u04c5\3\2\2\2\u04c4"+
		"\u04bd\3\2\2\2\u04c4\u04be\3\2\2\2\u04c5w\3\2\2\2\u04c6\u04cd\5v<\2\u04c7"+
		"\u04c8\5t;\2\u04c8\u04c9\5z>\2\u04c9\u04ca\5\u013c\u009f\2\u04ca\u04cd"+
		"\3\2\2\2\u04cb\u04cd\5\u019c\u00cf\2\u04cc\u04c6\3\2\2\2\u04cc\u04c7\3"+
		"\2\2\2\u04cc\u04cb\3\2\2\2\u04cdy\3\2\2\2\u04ce\u04da\7w\2\2\u04cf\u04da"+
		"\7|\2\2\u04d0\u04da\7}\2\2\u04d1\u04da\7~\2\2\u04d2\u04da\7z\2\2\u04d3"+
		"\u04da\7{\2\2\u04d4\u04da\5\u01a8\u00d5\2\u04d5\u04da\7\u0083\2\2\u04d6"+
		"\u04da\7\u0080\2\2\u04d7\u04da\7\177\2\2\u04d8\u04da\7\u0081\2\2\u04d9"+
		"\u04ce\3\2\2\2\u04d9\u04cf\3\2\2\2\u04d9\u04d0\3\2\2\2\u04d9\u04d1\3\2"+
		"\2\2\u04d9\u04d2\3\2\2\2\u04d9\u04d3\3\2\2\2\u04d9\u04d4\3\2\2\2\u04d9"+
		"\u04d5\3\2\2\2\u04d9\u04d6\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2"+
		"\2\2\u04da{\3\2\2\2\u04db\u04dc\b?\1\2\u04dc\u04dd\5x=\2\u04dd\u04e3\3"+
		"\2\2\2\u04de\u04df\f\3\2\2\u04df\u04e0\7\u008c\2\2\u04e0\u04e2\5x=\2\u04e1"+
		"\u04de\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2"+
		"\2\2\u04e4}\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6\u04e7\5v<\2\u04e7\177\3"+
		"\2\2\2\u04e8\u0503\5\u0082B\2\u04e9\u04eb\5\u00f4{\2\u04ea\u04e9\3\2\2"+
		"\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u0503\5\u0084C\2\u04ed"+
		"\u04ef\5\u00f4{\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0"+
		"\3\2\2\2\u04f0\u0503\5\u0086D\2\u04f1\u04f3\5\u00f4{\2\u04f2\u04f1\3\2"+
		"\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u0503\5\u008aF\2\u04f5"+
		"\u04f7\5\u00f4{\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8"+
		"\3\2\2\2\u04f8\u0503\5\u008eH\2\u04f9\u04fb\5\u00f4{\2\u04fa\u04f9\3\2"+
		"\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u0503\5\u0096L\2\u04fd"+
		"\u0503\5\u0098M\2\u04fe\u0500\5\u00f4{\2\u04ff\u04fe\3\2\2\2\u04ff\u0500"+
		"\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0503\5\u0192\u00ca\2\u0502\u04e8\3"+
		"\2\2\2\u0502\u04ea\3\2\2\2\u0502\u04ee\3\2\2\2\u0502\u04f2\3\2\2\2\u0502"+
		"\u04f6\3\2\2\2\u0502\u04fa\3\2\2\2\u0502\u04fd\3\2\2\2\u0502\u04ff\3\2"+
		"\2\2\u0503\u0081\3\2\2\2\u0504\u0506\5\u00f4{\2\u0505\u0504\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7\23\2\2\u0508\u0509\7"+
		"\u0090\2\2\u0509\u0519\5\u0080A\2\u050a\u050c\5\u00f4{\2\u050b\u050a\3"+
		"\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\7\"\2\2\u050e"+
		"\u050f\5~@\2\u050f\u0510\7\u0090\2\2\u0510\u0511\5\u0080A\2\u0511\u0519"+
		"\3\2\2\2\u0512\u0514\5\u00f4{\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2"+
		"\2\u0514\u0515\3\2\2\2\u0515\u0516\7-\2\2\u0516\u0517\7\u0090\2\2\u0517"+
		"\u0519\5\u0080A\2\u0518\u0505\3\2\2\2\u0518\u050b\3\2\2\2\u0518\u0513"+
		"\3\2\2\2\u0519\u0083\3\2\2\2\u051a\u051c\5|?\2\u051b\u051a\3\2\2\2\u051b"+
		"\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\7\u0092\2\2\u051e\u0085"+
		"\3\2\2\2\u051f\u0521\7k\2\2\u0520\u0522\5\u0088E\2\u0521\u0520\3\2\2\2"+
		"\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\7l\2\2\u0524\u0087"+
		"\3\2\2\2\u0525\u0526\bE\1\2\u0526\u0527\5\u0080A\2\u0527\u052c\3\2\2\2"+
		"\u0528\u0529\f\3\2\2\u0529\u052b\5\u0080A\2\u052a\u0528\3\2\2\2\u052b"+
		"\u052e\3\2\2\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u0089\3\2"+
		"\2\2\u052e\u052c\3\2\2\2\u052f\u0530\7=\2\2\u0530\u0531\7g\2\2\u0531\u0532"+
		"\5\u008cG\2\u0532\u0533\7h\2\2\u0533\u0534\5\u0080A\2\u0534\u0544\3\2"+
		"\2\2\u0535\u0536\7=\2\2\u0536\u0537\7g\2\2\u0537\u0538\5\u008cG\2\u0538"+
		"\u0539\7h\2\2\u0539\u053a\5\u0080A\2\u053a\u053b\7\62\2\2\u053b\u053c"+
		"\5\u0080A\2\u053c\u0544\3\2\2\2\u053d\u053e\7U\2\2\u053e\u053f\7g\2\2"+
		"\u053f\u0540\5\u008cG\2\u0540\u0541\7h\2\2\u0541\u0542\5\u0080A\2\u0542"+
		"\u0544\3\2\2\2\u0543\u052f\3\2\2\2\u0543\u0535\3\2\2\2\u0543\u053d\3\2"+
		"\2\2\u0544\u008b\3\2\2\2\u0545\u0556\5|?\2\u0546\u0548\5\u00f4{\2\u0547"+
		"\u0546\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\5\u00ac"+
		"W\2\u054a\u054b\5\u010e\u0088\2\u054b\u054c\7w\2\2\u054c\u054d\5\u013c"+
		"\u009f\2\u054d\u0556\3\2\2\2\u054e\u0550\5\u00f4{\2\u054f\u054e\3\2\2"+
		"\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\5\u00acW\2\u0552"+
		"\u0553\5\u010e\u0088\2\u0553\u0554\5\u0140\u00a1\2\u0554\u0556\3\2\2\2"+
		"\u0555\u0545\3\2\2\2\u0555\u0547\3\2\2\2\u0555\u054f\3\2\2\2\u0556\u008d"+
		"\3\2\2\2\u0557\u0558\7f\2\2\u0558\u0559\7g\2\2\u0559\u055a\5\u008cG\2"+
		"\u055a\u055b\7h\2\2\u055b\u055c\5\u0080A\2\u055c\u057b\3\2\2\2\u055d\u055e"+
		"\7/\2\2\u055e\u055f\5\u0080A\2\u055f\u0560\7f\2\2\u0560\u0561\7g\2\2\u0561"+
		"\u0562\5|?\2\u0562\u0563\7h\2\2\u0563\u0564\7\u0092\2\2\u0564\u057b\3"+
		"\2\2\2\u0565\u0566\7:\2\2\u0566\u0567\7g\2\2\u0567\u0569\5\u0090I\2\u0568"+
		"\u056a\5\u008cG\2\u0569\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b"+
		"\3\2\2\2\u056b\u056d\7\u0092\2\2\u056c\u056e\5|?\2\u056d\u056c\3\2\2\2"+
		"\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\7h\2\2\u0570\u0571"+
		"\5\u0080A\2\u0571\u057b\3\2\2\2\u0572\u0573\7:\2\2\u0573\u0574\7g\2\2"+
		"\u0574\u0575\5\u0092J\2\u0575\u0576\7\u0090\2\2\u0576\u0577\5\u0094K\2"+
		"\u0577\u0578\7h\2\2\u0578\u0579\5\u0080A\2\u0579\u057b\3\2\2\2\u057a\u0557"+
		"\3\2\2\2\u057a\u055d\3\2\2\2\u057a\u0565\3\2\2\2\u057a\u0572\3\2\2\2\u057b"+
		"\u008f\3\2\2\2\u057c\u057f\5\u0084C\2\u057d\u057f\5\u00a2R\2\u057e\u057c"+
		"\3\2\2\2\u057e\u057d\3\2\2\2\u057f\u0091\3\2\2\2\u0580\u0582\5\u00f4{"+
		"\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584"+
		"\5\u00acW\2\u0584\u0585\5\u010e\u0088\2\u0585\u0093\3\2\2\2\u0586\u0589"+
		"\5|?\2\u0587\u0589\5\u0140\u00a1\2\u0588\u0586\3\2\2\2\u0588\u0587\3\2"+
		"\2\2\u0589\u0095\3\2\2\2\u058a\u058b\7!\2\2\u058b\u059b\7\u0092\2\2\u058c"+
		"\u058d\7+\2\2\u058d\u059b\7\u0092\2\2\u058e\u0590\7M\2\2\u058f\u0591\5"+
		"|?\2\u0590\u058f\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\3\2\2\2\u0592"+
		"\u059b\7\u0092\2\2\u0593\u0594\7M\2\2\u0594\u0595\5\u0140\u00a1\2\u0595"+
		"\u0596\7\u0092\2\2\u0596\u059b\3\2\2\2\u0597\u0598\7<\2\2\u0598\u0599"+
		"\7\23\2\2\u0599\u059b\7\u0092\2\2\u059a\u058a\3\2\2\2\u059a\u058c\3\2"+
		"\2\2\u059a\u058e\3\2\2\2\u059a\u0593\3\2\2\2\u059a\u0597\3\2\2\2\u059b"+
		"\u0097\3\2\2\2\u059c\u059d\5\u009eP\2\u059d\u0099\3\2\2\2\u059e\u059f"+
		"\bN\1\2\u059f\u05a0\5\u009cO\2\u05a0\u05a5\3\2\2\2\u05a1\u05a2\f\3\2\2"+
		"\u05a2\u05a4\5\u009cO\2\u05a3\u05a1\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"+
		"\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u009b\3\2\2\2\u05a7\u05a5\3\2"+
		"\2\2\u05a8\u05b2\5\u009eP\2\u05a9\u05b2\5\u0134\u009b\2\u05aa\u05b2\5"+
		"\u017a\u00be\2\u05ab\u05b2\5\u018e\u00c8\2\u05ac\u05b2\5\u0190\u00c9\2"+
		"\u05ad\u05b2\5\u00f2z\2\u05ae\u05b2\5\u00dan\2\u05af\u05b2\5\u00a6T\2"+
		"\u05b0\u05b2\5\u00a8U\2\u05b1\u05a8\3\2\2\2\u05b1\u05a9\3\2\2\2\u05b1"+
		"\u05aa\3\2\2\2\u05b1\u05ab\3\2\2\2\u05b1\u05ac\3\2\2\2\u05b1\u05ad\3\2"+
		"\2\2\u05b1\u05ae\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b0\3\2\2\2\u05b2"+
		"\u009d\3\2\2\2\u05b3\u05bc\5\u00a2R\2\u05b4\u05bc\5\u00f0y\2\u05b5\u05bc"+
		"\5\u00e8u\2\u05b6\u05bc\5\u00ecw\2\u05b7\u05bc\5\u00eex\2\u05b8\u05bc"+
		"\5\u00a4S\2\u05b9\u05bc\5\u00a0Q\2\u05ba\u05bc\5\u00caf\2\u05bb\u05b3"+
		"\3\2\2\2\u05bb\u05b4\3\2\2\2\u05bb\u05b5\3\2\2\2\u05bb\u05b6\3\2\2\2\u05bb"+
		"\u05b7\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05ba\3\2"+
		"\2\2\u05bc\u009f\3\2\2\2\u05bd\u05be\7a\2\2\u05be\u05c0\7\23\2\2\u05bf"+
		"\u05c1\5\u00f4{\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2"+
		"\3\2\2\2\u05c2\u05c3\7w\2\2\u05c3\u05c4\5\u0122\u0092\2\u05c4\u05c5\7"+
		"\u0092\2\2\u05c5\u00a1\3\2\2\2\u05c6\u05c8\5\u00acW\2\u05c7\u05c6\3\2"+
		"\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05ca\3\2\2\2\u05c9\u05cb\5\u010a\u0086"+
		"\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05d5"+
		"\7\u0092\2\2\u05cd\u05cf\5\u00f4{\2\u05ce\u05d0\5\u00acW\2\u05cf\u05ce"+
		"\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d2\5\u010a\u0086"+
		"\2\u05d2\u05d3\7\u0092\2\2\u05d3\u05d5\3\2\2\2\u05d4\u05c7\3\2\2\2\u05d4"+
		"\u05cd\3\2\2\2\u05d5\u00a3\3\2\2\2\u05d6\u05d7\7R\2\2\u05d7\u05d8\7g\2"+
		"\2\u05d8\u05d9\5~@\2\u05d9\u05da\7\u008c\2\2\u05da\u05db\7\u009e\2\2\u05db"+
		"\u05dc\7h\2\2\u05dc\u05dd\7\u0092\2\2\u05dd\u00a5\3\2\2\2\u05de\u05df"+
		"\7\u0092\2\2\u05df\u00a7\3\2\2\2\u05e0\u05e1\5\u00f4{\2\u05e1\u05e2\7"+
		"\u0092\2\2\u05e2\u00a9\3\2\2\2\u05e3\u05ea\5\u00aeX\2\u05e4\u05ea\5\u00b4"+
		"[\2\u05e5\u05ea\5\u00b0Y\2\u05e6\u05ea\7;\2\2\u05e7\u05ea\7\\\2\2\u05e8"+
		"\u05ea\7)\2\2\u05e9\u05e3\3\2\2\2\u05e9\u05e4\3\2\2\2\u05e9\u05e5\3\2"+
		"\2\2\u05e9\u05e6\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05e8\3\2\2\2\u05ea"+
		"\u00ab\3\2\2\2\u05eb\u05ed\5\u00aaV\2\u05ec\u05ee\5\u00f4{\2\u05ed\u05ec"+
		"\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f3\3\2\2\2\u05ef\u05f0\5\u00aaV"+
		"\2\u05f0\u05f1\5\u00acW\2\u05f1\u05f3\3\2\2\2\u05f2\u05eb\3\2\2\2\u05f2"+
		"\u05ef\3\2\2\2\u05f3\u00ad\3\2\2\2\u05f4\u05f5\t\5\2\2\u05f5\u00af\3\2"+
		"\2\2\u05f6\u05f7\t\6\2\2\u05f7\u00b1\3\2\2\2\u05f8\u05f9\7\23\2\2\u05f9"+
		"\u00b3\3\2\2\2\u05fa\u05fe\5\u00b6\\\2\u05fb\u05fe\5\u0144\u00a3\2\u05fc"+
		"\u05fe\5\u00c6d\2\u05fd\u05fa\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fd\u05fc"+
		"\3\2\2\2\u05fe\u00b5\3\2\2\2\u05ff\u0604\5\u00bc_\2\u0600\u0604\5\u00c2"+
		"b\2\u0601\u0604\5\u018c\u00c7\2\u0602\u0604\5\u011c\u008f\2\u0603\u05ff"+
		"\3\2\2\2\u0603\u0600\3\2\2\2\u0603\u0601\3\2\2\2\u0603\u0602\3\2\2\2\u0604"+
		"\u00b7\3\2\2\2\u0605\u0607\5\u00b4[\2\u0606\u0608\5\u00f4{\2\u0607\u0606"+
		"\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060d\3\2\2\2\u0609\u060a\5\u00b4["+
		"\2\u060a\u060b\5\u00b8]\2\u060b\u060d\3\2\2\2\u060c\u0605\3\2\2\2\u060c"+
		"\u0609\3\2\2\2\u060d\u00b9\3\2\2\2\u060e\u0610\5\u00b6\\\2\u060f\u0611"+
		"\5\u00f4{\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0616\3\2\2"+
		"\2\u0612\u0613\5\u00b6\\\2\u0613\u0614\5\u00ba^\2\u0614\u0616\3\2\2\2"+
		"\u0615\u060e\3\2\2\2\u0615\u0612\3\2\2\2\u0616\u00bb\3\2\2\2\u0617\u0619"+
		"\5\60\31\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2"+
		"\u061a\u062f\5\u00be`\2\u061b\u061c\5\60\31\2\u061c\u061d\7V\2\2\u061d"+
		"\u061e\5\u0182\u00c2\2\u061e\u062f\3\2\2\2\u061f\u062f\7$\2\2\u0620\u062f"+
		"\7%\2\2\u0621\u062f\7&\2\2\u0622\u062f\7e\2\2\u0623\u062f\7 \2\2\u0624"+
		"\u062f\7N\2\2\u0625\u062f\7?\2\2\u0626\u062f\7@\2\2\u0627\u062f\7O\2\2"+
		"\u0628\u062f\7`\2\2\u0629\u062f\79\2\2\u062a\u062f\7\60\2\2\u062b\u062f"+
		"\7c\2\2\u062c\u062f\7\37\2\2\u062d\u062f\5\u00c0a\2\u062e\u0618\3\2\2"+
		"\2\u062e\u061b\3\2\2\2\u062e\u061f\3\2\2\2\u062e\u0620\3\2\2\2\u062e\u0621"+
		"\3\2\2\2\u062e\u0622\3\2\2\2\u062e\u0623\3\2\2\2\u062e\u0624\3\2\2\2\u062e"+
		"\u0625\3\2\2\2\u062e\u0626\3\2\2\2\u062e\u0627\3\2\2\2\u062e\u0628\3\2"+
		"\2\2\u062e\u0629\3\2\2\2\u062e\u062a\3\2\2\2\u062e\u062b\3\2\2\2\u062e"+
		"\u062c\3\2\2\2\u062e\u062d\3\2\2\2\u062f\u00bd\3\2\2\2\u0630\u0635\5\u0142"+
		"\u00a2\2\u0631\u0635\5\u00c4c\2\u0632\u0635\5\u00b2Z\2\u0633\u0635\5\u0182"+
		"\u00c2\2\u0634\u0630\3\2\2\2\u0634\u0631\3\2\2\2\u0634\u0632\3\2\2\2\u0634"+
		"\u0633\3\2\2\2\u0635\u00bf\3\2\2\2\u0636\u0637\7,\2\2\u0637\u0638\7g\2"+
		"\2\u0638\u0639\5|?\2\u0639\u063a\7h\2\2\u063a\u0640\3\2\2\2\u063b\u063c"+
		"\7,\2\2\u063c\u063d\7g\2\2\u063d\u063e\7\37\2\2\u063e\u0640\7h\2\2\u063f"+
		"\u0636\3\2\2\2\u063f\u063b\3\2\2\2\u0640\u00c1\3\2\2\2\u0641\u0643\5\u014c"+
		"\u00a7\2\u0642\u0644\5\u00f4{\2\u0643\u0642\3\2\2\2\u0643\u0644\3\2\2"+
		"\2\u0644\u0646\3\2\2\2\u0645\u0647\5\60\31\2\u0646\u0645\3\2\2\2\u0646"+
		"\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\7\23\2\2\u0649\u065a\3"+
		"\2\2\2\u064a\u064b\5\u014c\u00a7\2\u064b\u064c\5\u0182\u00c2\2\u064c\u065a"+
		"\3\2\2\2\u064d\u064e\5\u014c\u00a7\2\u064e\u0650\5\60\31\2\u064f\u0651"+
		"\7V\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0653\5\u0182\u00c2\2\u0653\u065a\3\2\2\2\u0654\u0656\7\63\2\2\u0655"+
		"\u0657\5\60\31\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\3"+
		"\2\2\2\u0658\u065a\7\23\2\2\u0659\u0641\3\2\2\2\u0659\u064a\3\2\2\2\u0659"+
		"\u064d\3\2\2\2\u0659\u0654\3\2\2\2\u065a\u00c3\3\2\2\2\u065b\u065c\7\23"+
		"\2\2\u065c\u00c5\3\2\2\2\u065d\u065e\5\u00c8e\2\u065e\u0660\7k\2\2\u065f"+
		"\u0661\5\u00d0i\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662"+
		"\3\2\2\2\u0662\u0663\7l\2\2\u0663\u066b\3\2\2\2\u0664\u0665\5\u00c8e\2"+
		"\u0665\u0666\7k\2\2\u0666\u0667\5\u00d0i\2\u0667\u0668\7\u008c\2\2\u0668"+
		"\u0669\7l\2\2\u0669\u066b\3\2\2\2\u066a\u065d\3\2\2\2\u066a\u0664\3\2"+
		"\2\2\u066b\u00c7\3\2\2\2\u066c\u066e\5\u00ccg\2\u066d\u066f\5\u00f4{\2"+
		"\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670\u0672"+
		"\7\23\2\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0674\3\2\2\2"+
		"\u0673\u0675\5\u00ceh\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675"+
		"\u0680\3\2\2\2\u0676\u0678\5\u00ccg\2\u0677\u0679\5\u00f4{\2\u0678\u0677"+
		"\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\5\60\31\2"+
		"\u067b\u067d\7\23\2\2\u067c\u067e\5\u00ceh\2\u067d\u067c\3\2\2\2\u067d"+
		"\u067e\3\2\2\2\u067e\u0680\3\2\2\2\u067f\u066c\3\2\2\2\u067f\u0676\3\2"+
		"\2\2\u0680\u00c9\3\2\2\2\u0681\u0683\5\u00ccg\2\u0682\u0684\5\u00f4{\2"+
		"\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687"+
		"\7\23\2\2\u0686\u0688\5\u00ceh\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2"+
		"\2\u0688\u0689\3\2\2\2\u0689\u068a\7\u0092\2\2\u068a\u00cb\3\2\2\2\u068b"+
		"\u0691\7\63\2\2\u068c\u068d\7\63\2\2\u068d\u0691\7\'\2\2\u068e\u068f\7"+
		"\63\2\2\u068f\u0691\7T\2\2\u0690\u068b\3\2\2\2\u0690\u068c\3\2\2\2\u0690"+
		"\u068e\3\2\2\2\u0691\u00cd\3\2\2\2\u0692\u0693\7\u0090\2\2\u0693\u0694"+
		"\5\u00b8]\2\u0694\u00cf\3\2\2\2\u0695\u0696\bi\1\2\u0696\u0697\5\u00d2"+
		"j\2\u0697\u069d\3\2\2\2\u0698\u0699\f\3\2\2\u0699\u069a\7\u008c\2\2\u069a"+
		"\u069c\5\u00d2j\2\u069b\u0698\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b"+
		"\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u00d1\3\2\2\2\u069f\u069d\3\2\2\2\u06a0"+
		"\u06a6\5\u00d4k\2\u06a1\u06a2\5\u00d4k\2\u06a2\u06a3\7w\2\2\u06a3\u06a4"+
		"\5~@\2\u06a4\u06a6\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a5\u06a1\3\2\2\2\u06a6"+
		"\u00d3\3\2\2\2\u06a7\u06a8\7\23\2\2\u06a8\u00d5\3\2\2\2\u06a9\u06ac\5"+
		"\u00d8m\2\u06aa\u06ac\5\u00e6t\2\u06ab\u06a9\3\2\2\2\u06ab\u06aa\3\2\2"+
		"\2\u06ac\u00d7\3\2\2\2\u06ad\u06ae\7\23\2\2\u06ae\u00d9\3\2\2\2\u06af"+
		"\u06b2\5\u00dco\2\u06b0\u06b2\5\u00e2r\2\u06b1\u06af\3\2\2\2\u06b1\u06b0"+
		"\3\2\2\2\u06b2\u00db\3\2\2\2\u06b3\u06b6\5\u00dep\2\u06b4\u06b6\5\u00e0"+
		"q\2\u06b5\u06b3\3\2\2\2\u06b5\u06b4\3\2\2\2\u06b6\u00dd\3\2\2\2\u06b7"+
		"\u06b9\7>\2\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2"+
		"\2\2\u06ba\u06bb\7B\2\2\u06bb\u06bc\7\23\2\2\u06bc\u06bd\7k\2\2\u06bd"+
		"\u06be\5\u00e4s\2\u06be\u06bf\7l\2\2\u06bf\u00df\3\2\2\2\u06c0\u06c2\7"+
		">\2\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3"+
		"\u06c4\7B\2\2\u06c4\u06c5\5\u00d8m\2\u06c5\u06c6\7k\2\2\u06c6\u06c7\5"+
		"\u00e4s\2\u06c7\u06c8\7l\2\2\u06c8\u00e1\3\2\2\2\u06c9\u06cb\7>\2\2\u06ca"+
		"\u06c9\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cd\7B"+
		"\2\2\u06cd\u06ce\7k\2\2\u06ce\u06cf\5\u00e4s\2\u06cf\u06d0\7l\2\2\u06d0"+
		"\u00e3\3\2\2\2\u06d1\u06d3\5\u009aN\2\u06d2\u06d1\3\2\2\2\u06d2\u06d3"+
		"\3\2\2\2\u06d3\u00e5\3\2\2\2\u06d4\u06d5\7\23\2\2\u06d5\u00e7\3\2\2\2"+
		"\u06d6\u06d7\7B\2\2\u06d7\u06d8\7\23\2\2\u06d8\u06d9\7w\2\2\u06d9\u06da"+
		"\5\u00eav\2\u06da\u06db\7\u0092\2\2\u06db\u00e9\3\2\2\2\u06dc\u06de\5"+
		"\60\31\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df"+
		"\u06e0\5\u00d6l\2\u06e0\u00eb\3\2\2\2\u06e1\u06e3\7a\2\2\u06e2\u06e4\7"+
		"^\2\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5"+
		"\u06e6\5\60\31\2\u06e6\u06e7\5,\27\2\u06e7\u06e8\7\u0092\2\2\u06e8\u06ef"+
		"\3\2\2\2\u06e9\u06ea\7a\2\2\u06ea\u06eb\7\u0091\2\2\u06eb\u06ec\5,\27"+
		"\2\u06ec\u06ed\7\u0092\2\2\u06ed\u06ef\3\2\2\2\u06ee\u06e1\3\2\2\2\u06ee"+
		"\u06e9\3\2\2\2\u06ef\u00ed\3\2\2\2\u06f0\u06f2\5\u00f4{\2\u06f1\u06f0"+
		"\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\7a\2\2\u06f4"+
		"\u06f6\7B\2\2\u06f5\u06f7\5\60\31\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3"+
		"\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\5\u00d6l\2\u06f9\u06fa\7\u0092"+
		"\2\2\u06fa\u00ef\3\2\2\2\u06fb\u06fc\7\36\2\2\u06fc\u06fd\7g\2\2\u06fd"+
		"\u06fe\7\u009e\2\2\u06fe\u06ff\7h\2\2\u06ff\u0700\7\u0092\2\2\u0700\u00f1"+
		"\3\2\2\2\u0701\u0702\7\66\2\2\u0702\u0703\7\u009e\2\2\u0703\u0705\7k\2"+
		"\2\u0704\u0706\5\u009aN\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0707\3\2\2\2\u0707\u070c\7l\2\2\u0708\u0709\7\66\2\2\u0709\u070a\7\u009e"+
		"\2\2\u070a\u070c\5\u009cO\2\u070b\u0701\3\2\2\2\u070b\u0708\3\2\2\2\u070c"+
		"\u00f3\3\2\2\2\u070d\u070e\b{\1\2\u070e\u070f\5\u00f6|\2\u070f\u0714\3"+
		"\2\2\2\u0710\u0711\f\3\2\2\u0711\u0713\5\u00f6|\2\u0712\u0710\3\2\2\2"+
		"\u0713\u0716\3\2\2\2\u0714\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u00f5"+
		"\3\2\2\2\u0716\u0714\3\2\2\2\u0717\u0718\7i\2\2\u0718\u0719\7i\2\2\u0719"+
		"\u071a\5\u00fa~\2\u071a\u071b\7j\2\2\u071b\u071c\7j\2\2\u071c\u071f\3"+
		"\2\2\2\u071d\u071f\5\u00f8}\2\u071e\u0717\3\2\2\2\u071e\u071d\3\2\2\2"+
		"\u071f\u00f7\3\2\2\2\u0720\u0721\7\34\2\2\u0721\u0722\7g\2\2\u0722\u0724"+
		"\5\u0122\u0092\2\u0723\u0725\7\u0095\2\2\u0724\u0723\3\2\2\2\u0724\u0725"+
		"\3\2\2\2\u0725\u0726\3\2\2\2\u0726\u0727\7h\2\2\u0727\u0731\3\2\2\2\u0728"+
		"\u0729\7\34\2\2\u0729\u072a\7g\2\2\u072a\u072c\5~@\2\u072b\u072d\7\u0095"+
		"\2\2\u072c\u072b\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072e\3\2\2\2\u072e"+
		"\u072f\7h\2\2\u072f\u0731\3\2\2\2\u0730\u0720\3\2\2\2\u0730\u0728\3\2"+
		"\2\2\u0731\u00f9\3\2\2\2\u0732\u0734\b~\1\2\u0733\u0735\5\u00fc\177\2"+
		"\u0734\u0733\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u073a\3\2\2\2\u0736\u0737"+
		"\5\u00fc\177\2\u0737\u0738\7\u0095\2\2\u0738\u073a\3\2\2\2\u0739\u0732"+
		"\3\2\2\2\u0739\u0736\3\2\2\2\u073a\u0747\3\2\2\2\u073b\u073c\f\5\2\2\u073c"+
		"\u073e\7\u008c\2\2\u073d\u073f\5\u00fc\177\2\u073e\u073d\3\2\2\2\u073e"+
		"\u073f\3\2\2\2\u073f\u0746\3\2\2\2\u0740\u0741\f\3\2\2\u0741\u0742\7\u008c"+
		"\2\2\u0742\u0743\5\u00fc\177\2\u0743\u0744\7\u0095\2\2\u0744\u0746\3\2"+
		"\2\2\u0745\u073b\3\2\2\2\u0745\u0740\3\2\2\2\u0746\u0749\3\2\2\2\u0747"+
		"\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u00fb\3\2\2\2\u0749\u0747\3\2"+
		"\2\2\u074a\u074c\5\u00fe\u0080\2\u074b\u074d\5\u0104\u0083\2\u074c\u074b"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u00fd\3\2\2\2\u074e\u0751\7\23\2\2"+
		"\u074f\u0751\5\u0100\u0081\2\u0750\u074e\3\2\2\2\u0750\u074f\3\2\2\2\u0751"+
		"\u00ff\3\2\2\2\u0752\u0753\5\u0102\u0082\2\u0753\u0754\7\u0091\2\2\u0754"+
		"\u0755\7\23\2\2\u0755\u0101\3\2\2\2\u0756\u0757\7\23\2\2\u0757\u0103\3"+
		"\2\2\2\u0758\u0759\7g\2\2\u0759\u075a\5\u0106\u0084\2\u075a\u075b\7h\2"+
		"\2\u075b\u0105\3\2\2\2\u075c\u075e\b\u0084\1\2\u075d\u075f\5\u0108\u0085"+
		"\2\u075e\u075d\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0764\3\2\2\2\u0760\u0761"+
		"\f\3\2\2\u0761\u0763\5\u0108\u0085\2\u0762\u0760\3\2\2\2\u0763\u0766\3"+
		"\2\2\2\u0764\u0762\3\2\2\2\u0764\u0765\3\2\2\2\u0765\u0107\3\2\2\2\u0766"+
		"\u0764\3\2\2\2\u0767\u0768\7g\2\2\u0768\u0769\5\u0106\u0084\2\u0769\u076a"+
		"\7h\2\2\u076a\u0774\3\2\2\2\u076b\u076c\7i\2\2\u076c\u076d\5\u0106\u0084"+
		"\2\u076d\u076e\7j\2\2\u076e\u0774\3\2\2\2\u076f\u0770\7k\2\2\u0770\u0771"+
		"\5\u0106\u0084\2\u0771\u0772\7l\2\2\u0772\u0774\3\2\2\2\u0773\u0767\3"+
		"\2\2\2\u0773\u076b\3\2\2\2\u0773\u076f\3\2\2\2\u0774\u0109\3\2\2\2\u0775"+
		"\u0776\b\u0086\1\2\u0776\u0777\5\u010c\u0087\2\u0777\u077d\3\2\2\2\u0778"+
		"\u0779\f\3\2\2\u0779\u077a\7\u008c\2\2\u077a\u077c\5\u010c\u0087\2\u077b"+
		"\u0778\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2"+
		"\2\2\u077e\u010b\3\2\2\2\u077f\u077d\3\2\2\2\u0780\u0782\5\u010e\u0088"+
		"\2\u0781\u0783\5\u0138\u009d\2\u0782\u0781\3\2\2\2\u0782\u0783\3\2\2\2"+
		"\u0783\u010d\3\2\2\2\u0784\u078a\5\u0110\u0089\2\u0785\u0786\5\u0112\u008a"+
		"\2\u0786\u0787\5\u0114\u008b\2\u0787\u0788\5\u0116\u008c\2\u0788\u078a"+
		"\3\2\2\2\u0789\u0784\3\2\2\2\u0789\u0785\3\2\2\2\u078a\u010f\3\2\2\2\u078b"+
		"\u0790\5\u0112\u008a\2\u078c\u078d\5\u0118\u008d\2\u078d\u078e\5\u0110"+
		"\u0089\2\u078e\u0790\3\2\2\2\u078f\u078b\3\2\2\2\u078f\u078c\3\2\2\2\u0790"+
		"\u0111\3\2\2\2\u0791\u0792\b\u008a\1\2\u0792\u0794\5\u0120\u0091\2\u0793"+
		"\u0795\5\u00f4{\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u079b"+
		"\3\2\2\2\u0796\u0797\7g\2\2\u0797\u0798\5\u0110\u0089\2\u0798\u0799\7"+
		"h\2\2\u0799\u079b\3\2\2\2\u079a\u0791\3\2\2\2\u079a\u0796\3\2\2\2\u079b"+
		"\u07a9\3\2\2\2\u079c\u079d\f\5\2\2\u079d\u07a8\5\u0114\u008b\2\u079e\u079f"+
		"\f\4\2\2\u079f\u07a1\7i\2\2\u07a0\u07a2\5~@\2\u07a1\u07a0\3\2\2\2\u07a1"+
		"\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a5\7j\2\2\u07a4\u07a6\5\u00f4"+
		"{\2\u07a5\u07a4\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7"+
		"\u079c\3\2\2\2\u07a7\u079e\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9\u07a7\3\2"+
		"\2\2\u07a9\u07aa\3\2\2\2\u07aa\u0113\3\2\2\2\u07ab\u07a9\3\2\2\2\u07ac"+
		"\u07ad\7g\2\2\u07ad\u07ae\5\u012e\u0098\2\u07ae\u07b0\7h\2\2\u07af\u07b1"+
		"\5\u011a\u008e\2\u07b0\u07af\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\3"+
		"\2\2\2\u07b2\u07b4\5\u011e\u0090\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2"+
		"\2\2\u07b4\u07b6\3\2\2\2\u07b5\u07b7\5\u019e\u00d0\2\u07b6\u07b5\3\2\2"+
		"\2\u07b6\u07b7\3\2\2\2\u07b7\u07b9\3\2\2\2\u07b8\u07ba\5\u00f4{\2\u07b9"+
		"\u07b8\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u0115\3\2\2\2\u07bb\u07bc\7\u008e"+
		"\2\2\u07bc\u07be\5\u00ba^\2\u07bd\u07bf\5\u0124\u0093\2\u07be\u07bd\3"+
		"\2\2\2\u07be\u07bf\3\2\2\2\u07bf\u0117\3\2\2\2\u07c0\u07c2\7o\2\2\u07c1"+
		"\u07c3\5\u00f4{\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5"+
		"\3\2\2\2\u07c4\u07c6\5\u011a\u008e\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3"+
		"\2\2\2\u07c6\u07d8\3\2\2\2\u07c7\u07c9\7s\2\2\u07c8\u07ca\5\u00f4{\2\u07c9"+
		"\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07d8\3\2\2\2\u07cb\u07cd\7\u0088"+
		"\2\2\u07cc\u07ce\5\u00f4{\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce"+
		"\u07d8\3\2\2\2\u07cf\u07d0\5\60\31\2\u07d0\u07d2\7o\2\2\u07d1\u07d3\5"+
		"\u00f4{\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2\2\u07d3\u07d5\3\2\2\2"+
		"\u07d4\u07d6\5\u011a\u008e\2\u07d5\u07d4\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6"+
		"\u07d8\3\2\2\2\u07d7\u07c0\3\2\2\2\u07d7\u07c7\3\2\2\2\u07d7\u07cb\3\2"+
		"\2\2\u07d7\u07cf\3\2\2\2\u07d8\u0119\3\2\2\2\u07d9\u07db\5\u011c\u008f"+
		"\2\u07da\u07dc\5\u011a\u008e\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2"+
		"\u07dc\u011b\3\2\2\2\u07dd\u07de\t\7\2\2\u07de\u011d\3\2\2\2\u07df\u07e0"+
		"\t\b\2\2\u07e0\u011f\3\2\2\2\u07e1\u07e3\7\u0095\2\2\u07e2\u07e1\3\2\2"+
		"\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e5\5*\26\2\u07e5\u0121"+
		"\3\2\2\2\u07e6\u07e8\5\u00b8]\2\u07e7\u07e9\5\u0124\u0093\2\u07e8\u07e7"+
		"\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u0123\3\2\2\2\u07ea\u07f3\5\u0126\u0094"+
		"\2\u07eb\u07ed\5\u0128\u0095\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3\2\2\2"+
		"\u07ed\u07ee\3\2\2\2\u07ee\u07ef\5\u0114\u008b\2\u07ef\u07f0\5\u0116\u008c"+
		"\2\u07f0\u07f3\3\2\2\2\u07f1\u07f3\5\u012a\u0096\2\u07f2\u07ea\3\2\2\2"+
		"\u07f2\u07ec\3\2\2\2\u07f2\u07f1\3\2\2\2\u07f3\u0125\3\2\2\2\u07f4\u07fa"+
		"\5\u0128\u0095\2\u07f5\u07f7\5\u0118\u008d\2\u07f6\u07f8\5\u0126\u0094"+
		"\2\u07f7\u07f6\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fa\3\2\2\2\u07f9\u07f4"+
		"\3\2\2\2\u07f9\u07f5\3\2\2\2\u07fa\u0127\3\2\2\2\u07fb\u07fc\b\u0095\1"+
		"\2\u07fc\u080a\5\u0114\u008b\2\u07fd\u07ff\7i\2\2\u07fe\u0800\5~@\2\u07ff"+
		"\u07fe\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0803\7j"+
		"\2\2\u0802\u0804\5\u00f4{\2\u0803\u0802\3\2\2\2\u0803\u0804\3\2\2\2\u0804"+
		"\u080a\3\2\2\2\u0805\u0806\7g\2\2\u0806\u0807\5\u0126\u0094\2\u0807\u0808"+
		"\7h\2\2\u0808\u080a\3\2\2\2\u0809\u07fb\3\2\2\2\u0809\u07fd\3\2\2\2\u0809"+
		"\u0805\3\2\2\2\u080a\u0818\3\2\2\2\u080b\u080c\f\7\2\2\u080c\u0817\5\u0114"+
		"\u008b\2\u080d\u080e\f\5\2\2\u080e\u0810\7i\2\2\u080f\u0811\5~@\2\u0810"+
		"\u080f\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0814\7j"+
		"\2\2\u0813\u0815\5\u00f4{\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815"+
		"\u0817\3\2\2\2\u0816\u080b\3\2\2\2\u0816\u080d\3\2\2\2\u0817\u081a\3\2"+
		"\2\2\u0818\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u0129\3\2\2\2\u081a"+
		"\u0818\3\2\2\2\u081b\u0820\5\u012c\u0097\2\u081c\u081d\5\u0118\u008d\2"+
		"\u081d\u081e\5\u012a\u0096\2\u081e\u0820\3\2\2\2\u081f\u081b\3\2\2\2\u081f"+
		"\u081c\3\2\2\2\u0820\u012b\3\2\2\2\u0821\u0822\b\u0097\1\2\u0822\u0823"+
		"\7\u0095\2\2\u0823\u0831\3\2\2\2\u0824\u0825\f\5\2\2\u0825\u0830\5\u0114"+
		"\u008b\2\u0826\u0827\f\4\2\2\u0827\u0829\7i\2\2\u0828\u082a\5~@\2\u0829"+
		"\u0828\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082d\7j"+
		"\2\2\u082c\u082e\5\u00f4{\2\u082d\u082c\3\2\2\2\u082d\u082e\3\2\2\2\u082e"+
		"\u0830\3\2\2\2\u082f\u0824\3\2\2\2\u082f\u0826\3\2\2\2\u0830\u0833\3\2"+
		"\2\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u012d\3\2\2\2\u0833"+
		"\u0831\3\2\2\2\u0834\u0836\5\u0130\u0099\2\u0835\u0834\3\2\2\2\u0835\u0836"+
		"\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0839\7\u0095\2\2\u0838\u0837\3\2\2"+
		"\2\u0838\u0839\3\2\2\2\u0839\u083f\3\2\2\2\u083a\u083b\5\u0130\u0099\2"+
		"\u083b\u083c\7\u008c\2\2\u083c\u083d\7\u0095\2\2\u083d\u083f\3\2\2\2\u083e"+
		"\u0835\3\2\2\2\u083e\u083a\3\2\2\2\u083f\u012f\3\2\2\2\u0840\u0841\b\u0099"+
		"\1\2\u0841\u0842\5\u0132\u009a\2\u0842\u0848\3\2\2\2\u0843\u0844\f\3\2"+
		"\2\u0844\u0845\7\u008c\2\2\u0845\u0847\5\u0132\u009a\2\u0846\u0843\3\2"+
		"\2\2\u0847\u084a\3\2\2\2\u0848\u0846\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u0131\3\2\2\2\u084a\u0848\3\2\2\2\u084b\u084d\5\u00f4{\2\u084c\u084b"+
		"\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\5\u00acW"+
		"\2\u084f\u0850\5\u010e\u0088\2\u0850\u086b\3\2\2\2\u0851\u0853\5\u00f4"+
		"{\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854\3\2\2\2\u0854"+
		"\u0855\5\u00acW\2\u0855\u0856\5\u010e\u0088\2\u0856\u0857\7w\2\2\u0857"+
		"\u0858\5\u013c\u009f\2\u0858\u086b\3\2\2\2\u0859\u085b\5\u00f4{\2\u085a"+
		"\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\5\u00ac"+
		"W\2\u085d\u085f\5\u0124\u0093\2\u085e\u085d\3\2\2\2\u085e\u085f\3\2\2"+
		"\2\u085f\u086b\3\2\2\2\u0860\u0862\5\u00f4{\2\u0861\u0860\3\2\2\2\u0861"+
		"\u0862\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0865\5\u00acW\2\u0864\u0866"+
		"\5\u0124\u0093\2\u0865\u0864\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\3"+
		"\2\2\2\u0867\u0868\7w\2\2\u0868\u0869\5\u013c\u009f\2\u0869\u086b\3\2"+
		"\2\2\u086a\u084c\3\2\2\2\u086a\u0852\3\2\2\2\u086a\u085a\3\2\2\2\u086a"+
		"\u0861\3\2\2\2\u086b\u0133\3\2\2\2\u086c\u086e\5\u00f4{\2\u086d\u086c"+
		"\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u0870\3\2\2\2\u086f\u0871\5\u00acW"+
		"\2\u0870\u086f\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0874"+
		"\5\u010e\u0088\2\u0873\u0875\5\u0156\u00ac\2\u0874\u0873\3\2\2\2\u0874"+
		"\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\5\u0136\u009c\2\u0877\u0135"+
		"\3\2\2\2\u0878\u087a\5\u016e\u00b8\2\u0879\u0878\3\2\2\2\u0879\u087a\3"+
		"\2\2\2\u087a\u087b\3\2\2\2\u087b\u0884\5\u0086D\2\u087c\u0884\5\u0194"+
		"\u00cb\2\u087d\u087e\7w\2\2\u087e\u087f\7-\2\2\u087f\u0884\7\u0092\2\2"+
		"\u0880\u0881\7w\2\2\u0881\u0882\7.\2\2\u0882\u0884\7\u0092\2\2\u0883\u0879"+
		"\3\2\2\2\u0883\u087c\3\2\2\2\u0883\u087d\3\2\2\2\u0883\u0880\3\2\2\2\u0884"+
		"\u0137\3\2\2\2\u0885\u088b\5\u013a\u009e\2\u0886\u0887\7g\2\2\u0887\u0888"+
		"\5F$\2\u0888\u0889\7h\2\2\u0889\u088b\3\2\2\2\u088a\u0885\3\2\2\2\u088a"+
		"\u0886\3\2\2\2\u088b\u0139\3\2\2\2\u088c\u088d\7w\2\2\u088d\u0890\5\u013c"+
		"\u009f\2\u088e\u0890\5\u0140\u00a1\2\u088f\u088c\3\2\2\2\u088f\u088e\3"+
		"\2\2\2\u0890\u013b\3\2\2\2\u0891\u0894\5x=\2\u0892\u0894\5\u0140\u00a1"+
		"\2\u0893\u0891\3\2\2\2\u0893\u0892\3\2\2\2\u0894\u013d\3\2\2\2\u0895\u0896"+
		"\b\u00a0\1\2\u0896\u0898\5\u013c\u009f\2\u0897\u0899\7\u0095\2\2\u0898"+
		"\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u08a2\3\2\2\2\u089a\u089b\f\3"+
		"\2\2\u089b\u089c\7\u008c\2\2\u089c\u089e\5\u013c\u009f\2\u089d\u089f\7"+
		"\u0095\2\2\u089e\u089d\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2\2\2"+
		"\u08a0\u089a\3\2\2\2\u08a1\u08a4\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a3"+
		"\3\2\2\2\u08a3\u013f\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a5\u08a6\7k\2\2\u08a6"+
		"\u08a8\5\u013e\u00a0\2\u08a7\u08a9\7\u008c\2\2\u08a8\u08a7\3\2\2\2\u08a8"+
		"\u08a9\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\7l\2\2\u08ab\u08af\3\2"+
		"\2\2\u08ac\u08ad\7k\2\2\u08ad\u08af\7l\2\2\u08ae\u08a5\3\2\2\2\u08ae\u08ac"+
		"\3\2\2\2\u08af\u0141\3\2\2\2\u08b0\u08b3\7\23\2\2\u08b1\u08b3\5\u0182"+
		"\u00c2\2\u08b2\u08b0\3\2\2\2\u08b2\u08b1\3\2\2\2\u08b3\u0143\3\2\2\2\u08b4"+
		"\u08b5\5\u0146\u00a4\2\u08b5\u08b7\7k\2\2\u08b6\u08b8\5\u014e\u00a8\2"+
		"\u08b7\u08b6\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08ba"+
		"\7l\2\2\u08ba\u0145\3\2\2\2\u08bb\u08bd\5\u014c\u00a7\2\u08bc\u08be\5"+
		"\u00f4{\2\u08bd\u08bc\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08bf\3\2\2\2"+
		"\u08bf\u08c1\5\u0148\u00a5\2\u08c0\u08c2\5\u014a\u00a6\2\u08c1\u08c0\3"+
		"\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\3\2\2\2\u08c3\u08c5\5\u015c\u00af"+
		"\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08ce\3\2\2\2\u08c6\u08c8"+
		"\5\u014c\u00a7\2\u08c7\u08c9\5\u00f4{\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9"+
		"\3\2\2\2\u08c9\u08cb\3\2\2\2\u08ca\u08cc\5\u015c\u00af\2\u08cb\u08ca\3"+
		"\2\2\2\u08cb\u08cc\3\2\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08bb\3\2\2\2\u08cd"+
		"\u08c6\3\2\2\2\u08ce\u0147\3\2\2\2\u08cf\u08d1\5\60\31\2\u08d0\u08cf\3"+
		"\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\5\u0142\u00a2"+
		"\2\u08d3\u0149\3\2\2\2\u08d4\u08d5\78\2\2\u08d5\u014b\3\2\2\2\u08d6\u08d7"+
		"\t\t\2\2\u08d7\u014d\3\2\2\2\u08d8\u08da\5\u0150\u00a9\2\u08d9\u08db\5"+
		"\u014e\u00a8\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08e2\3\2"+
		"\2\2\u08dc\u08dd\5\u0166\u00b4\2\u08dd\u08df\7\u0090\2\2\u08de\u08e0\5"+
		"\u014e\u00a8\2\u08df\u08de\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e2\3\2"+
		"\2\2\u08e1\u08d8\3\2\2\2\u08e1\u08dc\3\2\2\2\u08e2\u014f\3\2\2\2\u08e3"+
		"\u08e5\5\u00f4{\2\u08e4\u08e3\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e7"+
		"\3\2\2\2\u08e6\u08e8\5\u00acW\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2"+
		"\2\u08e8\u08ea\3\2\2\2\u08e9\u08eb\5\u0152\u00aa\2\u08ea\u08e9\3\2\2\2"+
		"\u08ea\u08eb\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08f4\7\u0092\2\2\u08ed"+
		"\u08f4\5\u0134\u009b\2\u08ee\u08f4\5\u00ecw\2\u08ef\u08f4\5\u00a4S\2\u08f0"+
		"\u08f4\5\u017a\u00be\2\u08f1\u08f4\5\u00a0Q\2\u08f2\u08f4\5\u00a6T\2\u08f3"+
		"\u08e4\3\2\2\2\u08f3\u08ed\3\2\2\2\u08f3\u08ee\3\2\2\2\u08f3\u08ef\3\2"+
		"\2\2\u08f3\u08f0\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f3\u08f2\3\2\2\2\u08f4"+
		"\u0151\3\2\2\2\u08f5\u08f6\b\u00aa\1\2\u08f6\u08f7\5\u0154\u00ab\2\u08f7"+
		"\u08fd\3\2\2\2\u08f8\u08f9\f\3\2\2\u08f9\u08fa\7\u008c\2\2\u08fa\u08fc"+
		"\5\u0154\u00ab\2\u08fb\u08f8\3\2\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3"+
		"\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0153\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900"+
		"\u0902\5\u010e\u0088\2\u0901\u0903\5\u0156\u00ac\2\u0902\u0901\3\2\2\2"+
		"\u0902\u0903\3\2\2\2\u0903\u0905\3\2\2\2\u0904\u0906\5\u015a\u00ae\2\u0905"+
		"\u0904\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0914\3\2\2\2\u0907\u0909\5\u010e"+
		"\u0088\2\u0908\u090a\5\u013a\u009e\2\u0909\u0908\3\2\2\2\u0909\u090a\3"+
		"\2\2\2\u090a\u0914\3\2\2\2\u090b\u090d\7\23\2\2\u090c\u090b\3\2\2\2\u090c"+
		"\u090d\3\2\2\2\u090d\u090f\3\2\2\2\u090e\u0910\5\u00f4{\2\u090f\u090e"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\7\u0090\2"+
		"\2\u0912\u0914\5~@\2\u0913\u0900\3\2\2\2\u0913\u0907\3\2\2\2\u0913\u090c"+
		"\3\2\2\2\u0914\u0155\3\2\2\2\u0915\u0916\b\u00ac\1\2\u0916\u0917\5\u0158"+
		"\u00ad\2\u0917\u091c\3\2\2\2\u0918\u0919\f\3\2\2\u0919\u091b\5\u0158\u00ad"+
		"\2\u091a\u0918\3\2\2\2\u091b\u091e\3\2\2\2\u091c\u091a\3\2\2\2\u091c\u091d"+
		"\3\2\2\2\u091d\u0157\3\2\2\2\u091e\u091c\3\2\2\2\u091f\u0920\t\n\2\2\u0920"+
		"\u0159\3\2\2\2\u0921\u0922\7w\2\2\u0922\u0923\7\u0096\2\2\u0923\u0924"+
		"\b\u00ae\1\2\u0924\u015b\3\2\2\2\u0925\u0926\7\u0090\2\2\u0926\u0927\5"+
		"\u015e\u00b0\2\u0927\u015d\3\2\2\2\u0928\u0929\b\u00b0\1\2\u0929\u092b"+
		"\5\u0160\u00b1\2\u092a\u092c\7\u0095\2\2\u092b\u092a\3\2\2\2\u092b\u092c"+
		"\3\2\2\2\u092c\u0935\3\2\2\2\u092d\u092e\f\3\2\2\u092e\u092f\7\u008c\2"+
		"\2\u092f\u0931\5\u0160\u00b1\2\u0930\u0932\7\u0095\2\2\u0931\u0930\3\2"+
		"\2\2\u0931\u0932\3\2\2\2\u0932\u0934\3\2\2\2\u0933\u092d\3\2\2\2\u0934"+
		"\u0937\3\2\2\2\u0935\u0933\3\2\2\2\u0935\u0936\3\2\2\2\u0936\u015f\3\2"+
		"\2\2\u0937\u0935\3\2\2\2\u0938\u093a\5\u00f4{\2\u0939\u0938\3\2\2\2\u0939"+
		"\u093a\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u094e\5\u0164\u00b3\2\u093c\u093e"+
		"\5\u00f4{\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3\2\2"+
		"\2\u093f\u0941\7b\2\2\u0940\u0942\5\u0166\u00b4\2\u0941\u0940\3\2\2\2"+
		"\u0941\u0942\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u094e\5\u0164\u00b3\2\u0944"+
		"\u0946\5\u00f4{\2\u0945\u0944\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0947"+
		"\3\2\2\2\u0947\u0949\5\u0166\u00b4\2\u0948\u094a\7b\2\2\u0949\u0948\3"+
		"\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\5\u0164\u00b3"+
		"\2\u094c\u094e\3\2\2\2\u094d\u0939\3\2\2\2\u094d\u093d\3\2\2\2\u094d\u0945"+
		"\3\2\2\2\u094e\u0161\3\2\2\2\u094f\u0951\5\60\31\2\u0950\u094f\3\2\2\2"+
		"\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0955\5\u0142\u00a2\2\u0953"+
		"\u0955\5\u00c0a\2\u0954\u0950\3\2\2\2\u0954\u0953\3\2\2\2\u0955\u0163"+
		"\3\2\2\2\u0956\u0957\5\u0162\u00b2\2\u0957\u0165\3\2\2\2\u0958\u0959\t"+
		"\13\2\2\u0959\u0167\3\2\2\2\u095a\u095b\7F\2\2\u095b\u095c\5\u016a\u00b6"+
		"\2\u095c\u0169\3\2\2\2\u095d\u095f\5\u00b8]\2\u095e\u0960\5\u016c\u00b7"+
		"\2\u095f\u095e\3\2\2\2\u095f\u0960\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u0960\u016b\3\2\2\2\u0961\u0963\5\u0118\u008d\2\u0962\u0964\5\u016c\u00b7"+
		"\2\u0963\u0962\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u016d\3\2\2\2\u0965\u0966"+
		"\7\u0090\2\2\u0966\u0967\5\u0170\u00b9\2\u0967\u016f\3\2\2\2\u0968\u096a"+
		"\5\u0172\u00ba\2\u0969\u096b\7\u0095\2\2\u096a\u0969\3\2\2\2\u096a\u096b"+
		"\3\2\2\2\u096b\u0974\3\2\2\2\u096c\u096e\5\u0172\u00ba\2\u096d\u096f\7"+
		"\u0095\2\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0970\3\2\2\2"+
		"\u0970\u0971\7\u008c\2\2\u0971\u0972\5\u0170\u00b9\2\u0972\u0974\3\2\2"+
		"\2\u0973\u0968\3\2\2\2\u0973\u096c\3\2\2\2\u0974\u0171\3\2\2\2\u0975\u0976"+
		"\5\u0174\u00bb\2\u0976\u0978\7g\2\2\u0977\u0979\5F$\2\u0978\u0977\3\2"+
		"\2\2\u0978\u0979\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097b\7h\2\2\u097b"+
		"\u0980\3\2\2\2\u097c\u097d\5\u0174\u00bb\2\u097d\u097e\5\u0140\u00a1\2"+
		"\u097e\u0980\3\2\2\2\u097f\u0975\3\2\2\2\u097f\u097c\3\2\2\2\u0980\u0173"+
		"\3\2\2\2\u0981\u0984\5\u0162\u00b2\2\u0982\u0984\7\23\2\2\u0983\u0981"+
		"\3\2\2\2\u0983\u0982\3\2\2\2\u0984\u0175\3\2\2\2\u0985\u0986\7F\2\2\u0986"+
		"\u0987\5\u01aa\u00d6\2\u0987\u0177\3\2\2\2\u0988\u0989\7F\2\2\u0989\u098a"+
		"\7\u009e\2\2\u098a\u098e\7\23\2\2\u098b\u098c\7F\2\2\u098c\u098e\7\u00a1"+
		"\2\2\u098d\u0988\3\2\2\2\u098d\u098b\3\2\2\2\u098e\u0179\3\2\2\2\u098f"+
		"\u0990\7V\2\2\u0990\u0991\7x\2\2\u0991\u0992\5\u017c\u00bf\2\u0992\u0993"+
		"\7y\2\2\u0993\u0994\5\u009cO\2\u0994\u017b\3\2\2\2\u0995\u0996\b\u00bf"+
		"\1\2\u0996\u0997\5\u017e\u00c0\2\u0997\u099d\3\2\2\2\u0998\u0999\f\3\2"+
		"\2\u0999\u099a\7\u008c\2\2\u099a\u099c\5\u017e\u00c0\2\u099b\u0998\3\2"+
		"\2\2\u099c\u099f\3\2\2\2\u099d\u099b\3\2\2\2\u099d\u099e\3\2\2\2\u099e"+
		"\u017d\3\2\2\2\u099f\u099d\3\2\2\2\u09a0\u09a3\5\u0180\u00c1\2\u09a1\u09a3"+
		"\5\u0132\u009a\2\u09a2\u09a0\3\2\2\2\u09a2\u09a1\3\2\2\2\u09a3\u017f\3"+
		"\2\2\2\u09a4\u09a6\7\'\2\2\u09a5\u09a7\7\u0095\2\2\u09a6\u09a5\3\2\2\2"+
		"\u09a6\u09a7\3\2\2\2\u09a7\u09a9\3\2\2\2\u09a8\u09aa\7\23\2\2\u09a9\u09a8"+
		"\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09d5\3\2\2\2\u09ab\u09ad\7\'\2\2\u09ac"+
		"\u09ae\7\23\2\2\u09ad\u09ac\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\3"+
		"\2\2\2\u09af\u09b0\7w\2\2\u09b0\u09d5\5\u0122\u0092\2\u09b1\u09b3\7^\2"+
		"\2\u09b2\u09b4\7\u0095\2\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4"+
		"\u09b6\3\2\2\2\u09b5\u09b7\7\23\2\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3"+
		"\2\2\2\u09b7\u09d5\3\2\2\2\u09b8\u09ba\7^\2\2\u09b9\u09bb\7\23\2\2\u09ba"+
		"\u09b9\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\7w"+
		"\2\2\u09bd\u09d5\5\u0122\u0092\2\u09be\u09bf\7V\2\2\u09bf\u09c0\7x\2\2"+
		"\u09c0\u09c1\5\u017c\u00bf\2\u09c1\u09c2\7y\2\2\u09c2\u09c4\7\'\2\2\u09c3"+
		"\u09c5\7\u0095\2\2\u09c4\u09c3\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c7"+
		"\3\2\2\2\u09c6\u09c8\7\23\2\2\u09c7\u09c6\3\2\2\2\u09c7\u09c8\3\2\2\2"+
		"\u09c8\u09d5\3\2\2\2\u09c9\u09ca\7V\2\2\u09ca\u09cb\7x\2\2\u09cb\u09cc"+
		"\5\u017c\u00bf\2\u09cc\u09cd\7y\2\2\u09cd\u09cf\7\'\2\2\u09ce\u09d0\7"+
		"\23\2\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1"+
		"\u09d2\7w\2\2\u09d2\u09d3\5*\26\2\u09d3\u09d5\3\2\2\2\u09d4\u09a4\3\2"+
		"\2\2\u09d4\u09ab\3\2\2\2\u09d4\u09b1\3\2\2\2\u09d4\u09b8\3\2\2\2\u09d4"+
		"\u09be\3\2\2\2\u09d4\u09c9\3\2\2\2\u09d5\u0181\3\2\2\2\u09d6\u09d7\5\u0186"+
		"\u00c4\2\u09d7\u09d9\7x\2\2\u09d8\u09da\5\u0188\u00c5\2\u09d9\u09d8\3"+
		"\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\7y\2\2\u09dc"+
		"\u0183\3\2\2\2\u09dd\u09ed\5\u0182\u00c2\2\u09de\u09df\5\u0176\u00bc\2"+
		"\u09df\u09e1\7x\2\2\u09e0\u09e2\5\u0188\u00c5\2\u09e1\u09e0\3\2\2\2\u09e1"+
		"\u09e2\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\7y\2\2\u09e4\u09ed\3\2"+
		"\2\2\u09e5\u09e6\5\u0178\u00bd\2\u09e6\u09e8\7x\2\2\u09e7\u09e9\5\u0188"+
		"\u00c5\2\u09e8\u09e7\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea"+
		"\u09eb\7y\2\2\u09eb\u09ed\3\2\2\2\u09ec\u09dd\3\2\2\2\u09ec\u09de\3\2"+
		"\2\2\u09ec\u09e5\3\2\2\2\u09ed\u0185\3\2\2\2\u09ee\u09ef\7\23\2\2\u09ef"+
		"\u0187\3\2\2\2\u09f0\u09f1\b\u00c5\1\2\u09f1\u09f3\5\u018a\u00c6\2\u09f2"+
		"\u09f4\7\u0095\2\2\u09f3\u09f2\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09fd"+
		"\3\2\2\2\u09f5\u09f6\f\3\2\2\u09f6\u09f7\7\u008c\2\2\u09f7\u09f9\5\u018a"+
		"\u00c6\2\u09f8\u09fa\7\u0095\2\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa\3\2\2"+
		"\2\u09fa\u09fc\3\2\2\2\u09fb\u09f5\3\2\2\2\u09fc\u09ff\3\2\2\2\u09fd\u09fb"+
		"\3\2\2\2\u09fd\u09fe\3\2\2\2\u09fe\u0189\3\2\2\2\u09ff\u09fd\3\2\2\2\u0a00"+
		"\u0a04\5~@\2\u0a01\u0a04\5\u0122\u0092\2\u0a02\u0a04\5*\26\2\u0a03\u0a00"+
		"\3\2\2\2\u0a03\u0a01\3\2\2\2\u0a03\u0a02\3\2\2\2\u0a04\u018b\3\2\2\2\u0a05"+
		"\u0a06\7^\2\2\u0a06\u0a07\5\60\31\2\u0a07\u0a08\7\23\2\2\u0a08\u0a11\3"+
		"\2\2\2\u0a09\u0a0a\7^\2\2\u0a0a\u0a0c\5\60\31\2\u0a0b\u0a0d\7V\2\2\u0a0c"+
		"\u0a0b\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a0f\5\u0182"+
		"\u00c2\2\u0a0f\u0a11\3\2\2\2\u0a10\u0a05\3\2\2\2\u0a10\u0a09\3\2\2\2\u0a11"+
		"\u018d\3\2\2\2\u0a12\u0a14\7\66\2\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3"+
		"\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\7V\2\2\u0a16\u0a17\5\u009cO\2\u0a17"+
		"\u018f\3\2\2\2\u0a18\u0a19\7V\2\2\u0a19\u0a1a\7x\2\2\u0a1a\u0a1b\7y\2"+
		"\2\u0a1b\u0a1c\5\u009cO\2\u0a1c\u0191\3\2\2\2\u0a1d\u0a1e\7[\2\2\u0a1e"+
		"\u0a1f\5\u0086D\2\u0a1f\u0a20\5\u0196\u00cc\2\u0a20\u0193\3\2\2\2\u0a21"+
		"\u0a23\7[\2\2\u0a22\u0a24\5\u016e\u00b8\2\u0a23\u0a22\3\2\2\2\u0a23\u0a24"+
		"\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0a26\5\u0086D\2\u0a26\u0a27\5\u0196"+
		"\u00cc\2\u0a27\u0195\3\2\2\2\u0a28\u0a2a\5\u0198\u00cd\2\u0a29\u0a2b\5"+
		"\u0196\u00cc\2\u0a2a\u0a29\3\2\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0197\3\2"+
		"\2\2\u0a2c\u0a2d\7#\2\2\u0a2d\u0a2e\7g\2\2\u0a2e\u0a2f\5\u019a\u00ce\2"+
		"\u0a2f\u0a30\7h\2\2\u0a30\u0a31\5\u0086D\2\u0a31\u0199\3\2\2\2\u0a32\u0a34"+
		"\5\u00f4{\2\u0a33\u0a32\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2"+
		"\2\u0a35\u0a36\5\u00b8]\2\u0a36\u0a37\5\u010e\u0088\2\u0a37\u0a41\3\2"+
		"\2\2\u0a38\u0a3a\5\u00f4{\2\u0a39\u0a38\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a"+
		"\u0a3b\3\2\2\2\u0a3b\u0a3d\5\u00b8]\2\u0a3c\u0a3e\5\u0124\u0093\2\u0a3d"+
		"\u0a3c\3\2\2\2\u0a3d\u0a3e\3\2\2\2\u0a3e\u0a41\3\2\2\2\u0a3f\u0a41\7\u0095"+
		"\2\2\u0a40\u0a33\3\2\2\2\u0a40\u0a39\3\2\2\2\u0a40\u0a3f\3\2\2\2\u0a41"+
		"\u019b\3\2\2\2\u0a42\u0a44\7Y\2\2\u0a43\u0a45\5x=\2\u0a44\u0a43\3\2\2"+
		"\2\u0a44\u0a45\3\2\2\2\u0a45\u019d\3\2\2\2\u0a46\u0a49\5\u01a0\u00d1\2"+
		"\u0a47\u0a49\5\u01a4\u00d3\2\u0a48\u0a46\3\2\2\2\u0a48\u0a47\3\2\2\2\u0a49"+
		"\u019f\3\2\2\2\u0a4a\u0a4b\7Y\2\2\u0a4b\u0a4d\7g\2\2\u0a4c\u0a4e\5\u01a2"+
		"\u00d2\2\u0a4d\u0a4c\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f"+
		"\u0a50\7h\2\2\u0a50\u01a1\3\2\2\2\u0a51\u0a52\b\u00d2\1\2\u0a52\u0a54"+
		"\5\u0122\u0092\2\u0a53\u0a55\7\u0095\2\2\u0a54\u0a53\3\2\2\2\u0a54\u0a55"+
		"\3\2\2\2\u0a55\u0a5e\3\2\2\2\u0a56\u0a57\f\3\2\2\u0a57\u0a58\7\u008c\2"+
		"\2\u0a58\u0a5a\5\u0122\u0092\2\u0a59\u0a5b\7\u0095\2\2\u0a5a\u0a59\3\2"+
		"\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5d\3\2\2\2\u0a5c\u0a56\3\2\2\2\u0a5d"+
		"\u0a60\3\2\2\2\u0a5e\u0a5c\3\2\2\2\u0a5e\u0a5f\3\2\2\2\u0a5f\u01a3\3\2"+
		"\2\2\u0a60\u0a5e\3\2\2\2\u0a61\u0a62\7D\2\2\u0a62\u0a63\7g\2\2\u0a63\u0a64"+
		"\5~@\2\u0a64\u0a65\7h\2\2\u0a65\u0a68\3\2\2\2\u0a66\u0a68\7D\2\2\u0a67"+
		"\u0a61\3\2\2\2\u0a67\u0a66\3\2\2\2\u0a68\u01a5\3\2\2\2\u0a69\u0a6a\7y"+
		"\2\2\u0a6a\u0a6b\7y\2\2\u0a6b\u01a7\3\2\2\2\u0a6c\u0a6d\7y\2\2\u0a6d\u0a6e"+
		"\7y\2\2\u0a6e\u0a6f\7w\2\2\u0a6f\u01a9\3\2\2\2\u0a70\u0aa1\7C\2\2\u0a71"+
		"\u0aa1\7.\2\2\u0a72\u0a73\7C\2\2\u0a73\u0a74\7i\2\2\u0a74\u0aa1\7j\2\2"+
		"\u0a75\u0a76\7.\2\2\u0a76\u0a77\7i\2\2\u0a77\u0aa1\7j\2\2\u0a78\u0aa1"+
		"\7m\2\2\u0a79\u0aa1\7n\2\2\u0a7a\u0aa1\7o\2\2\u0a7b\u0aa1\7p\2\2\u0a7c"+
		"\u0aa1\7q\2\2\u0a7d\u0aa1\7r\2\2\u0a7e\u0aa1\7s\2\2\u0a7f\u0aa1\7t\2\2"+
		"\u0a80\u0aa1\7u\2\2\u0a81\u0aa1\7v\2\2\u0a82\u0aa1\7w\2\2\u0a83\u0aa1"+
		"\7x\2\2\u0a84\u0aa1\7y\2\2\u0a85\u0aa1\7z\2\2\u0a86\u0aa1\7{\2\2\u0a87"+
		"\u0aa1\7|\2\2\u0a88\u0aa1\7}\2\2\u0a89\u0aa1\7~\2\2\u0a8a\u0aa1\7\177"+
		"\2\2\u0a8b\u0aa1\7\u0080\2\2\u0a8c\u0aa1\7\u0081\2\2\u0a8d\u0aa1\7\u0082"+
		"\2\2\u0a8e\u0aa1\5\u01a6\u00d4\2\u0a8f\u0aa1\5\u01a8\u00d5\2\u0a90\u0aa1"+
		"\7\u0083\2\2\u0a91\u0aa1\7\u0084\2\2\u0a92\u0aa1\7\u0085\2\2\u0a93\u0aa1"+
		"\7\u0086\2\2\u0a94\u0aa1\7\u0087\2\2\u0a95\u0aa1\7\u0088\2\2\u0a96\u0aa1"+
		"\7\u0089\2\2\u0a97\u0aa1\7\u008a\2\2\u0a98\u0aa1\7\u008b\2\2\u0a99\u0aa1"+
		"\7\u008c\2\2\u0a9a\u0aa1\7\u008d\2\2\u0a9b\u0aa1\7\u008e\2\2\u0a9c\u0a9d"+
		"\7g\2\2\u0a9d\u0aa1\7h\2\2\u0a9e\u0a9f\7i\2\2\u0a9f\u0aa1\7j\2\2\u0aa0"+
		"\u0a70\3\2\2\2\u0aa0\u0a71\3\2\2\2\u0aa0\u0a72\3\2\2\2\u0aa0\u0a75\3\2"+
		"\2\2\u0aa0\u0a78\3\2\2\2\u0aa0\u0a79\3\2\2\2\u0aa0\u0a7a\3\2\2\2\u0aa0"+
		"\u0a7b\3\2\2\2\u0aa0\u0a7c\3\2\2\2\u0aa0\u0a7d\3\2\2\2\u0aa0\u0a7e\3\2"+
		"\2\2\u0aa0\u0a7f\3\2\2\2\u0aa0\u0a80\3\2\2\2\u0aa0\u0a81\3\2\2\2\u0aa0"+
		"\u0a82\3\2\2\2\u0aa0\u0a83\3\2\2\2\u0aa0\u0a84\3\2\2\2\u0aa0\u0a85\3\2"+
		"\2\2\u0aa0\u0a86\3\2\2\2\u0aa0\u0a87\3\2\2\2\u0aa0\u0a88\3\2\2\2\u0aa0"+
		"\u0a89\3\2\2\2\u0aa0\u0a8a\3\2\2\2\u0aa0\u0a8b\3\2\2\2\u0aa0\u0a8c\3\2"+
		"\2\2\u0aa0\u0a8d\3\2\2\2\u0aa0\u0a8e\3\2\2\2\u0aa0\u0a8f\3\2\2\2\u0aa0"+
		"\u0a90\3\2\2\2\u0aa0\u0a91\3\2\2\2\u0aa0\u0a92\3\2\2\2\u0aa0\u0a93\3\2"+
		"\2\2\u0aa0\u0a94\3\2\2\2\u0aa0\u0a95\3\2\2\2\u0aa0\u0a96\3\2\2\2\u0aa0"+
		"\u0a97\3\2\2\2\u0aa0\u0a98\3\2\2\2\u0aa0\u0a99\3\2\2\2\u0aa0\u0a9a\3\2"+
		"\2\2\u0aa0\u0a9b\3\2\2\2\u0aa0\u0a9c\3\2\2\2\u0aa0\u0a9e\3\2\2\2\u0aa1"+
		"\u01ab\3\2\2\2\u0aa2\u0aaa\7\u0096\2\2\u0aa3\u0aaa\7\u009c\2\2\u0aa4\u0aaa"+
		"\7\u009d\2\2\u0aa5\u0aaa\7\u009e\2\2\u0aa6\u0aaa\5\u01ae\u00d8\2\u0aa7"+
		"\u0aaa\5\u01b0\u00d9\2\u0aa8\u0aaa\5\u01b2\u00da\2\u0aa9\u0aa2\3\2\2\2"+
		"\u0aa9\u0aa3\3\2\2\2\u0aa9\u0aa4\3\2\2\2\u0aa9\u0aa5\3\2\2\2\u0aa9\u0aa6"+
		"\3\2\2\2\u0aa9\u0aa7\3\2\2\2\u0aa9\u0aa8\3\2\2\2\u0aaa\u01ad\3\2\2\2\u0aab"+
		"\u0aac\t\f\2\2\u0aac\u01af\3\2\2\2\u0aad\u0aae\7E\2\2\u0aae\u01b1\3\2"+
		"\2\2\u0aaf\u0ab0\t\r\2\2\u0ab0\u01b3\3\2\2\2\u014f\u01b7\u01c3\u01cf\u01d6"+
		"\u01e2\u0203\u0211\u0228\u022d\u0230\u024b\u0252\u0258\u0269\u0271\u028f"+
		"\u0293\u0299\u029d\u02a9\u02ad\u02b8\u02bc\u02cb\u02d2\u02d7\u02d9\u02de"+
		"\u02e4\u02ee\u02f5\u02fb\u02ff\u0304\u030a\u0311\u0317\u031a\u031d\u0320"+
		"\u0327\u032e\u0362\u0371\u0377\u037d\u038a\u038c\u0392\u03a1\u03a7\u03c5"+
		"\u03ca\u03ce\u03d2\u03d5\u03d9\u03df\u03e1\u03e9\u03ed\u03f0\u03f7\u03fe"+
		"\u0402\u0407\u040b\u040e\u0413\u0419\u0426\u0431\u0433\u0442\u0444\u0450"+
		"\u0452\u045f\u0461\u0473\u0475\u0481\u0483\u048e\u0499\u04a4\u04af\u04ba"+
		"\u04c4\u04cc\u04d9\u04e3\u04ea\u04ee\u04f2\u04f6\u04fa\u04ff\u0502\u0505"+
		"\u050b\u0513\u0518\u051b\u0521\u052c\u0543\u0547\u054f\u0555\u0569\u056d"+
		"\u057a\u057e\u0581\u0588\u0590\u059a\u05a5\u05b1\u05bb\u05c0\u05c7\u05ca"+
		"\u05cf\u05d4\u05e9\u05ed\u05f2\u05fd\u0603\u0607\u060c\u0610\u0615\u0618"+
		"\u062e\u0634\u063f\u0643\u0646\u0650\u0656\u0659\u0660\u066a\u066e\u0671"+
		"\u0674\u0678\u067d\u067f\u0683\u0687\u0690\u069d\u06a5\u06ab\u06b1\u06b5"+
		"\u06b8\u06c1\u06ca\u06d2\u06dd\u06e3\u06ee\u06f1\u06f6\u0705\u070b\u0714"+
		"\u071e\u0724\u072c\u0730\u0734\u0739\u073e\u0745\u0747\u074c\u0750\u075e"+
		"\u0764\u0773\u077d\u0782\u0789\u078f\u0794\u079a\u07a1\u07a5\u07a7\u07a9"+
		"\u07b0\u07b3\u07b6\u07b9\u07be\u07c2\u07c5\u07c9\u07cd\u07d2\u07d5\u07d7"+
		"\u07db\u07e2\u07e8\u07ec\u07f2\u07f7\u07f9\u07ff\u0803\u0809\u0810\u0814"+
		"\u0816\u0818\u081f\u0829\u082d\u082f\u0831\u0835\u0838\u083e\u0848\u084c"+
		"\u0852\u085a\u085e\u0861\u0865\u086a\u086d\u0870\u0874\u0879\u0883\u088a"+
		"\u088f\u0893\u0898\u089e\u08a2\u08a8\u08ae\u08b2\u08b7\u08bd\u08c1\u08c4"+
		"\u08c8\u08cb\u08cd\u08d0\u08da\u08df\u08e1\u08e4\u08e7\u08ea\u08f3\u08fd"+
		"\u0902\u0905\u0909\u090c\u090f\u0913\u091c\u092b\u0931\u0935\u0939\u093d"+
		"\u0941\u0945\u0949\u094d\u0950\u0954\u095f\u0963\u096a\u096e\u0973\u0978"+
		"\u097f\u0983\u098d\u099d\u09a2\u09a6\u09a9\u09ad\u09b3\u09b6\u09ba\u09c4"+
		"\u09c7\u09cf\u09d4\u09d9\u09e1\u09e8\u09ec\u09f3\u09f9\u09fd\u0a03\u0a0c"+
		"\u0a10\u0a13\u0a23\u0a2a\u0a33\u0a39\u0a3d\u0a40\u0a44\u0a48\u0a4d\u0a54"+
		"\u0a5a\u0a5e\u0a67\u0aa0\u0aa9";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}