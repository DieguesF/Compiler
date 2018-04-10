package at.tugraz.ist.cc;



import org.junit.Test;



public class Tut1Example2Test {

    private final String path = "test/input/tut1/";


    LexicalAndSyntaxAnalyzerTut tut01 = new LexicalAndSyntaxAnalyzerTut();
    boolean debug = true;

    @Test
    public void testExample_2() {
        tut01.checkSyntax(path + "example_2.calc", debug);
    }
}
