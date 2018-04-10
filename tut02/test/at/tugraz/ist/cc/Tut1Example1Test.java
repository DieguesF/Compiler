package at.tugraz.ist.cc;



import org.junit.Test;



public class Tut1Example1Test {

    private final String path = "test/input/tut1/";


    LexicalAndSyntaxAnalyzerTut tut01 = new LexicalAndSyntaxAnalyzerTut();
    boolean debug = true;

    @Test
    public void testExample_1() {
        tut01.checkSyntax(path + "example_1.calc", debug);
    }
}
