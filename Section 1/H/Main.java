
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Grade grades = new Grade();
        UserInterface userInterface = new UserInterface(scanner, grades);
        System.out.println("Enter point totals, -1 stops:");
        userInterface.getInput();
        System.out.println("Point average (all): " + grades.averageOfPoints());
        // Write your program here -- consider breaking the program into
        // multiple classes.
    }
}
