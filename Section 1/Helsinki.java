// import java.util.Scanner;

// public class Helsinki {
// public static Scanner scanner = new Scanner(System.in);

// public static void main(String[] args) {

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
// christmasTree(4);
// printStars(5);
// printSpaces(5);
// }

// public static void printStars(int number) {
// // part 1 of the exercise

// for (int i = 1; i <= number; i++) {
// System.out.print("*");
// }
// System.out.println("");
// }

// public static void printSpaces(int number) {
// // part 1 of the exercise
// for (int i = 1; i <= number; i++) {
// System.out.print(" ");
// }
// }

// public static void printTriangle(int size) {
// // part 2 of the exercise

// // for (int j = size; j >= 1; j--) {
// // printSpaces(size - 1);
// int count = size - 1;
// for (int i = 1; i <= size; i++) {
// printSpaces(count);
// printStars(i);
// if (count == 0) {
// return;
// }
// count--;
// }
// // }

// }
// public static void printFromNumberToOne(int count) {
// for (int i = count; i >= 1; i--) {
// System.out.println(i);
// }
// }

// public static void christmasTree(int height) {
// // part 3 of the exercise
// int count = height - 1;
// for (int i = 1; i <= height * 2; i += 2) {
// printSpaces(count);
// printStars(i);

// if (count == 0) {
// break;
// }
// count--;
// }
// for (int i = 0; i < 2; i++) {
// printSpaces(height - 2);
// printStars(3);
// }
// }

// }
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Helsinki {
// public static void main(String[] args) {
// // ArrayList<String> stringList = new ArrayList<>();
// // String[] array = { "", "", "" };
// // stringList.add("asli");
// // stringList.add("ahmet");
// // stringList.add("asd");
// // array[0] = stringList.get(0);
// // System.out.println(array[0]);
// // for(int i= 0;i<numbers.size();i++){
// // if(numbers.get(i)==-1){
// // continue;
// // }
// // System.out.println(numbers.get(i));
// // }
// Scanner scanner = new Scanner(System.in);

// ArrayList<Integer> numbers = new ArrayList<>();
// while (true) {
// int number = Integer.valueOf(scanner.nextLine());
// if (number == -1) {
// break;
// }

// numbers.add(number);
// }

// System.out.print("From where? ");
// int from = Integer.valueOf(scanner.nextLine());
// System.out.println("");
// System.out.print("To where? ");
// int to = Integer.valueOf(scanner.nextLine());
// System.out.println("");
// for (int i = from; i <= to; i++) {
// System.out.println(numbers.get(i));
// }
// }
// }

// import java.util.ArrayList;
// import java.util.Scanner;

// public class IndexOf {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// ArrayList<Integer> list = new ArrayList<>();
// while (true) {
// int input = Integer.valueOf(scanner.nextLine());
// if (input == -1) {
// break;
// }

// list.add(input);
// }

// System.out.println("");

// // implement here finding the indices of a number
// System.out.print("Search for? ");
// int searchParam = Integer.valueOf(scanner.nextLine());
// for (int i = 0; i < list.size(); i++) {
// if (searchParam == list.get(i)) {
// System.out.println(list.get(i) + " is at index " + i);
// }
// }
// }
// }

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Helsinki {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// ArrayList<Integer> list = new ArrayList<>();
// while (true) {
// int newNumber = Integer.valueOf(scanner.nextLine());
// if (newNumber == 9999) {
// break;
// }
// list.add(newNumber);
// }
// int smallest = 99999;
// ArrayList<Integer> index = new ArrayList<>();
// for (int i = 0; i < list.size(); i++) {
// if (smallest == list.get(i)) {
// index.add(i);
// }
// if (list.get(i) < smallest) {
// smallest = list.get(i);
// index.add(i);
// }

// }
// System.out.println("Smallest number: " + smallest);
// for (int i = 0; i < index.size(); i++) {
// System.out.println("Found at index: " + index.get(i));

// }

// // implement here a program that reads user input
// // until the user enters 9999
// // after that, the program prints the smallest number
// // and its index -- the smallest number
// // might appear multiple times
// }
// }
import java.util.Scanner;
import java.util.ArrayList;

// public class Helinki {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// ArrayList<Integer> list = new ArrayList<>();
// while (true) {
// int num = Integer.valueOf(scanner.nextLine());
// if (num == -1) {
// break;
// }
// list.add(num);
// }
// // implement here a program, that first reads user input
// // adding them on a list until user gives -1.
// // Then it computes the average of the numbers on the list
// // and prints it.

// int sum = 0;
// for (Integer item : list) {
// sum += item;
// }
// System.out.println(sum * 1.0 / list.size());
// }
// }
// public class Helsinki {
// public static void main(String[] args) {
// ArrayList<Integer> numbers = new ArrayList<>();
// numbers.add(3);
// numbers.add(2);
// numbers.add(6);
// numbers.add(-1);
// numbers.add(5);
// numbers.add(1);

// System.out.println("The numbers in the range [0, 5]");
// printNumbersInRange(numbers, 0, 5);

// System.out.println("The numbers in the range [3, 10]");
// printNumbersInRange(numbers, 3, 10);

// }

// public static void printNumbersInRange(ArrayList<Integer> numbers, int low,
// int high) {
// for (Integer item : numbers) {
// if (item <= high && item >= low) {
// System.out.println(item);
// }
// }
// }
// }
// public class Helsinki {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int[] array = new int[10];
// array[0] = 6;
// array[1] = 2;
// array[2] = 8;
// array[3] = 1;
// array[4] = 3;
// array[5] = 0;
// array[6] = 9;
// array[7] = 7;

// System.out.print("Search for? ");
// int searching = Integer.valueOf(scanner.nextLine());

// // Implement the search functionality here
// if (searching < array.length) {
// System.out.println(array[searching] + " is at index " + searching);
// } else {
// System.out.println(searching + " was not found.");
// }
// }

// public static void printNeatly(int[] array) {
// // Write some code in here
// int counter = 0;
// for (Integer number : array) {
// if (counter == array.length - 1) {
// System.out.print(number);
// } else {
// System.out.print(number + ", ");
// }
// counter++;
// }
// }

// public static int sumOfNumbersInArray(int[] array) {
// // Write some code here
// int sum = 0;
// for (Integer number : array) {
// sum += number;
// }
// return sum;
// }

// }
public class Helsinki {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.print("Give a word: ");
        // String word = scanner.nextLine();
        // System.out.println(word + word + word);
        // String user1 = "alex";
        // String pass1 = "sunshine";
        // String user2 = "emma";
        // String pass2 = "haskell";
        // System.out.print("Enter username: ");
        // String username = scanner.nextLine();
        // System.out.print("Enter password: ");
        // String password = scanner.nextLine();
        // if (username.equals(user1) && password.equals(pass1) ||
        // username.equals(user2) && password.equals(pass2)) {
        // System.out.print("You have successfully logged in!");
        // }
        // while (true) {
        // String sentence = scanner.nextLine();
        // if (sentence.equals("")) {
        // break;
        // }
        // String[] words = sentence.split(" ");
        // for (String word : words) {
        // if (word.contains("av")) {
        // System.out.println(word);
        // }
        // }
        // }
        // int biggest = 0;
        // String name = "";
        // while (true) {
        // String input = scanner.nextLine();
        // if (input.equals("")) {
        // break;
        // }
        // String[] parts = input.split(",");
        // int age = Integer.valueOf(parts[1]);
        // if (biggest < age) {
        // biggest = age;
        // name = parts[0];
        // }
        // }

        // System.out.println("Name of the oldest: " + name);
        int sum = 0;
        String name = "";
        int size = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            int nameSize = parts[0].length();
            if (nameSize > size) {
                name = parts[0];
                size = nameSize;
            }
            sum += Integer.valueOf(parts[1]);
            count++;
        }
        System.out.print("Longest name: " + name);
        System.out.print("\nAverage of the birth years: " + (sum * 1.0) / count);
    }
}
