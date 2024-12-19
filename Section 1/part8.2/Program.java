import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        HashMap<Book, String> borrowers = new HashMap<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        Book bookObject2 = new Book("Book Object", 2000, "...");
        books.add(bookObject);
        books.add(bookObject2);
        borrowers.put(bookObject, "person1");
        borrowers.put(bookObject2, "person1");

        // int bookOne = books.get(0).hashCode();
        // int bookTwo = books.get(1).hashCode();
        int bookOne = borrowers.get(bookObject).hashCode();
        int bookTwo = borrowers.get(bookObject2).hashCode();

        System.out.println(bookOne);
        System.out.println(bookTwo);

        // if (books.contains(bookObject)) {
        // System.out.println("Book Object was found.");
        // }

        // bookObject = new Book("Book Object", 2000, "...");

        // if (!books.contains(bookObject)) {
        // System.out.println("Book Object was not found.");
        // }
    }

}