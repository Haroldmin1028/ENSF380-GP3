package edu.ucalgary.oop;

/**
 *
 */
public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    /**
     *
     * @param name
     * @param address
     */
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return
     */
    public DisasterVictim[] getOccupants() {
        return occupants;
    }

    /**
     *
     * @return
     */
    public Supply[] getSupplies() {
        return supplies;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @param occupants
     */
    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    /**
     *
     * @param supplies
     */
    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }

    /**
     *
     * @param occupant
     */
    public void addOccupant(DisasterVictim occupant) {

    }

    /**
     *
     * @param supply
     */
    public void addSupply(Supply supply) {

    }

    /**
     *
     * @param occupant
     */
    public void removeOccupant(DisasterVictim occupant) {
    }

    /**
     *
     * @param supply
     */
    public void removeSupply(Supply supply) {

    }
}
