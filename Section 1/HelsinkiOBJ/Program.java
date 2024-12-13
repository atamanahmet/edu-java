// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         // Try out how the different parts of the program work together
//         // here
//         Scanner scanner = new Scanner(System.in);
//         SimpleDictionary dictionary = new SimpleDictionary();

//         TextUI textUI = new TextUI(scanner, dictionary);
//         textUI.start();
//         System.out.println(dictionary.translate("pike")); // prints the string "hauki"
//     }
// }

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // JokeManager manager = new JokeManager();
        // manager.addJoke("Just joking 1");
        // manager.addJoke("Just joking 2");
        // manager.addJoke("Just joking 3");
        // Scanner scanner = new Scanner(System.in);

        // UserInterface ui = new UserInterface(manager, scanner);
        // ui.start();
        // JokeManager manager = new JokeManager();
        // Scanner scanner = new Scanner(System.in);

        // UserInterface ui = new UserInterface(manager, scanner);
        // ui.start();
        // Scanner scanner = new Scanner(System.in);
        // ArrayList<String> jokes = new ArrayList<>();
        // System.out.println("What a joke!");
        // while (true) {
        // System.out.println("Commands:");
        // System.out.println(" 1 - add a joke");
        // System.out.println(" 2 - draw a joke");
        // System.out.println(" 3 - list jokes");
        // System.out.println(" X - stop");
        // String command = scanner.nextLine();
        // if (command.equals("X")) {
        // break;
        // }
        // if (command.equals("1")) {
        // System.out.println("Write the joke to be added:");
        // String joke = scanner.nextLine();
        // jokes.add(joke);
        // } else if (command.equals("2")) {
        // System.out.println("Drawing a joke.");
        // if (jokes.isEmpty()) {
        // System.out.println("Jokes are in short supply.");
        // } else {
        // Random draw = new Random();
        // int index = draw.nextInt(jokes.size());
        // System.out.println(jokes.get(index));
        // }
        // } else if (command.equals("3")) {
        // System.out.println("Printing the jokes.");
        // for (String joke : jokes) {
        // System.out.println(joke);
        // }
        // }
        // }
        String input1 = "string1\n" + "string2\n" + "string3\n" + "exit\n";
        Scanner scanner2 = new Scanner(input1);
        while (true) {
            String line = scanner2.nextLine();

            if (line.equals("exit")) {
                break;
            }
            System.out.println(line);
        }
        ArrayList<String> linkList = new ArrayList<>();
        ArrayList<Integer> allready = new ArrayList<>();
        // ArrayList<String> listBuffer = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("extracted.txt"));) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("https")) {
                    // String[] buffer = line.split(" ");
                    // linkList.add(buffer[0]);

                    linkList.add(line);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println("All " + linkList.size() + " links extracted: ");
        Scanner scanInput = new Scanner(System.in);
        while (true) {
            System.out.println("Random? ");
            String input = scanInput.nextLine();
            if (input.equals("")) {
                Random randomNum = new Random();
                int num = randomNum.nextInt(460);
                if (allready.contains(num)) {
                    System.out.println("oops. Same Link. Continue?");
                    continue;
                } else {
                    allready.add(num);
                }

                System.out.println(num + ". Link: ");
                System.out.println(linkList.get(num));
            }
            scanInput.close();
            scanner2.close();

        }

    }
}
