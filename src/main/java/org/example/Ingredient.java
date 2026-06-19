public class Ingredient {

    // TO DO M1: private fields
    //   name (String)
    //   quantity (double)
    //   unit (String)


    public Ingredient(String name, double quantity, String unit) {
        // TO DO M1
    }

    // TO DO M1: getters (no setters)
    public String getName()    { return null; }
    public double getQuantity(){ return 0.0;  }
    public String getUnit()    { return null; }

    // TO DO M1: toString -> "<quantity> <unit> <name>"
    //   Trim trailing zeros from whole-number quantities:
    //     2.0  -> "2"
    //     0.5  -> "0.5"
    @Override
    public String toString() {
        return "";
    }
}
