import java.util.Scanner;

public class ArraysEdu2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] toppings = new String[3];
        System.out.println("How many pizza toppings do you want?");
        for (int i = 0; i < toppings.length; i++) {
            System.out.print(i + ".");
            toppings[i] = scan.nextLine();
        }
        System.out.println("Here's your toppings: ");
        for (int i = 0; i < toppings.length; i++) {
            toppings[i] = toppings[i].substring(0, 1).toUpperCase() + toppings[i].substring(1);
            System.out.println(i + ". " + toppings[i]);
        }
    }

}
