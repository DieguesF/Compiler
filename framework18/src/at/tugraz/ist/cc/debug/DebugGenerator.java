package at.tugraz.ist.cc.debug;

/**
 * Class to generate and print a debug table for assignment 2 (type checking).
 * 
 * @author ccfuntime
 */
public class DebugGenerator {

    /**
     * StringBuilder used to construct the debug strings
     */
    private StringBuilder bob_the_builder;
    /**
     * Format used for variable debug
     */
    private static final String var_debug_format = "%n%-20s|%-10s|%-43s|%-4s";

    /**
     * Format used for operator debug
     */
    private static final String op_debug_format = "%n%-6s|%-10s|%-10s|%-10s|%-4s|%-28s";
    /**
     * Concatenated string of variable debug
     */
    private String var_debug_str = "";

    /**
     * Concatenated string of operator debug
     */
    private String op_debug_str = "";

    /**
     * Adds variable informations for type checker debug to
     * {@link var_debug_str} using a format String and the given
     * {@link var_debug_format}. If the variable is a member variable (this is,
     * it is not defined inside a method scope) <code>method_id</code> should be
     * an empty String and no <code>param_types</code> have to be passed.
     * 
     * @param line
     *            line number where the variable is defined in the source code
     * @param id
     *            the variable's ID
     * @param type
     *            the full name of the variable's type
     * @param class_id
     *            the full name of the class associated with the variable
     * @param method_id
     *            the full method name in which the variable has been defined
     * @param param_types
     *            an array of strings with the full names of the parameter types
     *            of the aforementioned method
     * 
     */
    public void addVariableTCDebug(int line, String id, String type, String class_id, String method_id,
            String... param_types) {
        bob_the_builder = new StringBuilder();
        if (!method_id.equals("")) {
            bob_the_builder.append(class_id).append(".").append(method_id).append("(");

            if ((param_types != null) && (param_types.length != 0)) {
                for (String param_type : param_types)
                    bob_the_builder.append(param_type).append(" ");
                bob_the_builder.deleteCharAt(bob_the_builder.length() - 1);
            }
            bob_the_builder.append(")");
        } else
            bob_the_builder.append(class_id);
        var_debug_str += String.format(var_debug_format, id, type, bob_the_builder.toString(), Integer.toString(line));
    }

    /**
     * Adds information about an operator for type checker debug to
     * {@link op_debug_str}. For unary operators/return/conditions
     * <code>lhs_type</code> is expected to be an empty String. The
     * <code>op_string</code> should contain the whole expression (including
     * potential subexpressions).
     *
     * @param operator
     *            the operator symbol (e.g. "+", "==", "return")
     * @param lhs_type
     *            the full name of the left-hand side operand's type
     * @param rhs_type
     *            the full name of the right-hand side operand's type
     * @param result_type
     *            the full name of the operator's resulting type
     * @param line
     *            line number where the operator occurs in the source code
     * @param op_string
     *            the source code of the whole expression
     */
    public void addOperatorTCDebug(String operator, String lhs_type, String rhs_type, String result_type, int line,
            String op_string) {
        op_debug_str += String.format(op_debug_format, operator, lhs_type, rhs_type, result_type,
                Integer.toString(line), op_string);
    }

    /**
     * Prints the type checker debug Strings ({@link var_debug_str},
     * {@link op_debug_str}) to standard out in a formatted way. In addition
     * resets <code>var_debug_str</code> and <code>op_debug_str</code> to an
     * empty String.
     * <p>
     * Please watch youtu.be/dQw4w9WgXcQ if you feel like this framework has let
     * you down.
     */
    public void printTCDebug() {

        final StringBuilder separator = new StringBuilder();
        bob_the_builder = new StringBuilder();
        separator.append(String.format("%n"));

        for (int i = 0; i < 8; ++i)
            separator.append("----------");

        bob_the_builder.append(separator.toString());

        bob_the_builder.append(String.format(var_debug_format, "ID", "type", "scope", "line"));

        bob_the_builder.append(separator.toString());
        bob_the_builder.append(var_debug_str);

        bob_the_builder.append(String.format("%n")).append(separator);

        bob_the_builder.append(String.format(op_debug_format, "OP", "lhs", "rhs", "result", "line", "OP-string"));

        bob_the_builder.append(separator.toString());
        bob_the_builder.append(op_debug_str);
        System.out.print(bob_the_builder.toString());
        var_debug_str = "";
        op_debug_str = "";
    }
}
