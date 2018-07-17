package regEx.Controller;

import regEx.Model.Model;
import regEx.Model.ServicesRu;
import regEx.View.View;

import java.util.Scanner;
/**
 * Controller for RUS language.
 */
public class ControllerRu {
    Model model;
    View view;
    ServicesRu servicesRu;


    ControllerRu(Model model, View view) {

        this.view = view;
        this.model = model;
        servicesRu = new ServicesRu(model);
    }

    /**
     * This method is checked input data.
     * @param sc
     */
    public void checkInputData(Scanner sc) {

        while (isCorrectSecondName(sc));
        while (isCorrectFirstName(sc));
        while (isCorrectMiddleName(sc));
        view.message(model.getSecondName() + View.SPACE + servicesRu.first + View.DOT);

    }

    /**
     * this method is checked SecondName
     * @param sc
     * @return
     */
    private boolean isCorrectSecondName(Scanner sc) {
        view.message(View.INPUT_SECOND_NAME);
        if (servicesRu.checkSecondName(sc)) {

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
        if (servicesRu.checkFirstName(sc)) {

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
        if (servicesRu.checkMiddleName(sc)) {

            view.message(View.IS_CORRECT_MIDDLE_NAME);
            return false;
        } else view.message(View.WRONG);

        return true;
    }
}
