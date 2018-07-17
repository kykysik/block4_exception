package regEx.View;

/**
 * View class in MVC model.
 */
public class View {

    public static final String IS_CORRECT_SECOND_NAME = "Your Second Name is correct";
    public static final String IS_CORRECT_MIDDLE_NAME = "Your Middle Name is correct";
    public static final String IS_CORRECT_FIRST_NAME = "Your First Name is correct";
    public static final String INPUT_SECOND_NAME = "Input your Second Name";
    public static final String INPUT_MIDDLE_NAME = "Input your Middle Name";
    public static final String INPUT_FIRST_NAME = "Input your First Name";
    public static final String WRONG = "Your input is WRONG";
    public static final String SPACE = " ";
    public static final String DOT = ".";
    public static final String Choose_Language = "Choose your language between RUS and ENG";
    public static final String RUS = "RUS";
    public static final String ENG = "ENG";

    /**
     * output method
     * @param string
     */
    public void message(String string) {
        System.out.println(string);
    }
}
