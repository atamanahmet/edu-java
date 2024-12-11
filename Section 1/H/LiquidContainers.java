
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

        }
    }

}
