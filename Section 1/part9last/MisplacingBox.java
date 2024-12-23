import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> list = new ArrayList<>();

    public MisplacingBox() {
        super();
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        if (!list.contains(item)) {
            list.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
