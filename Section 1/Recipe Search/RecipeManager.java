import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private Scanner read;
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeManager() {
    }

    public String readFile(String url) {

        try {
            this.read = new Scanner(Paths.get("recipes.txt"));

            while (read.hasNextLine()) {
                String name = read.nextLine();
                int cookingTime = Integer.valueOf(read.nextLine());

                ArrayList<String> list = new ArrayList<>();
                while (read.hasNextLine()) {
                    String buffer = read.nextLine();
                    if (buffer.equals("")) {
                        break;
                    }
                    System.out.println(buffer);
                    list.add(buffer);
                }
                Recipe recipe = new Recipe(name, cookingTime, list);
                recipes.add(recipe);

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return "";
    }

    public void printRecipes() {
        System.out.println("Recipes:");
        for (int i = 0; i < recipes.size(); i++) {
            System.out.println(recipes.get(i).getName() + ", " + recipes.get(i).getCookingTime());
            for (int j = 0; j < recipes.get(i).getIngredients().size(); j++) {
                System.out.println(recipes.get(i).getIngredients().get(j));
            }
        }
    }
}
