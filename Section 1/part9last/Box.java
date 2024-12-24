import java.util.ArrayList;

public class Box implements Packables {
    private ArrayList<Packables> box;
    // as kg
    private double maxWeight;

    public Box(double maxWeight) {
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(Packables item) {
        double sum = 0;
        for (Packables packables : box) {
            sum += packables.weight();
        }
        if (item.weight() + sum <= this.maxWeight) {
            box.add(item);
        }
    }

    public String toString() {
        String itemOrItems = "items";
        if (this.box.size() == 1) {
            itemOrItems = "item";
        }
        return "Box: " + this.box.size() + " " + itemOrItems + ", " + "total weight " + this.weight() + " kg";
    }

    public double weight() {
        double currentWeight = 0;
        for (Packables packables : box) {
            currentWeight += packables.weight();
        }
        return currentWeight;
    }
}
