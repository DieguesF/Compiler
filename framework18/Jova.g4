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
WS:  [-\n\t\r ]  -> channel(HIDDEN);

// COMMENT:
COMMENT: '//' ~('\n' | '\r')*;

// STRING LITERALS
LITERAL: '"' ([0-9a-zA-Z] | '_' | '\\' | OPERATORS | PUNCT | ' ')* '"'; // TODO: I'm not 100% confident but I think is like that.

// CLASS
AMOD: 'public' | 'private';
CLASS_TYPE: [A-Z] (LETTER | DIGIT0 | '_')*;

// ------------------------ parser rules ---------------------------

program: class_decls;
type: PRIMITIVE_TYPE | CLASS_TYPE ;
class_decls: class_decl (class_decls | );
class_decl: class_head class_body;
class_head: KEY_CLASS CLASS_TYPE;
class_body: '{' member_decls method_decls '}';
member_decls: member_decl member_decls | ;
member_decl: AMOD type id_list ';';
id_list: ID | ID ',' id_list; // TODO: check if this line is correct (for task 1.3)
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

// --------------------- TODO: check correctness (for task 1.2) -------------------

expr: operand | expr_or;
expr_or: expr_and OR (expr_or | expr_and); // "true OR true", "false or true or false" etc.
expr_and: expr_relop AND (expr_and | expr_relop); // "(1>2) AND true", "(3>2) AND (5==3) AND true" etc.
expr_relop: expr_sign RELOP (expr_relop | expr_sign); // "(1+2) > (3-4)" etc.
expr_sign: expr_mulop SIGN (expr_sign | expr_mulop); // "(a x b) + (c / d)" etc.
expr_mulop: operand MULOP (expr_mulop | operand); // "a x b", "a x b / c" etc.
// --------------------- TODO: check correctness (for task 1.2) -------------------

operand: INT | BOOL | LITERAL | KEY_NIX | NOT operand | SIGN operand | id_operand | '(' expr ')';
id_operand: member_access '(' arg_list ')' | member_access;
arg_list: args | ;
args: expr | args ',' expr;


// TODO: The lines below are in the provided source code, but another definition for "WS" and "program" are also given in the grammar in assignment PDF so I don't know how to resolve it

// Do not remove/change the WS lexer rule as defined below
//WS : [ \n\t\r] -> channel(HIDDEN);

//


