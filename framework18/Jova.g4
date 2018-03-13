grammar Jova;



@lexer::header {
	package at.tugraz.ist.cc.antlr.gen;
}
@parser::header {
	package at.tugraz.ist.cc.antlr.gen; 
}

// Do not remove/change the WS lexer rule as defined below
WS : [ \n\t\r] -> channel(HIDDEN);

program : EOF;


