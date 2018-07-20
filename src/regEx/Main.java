package regEx;

import regEx.Controller.Controller;
import regEx.Model.Model;
import regEx.View.View;

import java.io.UnsupportedEncodingException;

/**
 * @author Bogdan
 * @version 1.1
 * Main class.
 */
public class Main {
    /**
     * Here start point of the program.
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.proc();

    }
}
