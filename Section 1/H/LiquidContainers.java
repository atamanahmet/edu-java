
import java.util.Scanner;

public class LiquidContainers {
    public static int first = 0;
    public static int second = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
            int amount = Integer.valueOf(inputArray[1]);
            System.out.println("");
            if (inputArray[0].equals("add")) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }

            } else if (inputArray[0].equals("move")) {
                if (first >= amount) {
                    if (second + amount <= 100) {
                        second += amount;
                        if (first - amount >= 0) {
                            first -= amount;
                        } else {
                            first = 0;
                        }

                    } else {
                        second = 100;
                    }

                } else {
                    second += first;
                    first = 0;
                }

            } else if (inputArray[0].equals("remove")) {
                if (second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }
}
