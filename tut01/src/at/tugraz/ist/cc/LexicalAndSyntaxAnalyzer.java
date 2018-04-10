package at.tugraz.ist.cc;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import at.tugraz.ist.cc.antlr.gen.CalculatorLexer;
import at.tugraz.ist.cc.antlr.gen.CalculatorParser;
import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;

public class LexicalAndSyntaxAnalyzer implements LexicalAndSyntaxAnalyzerInterface {

    public int lexer(String file_path, boolean debug) {

        return 0;
    }

    public int checkSyntax(String file_path, boolean debug) {

        CalculatorLexer lexer;
        try {
            lexer = new CalculatorLexer(new ANTLRFileStream(file_path));

            System.out.println(generateLexerDebug(lexer));

            lexer = new CalculatorLexer(new ANTLRFileStream(file_path));
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokens);

            parser.program();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return 0;
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
