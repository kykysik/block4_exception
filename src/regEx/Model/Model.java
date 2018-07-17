package regEx.Model;

public class Model {

    private String secondName; // фамилия
    private String firstName;
    private String middleName;

    /**
     * @return secondName.
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     *This method set string value in secondName
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method set string value in firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * This method set string value in middleName
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


}
