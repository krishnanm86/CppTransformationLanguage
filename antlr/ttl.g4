
grammar ttl;

rulelist
    : rule_* EOF
;

rule_
    : lhs ASSIGN rhs
    ;

lhs
    : id
    ;

rhs
    : alternatives
    ;

alternatives
    : alternative (BAR alternative)*
    ;

alternative
    : element*
    ;

element
    : optional
    | zeroormore
    | oneormore
    | text
    | id
    ;

optional
    : REND alternatives LEND
    ;

zeroormore
    : RBRACE alternatives LBRACE
    ;

oneormore
    : RPAREN alternatives LPAREN
    ;

text
    : ID
    ;

id
    : LT ruleid GT
    ;

ruleid
    : ID
    ;

ASSIGN
    : '::='
    ;

LPAREN
    : ')'
    ;

RPAREN
    : '('
    ;

LBRACE
    : '}'
    ;

RBRACE
    : '{'
    ;

LEND
    : ']'
    ;

REND
    : '['
    ;

BAR
    : '|'
    ;

GT
    : '>'
    ;

LT
    : '<'
    ;

ID
    : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|' ')+
    ;

WS
    : [ \r\n\t] -> skip
    ;