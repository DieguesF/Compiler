package at.tugraz.ist.cc;

import at.tugraz.ist.cc.antlr.gen.JovaLexer;
import at.tugraz.ist.cc.antlr.gen.JovaParser;
import at.tugraz.ist.cc.error.ErrorHandler;
import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
//TODO: we have to change this class, only copy from calculator
public class LexicalAndSyntaxAnalyzer implements LexicalAndSyntaxAnalyzerInterface {

    public int lexer(String file_path, boolean debug) {

        JovaLexer lexer;

        try {
            lexer = new JovaLexer(new ANTLRFileStream(file_path));
            lexer.removeErrorListeners();
            //lexer.addErrorListener();

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            if (debug){
                System.out.println(generateLexerDebug(lexer));
            }
            //JovaParser parser = new JovaParser(tokens);
            //parser.program();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        ErrorHandler.INSTANCE.printLexerErrors();
        return ErrorHandler.INSTANCE.getNumLexErrors();
        //return 0;
    }

    public int checkSyntax(String file_path, boolean debug) {

        JovaLexer lexer;
        try {
            lexer = new JovaLexer(new ANTLRFileStream(file_path));

            System.out.println(generateLexerDebug(lexer));

            lexer = new JovaLexer(new ANTLRFileStream(file_path));
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JovaParser parser = new JovaParser(tokens);

            parser.program();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return 0;
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
