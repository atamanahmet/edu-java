/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> holds;
    private int currentWeight = 0;

    public Hold(int maxWeight) {
        this.holds = new ArrayList<>(maxWeight);
    }

    public void addSuitcase(Suitcase suitcase) {
        holds.add(suitcase);
        currentWeight += suitcase.totalWeight();
    }

    public String toString() {
        return this.holds.size() + " suitcases (" + currentWeight + " kg)";
    }
}
