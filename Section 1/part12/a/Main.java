package a;

// import a.List;
// import java.util.ArrayList;
// import java.util.List;

public class Main {
    // ArrayList<String> list = new ArrayList<>();
    // List<String> list2 = new ArrayList<>();
    public static void main(String[] args) {
        List<String> myList = new List<>();
        // myList.add("hello");
        // myList.add("world");
        for (int i = 0; i < 100; i++) {
            try {
                myList.add("hello" + i);
            } catch (ClassCastException e) {
                myList.add("hello" + i);
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
