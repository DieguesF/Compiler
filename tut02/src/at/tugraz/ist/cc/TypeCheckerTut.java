package at.tugraz.ist.cc;

import org.antlr.v4.runtime.tree.ParseTree;

public class TypeCheckerTut {
	
	
	
	public void checkTypes(String path) {
		LexicalAndSyntaxAnalyzerTut parser = new LexicalAndSyntaxAnalyzerTut();
		ParseTree cst = parser.checkSyntax(path, false);
		
		TypeCheckerVisitor visitor = new TypeCheckerVisitor();
		visitor.visit(cst);
	}
}
