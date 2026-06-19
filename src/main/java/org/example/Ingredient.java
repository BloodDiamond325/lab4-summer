public class Ingredient {

    // TO DO M1: private fields
    //   name (String)
    //   quantity (double)
    //   unit (String)

    private String name;
    private double quantity;
    private String units;


    public Ingredient(String name, double quantity, String unit) {
        // TO DO M1
        this.name = name;
        this.quantity = quantity;
        this.units = unit;

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
        // quantity + " " + unit + " " + name " ";}
        String q = (quantity == Math.floor(quantity))
                ? String.valueOf((int) quantity)
                : String.valueOf(quantity);

        return String.format("%s %s %s", q, units, name);
    }
}
