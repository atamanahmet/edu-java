
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("\nFirst: " + first.getAmount() + "/" + first.getLimit());
            System.out.println("Second: " + second.getAmount() + "/" + second.getLimit());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.startsWith("add")) {
                String[] buffer = input.split(" ");
                int amount = Integer.valueOf(buffer[1]);
                first.add(amount);
            } else if (input.startsWith("move")) {
                String[] buffer = input.split(" ");
                int amount = Integer.valueOf(buffer[1]);
                first.move(second, amount);
            } else if (input.startsWith("remove")) {
                String[] buffer = input.split(" ");
                int amount = Integer.valueOf(buffer[1]);
                second.remove(amount);
            }

        }
    }

}
