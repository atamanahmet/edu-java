import java.util.ArrayList;

public class BoxWithMaxWeight extends Box1 {
    private int capacity;
    private int currentWeight;
    private ArrayList<Item2> itemList;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.itemList = new ArrayList<>();
        this.capacity = capacity;
        this.currentWeight = 0;
    }

    public void add(Item2 item) {
        int itemWeight = item.getWeight();
        if (itemWeight + this.currentWeight <= this.capacity) {
            this.itemList.add(item);
            this.currentWeight += itemWeight;
        }
    }

    public boolean isInBox(Item2 item) {
        if (this.itemList.contains(item)) {
            return true;
        }
        return false;
    }
}
