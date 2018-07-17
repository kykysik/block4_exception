package regEx.Model;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Service for ENG language
 */
public class ServicesENG {

    private Model model;
    private Pattern pattern = Pattern.compile("^[a-zA-Z-]+$");
    private Pattern pattern1 = Pattern.compile("[a-zA-Z]");
    private static Matcher firstLetter ;
    public String first ;

    public ServicesENG(Model model){
        this.model = model;
    }

    /**
     * verifies the SecondName for correctness
     * @param sc
     * @return
     */
    public boolean checkSecondName(Scanner sc) {
        String res = sc.next();
        Matcher regEx = pattern.matcher(res);

        if(regEx.matches()) {
            model.setSecondName(res);
            return true;
        }
        return false;
    }

    /**
     * verifies the FirstName for correctness
     * @param sc
     * @return
     */
    public boolean checkFirstName(Scanner sc) {
        String res = sc.next();
        Matcher regEx = pattern.matcher(res);
        if(regEx.matches()) {
            model.setFirstName(res);
            firstLetter = pattern1.matcher(res);
            if(firstLetter.find()) {
                first = firstLetter.group();
            }
            return true;
        }
        return false;
    }

    /**
     * verifies the MiddleName for correctness
     * @param sc
     * @return
     */
    public boolean checkMiddleName(Scanner sc) {
        String res = sc.next();
        Matcher regEx = pattern.matcher(res);

        if(regEx.matches()) {
            model.setMiddleName(res);
            return true;
        }
        return false;
    }
}
