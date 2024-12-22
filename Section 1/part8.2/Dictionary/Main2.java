
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // write your test code here
        // Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN",
        // 1200);
        // Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100
        // Helsinki", 5400);
        // System.out.println(ada);
        // System.out.println(esko);
        //
        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles
        // 90028");
        //
        // int i = 0;
        // while (i < 25) {
        // ollie.study();
        // i = i + 1;
        // }
        // System.out.println(ollie);
        // ArrayList<Person> persons = new ArrayList<Person>();
        // persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN",
        // 1200));
        // persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        // printPersons(persons);
        ArrayList<String> list = new ArrayList<>();
        list.add("item1");
        list.add("item2");
        ArrayList list2 = (ArrayList) list.clone();

        list.remove(0);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list2.getClass());
        // System.out.println(list.getClass());

    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
