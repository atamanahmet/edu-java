import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Waht is your name?");
        String name = scan.nextLine();
        System.out.println("How much do you spend on coffee?");
        double coffee = scan.nextDouble();
        System.out.println("how much spend on fast food?");
        double fastFood = scan.nextDouble();

        System.out.println("\nHello " + name);
        System.out.println("\nYou spent on coffee: $" + coffee);
        System.out.println("\nYou spent on fast food: $" + fastFood);

        scan.close();
    }
}
