package at.tugraz.ist.cc;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;



public class Example1Test {

    private final String path = "test/input/tut1/";


    LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
    boolean debug = true;

    @Test
    public void testExample_1() {
        int result = lexAndSyntax.checkSyntax(path + "example_1.calc", debug);
        assertEquals(0, result);
    }
}
