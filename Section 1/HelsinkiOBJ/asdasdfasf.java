
// import java.util.HashMap;

// public class SimpleDictionary {

// private HashMap<String, String> translations;

// public SimpleDictionary() {
// this.translations = new HashMap<>();
// }

// public String translate(String word) {
// return this.translations.get(word);
// }

// public void add(String word, String translation) {
// this.translations.put(word, translation);
// }
// }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
// import java.util.ArrayList;
// import java.util.Scanner;

// public class UserInterface {

// private Scanner scanner;
// private TodoList list;

// public UserInterface(TodoList list, Scanner scanner) {
// this.list = list;
// this.scanner = scanner;
// }

// public void start() {
// while (true) {
// System.out.print("Command: ");
// String input = scanner.nextLine();
// if (input.equals("stop")) {
// break;
// } else if (input.equals("add")) {
// System.out.print("Task: ");
// String task = scanner.nextLine();
// list.add(task);
// } else if (input.equals("remove")) {
// System.out.print("Which task was completed? ");
// int selection = Integer.valueOf(scanner.nextLine());
// list.remove(selection);
// } else if (input.equals("list")) {
// list.print();
// }
// }
// }
// }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")) {
                break;
            } else if (input.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if (input.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }

        }

    }
}
