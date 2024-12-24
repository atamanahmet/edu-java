import java.util.ArrayList;
import java.util.Arrays;

public class OneItemBox extends Box1 {
    private ArrayList<Item> list;

    public OneItemBox() {
        super();
        this.list = new ArrayList<>();
    }

    public void add(Item item) {
        if (list.size() == 0) {
            list.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return list.contains(item);
    }
}
