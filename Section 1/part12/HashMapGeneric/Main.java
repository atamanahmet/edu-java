
import java.util.Random;

import java.util.Scanner;

import part12.Die;

public class Main {
    public static void main(String[] args) {
        // Random randomNum = new Random();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("How many random numbers should be printed?");
        // int input = Integer.valueOf(scanner.nextLine());

        // for (int i = 0; i < input; i++) {
        // System.out.println(randomNum.nextInt(10));
        // }
        Die die = new Die(5);

        for (int i = 0; i < 1000; i++) {
            System.out.println(die.throwDie());
        }

    }
}
