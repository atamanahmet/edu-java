import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    // private Recipe recipe;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void getInput() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        }
    }
}
