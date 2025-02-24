package edu.ucalgary.oop;
import java.sql.Array;
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
    //private FamilyRelation[] familyConnections;
    //private MedicalRecord[] medicalRecords;
    //private Supply[] personalBelongings;

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
     *
     * @return
     */
    private static int generateSocialID() {
        counter++;
        return counter;
    }

    /**
     *
     * @param date
     * @return
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
     *
     * @param dateStr
     * @return
     */
    private static int convertDateStringToInt(String dateStr) {
        String combine = dateStr.replace("-", "");
        return Integer.parseInt(combine);
    }

    /**
     *
     * @param supply
     */
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }

    /**
     *
     * @param unwantedSupply
     */
    public void removePersonalBelonging(Supply unwantedSupply) {
        personalBelongings.remove(unwantedSupply);
    }

    /**
     *
     * @param relation
     */
    public void addFamilyConnection(FamilyRelation relation){
        familyConnections.add(relation);
    }

    /**
     *
     * @param exRelation
     */
    public void removeFamilyConnection(FamilyRelation exRelation) {
        familyConnections.remove(exRelation);
    }

    /**
     *
     * @param record
     */
    public void addMedicalRecord(MedicalRecord record){
        medicalRecords.add(record);
    }

    /**
     *
     * @return
     */
    public String getFirstName() {return firstName;}

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {this.firstName = firstName;}

    /**
     *
     * @return
     */
    public String getLastName() {return lastName;}

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {this.lastName = lastName;}

    /**
     *
     * @return
     */
    public String getDateOfBirth() {return dateOfBirth;}

    /**
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("Invalid date of birth");
        }
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *
     * @return
     */
    public int getAssignedSocialID() {return ASSIGNED_SOCIAL_ID;}

    /**
     *
     * @return
     */
    public FamilyRelation[] getFamilyConnections() {
        //return familyConnections;
        return familyConnections.toArray(new FamilyRelation[0]);
    }

    /**
     *
     * @param connections
     */
    public void setFamilyConnections(FamilyRelation[] connections) {
        //this.familyConnections = connections;
        this.familyConnections = new ArrayList<>(Arrays.asList(connections));
    }

    /**
     *
     * @return
     */
    public MedicalRecord[] getMedicalRecords() {
        //return medicalRecords;
        return medicalRecords.toArray(new MedicalRecord[0]);
    }

    /**
     *
     * @param records
     */
    public void setMedicalRecords(MedicalRecord[] records) {
        //this.medicalRecords = records;
        this.medicalRecords = new ArrayList<>(Arrays.asList(records));
    }

    /**
     *
     * @return
     */
    public Supply[] getPersonalBelongings() {
        //return personalBelongings;
        return personalBelongings.toArray(new Supply[0]);
    }

    /**
     *
     * @param belongings
     */
    public void setPersonalBelongings(Supply[] belongings) {
        //this.personalBelongings = belongings;
        this.personalBelongings = new ArrayList<>(Arrays.asList(belongings));
    }

    /**
     *
     * @return
     */
    public String getEntryDate() {return ENTRY_DATE;}

    /**
     *
     * @return
     */
    public String getComments() {return comments;}

    /**
     *
     * @param comments
     */
    public void setComments(String comments) {this.comments = comments;}

    /**
     *
     * @return
     */
    public String getGender() {return gender;}

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {this.gender = gender;}
}
