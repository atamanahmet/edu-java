import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String computer = computerSelect().toLowerCase();
        String player = playerSelect().toLowerCase();
        System.out.println("\n\tYou: " + player + "\n\tCPU: " + computer);
        isPlayerWin(player, computer);
    }

    public static void isPlayerWin(String player, String computer) {
        if (player.equals("rock") && !computer.equals("paper")) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost.");
        }
    }

    public static String playerSelect() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your selection: ");

        return scan.nextLine();
    }

    public static String computerSelect() {
        int randomNum = (int) (Math.random() * 3) + 1;
        String selection = null;
        switch (randomNum) {
            case 1:
                return "rock";

            case 2:
                return "paper";

            case 3:
                return "scissor";
            default:
                return "Error!";
        }

    }
}