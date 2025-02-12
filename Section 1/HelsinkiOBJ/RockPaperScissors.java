import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String computer = computerSelect().toLowerCase();
        String player = playerSelect().toLowerCase();
        System.out.println("\n\tYou: " + player + "\n\tCPU: " + computer);
        printResult(player, computer);
    }

    public static void printResult(String player, String computer) {
        if (player.equals(computer)) {
            System.out.println("Draw!");
        } else if (player.toLowerCase().equals("rock") && !computer.equals("paper")) {
            System.out.println("You Won!");
        } else if (player.toLowerCase().equals("paper") && !computer.equals("scissors")) {
            System.out.println("You Won!");
        } else if (player.toLowerCase().equals("scissors") && !computer.equals("rock")) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost.");
        }

    }

    public static String playerSelect() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your selection: ");
        String selection = scan.nextLine();
        scan.close();
        return selection;
    }

    public static String computerSelect() {
        int randomNum = (int) (Math.random() * 4);
        switch (randomNum) {
            case 1:
                return "rock";

            case 2:
                return "paper";

            case 3:
                return "scissors";

            default:
                return "Error!";
        }

    }
}