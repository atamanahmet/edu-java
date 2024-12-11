/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
public class Container {

    private int liquidAmount;
    private int limit;

    public Container() {
        this(0, 100);
    }

    public Container(int liquidAmount, int limit) {
        this.liquidAmount = liquidAmount;
        this.limit = limit;
    }

    public int contains() {
        return this.liquidAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.liquidAmount + amount <= this.limit) {
                this.liquidAmount += amount;
            } else {
                this.liquidAmount = this.limit;
            }
        }

    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.liquidAmount - amount >= 0) {
                this.liquidAmount -= amount;
            } else {
                this.liquidAmount = 0;
            }
        }

    }

    public String toString() {
        return this.liquidAmount + "/" + this.limit;
    }
}
