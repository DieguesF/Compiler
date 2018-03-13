package at.tugraz.ist.cc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import at.tugraz.ist.cc.interfaces.TypeCheckerInterface;

public class TypeCheckerPublicTest {

    private final String path_coercion = "test/input/typechecking/coercion_warning/";
    private final String path_fail = "test/input/typechecking/fail//";
    private final String path_pass = "test/input/typechecking/pass/";
    
    TypeCheckerInterface typeChecker = new TypeChecker();
    boolean debug = true;

    @Test
    public void testPass01() {
        int result = typeChecker.checkTypes(path_pass + "pass01.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass02() {
        int result = typeChecker.checkTypes(path_pass + "pass02.jova", debug);
        assertEquals(0, result);
    }
        @Test
    public void testPass03() {
        int result = typeChecker.checkTypes(path_pass + "pass03.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass04() {
        int result = typeChecker.checkTypes(path_pass + "pass03.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass05() {
        int result = typeChecker.checkTypes(path_coercion + "warning01.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass06() {
        int result = typeChecker.checkTypes(path_coercion + "warning02.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testPass07() {
        int result = typeChecker.checkTypes(path_coercion + "warning03.jova", debug);
        assertEquals(0, result);
    }
    
    @Test
    public void testPass08() {
        int result = typeChecker.checkTypes(path_coercion + "warning04.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testFail01() {
        int result = typeChecker.checkTypes(path_fail+ "access/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail02() {
        int result = typeChecker.checkTypes(path_fail+ "access/fail02.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail03() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail04() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail02.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail05() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail03.jova", debug);
        assertEquals(1, result);
    }

    
    @Test
    public void testFail06() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail04.jova", debug);
        assertEquals(1, result);
    }
    
    
    @Test
    public void testFail07() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail05.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testFail08() {
        int result = typeChecker.checkTypes(path_fail+ "incompatible_condition/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail09() {
        int result = typeChecker.checkTypes(path_fail+ "incompatible_return/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail10() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail11() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail02.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testFail12() {
        int result = typeChecker.checkTypes(path_fail+ "main_structure/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail13() {
        int result = typeChecker.checkTypes(path_fail+ "main_structure/fail02.jova", debug);
        assertEquals(1, result);
    }
   
    @Test
    public void testFail14() {
        int result = typeChecker.checkTypes(path_fail+ "undeclared_id/fail01.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail15() {
        int result = typeChecker.checkTypes(path_fail+ "undeclared_id/fail02.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail16() {
        int result = typeChecker.checkTypes(path_fail+ "undeclared_id/fail03.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testFail17() {
        int result = typeChecker.checkTypes(path_fail+ "undeclared_id/fail04.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail18() {
        int result = typeChecker.checkTypes(path_fail+ "undeclared_id/fail05.jova", debug);
        assertEquals(1, result);
    }

        @Test
    public void testFail19() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail06.jova", debug);
        assertEquals(1, result);
    }

    
    @Test
    public void testFail20() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail07.jova", debug);
        assertEquals(1, result);
    }
    
    
    @Test
    public void testFail21() {
        int result = typeChecker.checkTypes(path_fail+ "double_decl/fail08.jova", debug);
        assertEquals(1, result);
    }

        @Test
    public void testFail22() {
        int result = typeChecker.checkTypes(path_fail+ "incompatible_condition/fail02.jova", debug);
        assertEquals(1, result);
    }

        @Test
    public void testFail23() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail03.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail24() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail04.jova", debug);
        assertEquals(1, result);
    }
            @Test
    public void testFail25() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail05.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail26() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail06.jova", debug);
        assertEquals(1, result);
    }
            @Test
    public void testFail27() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail07.jova", debug);
        assertEquals(1, result);
    }
    
    @Test
    public void testFail28() {
        int result = typeChecker.checkTypes(path_fail+ "incorrect_operand/fail08.jova", debug);
        assertEquals(1, result);
    }
}
