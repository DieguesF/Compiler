package at.tugraz.ist.cc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import at.tugraz.ist.cc.interfaces.LexicalAndSyntaxAnalyzerInterface;

public class LexicalAndSyntaxPublicTest {

    private final String path_lexer = "test/input/lexer/";
    private final String path_parser = "test/input/parser/";

    LexicalAndSyntaxAnalyzerInterface lexAndSyntax = new LexicalAndSyntaxAnalyzer();
    boolean debug = true;

    @Test
    public void testLexerPass01() {
        int result = lexAndSyntax.lexer(path_lexer + "pass01.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerPass02() {
        int result = lexAndSyntax.lexer(path_lexer + "pass02.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerPass03() {
        int result = lexAndSyntax.lexer(path_lexer + "pass03.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerPass04() {
        int result = lexAndSyntax.lexer(path_lexer + "pass04.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testLexerFail01() {
        int result = lexAndSyntax.lexer(path_lexer + "fail01.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail02() {
        int result = lexAndSyntax.lexer(path_lexer + "fail02.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail03() {
        int result = lexAndSyntax.lexer(path_lexer + "fail03.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail04() {
        int result = lexAndSyntax.lexer(path_lexer + "fail04.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail05() {
        int result = lexAndSyntax.lexer(path_lexer + "fail05.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail06() {
        int result = lexAndSyntax.lexer(path_lexer + "fail06.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail07() {
        int result = lexAndSyntax.lexer(path_lexer + "fail07.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail08() {
        int result = lexAndSyntax.lexer(path_lexer + "fail08.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testLexerFail09() {
        int result = lexAndSyntax.lexer(path_lexer + "fail09.jova", debug);
        assertEquals(1, result);
    }

    // PARSER

    @Test
    public void testParserPass01() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass01.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass02() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass02.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass03() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass03.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass04() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass04.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass05() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass05.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass06() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass06.jova", debug);
        assertEquals(0, result);
    }

        @Test
    public void testParserPass07() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass07.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass08() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass08.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass09() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass09.jova", debug);
        assertEquals(0, result);
    }

    @Test
    public void testParserPass10() {
        int result = lexAndSyntax.checkSyntax(path_parser + "pass10.jova", debug);
        assertEquals(0, result);
    }


    @Test
    public void testParserFail01() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail01.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testParserFail02() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail02.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testParserFail03() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail03.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testParserFail04() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail04.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testParserFail05() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail05.jova", debug);
        assertEquals(1, result);
    }

    @Test
    public void testParserFail06() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail06.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail07() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail07.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail08() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail08.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail09() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail09.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail10() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail10.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail11() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail11.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail12() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail12.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail13() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail13.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail14() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail14.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail15() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail15.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail16() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail16.jova", debug);
        assertEquals(1, result);
    }
        @Test
    public void testParserFail17() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail17.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail18() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail18.jova", debug);
        assertEquals(2, result);
    }
    @Test
    public void testParserFail19() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail19.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail20() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail20.jova", debug);
        assertEquals(1, result);
    }
            @Test
    public void testParserFail21() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail21.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail22() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail22.jova", debug);
        assertEquals(2, result);
    }
    @Test
    public void testParserFail23() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail23.jova", debug);
        assertEquals(1, result);
    }
    @Test
    public void testParserFail24() {
        int result = lexAndSyntax.checkSyntax(path_parser + "fail24.jova", debug);
        assertEquals(1, result);
    }
}
