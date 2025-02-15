package edu.ucalgary.oop;

/**
 *
 */
public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    /**
     *
     * @param inquirer
     * @param missingPerson
     * @param dateOfInquiry
     * @param infoProvided
     * @param lastKnownLocation
     */
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    /**
     *
     * @return
     */
    public Inquirer getInquirer() {
        return inquirer;
    }

    /**
     *
     * @param inquirer
     */
    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    /**
     *
     * @return
     */
    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    /**
     *
     * @param missingPerson
     */
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    /**
     *
     * @return
     */
    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    /**
     *
     * @param dateOfInquiry
     */
    public void setDateOfInquiry(String dateOfInquiry) {
        this.dateOfInquiry = dateOfInquiry;
    }

    /**
     *
     * @return
     */
    public String getInfoProvided() {
        return infoProvided;
    }

    /**
     *
     * @param infoProvided
     */
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    /**
     *
     * @return
     */
    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    /**
     *
     * @param lastKnownLocation
     */
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    /**
     *
     * @param date
     * @return
     */
    private boolean isValidDateFormat(String date) {
        return false;
    }

    /**
     *
     * @return
     */
    public String getLogDetails() {
        return "";
    }
}
