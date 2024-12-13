import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredient = new ArrayList<>();

    public Recipe() {

    }

    public Recipe(String name, int cookingTime, ArrayList<String> ingredient) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredient = ingredient;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public void addIngredient(String value) {
        this.ingredient.add(value);
    }

    public ArrayList<String> getIngredients() {
        return this.ingredient;
    }
}
