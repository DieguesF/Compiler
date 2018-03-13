package at.tugraz.ist.cc.error.typechecker;

import at.tugraz.ist.cc.error.JovaError;

/**
 * @author doublethegundoublethefun
 *
 */
public class MemberDoubleDefTypeError extends JovaError {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MemberDoubleDefTypeError(String err_msg, int line, int char_pos) {
        super(err_msg, line, char_pos);
    }
}
