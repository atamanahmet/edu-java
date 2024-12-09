
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            String word;
            String translation;
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.println("");
                System.out.print("Word:");
                System.out.println("");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                translation = scanner.nextLine();
                simpleDictionary.add(word, translation);

            } else {
                System.out.println("Unknown command");
            }

        }
    }
}
