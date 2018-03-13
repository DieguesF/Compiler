package at.tugraz.ist.cc.warning.typechecker;

import at.tugraz.ist.cc.warning.JovaWarning;

/**
 * @author ccfuntime
 *
 */
public class ReturnCoecrionWarning extends JovaWarning {

    public ReturnCoecrionWarning(String msg, int line, int char_pos) {
        super(msg, line, char_pos);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
