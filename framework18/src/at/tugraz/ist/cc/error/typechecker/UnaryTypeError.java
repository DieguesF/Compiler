package at.tugraz.ist.cc.error.typechecker;

import at.tugraz.ist.cc.error.JovaError;

/**
 * @author ccfuntime
 *
 */
public class UnaryTypeError extends JovaError {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public UnaryTypeError(String err_msg, int line, int char_pos) {
        super(err_msg, line, char_pos);
    }

}
