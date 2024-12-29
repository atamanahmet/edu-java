import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Aaa {
    public static void main(String[] args) {
        // List<String[]> list = new ArrayList<>();
        // List<String[]> listBuffer = new ArrayList<>();

        // try {
        // Files.lines(Paths.get("literacy.csv")).map(line -> line.split(","))
        // .map(arr -> new String[] { arr[0], arr[1], arr[2] }).forEach(arr ->
        // list.add(arr));

        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }
        // list.stream().forEach(arr -> System.out.println(arr[0] + ", " + arr[1] + ", "
        // + arr[2]));
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageReq = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name, ageReq));
        }
        Comparator<Book> comp = Comparator.comparing(Book::getAgeReq).thenComparing(Book::getName);
        Collections.sort(books, comp);
        System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        books.stream().forEach(book -> System.out.println(book));
    }

}