import java.util.Scanner;

public class Practice {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int dividend = 3;
        // int divisor = 2;

        // double result = dividend / (divisor * 1.0);
        // System.out.println(result);
        // System.out.println("Give the first number:");
        // int num1 = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the second number:");
        // int num2 = Integer.valueOf(scanner.nextLine());
        // System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        // System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        // System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        // System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}