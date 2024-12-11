
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
            System.out.println("");
            String[] buffer = input.split(" ");
            int amount = Integer.valueOf(buffer[1]);
            String cmd = buffer[0];
            if (cmd.equals("add")) {
                first.add(amount);
            } else if (cmd.equals("remove")) {
                second.remove(amount);
            } else if (cmd.equals("move")) {
                first.remove(amount);
                second.add(amount);
            } else {
                continue;
            }
        }
    }

}
