
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(612133, "name for the book " + i));
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        // books.add(books.id: 16643; name: name 16643)

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            int id = books.get(i).getId();
            if (id == searchedId) {
                return i;
            }
        }
        return -1;
    }

    // @SuppressWarnings("unlikely-arg-type")
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        int mid;

        while (true) {
            mid = (end + begin) / 2;
            long currentId = books.get(mid).getId();
            if (begin > end) {
                break;
            } else if (currentId == searchedId) {
                System.out.println(books.get(mid));
                return mid;
            } else if (currentId > searchedId) {
                end = mid - 1;
            } else if (currentId < searchedId) {
                begin = mid + 1;
            }
        }
        return -1;

    }
}
