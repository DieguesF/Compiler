package at.tugraz.ist.cc;

import at.tugraz.ist.cc.antlr.gen.JovaLexer;
import at.tugraz.ist.cc.error.ErrorHandler;
import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class LexicalAndSyntaxAnalyzer implements LexicalAndSyntaxAnalyzerInterface {

    public int lexer(String file_path, boolean debug) {
        JovaLexer lexer;
        int current_line = 0;
        if (debug) {
            try {
                lexer = new JovaLexer(new ANTLRFileStream(file_path));
                lexer.removeErrorListeners();
                for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
                    String newToken;
                    if((newToken = lexer.getVocabulary().getSymbolicName(token.getType())) == null){
                        newToken = token.getText();
                    }
                    if (current_line != token.getLine()) {
                        current_line = token.getLine();
                        System.out.print("\n");
                    }
                    System.out.print(newToken + " ");
                }

            } catch (IOException e) {

            }
        }
        ErrorHandler.INSTANCE.printLexerErrors();

        return ErrorHandler.INSTANCE.getNumLexErrors();
    }


    public int checkSyntax(String file_path, boolean debug) {

        JovaLexer lexer;
/*
        if(debug) {
            try {
                lexer = new JovaLexer(new ANTLRFileStream(file_path));

                System.out.println(generateLexerDebug(lexer));

                lexer = new JovaLexer(new ANTLRFileStream(file_path));
                lexer.removeErrorListeners();
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JovaParser parser = new JovaParser(tokens);

                parser.program();

            } catch (IOException e) {
                return 1;
            }

            return 0;
        }*/
        return 1;
    }

    public String generateLexerDebug(JovaLexer lex) {
        StringBuilder lex_debug = new StringBuilder();

        // iterating through all input tokens
        int current_line = 0;
        int count = 0;
        for (Token token = lex.nextToken(); token.getType() != Token.EOF; token = lex.nextToken()) {
            if (token.getType() != JovaLexer.WS) {
                if (current_line != token.getLine()) {
                    // updating new line
                    count++;
                    current_line = token.getLine();
                    int current_position = token.getCharPositionInLine();
                    lex_debug.append(System.lineSeparator()).append("#"+count+": ").append("line ").append(current_line).append(":").append(current_position);
                }

                lex_debug.append(" ");

                // adding token "names"
                if (JovaLexer.VOCABULARY.getSymbolicName(token.getType()) != null)
                    lex_debug.append(JovaLexer.VOCABULARY.getSymbolicName(token.getType()));
                else
                    lex_debug.append(JovaLexer.VOCABULARY.getLiteralName(token.getType()));
            }
        }
        return lex_debug.toString();
    }


}
