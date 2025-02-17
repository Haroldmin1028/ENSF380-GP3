package edu.ucalgary.oop;
import java.util.*;

/**
 *
 */
public class Location {
    private String name;
    private String address;
    // ArrayList<DisasterVictim> occupants;
    //private ArrayList<Supply> supplies;
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
        //this.occupants = new ArrayList<>();
        //this.supplies = new ArrayList<>();
        this.occupants = new DisasterVictim[0];
        this.supplies = new Supply[0];
    }

    /**
     *
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
     *
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
     *
     * @param supply
     */
    public void addSupply(Supply supply) {



//        Supply[] supplies = new Supply[this.supplies.length + 1];
//        for (int i = 0; i < this.supplies.length; i++) {
//            supplies[i] = this.supplies[i];
//        }
//        supplies[this.supplies.length] = supply;
//        this.supplies = supplies;
    }

    /**
     *
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
     * @return
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
     * @return
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
     *
     * @return
     */
    public DisasterVictim[] getOccupants() {
        return occupants;
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
     * @return
     */
    public Supply[] getSupplies() {
        return supplies;
    }

    /**
     *
     * @param supplies
     */
    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }
}
