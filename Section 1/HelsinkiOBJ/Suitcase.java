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

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>(maxWeight);
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {

        if (!this.items.contains(item) && (item.getWeight() + this.currentWeight) < this.maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    public String toString() {
        String placeHolder = "items";
        if (items.size() == 1) {
            placeHolder = "item";
        }
        return items.size() + " " + placeHolder + " (" + currentWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        Item heaviest = this.items.get(0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
