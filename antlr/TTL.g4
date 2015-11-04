grammar TTL;

transformationProgram :	spec+ ;

spec : 	NAMESPACE Identifier ':' Identifier '===' Identifier '{{' decl+ '}}' ;

decl : INCLUDE StringLiteral
       | INCLUDE '<' cc '>'
       | transformationrule ;
       
transformationrule: tagname '{{' transformationrule '}}'
                    | tagdecl
                    | mapdecl
                    | astname cc '===' Identifier cc conditions ';;'
                    | astname cc '===' Identifier  '{{' cc conditions '}}' ';;';
conditions: ;

astname: 'type' | 'decl'  ; //TODO: List incomplete. Extend it as needed

mapdecl: 'map ' Identifier '(' listofpairs ')';
listofpairs: ''
             | StringLiteral ':' StringLiteral ',' listofpairs;


tagdecl: 'tag'? Identifier  '<' formals '>' ';;' ;
 
         
formals: astname '<' Identifier '>';

tag: Identifier;


tagname: Identifier ;

 
cc: ;

//Constants
INCLUDE : '#include ' ;
NAMESPACE : 'namespace';



//The rest of the grammar rules and definition  are taken from the C grammar

Identifier
:
	IdentifierNondigit
	(
		IdentifierNondigit
		| Digit
	)*
;

fragment
IdentifierNondigit
:
	Nondigit
	| UniversalCharacterName
	//|   // other implementation-defined characters...

;

fragment
Nondigit
:
	[a-zA-Z_]
;

fragment
Digit
:
	[0-9]
;

fragment
UniversalCharacterName
:
	'\\u' HexQuad
	| '\\U' HexQuad HexQuad
;

fragment
HexQuad
:
	HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
;

fragment
HexadecimalDigit
:
	[0-9a-fA-F]
;

StringLiteral
:
	EncodingPrefix? '"' SCharSequence? '"'
;

fragment
EncodingPrefix
:
	'u8'
	| 'u'
	| 'U'
	| 'L'
;

fragment
SCharSequence
:
	SChar+
;

fragment
SChar
:
	~["\\\r\n]
	| EscapeSequence
;

LineDirective
:
	'#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]* -> skip
;

PragmaDirective
:
	'#' Whitespace? 'pragma' Whitespace ~[\r\n]* -> skip
;

Whitespace
:
	[ \t]+ -> skip
;

Newline
:
	(
		'\r' '\n'?
		| '\n'
	) -> skip
;

BlockComment
:
	'/*' .*? '*/' -> skip
;

LineComment
:
	'//' ~[\r\n]* -> skip
;

fragment
EscapeSequence
:
	SimpleEscapeSequence
	| OctalEscapeSequence
	| HexadecimalEscapeSequence
	| UniversalCharacterName
;

fragment
SimpleEscapeSequence
:
	'\\' ['"?abfnrtv\\]
;

fragment
OctalEscapeSequence
:
	'\\' OctalDigit
	| '\\' OctalDigit OctalDigit
	| '\\' OctalDigit OctalDigit OctalDigit
;

fragment
HexadecimalEscapeSequence
:
	'\\x' HexadecimalDigit+
;

fragment
DecimalConstant
:
	NonzeroDigit Digit*
;

fragment
OctalDigit
:
	[0-7]
;

fragment
NonzeroDigit
:
	[1-9]
;