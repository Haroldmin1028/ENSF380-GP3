package edu.ucalgary.oop;

/**
 *
 */
public class FamilyRelation {
    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;

    /**
     * Constructor to initialize a FamilyRelation with two DisasterVictims and the relationship between them.
     * @param personOne The first person in the relation
     * @param relationshipTo The family relation of personOne to personTwo
     * @param personTwo The second person in the relation
     */
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    /**
     * Retrieves the first person in the relation.
     * @return personOne
     */
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    /**
     *
     * @param personOne
     */
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }

    /**
     * Retrieves the second person in the relation.
     * @return personTwo
     */
    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    /**
     *
     * @param personTwo
     */
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }

    /**
     * Retrieves the family relationship.
     * @return relationshipTo
     */
    public String getRelationshipTo() {
        return relationshipTo;
    }

    /**
     * Specifies
     * @param relationshipTo
     */
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
}
