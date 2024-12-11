
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputArray = new String[2];
            inputArray = input.split(" ");
            if (inputArray[0].equals("add")) {
                add(first, Integer.valueOf(inputArray[1]));
            } else if (inputArray[0].equals("move")) {
                move(first, second, Integer.valueOf(inputArray[1]));
            }
        }
    }

    public static void add(int container, int liquid) {
        if (container + liquid <= 100) {
            container += liquid;
        } else {
            container = 100;
        }
    }

    public static void move(int from, int to, int amount) {
        if (to + amount <= 100) {
            to += amount;
            if (from - amount >= 0) {
                from -= amount;
            } else {
                from = 0;
            }

        } else {
            to = 100;
        }

    }
}
