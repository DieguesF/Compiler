grammar Calculator;

@lexer::header {
	package at.tugraz.ist.cc.antlr.gen;
}

@parser::header {
	package at.tugraz.ist.cc.antlr.gen; 
}


// token <token_class, string>
// lexer rules
KEY_BEGIN : 'begin';
KEY_END : 'end';

fragment DIGIT : [0-9];  // '0'..'9'
NUMBER : DIGIT+;

ID : LETTER (LETTER | DIGIT)*;
fragment LETTER : [a-zA-Z];

// very sloppy string definition! 
// consider using esc sequences instead!
STRING_LIT : '"' .*? '"';

EQ : '=';
ADD : '+';
MUL : '*';

WS : [ \n\t\r] -> skip;

// parser rules
program : KEY_BEGIN assignment* KEY_END EOF;

assignment : ID EQ expr ';';

// labeled with #
expr : lhs=expr op=MUL rhs=expr   # MulExpr
     | lhs=expr op=ADD rhs=expr   # AddExpr
     | ID                         # Id
     | NUMBER                     # IntLit
     | STRING_LIT                 # StrLit
     ;



