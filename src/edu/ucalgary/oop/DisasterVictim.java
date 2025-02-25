package edu.ucalgary.oop;
import java.util.*;

/**
 *
 */
public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;

    private ArrayList<FamilyRelation> familyConnections;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<Supply> personalBelongings;

    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter;

    /**
     *
     * @param firstName
     * @param ENTRY_DATE
     * @throws IllegalArgumentException if entry date is invalid
     */
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        if (!isValidDateFormat(ENTRY_DATE)) {
            throw new IllegalArgumentException("Invalid entry date");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new ArrayList<FamilyRelation>();
        this.medicalRecords = new ArrayList<MedicalRecord>();
        this.personalBelongings = new ArrayList<Supply>();
    }

    /**
     *
     * @param firstName
     * @param ENTRY_DATE
     * @param dateOfBirth
     * @throws IllegalArgumentException if entry date is invalid, date of birth is invalid, or date of birth is after the entry date
     */
    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        if (!isValidDateFormat(ENTRY_DATE)) {
            throw new IllegalArgumentException("Invalid entry date");
        }
        else if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date of birth");
        }

        if (convertDateStringToInt(dateOfBirth) > convertDateStringToInt(ENTRY_DATE)){
            throw new IllegalArgumentException("Date of birth cannot come after entry date.");
        }

        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.dateOfBirth = dateOfBirth;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new ArrayList<FamilyRelation>();
        this.medicalRecords = new ArrayList<MedicalRecord>();
        this.personalBelongings = new ArrayList<Supply>();
    }

    /**
     * Creates a unique identifier for each DisasterVictim.
     * @return counter incremented by 1
     */
    private static int generateSocialID() {
        counter++;
        return counter;
    }

    /**
     * Checks if the provided date has a valid format.
     * @param date
     * @return false if invalid date format is detected, else true
     */
    private static boolean isValidDateFormat(String date) {
        String[] split = date.split("-");
        if (split.length != 3) {
            return false;
        }

        try {
            int year = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int day = Integer.parseInt(split[2]);

            if (month < 1 || month > 12 || day < 1) {
                return false;
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    return false;
                }
            }
            else if (month == 2) {
                if (day > 29) {
                    return false;
                }
            }
            else {
                if (day > 31) {
                    return false;
                }
            }
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Converts a date with a valid format to an integer.
     * @param dateStr
     * @return date as an Integer
     */
    private static int convertDateStringToInt(String dateStr) {
        String combine = dateStr.replace("-", "");
        return Integer.parseInt(combine);
    }

    /**
     * Adds a personal belonging to the list.
     * @param supply
     */
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }

    /**
     * Removes a personal belonging from the list.
     * @param unwantedSupply
     */
    public void removePersonalBelonging(Supply unwantedSupply) {
        personalBelongings.remove(unwantedSupply);
    }

    /**
     * Adds a family relation to the list.
     * @param relation
     */
    public void addFamilyConnection(FamilyRelation relation){
        familyConnections.add(relation);
    }

    /**
     * Removes a family relation from the list.
     * @param exRelation
     */
    public void removeFamilyConnection(FamilyRelation exRelation) {
        familyConnections.remove(exRelation);
    }

    /**
     * Adds a medical record to the list.
     * @param record
     */
    public void addMedicalRecord(MedicalRecord record){
        medicalRecords.add(record);
    }

    /**
     *
     * @return firstName
     */
    public String getFirstName() {return firstName;}

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {this.firstName = firstName;}

    /**
     *
     * @return lastName
     */
    public String getLastName() {return lastName;}

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {this.lastName = lastName;}

    /**
     *
     * @return dateOfBirth
     */
    public String getDateOfBirth() {return dateOfBirth;}

    /**
     * Sets the birthdate if the provided date has a valid format.
     * @param dateOfBirth
     * @throws IllegalArgumentException if the date has an invalid format
     */
    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date of birth");
        }
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *
     * @return ASSIGNED_SOCIAL_ID
     */
    public int getAssignedSocialID() {return ASSIGNED_SOCIAL_ID;}

    /**
     *
     * @return familyConnections as an array
     */
    public FamilyRelation[] getFamilyConnections() {
        return familyConnections.toArray(new FamilyRelation[0]);
    }

    /**
     *
     * @param connections
     */
    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = new ArrayList<>(Arrays.asList(connections));
    }

    /**
     *
     * @return medicalRecords as an array
     */
    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords.toArray(new MedicalRecord[0]);
    }

    /**
     *
     * @param records
     */
    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = new ArrayList<>(Arrays.asList(records));
    }

    /**
     *
     * @return personalBelongings as an array
     */
    public Supply[] getPersonalBelongings() {
        return personalBelongings.toArray(new Supply[0]);
    }

    /**
     *
     * @param belongings
     */
    public void setPersonalBelongings(Supply[] belongings) {
        this.personalBelongings = new ArrayList<>(Arrays.asList(belongings));
    }

    /**
     *
     * @return ENTRY_DATE
     */
    public String getEntryDate() {return ENTRY_DATE;}

    /**
     *
     * @return comments
     */
    public String getComments() {return comments;}

    /**
     *
     * @param comments
     */
    public void setComments(String comments) {this.comments = comments;}

    /**
     *
     * @return gender
     */
    public String getGender() {return gender;}

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {this.gender = gender;}
}
