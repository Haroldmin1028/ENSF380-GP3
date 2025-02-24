package edu.ucalgary.oop;

/**
 *
 */
public class Inquirer {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String INFO;
    private final String SERVICES_PHONE;

    /**
     *
     * @param firstName
     * @param lastName
     * @param phone
     * @param info
     */
    public Inquirer(String firstName, String lastName, String phone, String info){
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.INFO = info;
        this.SERVICES_PHONE = phone;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return FIRST_NAME;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return LAST_NAME;
    }

    /**
     *
     * @return
     */
    public String getInfo() {
        return INFO;
    }

    /**
     *
     * @return
     */
    public String getServicesPhoneNum() {
        return SERVICES_PHONE;
    }

}
