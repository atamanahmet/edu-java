import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {
        System.out.println("Your Sum: " + takeNumbers());
        System.out.println("Dice Sum: " + diceRandom());
        int dice = diceRandom();
        int player = takeNumbers();
        if (player - dice >= 3) {
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
