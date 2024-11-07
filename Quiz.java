import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = 0;
        String answer;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");

        answer = scan.nextLine();

        if (answer.equals("c") || answer.equals("C")) {
            points += 5;
        }

        System.out.println("\n2.Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");

        answer = scan.nextLine();

        if (answer.equals("a") || answer.equals("A")) {
            points += 5;
        }
        System.out.println("\n2.What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative \n");
        answer = scan.nextLine();
        if (answer.equals("d") || answer.equals("D")) {
            points += 5;
        }

        System.out.println("\n2.Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy \n");
        answer = scan.nextLine();
        scan.close();
        if (answer.equals("a") || answer.equals("A") || answer.equals("b") || answer.equals("B")) {
            points += 5;
        }

        System.out.println("\nYour final score is : " + points);
        if (points >= 15) {
            System.out.println("\nWow, you know your stuff!");
        } else if (points < 15 && points >= 5) {
            System.out.println("\nNot bad!");
        } else {
            System.out.println("\nBetter luck next time.");
        }

    }
}