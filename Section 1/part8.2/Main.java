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
            for (Person person : persons) {
                map.put(j, person);
            }

        }
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}