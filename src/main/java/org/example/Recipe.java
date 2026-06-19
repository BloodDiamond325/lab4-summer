import java.util.Collections;
import java.util.List;

public class Recipe {

    // TO DO M2: private fields
    //   title (String), category (String), vegetarian (boolean),
    //   instructions (String), ingredients (List<Ingredient>)


    public Recipe(String title, String category, boolean vegetarian, String instructions) {
        // TO DO M2: assign first four, initialise ingredients to new ArrayList<>()
    }

    // TO DO M2: getters
    public String getTitle()        { return null; }
    public String getCategory()     { return null; }
    public boolean isVegetarian()   { return false; }
    public String getInstructions() { return null; }

    // TO DO M2: return Collections.unmodifiableList(ingredients)
    public List<Ingredient> getIngredients() {
        return Collections.emptyList();
    }

    // TO DO M2: append ingredient
    public void addIngredient(Ingredient i) {

    }

    // TO DO M2: toString format (note the indentation):
    //   "Pelau (Main)
    //      Ingredients:
    //        2 cups rice
    //        1 lb chicken
    //      Instructions:
    //        <instructions>"
    //   When vegetarian: header is "<title> (<category>, vegetarian)"
    @Override
    public String toString() {
        return "";
    }
}
