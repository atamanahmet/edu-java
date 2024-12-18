// // import java.util.HashMap;
// // import java.util.ArrayList;

// // public class Main {

// // public static void main(String[] args) {
// // HashMap<Integer, Person> map = new HashMap<>();
// // ArrayList<Person> persons = new ArrayList<>();
// // for (int i = 0; i < 100; i++) {
// // persons.add(new Person(String.valueOf(i), i));
// // }
// // for (int j = 0; j < persons.size(); j++) {

// // map.put(j, persons.get(j));

// // }
// // // for (int i = 0; i < map.size(); i++) {
// // // System.out.println(map.get(i));
// // // }
// // System.out.println(map);
// // }
// // }

// import java.util.HashMap;

// public class Program {

// public static void main(String[] args) {
// // Test your program here!
// HashMap<String, Book> hashmap = new HashMap<>();
// hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
// hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

// printValues(hashmap);
// System.out.println("---");
// printValueIfNameContains(hashmap, "prejud");
// }

// public static void printValues(HashMap<String, Book> hashMap) {
// for (Book book : hashMap.values()) {
// System.out.println(book);
// }
// }

// public static void printValueIfNameContains(HashMap<String, Book> hashMap,
// String text) {
// for (Book book : hashMap.values()) {
// if (book.getName().contains(text)) {
// System.out.println(book);
// }
// }
// }

// }

// import java.util.HashMap;

// public class IOU {

// private HashMap<String, Double> hashMap;

// public IOU() {
// this.hashMap = new HashMap<>();
// }

// public void setSum(String toWhom, double amount) {
// hashMap.put(toWhom, amount);
// }

// public double howMuchDoIOweTo(String toWhom) {
// // if(hashMap.get(toWhom)!=null){
// // return hashMap.get(toWhom);
// // }
// // return 0;
// return hashMap.getOrDefault(toWhom, 0.0);
// }
// }
