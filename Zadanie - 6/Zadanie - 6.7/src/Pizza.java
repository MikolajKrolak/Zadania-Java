public abstract class Pizza implements Comparable<Pizza>{
    protected double calories;
    protected String name;
    protected double price;

    public Pizza(double calories, String name, double price){
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza: " + name + " ma " + calories + " kalorii oraz kosztuje " + price + " zł.";
    }

    @Override
    public int compareTo(Pizza other) {
        if (other == null){
            throw new NullPointerException("Cannot compare with null");
        }

        return Double.compare(this.price, other.price);
    }
}
