import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    // private Recipe recipe;
    private RecipeManager manager;

    public UserInterface(Scanner scanner, RecipeManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void getInput() {
        System.out.print("File to read: ");
        String url = scanner.nextLine();
        System.out.println("");
        manager.readFile(url);
        System.out.println("Commands:\r\n" + //
                "list - lists the recipes\r\n" + //
                "stop - stops the program");
        System.out.println("");
        System.out.print("Enter command: ");

        while (true) {

            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                manager.printRecipes();
                System.out.print("\nEnter command: ");
            } else if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String findName = scanner.nextLine().toLowerCase();
                int index = manager.searchName(findName);
                manager.printRecipes(index);
            } else {
                continue;
            }
        }
    }
}
