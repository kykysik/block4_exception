package regEx.Controller;

import regEx.View.View;

import java.io.UnsupportedEncodingException;

import static regEx.View.TextConstant.INFO;

public class LoginException extends Exception {

    public LoginException(View view) throws UnsupportedEncodingException {
        view.printStringInput(INFO);
    }

}
