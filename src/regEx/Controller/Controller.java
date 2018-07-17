package regEx.Controller;

import regEx.Model.Model;
import regEx.View.View;
import java.util.Scanner;

/**
 * Main Controller.
 */
public class Controller {

     private Model model;
     private View view;
     private ControllerEng controllerEng ;
     private ControllerRu controllerRu;
     
     public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        controllerEng = new ControllerEng(model, view);
        controllerRu = new ControllerRu(model, view);
     }

     public void proc() {
        Scanner sc = new Scanner(System.in);
        view.message(View.Choose_Language);
        changeLanguage(sc);

     }

    /**
     * This method change language after user input.
     * @param sc
     */
     private void changeLanguage(Scanner sc) {

        String input;
        while (true) {
            input = sc.next();

            if (input.equals(View.RUS)) {
                controllerRu.checkInputData(sc);
                break;
            } else if (input.equals(View.ENG)) {
                controllerEng.checkInputData(sc);
                break;
            } else {
                view.message(View.WRONG);
                continue;
            }
        }
     }

}
