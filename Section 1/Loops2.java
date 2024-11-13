import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        greet(scan);
        calculatePoints(scan);
    }

    public static void greet(Scanner scan) {

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println(
                "Great, here are the rules:\n\t-If you roll a 6, the game stops. \n\t-If you roll a 4, nothing happens.\n\t-Otherwise, you get 1 point.\nYou must collect at least 3 points to win.");

    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void calculatePoints(Scanner scan) {
        int points = 0;
        int dice = rollDice();
        while (scan.hasNextLine()) {
            System.out.println("Press Enter to Roll!");
            scan.nextLine();
            dice = rollDice();
            System.out.println("Dice: " + dice);
            if (dice == 6) {
                scan.close();
                break;
            } else if (dice == 4) {
                continue;
            } else {
                points++;
                System.out.println("Score: " + points);
            }
        }
        System.out.println("Your Final Score: " + points);

    }
}