
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                String[] buffer = input.split(" ");
                int amount = Integer.valueOf(buffer[1]);
                first.add(amount);
            }

        }
    }

}
