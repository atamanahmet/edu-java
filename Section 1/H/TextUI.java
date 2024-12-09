
// import java.util.ArrayList;
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
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye Bye!");
                break;
            }
            if (input.equals("add")) {

                System.out.print("Word: ");

                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);

            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String translation = simpleDictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word (" + word + ") was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }

            } else {
                System.out.println("Unknown command");
            }

        }
    }
}
