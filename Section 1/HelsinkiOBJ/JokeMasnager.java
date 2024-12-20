
// // import java.util.ArrayList;
// import java.util.Scanner;

// public class TextUI {

//     private Scanner scanner;
//     private SimpleDictionary simpleDictionary;

//     public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
//         this.scanner = scanner;
//         this.simpleDictionary = simpleDictionary;
//     }

//     public void start() {
//         while (true) {
//             System.out.print("Command: ");
//             String input = scanner.nextLine();
//             if (input.equals("end")) {
//                 System.out.println("Bye Bye!");
//                 break;
//             }
//             if (input.equals("add")) {

//                 System.out.print("Word: ");

//                 String word = scanner.nextLine();
//                 System.out.print("Translation: ");
//                 String translation = scanner.nextLine();
//                 simpleDictionary.add(word, translation);

//             } else if (input.equals("search")) {
//                 System.out.print("To be translated: ");
//                 String word = scanner.nextLine();
//                 String translation = simpleDictionary.translate(word);
//                 if (translation == null) {
//                     System.out.println("Word (" + word + ") was not found");
//                 } else {
//                     System.out.println("Translation: " + translation);
//                 }

//             } else {
//                 System.out.println("Unknown command");
//             }

//         }
//     }
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

// public class TodoList {

//     private ArrayList<String> todoList;

//     public TodoList() {
//         this.todoList = new ArrayList<>();
//     }

//     public void add(String task) {
//         this.todoList.add(task);
//     }

//     public void remove(int index) {
//         this.todoList.remove(index - 1);
//     }

//     public ArrayList<String> getTodoList() {
//         return this.todoList;
//     }

//     public void print() {
//         for (int i = 0; i < todoList.size(); i++) {
//             System.out.println((i + 1) + ": " + todoList.get(i));
//         }
//     }

// }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
import java.util.ArrayList;
//import java.util.Scanner;
import java.util.Random;

public class JokeMasnager {

    private ArrayList<String> jokes;

    public JokeMasnager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {

        if (jokes.size() > 0) {
            Random draw = new Random();
            return jokes.get(draw.nextInt(jokes.size()));
        } else {
            return "Jokes are in short supply.";
        }

    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
