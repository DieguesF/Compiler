package at.tugraz.ist.cc;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import at.tugraz.ist.cc.antlr.gen.CalculatorLexer;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser;

public class LexicalAndSyntaxAnalyzerTut {

	public ParseTree checkSyntax(String file_path, boolean debug) {

		CalculatorLexer lexer;
		ParseTree cst = null;
		try {
			lexer = new CalculatorLexer(new ANTLRFileStream(file_path));
			if (debug) {
				System.out.println(generateLexerDebug(lexer));
				lexer = new CalculatorLexer(new ANTLRFileStream(file_path));
				lexer.removeErrorListeners();
			}
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CalculatorParser parser = new CalculatorParser(tokens);

			cst = parser.program();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cst;
	}

	public String generateLexerDebug(CalculatorLexer lex) {
		StringBuilder lex_debug = new StringBuilder();

		// iterating through all input tokens
		int current_line = 0;
		for (Token token = lex.nextToken(); token.getType() != Token.EOF; token = lex.nextToken()) {
			if (token.getType() != CalculatorLexer.WS) {
				if (current_line != token.getLine()) {
					// updating new line
					current_line = token.getLine();
					lex_debug.append(System.lineSeparator()).append(current_line).append(":");
				}

				lex_debug.append(" ");

				// adding token "names"
				if (CalculatorLexer.VOCABULARY.getSymbolicName(token.getType()) != null)
					lex_debug.append(CalculatorLexer.VOCABULARY.getSymbolicName(token.getType()));
				else
					lex_debug.append(CalculatorLexer.VOCABULARY.getLiteralName(token.getType()));
			}
		}
		return lex_debug.toString();
	}

}
