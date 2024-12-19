import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book bookObject = new Book("Book Object", 2000, "...");
        Book bookObject2 = new Book("Book Object", 2000, "...");
        books.add(bookObject);
        books.add(bookObject2);
        int bookOne = books.get(0).getName().hashCode();
        int bookTwo = books.get(1).getName().hashCode();
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