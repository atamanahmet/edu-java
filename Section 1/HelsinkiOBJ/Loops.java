import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // String items = ["asd","bsd","zxc"];
        // for (int i = 0; i < 10; i++) {
        // System.out.println("5x" + i + " : " + 5 * i);
        // }
        // items.forEach(e){
        // e
        // }
        // int counter = 1;
        // for (int i = 1; i < 30; i++) {
        // if (counter != 11) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // System.out.println("Counter: " + counter);
        // counter++;
        // }
        // }
        // }
        // for (int i = 1; i < 11; i++) {
        // System.out.println(i + ". Test 123123123");
        // }
        // getSentence();
        // for (int i = 0; i < 10; i++) {
        // System.out.print(i + " ");

        // }
        // getNumbersAndWrite();

        // for (int i = 0; i < 20; i++) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // System.out.println(i + " - FizzBuzz");
        // } else if (i % 3 == 0) {
        // System.out.println(i + " - fizz");
        // } else if (i % 5 == 0) {
        // System.out.println(i + " - buzz");
        // }
        // }
        // }

        // public static void getNumbersAndWrite() {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Number to count by: ");
        // int by = scan.nextInt();
        // System.out.println("Number to start from: ");
        // int from = scan.nextInt();
        // System.out.println("Number to count to: ");
        // int to = scan.nextInt();
        // writeNumbers(by, from, to);

        boolean isWin = false;
        Scanner scan = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("I choose a number between 1 and 5. Guess it!: ");
        System.out.println(randomNum);
        while (isWin == false) {

            int choice = scan.nextInt();
            isWin = choice == randomNum ? true : false;
            if (!isWin) {
                System.out.println("Try Again.");
            } else {
                System.out.println("You guess it right!!");
                scan.close();
            }
        }

    }

    // public static void writeNumbers(int by, int from, int to) {
    // for (int i = from; i <= to; i += by) {
    // System.out.print(i + " ");
    // }
    // }
    // public static void getSentence() {
    // Scanner scan = new Scanner(System.in);
    // System.out.println("What is the sentence you want to write?");
    // String content = scan.nextLine();
    // System.out.println("How many time you want to write?");
    // int count = scan.nextInt();
    // writeSentence(content, count);
    // scan.close();
    // }

    // public static void writeSentence(String stringToWrite, int writeCount) {
    // for (int i = 1; i <= writeCount; i++) {
    // System.out.println(i + ". " + stringToWrite);
    // }
    // }

}