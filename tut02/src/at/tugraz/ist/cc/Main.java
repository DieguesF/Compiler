package at.tugraz.ist.cc;


public class Main {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("USAGE:");
            System.out.println("param1 (task): tut1|tut2");
            System.out.println("param2: path to the input file (*.calc)");
            System.exit(-1);
        }

        if (args[0].equals("tut1")) {
            LexicalAndSyntaxAnalyzerTut tut01 = new LexicalAndSyntaxAnalyzerTut();
            tut01.checkSyntax(args[1], true);
        } else if(args[0].equals("tut2")) {
        	TypeCheckerTut tut02 = new TypeCheckerTut();
        	tut02.checkTypes(args[1]);
    }else {
            System.out.println("Unknown task name: " + args[0]);
        }
    }

}
