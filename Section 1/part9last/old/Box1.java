
import java.util.ArrayList;

public abstract class Box1 {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box1.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
