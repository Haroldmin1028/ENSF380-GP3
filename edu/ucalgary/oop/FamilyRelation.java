package edu.ucalgary.oop;

/**
 *
 */
public class FamilyRelation {
    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;

    /**
     *
     * @param personOne
     * @param relationshipTo
     * @param personTwo
     */
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    /**
     *
     * @return
     */
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    /**
     *
     * @return
     */
    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    /**
     *
     * @return
     */
    public String getRelationshipTo() {
        return relationshipTo;
    }

    /**
     *
     * @param personOne
     */
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }

    /**
     *
     * @param personTwo
     */
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }

    /**
     *
     * @param relationshipTo
     */
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
}
