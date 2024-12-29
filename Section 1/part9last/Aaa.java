import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aaa {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));
        humans.add(new Human("Matti", 150000));
        System.out.println(humans);
        /*
         * Uncomment the comment below when you have completed the compareTo-method.
         */
        Collections.sort(humans);
        System.out.println(humans);
    }

}
