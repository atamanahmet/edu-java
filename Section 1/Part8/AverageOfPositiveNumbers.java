import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                numberList.add(input);
            }
        }
        if (numberList.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            int sum = 0;
            for (int number : numberList) {
                sum += number;
            }
            System.out.println(sum * 1.0 / numberList.size());
        }

    }
}
