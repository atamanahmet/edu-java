import java.util.Scanner;

public class Helsinki {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your program here
        // System.out.println("Give points [0-100]:");
        // int point = Integer.valueOf(scan.nextLine());
        // if (point < 0) {
        // System.out.println("Grade: imposibble!");
        // } else if (point < 50) {
        // System.out.println("Grade: failed");

        // } else if (point < 60) {
        // System.out.println("Grade: 1");
        // } else if (point < 70) {
        // System.out.println("Grade: 2");
        // } else if (point < 80) {
        // System.out.println("Grade: 3");
        // } else if (point < 90) {
        // System.out.println("Grade: 4");
        // } else if (point < 100) {
        // System.out.println("Grade: 5");
        // } else {
        // System.out.println("Grade: incredible!");
        // }
        // scan.close();
        // System.out.println("Enter the first string:");
        // String string1 = scan.nextLine();
        // System.out.println("Enter the second string:");

        // String string2 = scan.nextLine();
        // if (string1.equals(string2)) {
        // System.out.println("Same");
        // } else {
        // System.out.println("Different");
        // }
        // System.out.println("How old are you?");
        // int age = Integer.valueOf(scan.nextLine());
        // if (age >= 0 && age <= 120) {
        // System.out.println("OK");
        // } else {
        // System.out.println("Impossible!");
        // }
        // System.out.print("Give a year: ");
        // int year = Integer.valueOf(scan.nextLine());
        // if ((year % 100 == 0 && year % 400 == 0)) {
        // System.out.println("The year is a leap year.");
        // } else if (year % 4 == 0 && year % 100 != 0) {
        // System.out.println("The year is a leap year.");
        // } else {
        // System.out.println("The year is not a leap year.");
        // }
        // double tax;
        // System.out.println("Value of the gift?");
        // int value = Integer.valueOf(scan.nextLine());
        // if (value < 5000) {
        // System.out.println("No tax!");
        // } else if (value >= 5000 && value < 25000) {
        // tax = (((value - 5000) * 0.08) + 100);
        // System.out.println("Tax: " + tax);
        // } else if (value >= 25000 && value < 55000) {
        // tax = (((value - 25000) * 0.10) + 1700);
        // System.out.println("Tax: " + tax);
        // } else if (value >= 55000 && value < 200000) {
        // tax = (((value - 55000) * 0.12) + 4700);
        // System.out.println("Tax: " + tax);
        // } else if (value >= 200000 && value < 1000000) {
        // tax = (((value - 200000) * 0.15) + 22100);
        // System.out.println("Tax: " + tax);
        // } else if (value >= 1000000) {
        // tax = (((value - 1000000) * 0.17) + 142100);
        // System.out.println("Tax: " + tax);
        // }
        // int number = Integer.valueOf(scan.nextLine());

        // System.out.println(number * number);
        // int num1 = Integer.valueOf(scan.nextLine());
        // int num2 = Integer.valueOf(scan.nextLine());
        // if (num1 == num2) {
        // System.out.println(num1 + " is equal to " + num2 + ".");
        // } else if (num1 > num2) {
        // System.out.println(num1 + " is greater than " + num2 + ".");
        // } else if (num1 < num2) {
        // System.out.println(num1 + " is smaller than " + num2 + ".");
        // }

        // int input = 0;
        // int sum = 0;
        // int counter = 0;
        // while (true) {
        // System.out.println("Give a number:");
        // input = Integer.valueOf(scan.nextLine());
        // if (input == 0) {
        // break;
        // }
        // if (input > 0) {
        // sum += input;
        // counter++;
        // }

        // }
        // if (counter == 0) {
        // System.out.println("Cannot calculate the average");
        // } else {
        // double result = (sum * 1.0) / counter;
        // System.out.println(result);
        // }
        System.out.print("Where to? ");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int begin = Integer.valueOf(scanner.nextLine());

        for (int i = begin; i <= end; i++) {
            System.out.println(i);
        }

    }

}