package at.tugraz.ist.cc;

import org.junit.Test;



public class Tut2Example3Test {

    private final String path = "test/input/tut2/";


    TypeCheckerTut tut02 = new TypeCheckerTut();

    @Test
    public void testExample_2() {
    	tut02.checkTypes(path + "example_3.calc");
    }
}
