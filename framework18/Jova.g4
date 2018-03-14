grammar Jova;



@lexer::header {
	package at.tugraz.ist.cc.antlr.gen;
}
@parser::header {
	package at.tugraz.ist.cc.antlr.gen; 
}

// ------------------------ lexer rules ---------------------------

// KEYWORDS
KEY_CLASS: 'class';
KEY_IF: 'if';
KEY_ELSE: 'else';
KEY_WHILE: 'while';
KEY_RETURN: 'return';
KEY_NEW: 'new';
KEY_NIX: 'nix':

// OPERATORS
ASSIGN: '=';
RELOP: '<' | '>' | '<=' | '>=' | '==' | '!=';
MULOP: '*' | '/' | '%';
OR: '||';
AND: '&&';
SIGN: '+' | '-';
NOT: '!';
DOTOP: '.';
fragment OPERATORS: '<' | '>' | '=' | '+' | '-' | '/' | '%' | '*' | '|' | '&';

// NUMERICAL LITERALS
fragment DIGIT0: [0-9]; // '0'..'9'
fragment DIGIT: [1-9];
NUMBER: DIGIT0 | (DIGIT DIGIT0*); // either single digit OR not starting with 0
DECIMAL: DIGIT0+; // .0123, .999 etc.
INT: '-'? NUMBER ('.' DECIMAL)?; // -9, -1.23, 5, 6.8 etc.

// PRIMITIVE TYPES
PRIMITIVE_TYPE: 'int' | 'String' | 'bool';

// BOOLEAN LITERALS
BOOL: 'true' | 'false';

// IDENTIFIERS
ID: [a-z] (LETTER | DIGIT0 | '_')*;
fragment LETTER : [a-zA-Z];

// PUNCTUATION
fragment PUNCT: '.' | ',' | ';' | ':' | '!' | '?';

// TODO: pg22 & 23 of assignment pdf

// String
fragment ESC : '\\"';
STRING_LIT: '"' (ESC | )*? '"'; // TODO: decide what characters should be allowed in a String

// nix
NULL: 'nix'



// ------------------------ parser rules ---------------------------


// Do not remove/change the WS lexer rule as defined below
WS : [ \n\t\r] -> channel(HIDDEN);

program : EOF;


