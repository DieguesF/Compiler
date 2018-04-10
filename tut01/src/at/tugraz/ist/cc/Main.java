package at.tugraz.ist.cc;

import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;

public class Main {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("USAGE:");
            System.out.println("param1 (task): tut1|tut2");
            System.out.println("param2: path to the input file (*.jova)");
            System.out.println("param3 (debug): true|false");
            System.exit(-1);
        }

        if (args[0].equals("tut1")) {
            LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
            lexAndSyntax.checkSyntax(args[1], Boolean.parseBoolean(args[2]));
        } else {
            System.out.println("Unknown task name: " + args[0]);
        }
    }

}
