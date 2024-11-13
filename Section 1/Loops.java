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
        getNumbersAndWrite();
    }

    public static void getNumbersAndWrite() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number to count by: ");
        int by = scan.nextInt();
        System.out.println("Number to start from: ");
        int from = scan.nextInt();
        System.out.println("Number to count to: ");
        int to = scan.nextInt();
        writeNumbers(by, from, to);

    }

    public static void writeNumbers(int byNumber, int fromNumber, int toNumber) {
        for (int i = fromNumber; i <= toNumber; i += byNumber) {
            System.out.print(fromNumber + " ");
        }
    }
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