
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
            books.add(new Book(i, "name for the book " + i));
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

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
        for (Book book : books) {
            int id = book.getId();
            if (id == searchedId) {
                return id;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size();
        int mid;
        while (true) {
            mid = (end - begin) / 2 + begin;
            if (books.get(mid).getId() == searchedId) {
                return books.get(mid).getId();
            } else if (books.get(mid).getId() > searchedId) {
                end = mid + 1;
            } else if (books.get(mid).getId() < searchedId) {
                begin = mid - 1;
            }
        }
        // return -1;

    }
}
// 1 ortadaki rakamı bul
// ortadaki rakam eşitmi büyük mü küçük mü bak
// büyükse arama için ortadan sona kadar olanı topla 2ye böl devam et
// küçükse ortadan 0 a olan aralığı topla 2 ye böl ortadakine bak.
// ortada numara virgüllüyse floor yap
//

// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

// 15-8+1