
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println("");
            String[] buffer = input.split(" ");
            int amount = Integer.valueOf(buffer[1]);
            String cmd = buffer[0];
            if (cmd.equals("add")) {
                first.add(amount);
            } else if (cmd.equals("remove")) {
                second.remove(amount);
            } else if (cmd.equals("move")) {
                if (first.contains() > 0 && first.contains() < amount) {
                    second.add(first.contains());
                    first.remove(amount);
                } else if (first.contains() != 0) {
                    first.remove(amount);
                    second.add(amount);
                }

            } else {
                continue;
            }
        }
    }

}
