package edu.ucalgary.oop;
import java.util.ArrayList;

/**
 *
 */
public class Supply {
    private String type;
    private int quantity;

    /**
     *
     * @param type
     * @param quantity
     */
    public Supply(String type, int quantity) {

        this.type = type;
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
