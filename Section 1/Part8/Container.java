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

    private int currentAmount;
    private int limit = 100;

    public Container() {

    }

    public String toString() {
        return this.currentAmount + "/" + this.limit;
    }

    public int contains() {
        return this.currentAmount;
    }

    public int getLimit() {
        return this.limit;
    }

    public void setAmount(int amount) {
        if (amount > 0 && amount <= 100) {
            this.currentAmount = amount;

        }
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.currentAmount + amount > limit) {
                this.currentAmount = limit;
            } else {
                this.currentAmount += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.currentAmount - amount < 0) {
                this.currentAmount = 0;
            } else {
                this.currentAmount -= amount;
            }
        }
    }

    public void move(int amount, Container second) {
        if (amount > 0 && this.currentAmount > 0) {
            if (this.currentAmount - amount < 0) {
                if (second.contains() + this.currentAmount <= 100) {
                    second.setAmount(this.currentAmount + second.contains());
                } else {
                    second.setAmount(second.getLimit());
                }
                this.currentAmount = 0;
            } else {
                if (second.contains() + this.currentAmount <= 100) {
                    second.setAmount(amount + second.contains());
                } else {
                    second.setAmount(second.getLimit());
                }
                this.currentAmount -= amount;

            }
        }
    }
    // public void moveRepeat(Container second){
    // if(second.contains()+this.currentAmount<=100){
    // second.setAmount(this.currentAmount+second.contains());
    // }
    // else{
    // second.setAmount(second.getLimit());
    // }
    // }
}
