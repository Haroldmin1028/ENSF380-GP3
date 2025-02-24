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
        if (!isValidDateFormat(dateOfInquiry)){
            throw new IllegalArgumentException("Invalid Date");
        }
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
     * @return
     */
    public String getLogDetails() {
        String log = ("Inquirer: " + inquirer.getFirstName() + ", Missing Person: " + missingPerson.getFirstName()
                      + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: "
                      +  infoProvided + ", Last Known Location: " + lastKnownLocation.getName());
        return log;                         
                                   
    }
}
