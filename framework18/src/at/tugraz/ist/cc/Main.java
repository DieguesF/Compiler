package at.tugraz.ist.cc;

import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;
import at.tugraz.ist.cc.interfaces.TypeCheckerInterface;
import at.tugraz.ist.cc.interfaces.CodeGenerationInterface;

/**
 * @author cc17
 *
 */
public class Main {

    public static void main(String[] args) {

        //System.out.println("\n----Hello-Compiler-----\n:");

        if (args.length < 3) {
            System.out.println("USAGE:");
            System.out.println("\n----fail\n:");
            System.out.println("param1 (task): lexer|parser|typechecker|bytecode");
            System.out.println("param2: path to the input file (*.jova)");
            System.out.println("param3 (debug): true|false");
            System.out.println("param4: path to output folder (for bytecode)");
            System.exit(-1);
        }

        if (args[0].equals("lexer")) {
            LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
            lexAndSyntax.lexer(args[1], Boolean.parseBoolean(args[2]));
            //lexAndSyntax.checkSyntax(args[1], Boolean.parseBoolean(args[2]));
        } else if (args[0].equals("parser")) {
            LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
            lexAndSyntax.checkSyntax(args[1], Boolean.parseBoolean(args[2]));
        } else if (args[0].equals("typechecker")) {
            TypeCheckerInterface typeChecker = new TypeChecker();
            typeChecker.checkTypes(args[1], Boolean.parseBoolean(args[2]));
        } else if (args[0].equals("bytecode")) {
            CodeGenerationInterface codeGeneration = new CodeGeneration();
            codeGeneration.createCode(args[1], args[3]);
        } else {
            System.out.println("Unknown task name: " + args[0]);
        }
    }

}
