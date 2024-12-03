import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scan.nextLine());
            library.add(new Book(title, pages, publicationYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String selection = scan.nextLine();
        if (selection.equals("name")) {
            for (Book item : library) {
                System.out.println(item.getTitle());
            }
        }
    }
}
