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
KEY_NIX: 'nix';

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

// WHITE SPACES
WS: '-' | '\n' | '\t' | '\r';

// COMMENT:
COMMENT: '//' ~('\n' | '\r')*;

// STRING LITERALS
LITERAL: '"' ([0-9a-zA-Z] | '_' | '\\' | OPERATORS | PUNCT | ' ')* '"'; // TODO: I'm not 100% confident but I think is like that

// CLASS
AMOD: 'public' | 'private';
CLASS_TYPE: [A-Z] (LETTER | DIGIT0 | '_')*;

// ------------------------ parser rules ---------------------------

program: class_decls;
type: PRIMITIVE_TYPE | CLASS_TYPE;
class_decls: class_decl (class_decls | );
class_decl: class_head class_body;
class_head: KEY_CLASS CLASS_TYPE;
class_body: '{' member_decls method_decls '}';
member_decls: member_decl member_decls | ;
member_decl: AMOD type id_list ';';
id_list: id_list ID | ID ',' | ; // TODO: Task 1.3
method_decls: method_decl method_decls | ;
method_decl: method_head method_body;
method_head: AMOD type ID params;
params: '(' param_list ')' | '()';
param_list: type ID | param_list ',' type ID;
method_body: '{' declaration stmt ret_stmt '}';
declaration: type id_list ';' | declaration type id_list ';' | ;
stmt: stmt if_stmt | stmt while_stmt | stmt assignment ';' | ;
ret_stmt: KEY_RETURN expr ';';
if_stmt: KEY_IF '(' expr ')' compound_stmt | KEY_IF '(' expr ')' compound_stmt KEY_ELSE compound_stmt;
while_stmt: KEY_WHILE '(' expr ')' compound_stmt;
assignment: member_access ASSIGN (expr | object_alloc);
member_access: ID DOTOP member_access | ID;
object_alloc: KEY_NEW CLASS_TYPE;
compound_stmt: '{' stmt '}';
expr: // TODO: create production for expressions (Task 1.2)
operand: INT | BOOL | LITERAL | KEY_NIX | NOT operand | SIGN operand | id_operand | '(' expr ')';
id_operand: member_access '(' arg_list ')' | member_access;
arg_list: args | ;
args: expr | args ',' expr;

// Do not remove/change the WS lexer rule as defined below
WS : [ \n\t\r] -> channel(HIDDEN);

program : EOF;


