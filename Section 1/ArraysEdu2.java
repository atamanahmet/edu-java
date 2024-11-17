import java.util.Scanner;

public class ArraysEdu2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double[] celciusArray = { 100, 0, 40, 27, 38, 20 };
        double[] fahrenheitArray = {};
        // getToppings();
        celciusToFahrenheit(celciusArray, fahrenheitArray);
        printArray(fahrenheitArray);
        // scan.close();
    }

    // public static String[] getToppings() {
    // String[] toppings = new String[3];
    // System.out.println("How many pizza toppings do you want?");
    // for (int i = 0; i < toppings.length; i++) {
    // System.out.print(i + ".");
    // toppings[i] = scan.nextLine();
    // }
    // System.out.println("Here's your toppings: ");
    // for (int i = 0; i < toppings.length; i++) {
    // toppings[i] = toppings[i].substring(0, 1).toUpperCase() +
    // toppings[i].substring(1);
    // System.out.println(i + ". " + toppings[i]);
    // }
    // return toppings;
    // }

    public static double[] celciusToFahrenheit(double[] fahrenheitArray, double[] celciusArray) {
        for (int i = 0; i < celciusArray.length; i++) {
            fahrenheitArray[i] = (celciusArray[i] / 5) + 32;
            System.out.println(fahrenheitArray[i]);
        }
        return fahrenheitArray;
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
