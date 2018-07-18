package regEx.Controller;

import regEx.Model.Model;
import regEx.Model.Services;
import regEx.View.View;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import static regEx.View.TextConstant.*;

/**
 * Controller.
 */
 public class UtilityController {
     Model model;
     View view;
     Services services;

     UtilityController(Model model, View view) {

         this.view = view;
         this.model = model;
    }

    /**
     * This method is checked input data.
     * @param sc
     */
    public void checkInputData(Scanner sc, String regName, String regLastLetter) throws UnsupportedEncodingException {
        services = new Services(model, regName, regLastLetter);
        while (isCorrectSecondName(sc));
        while (isCorrectFirstName(sc));
        while (isCorrectMiddleName(sc));
        view.printResult(model.getSecondName(), services.first);
    }

    /**
     * this method is checked SecondName
     * @param sc
     * @return true, if secondName is correct
     */
    private boolean isCorrectSecondName(Scanner sc) throws UnsupportedEncodingException {
        view.printStringInput(SECOND_NAME);
        String res = sc.next();

        if (services.checkSecondName(res)) {

            return false;
        } else view.printWrongStringInput();

        return true;
    }

    /**
     * This method is checked FirstName
     * @param sc
     * @return true, if firstName is correct
     */
    private boolean isCorrectFirstName(Scanner sc) throws UnsupportedEncodingException{
        view.printStringInput(FIRST_NAME);

        String res = sc.next();

        if (services.checkFirstName(res)) {

            return false;
        } else view.printWrongStringInput();

        return true;
    }

    /**
     * This method is checked MiddleName
     * @param sc
     * @return true, if middleName is correct
     */
    private boolean isCorrectMiddleName(Scanner sc) throws UnsupportedEncodingException{
        view.printStringInput(MIDDLE_NAME);

        String res = sc.next();

        if (services.checkMiddleName(res)) {

            return false;
        } else view.printWrongStringInput();

        return true;
    }
}
