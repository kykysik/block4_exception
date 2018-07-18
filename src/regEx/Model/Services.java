package regEx.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Service for ENG language
 */
public class Services {

    private Model model;
    private Pattern pattern;
    private Pattern pattern1;
    private static Matcher firstLetter ;
    public String first ;

    public Services(Model model, String regName, String regLastLetter){
        this.model = model;
        pattern = Pattern.compile(regName);
        pattern1 = Pattern.compile(regLastLetter);
    }

    /**
     * verifies the SecondName for correctness
     * @param res
     * @return true, if regEx is correct
     */
    public boolean checkSecondName(String res) {
        Matcher regEx = pattern.matcher(res);

        if(regEx.matches()) {
            model.setSecondName(res);
            return true;
        }
        return false;
    }

    /**
     * verifies the FirstName for correctness
     * @param res
     * @return true, if regEx is correct
     */
    public boolean checkFirstName(String res) {
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
     * @param res
     * @return true, if regEx is correct
     */
    public boolean checkMiddleName(String res) {
        Matcher regEx = pattern.matcher(res);

        if(regEx.matches()) {
            model.setMiddleName(res);
            return true;
        }
        return false;
    }
}
