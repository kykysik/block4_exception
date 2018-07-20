package regEx.View;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static regEx.View.TextConstant.*;

/**
 * View class in MVC model.
 */
public class View {

    public static final String RUS = "RUS";
    public static final String ENG = "ENG";

    static String MESSAGES_BUNDLE_NAME = "resources";

    public static ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME);

    /**
     * initialization of LOCALE
     * @param locale
     */
    public void init(String locale) {
        bundle = ResourceBundle.getBundle(
                MESSAGES_BUNDLE_NAME,
                new Locale(locale));
    }

    /**
     * output message
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);

    }
    /**
     * Concatenation of string
     * @param message
     * @return
     */
    public String concatenationString(String... message ){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    /**
     * @param message
     * @throws UnsupportedEncodingException
     */
    public void printStringInput(String message) throws UnsupportedEncodingException {
        printMessage(concatenationString(
                new String(bundle.getString(message).getBytes(ISO_8859_1), "UTF-8")));
    }

    /**
     * output of result
     * @param second
     * @param first
     */
    public void printResult(String second, String first) {
        printMessage(concatenationString(
                second,
                bundle.getString(SPACE),
                first,
                bundle.getString(DOT)));
    }

    /**
     * used, if input is wrong
     * @throws UnsupportedEncodingException
     */
    public void printWrongStringInput() throws UnsupportedEncodingException {
        printMessage(concatenationString(
                new String(bundle.getString(WRONG_INPUT_DATA).getBytes(ISO_8859_1), "UTF-8")));
    }
}
