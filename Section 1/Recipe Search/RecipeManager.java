import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                    // System.out.println(buffer);
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

    public void printRecipes(int index) {

        System.out.println("\nRecipes:");
        if (index == -999) {
            for (int i = 0; i < recipes.size(); i++) {
                System.out.println(recipes.get(i).getName() + ", cooking time: " + recipes.get(i).getCookingTime());
                // for (int j = 0; j < recipes.get(i).getIngredients().size(); j++) {
                // System.out.println(recipes.get(i).getIngredients().get(j));
                // }

            }
        } else if (index == -1) {
            System.out.println("Cant find recipe");
        } else {
            System.out.println(recipes.get(index).getName() + ", cooking time: " + recipes.get(index).getCookingTime());
        }

    }

    public void printRecipes() {
        printRecipes(-999);

    }

    public int searchName(String name) {
        int index = -1;
        for (Recipe item : recipes) {
            String recipeName = item.getName().toLowerCase();
            String[] bufferArray = recipeName.split(" ");
            List<String> bufferArrayList = Arrays.asList(bufferArray);
            if (bufferArrayList.contains(name)) {
                index = recipes.indexOf(item);
            }
            for (String string : bufferArrayList) {
                if (string.startsWith(name)) {
                    index = recipes.indexOf(item);
                }

            }
        }
        if (index == -1) {
            return -1;
        } else {
            return index;
        }

    }
}
