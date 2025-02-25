package edu.ucalgary.oop;
import java.util.*;

/**
 *
 */
public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    /**
     * Constructor to initialize a Location using the name and address of the place
     * @param name
     * @param address
     */
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new DisasterVictim[0];
        this.supplies = new Supply[0];
    }

    /**
     * Adds a DisasterVictim to the occupants list
     * @param occupant
     */
    public void addOccupant(DisasterVictim occupant) {
        DisasterVictim[] occupants = new DisasterVictim[this.occupants.length + 1];
        for (int i = 0; i < this.occupants.length; i++) {
            occupants[i] = this.occupants[i];
        }
        occupants[this.occupants.length] = occupant;
        this.occupants = occupants;
    }

    /**
     * Removes a DisasterVictim from the occupants list
     * @param occupant
     */
    public void removeOccupant(DisasterVictim occupant) {
        DisasterVictim[] occupants = new DisasterVictim[this.occupants.length - 1];
        int i;
        for (i = 0; i < this.occupants.length; i++) {
            if (this.occupants[i] == occupant) {break;}
            occupants[i] = this.occupants[i];
        }
        for (int j = i + 1; j < this.occupants.length; j++) {
            occupants[j] = this.occupants[j - 1];
        }
        this.occupants = occupants;
    }

    /**
     * Adds a Supply to the supplies list
     * @param supply
     */
    public void addSupply(Supply supply) {
        
        Supply[] supplies = new Supply[this.supplies.length + 1];
        for (int i = 0; i < this.supplies.length; i++) {
            supplies[i] = this.supplies[i];
        }
        supplies[this.supplies.length] = supply;
        this.supplies = supplies;
    }

    /**
     * Removes a Supply from the supplies list
     * @param supply
     */
    public void removeSupply(Supply supply) {
        Supply[] supplies = new Supply[this.supplies.length - 1];
        int i;
        for (i = 0; i < this.supplies.length; i++) {
            if (this.supplies[i] == supply) {break;}
            supplies[i] = this.supplies[i];
        }
        for (int j = i + 1; j < this.supplies.length; j++) {
            supplies[j] = this.supplies[j - 1];
        }
        this.supplies = supplies;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the occupants as an ArrayList
     * @return occupantsAsList
     */
    public ArrayList<DisasterVictim> getOccupants() {
        ArrayList<DisasterVictim> occupantsAsList = new ArrayList<>(Arrays.asList(occupants));
        return occupantsAsList;
    }

    /**
     * Sets the occupants using an array
     * @param occupants
     */
    public void setOccupants(ArrayList<DisasterVictim> occupants) {
        this.occupants = occupants.toArray(new DisasterVictim[0]);
    }
    

    /**
     * Returns the supplies as an ArrayList
     * @return suppliesAsList
     */
    public ArrayList<Supply> getSupplies() {
        ArrayList<Supply> suppliesAsList = new ArrayList<>(Arrays.asList(supplies));
        return suppliesAsList;
    }

    /**
     * Sets the supplies using an array
     * @param supplies
     */
    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies.toArray(new Supply[0]);
    }
}
