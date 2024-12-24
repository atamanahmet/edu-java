import java.util.ArrayList;

public class BoxWithMaxWeight extends Box1 {
    private int capacity;
    private int currentWeight;
    private ArrayList<Item> itemList;

    public BoxWithMaxWeight(int capacity) {
        super();
        this.itemList = new ArrayList<>();
        this.capacity = capacity;
        this.currentWeight = 0;
    }

    public void add(Item item) {
        int itemWeight = item.getWeight();
        if (itemWeight + this.currentWeight <= this.capacity) {
            this.itemList.add(item);
            this.currentWeight += itemWeight;
        }
    }

    public boolean isInBox(Item item) {
        if (this.itemList.contains(item)) {
            return true;
        }
        return false;
    }
}
