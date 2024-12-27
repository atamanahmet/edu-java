import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter chars");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        // List<Integer> ordered = list.stream().mapToInt(row -> Integer.valueOf(row));
        long counter = list.stream().mapToInt(row -> Integer.valueOf(row)).filter(number -> number % 3 == 0).count();
        // List<Integer> numbersBy3 = list.stream().mapToInt(row ->
        // Integer.valueOf(row));
        System.out.println(counter);

    }
}
