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
            this.read = new Scanner(Paths.get(url));

            while (read.hasNextLine()) {
                String name = read.nextLine();
                int cookingTime = Integer.valueOf(read.nextLine());
                ArrayList<String> list = new ArrayList<>();
                while (!read.nextLine().equals("")) {
                    list.add(read.nextLine());
                }
                Recipe recipe = new Recipe(name, cookingTime, list);
                recipes.add(recipe);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return "";
    }
}
