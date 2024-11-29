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
        // System.out.print("Where to? ");
        // int end = Integer.valueOf(scanner.nextLine());
        // System.out.print("Where from? ");
        // int begin = Integer.valueOf(scanner.nextLine());

        // for (int i = begin; i <= end; i++) {
        // System.out.println(i);
        // }

        // System.out.print("First number? ");
        // int start = Integer.valueOf(scanner.nextLine());
        // System.out.print("Last number? ");
        // int end = Integer.valueOf(scanner.nextLine());
        // int result = 0;
        // for (int i = start; i <= end; i++) {
        // result += i;
        // }
        // System.out.println("The sum is: " + result);

        // int result = 1;
        // for (int i = 1; i <= end; i++) {
        // result *= i;
        // }
        // int input = 0;
        // int sum = 0;
        // int counter = 0;
        // int even = 0;
        // int odd = 0;
        // System.out.println("Give a number:");
        // while (true) {

        // input = Integer.valueOf(scanner.nextLine());
        // if (input == -1) {
        // break;
        // }
        // if (input % 2 == 0) {
        // even++;
        // } else {
        // odd++;
        // }
        // counter++;
        // sum += input;
        // }
        // System.out.println("Thx! Bye!");
        // System.out.println("Sum: " + sum);
        // System.out.println("Numbers: " + counter);
        // System.out.println("Average: " + (sum * 1.0) / counter);
        // System.out.println("Even: " + even);
        // System.out.println("Odd: " + odd);
        // System.out.println("How many times?");
        // printFromNumberToOne(5);
        // while (true) {
        // System.out.println(1);

        // return;
        // }
        // int size = 4;
        // int counter = 1;
        // for (int j = 1; j <= size; j++) {
        // System.out.println("");
        // for (int i = 1; i <= counter; i++) {
        // System.out.print("*");
        // }
        // counter++;
        // if (counter > size) {
        // return;
        // }

        // }
        christmasTree(7);
        // printStars(5);
        // printSpaces(5);
    }

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        // for (int j = size; j >= 1; j--) {
        // printSpaces(size - 1);
        int count = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(count);
            printStars(i);
            if (count == 0) {
                return;
            }
            count--;
        }

        // }

    }
    // public static void printFromNumberToOne(int count) {
    // for (int i = count; i >= 1; i--) {
    // System.out.println(i);
    // }
    // }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int count = height - 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(count);
            printStars(i);
            printSpaces(count);
            if (count == 0) {
                return;
            }
            count--;
        }
    }

}