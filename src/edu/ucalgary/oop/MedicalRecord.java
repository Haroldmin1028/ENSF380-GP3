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
     * @return location
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @return treatmentDetails
     */
    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    /**
     *
     * @return dateOfTreatment
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
     * @throws IllegalArgumentException if the date inputted has an invalid format
     */
    public void setDateOfTreatment(String dateOfTreatment) {
        if (!isValidDateFormat(dateOfTreatment)){
            throw new IllegalArgumentException("Not a valid Date");
        }

        this.dateOfTreatment = dateOfTreatment;
    }

    /**
     * Checks if the provided date has a valid format.
     * @param date
     * @return false if invalid date format is detected, else true
     */
    private boolean isValidDateFormat(String date) {
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
}
