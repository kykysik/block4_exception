package regEx.Controller;

import regEx.Model.Model;
import regEx.Model.ServicesENG;
import regEx.View.View;
import java.util.Scanner;

/**
 * Controller for Eng language.
 */
 public class ControllerEng {
     Model model;
     View view;
     ServicesENG servicesENG ;

     ControllerEng(Model model, View view) {

         this.view = view;
         this.model = model;
         servicesENG = new ServicesENG(model);
    }


    /**
     * This method is checked input data.
     * @param sc
     */
    public void checkInputData(Scanner sc) {

        while (isCorrectSecondName(sc));
        while (isCorrectFirstName(sc));
        while (isCorrectMiddleName(sc));
        view.message(model.getSecondName() + View.SPACE + servicesENG.first + View.DOT);


    }

    /**
     * this method is checked SecondName
     * @param sc
     * @return
     */
    private boolean isCorrectSecondName(Scanner sc) {
        view.message(View.INPUT_SECOND_NAME);
        if (servicesENG.checkSecondName(sc)) {

            view.message(View.IS_CORRECT_SECOND_NAME);
            return false;
        } else view.message(View.WRONG);

        return true;
    }

    /**
     * This method is checked FirstName
     * @param sc
     * @return
     */
    private boolean isCorrectFirstName(Scanner sc) {
        view.message(View.INPUT_FIRST_NAME);
        if (servicesENG.checkFirstName(sc)) {

            view.message(View.IS_CORRECT_FIRST_NAME);
            return false;

        } else view.message(View.WRONG);

        return true;
    }

    /**
     * This method is checked MiddleName
     * @param sc
     * @return
     */
    private boolean isCorrectMiddleName(Scanner sc) {
        view.message(View.INPUT_MIDDLE_NAME);
        if (servicesENG.checkMiddleName(sc)) {

            view.message(View.IS_CORRECT_MIDDLE_NAME);
            return false;
        } else view.message(View.WRONG);

        return true;
    }
}
