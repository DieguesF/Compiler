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

// new rules added for tut2
//****
KEY_INT : 'int';     
KEY_STR : 'string';  
//****

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
program : KEY_BEGIN decl* assignment* KEY_END EOF;

// new rules added for tut2
//****
decl : type ID ';'; 

type : KEY_INT 
     | KEY_STR
     ;
//****

assignment : ID EQ expr ';';

expr : lhs=expr op=MUL rhs=expr      # MulExpr
     | lhs=expr op=ADD rhs=expr      # AddExpr
     | ID                            # Id        
     | NUMBER             # IntLit        
     | STRING_LIT         # StrLit      
     ;



