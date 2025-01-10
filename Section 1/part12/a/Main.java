package a;

// import a.List;
// import java.util.ArrayList;
// import java.util.List;

public class Main {
    // ArrayList<String> list = new ArrayList<>();
    // List<String> list2 = new ArrayList<>();
    public static void main(String[] args) {
        List<String> myList = new List<>();
        // // myList.add("hello");
        // // myList.add("world");
        for (int i = 0; i < 25; i++) {
            myList.add("hello" + i);

        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + " " + myList.get(i));
        }
        myList.remove("hello3");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + " " + myList.get(i));
        }
        // List<String> myList = new List<>();
        // System.out.println(myList.contains("hello"));
        // myList.add("hello");
        // System.out.println(myList.contains("hello"));
    }
}
