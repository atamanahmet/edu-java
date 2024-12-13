import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {

        int dice = diceRandom();
        int player = takeNumbers();
        System.out.println("Your Sum: " + player);
        System.out.println("Dice Sum: " + dice);
        System.out.println(player - dice);
        if (player - dice <= 3 && player > dice) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost.");
        }

    }

    public static int takeNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        System.out.println("Enter third number");
        int num3 = scan.nextInt();
        scan.close();
        return (num1 + num2 + num3);

    }

    public static int diceRandom() {
        double randomNum1 = Math.floor((Math.random() * 6) + 1);
        double randomNum2 = Math.floor((Math.random() * 6) + 1);
        double randomNum3 = Math.floor((Math.random() * 6) + 1);
        return (int) (randomNum1 + randomNum2 + randomNum3);
    }
}
