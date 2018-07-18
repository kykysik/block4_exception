package regEx.Controller;

import regEx.Model.Model;
import regEx.View.View;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import static regEx.View.RegExContainer.*;
import static regEx.View.TextConstant.INPUT_LANGUAGE_DATA;

/**
 * Main Controller.
 */
public class Controller {

     private View view;
     private UtilityController controller;
     public String input;



    public Controller(Model model, View view) {
        this.view = view;
        controller = new UtilityController(model, view);
     }

    /**
     * @throws UnsupportedEncodingException
     */
     public void proc() throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
         view.printStringInput(INPUT_LANGUAGE_DATA);
        changeLanguage(sc);
     }


    /**
     * This method change language after user input.
     * @param sc
     * @throws UnsupportedEncodingException
     */
     private void changeLanguage(Scanner sc) throws UnsupportedEncodingException {
         while (true) {
            input = sc.next();

            if (input.equals(View.ENG)) {
                view.res(input);
                controller.checkInputData(sc, REGEX_NAME_ENG, REGEX_FIRST_LETTER_ENG);
                break;
            } else if (input.equals(View.RUS)) {
                view.res(input);
                controller.checkInputData(sc, REGEX_NAME_RUS, REGEX_FIRST_LETTER_RUS);
                break;
            } else {
                view.printWrongStringInput();
                continue;
            }
        }
     }
}
