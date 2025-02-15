package edu.ucalgary.oop;

/**
 *
 */
public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    /**
     *
     * @param location
     * @param treatmentDetails
     * @param dateOfTreatment
     */
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    /**
     *
     * @return
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @return
     */
    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    /**
     *
     * @return
     */
    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    /**
     *
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @param treatmentDetails
     */
    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    /**
     *
     * @param dateOfTreatment
     */
    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }

    /**
     *
     * @param date
     * @return
     */
    private boolean isValidDateFormat(String date) {
        return false;
    }
}
