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
                "stop - stops the program\r\n" + "find name - searches recipes by name\r\n"
                + "find cooking time - searches recipes by cooking time\r\n"
                + "find ingredient - searches recipes by ingredient\r");

        while (true) {
            System.out.print("\nEnter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                manager.printRecipes();
            } else if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String findName = scanner.nextLine().toLowerCase();
                manager.printRecipes(manager.searchName(findName));

            } else if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                manager.printRecipes(manager.searchTime(maxCookingTime));
            } else if (input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String findIngredient = scanner.nextLine();
                manager.printRecipes(manager.searchIngredient(findIngredient));
            } else {
                continue;
            }
        }
    }
}
