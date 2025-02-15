package edu.ucalgary.oop;

/**
 *
 */
public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter;

    /**
     *
     * @param firstName
     * @param ENTRY_DATE
     */
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
    }

    /**
     *
     * @param firstName
     * @param ENTRY_DATE
     * @param dateOfBirth
     */
    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *
     * @return
     */
    public int getAssignedSocialID() {
        return ASSIGNED_SOCIAL_ID;
    }

    /**
     *
     * @return
     */
    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    /**
     *
     * @param connections
     */
    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = connections;
    }

    /**
     *
     * @return
     */
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    /**
     *
     * @param records
     */
    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = records;
    }

    /**
     *
     * @return
     */
    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    /**
     *
     * @param belongings
     */
    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = belongings;
    }

    /**
     *
     * @param supply
     */
    public void addPersonalBelonging(Supply supply) {
        // add
    }

    /**
     *
     * @param unwantedSupply
     */
    public void removePersonalBelonging(Supply unwantedSupply) {
        // remove
    }

    /**
     *
     * @param relation
     */
    public void addFamilyConnection(FamilyRelation relation){
        // add
    }

    /**
     *
     * @param exRelation
     */
    public void removeFamilyConnection(FamilyRelation exRelation) {
        // remove
    }

    /**
     *
     * @param record
     */
    public void addMedicalRecord(MedicalRecord record){
        // add
    }

    /**
     *
     * @return
     */
    public String getEntryDate() {
        return ENTRY_DATE;
    }

    /**
     *
     * @return
     */
    public String getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    //move bottom 3 functions to top
    private static int generateSocialID() {
        // generate
    }

    /**
     *
     * @param date
     * @return
     */
    private static boolean isValidDateFormat(String date) {
        // check
    }

    /**
     *
     * @param dateStr
     * @return
     */
    private static int convertDateStringToInt(String dateStr) {
        // convert
    }
}
