
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person2> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            if (scanner.hasNextLine()) {
                continueQ = scanner.nextLine();
            }

            if (continueQ.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstName = "NaN";
            if (scanner.hasNextLine()) {
                firstName = scanner.nextLine();
            }
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if (scanner.hasNextLine()) {
                lastName = scanner.nextLine();
            }
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if (scanner.hasNextLine()) {
                birthYear = Integer.valueOf(scanner.nextLine());
            }

            persons.add(new Person2(firstName, lastName, birthYear));
            System.out.println("");
        }
        persons.stream().map(person -> person.getLastName()).distinct().sorted()
                .forEach(lastName -> System.out.println(lastName));
    }
}
