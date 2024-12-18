import java.util.HashMap;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<>();
        ArrayList<Person> persons = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            persons.add(new Person(String.valueOf(i), i));
        }
        for (int j = 0; j < persons.size(); j++) {

            map.put(j, persons.get(j));

        }
        // for (int i = 0; i < map.size(); i++) {
        // System.out.println(map.get(i));
        // }
        System.out.println(map);
    }
}