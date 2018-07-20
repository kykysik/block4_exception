package regEx.Model;

import java.util.ArrayList;

public class Model {

    private String secondName; // фамилия
    private String firstName;
    private String middleName;
    private ArrayList<String> list = new ArrayList<>();

    public Model() {
        list.add("Bogdan");
        list.add("Valera");
        list.add("Богдан");
        list.add("Валера");
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(String list) {
        this.list.add(list);
    }

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
