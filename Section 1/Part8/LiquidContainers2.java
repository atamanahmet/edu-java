
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.print("First: " + first.contains() + "/" + first.getLimit());
            System.out.println("");
            System.out.print("Second: " + second.contains() + "/" + second.getLimit());
            System.out.println("");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] buffer = input.split(" ");
            if (buffer[0].equals("add")) {
                first.add(Integer.valueOf(buffer[1]));
            } else if (buffer[0].equals("remove")) {
                second.remove(Integer.valueOf(buffer[1]));
            } else if (buffer[0].equals("move")) {
                first.move(Integer.valueOf(buffer[1]), second);
            }
        }
    }

}
