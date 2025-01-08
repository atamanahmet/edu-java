import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {
    List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void move(int dx, int dy) {
        for (Movable organism : list) {
            organism.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public String toString() {
        String temp = "";
        for (Movable organism : list) {
            temp += organism.toString() + "\n";
        }
        return temp;
    }
}
