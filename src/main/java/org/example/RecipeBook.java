import java.util.ArrayList;
import java.util.List;
// HARD CONSTRAINT: no javax.swing or java.awt imports here.

public class RecipeBook {

    private List<Recipe> recipes = new ArrayList<>();

    public RecipeBook() {
        // TO DO M3: pre-load 6 recipes (each with at least 2 ingredients):
        //   Pelau         (Main,        non-veg)
        //   Doubles       (Street food, veg)
        //   Callaloo      (Side,        veg)
        //   Bake & Shark  (Street food, non-veg)
        //   Roti          (Main,        veg)
        //   Sorrel        (Drink,       veg)
        // Pattern:
        //   Recipe r = new Recipe("Pelau", "Main", false, "Caramelise sugar, ...");
        //   r.addIngredient(new Ingredient("rice", 2.0, "cups"));
        //   r.addIngredient(new Ingredient("chicken", 1.0, "lb"));
        //   recipes.add(r);
    }

    public List<Recipe> all() {
        // TO DO M3: return a copy or the list itself (a List<Recipe>)
        return new ArrayList<>(recipes);
    }

    public List<Recipe> findByCategory(String category) {
        // TO DO M3: case-insensitive match. "All" (any case) means no filter.
        return new ArrayList<>();
    }

    public List<Recipe> findVegetarian(List<Recipe> in) {
        // TO DO M3
        return new ArrayList<>();
    }

    public List<Recipe> searchTitle(List<Recipe> in, String query) {
        // TO DO M3: substring, case-insensitive. null or whitespace query returns a copy of in.
        return new ArrayList<>();
    }

    public List<String> allCategories() {
        // TO DO M3: distinct categories from recipes, sorted, with "All" at index 0
        return new ArrayList<>();
    }
}
