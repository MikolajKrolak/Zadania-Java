public class PizzaDeluxe extends Pizza{
    private String sauceType;
    private boolean cheeseCrust;
    private double discount;

    public PizzaDeluxe(double calories, String name, double price){
        super(calories, name, price);
        if (sauceType == null){
            sauceType = "pomidorowy";
        }
        cheeseCrust = false;
        discount = 0;
    }
    public PizzaDeluxe(double calories, String name, double price, String sauceType, boolean cheeseCrust, double discount) {
        super(calories, name, price);
        this.sauceType = sauceType;
        this.cheeseCrust = cheeseCrust;
        this.discount = discount;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public void setCheeseCrust(boolean cheeseCrust) {
        this.cheeseCrust = cheeseCrust;
    }

    public String calculateDiscount() {
        double finalPrice = getPrice() - (getPrice() * discount / 100);
        return String.format("%.2f", finalPrice);
    }

    @Override
    public String toString() {
        String result = cheeseCrust ? "tak" : "nie";
        double finalPrice = getPrice() - (getPrice() * discount / 100);
        String formattedPrice = String.format("%.2f", finalPrice);
        return super.toString() + "\nTyp sosu: " + sauceType + ", brzegi serowe: " + result + ", cena po zniżce " + discount + "% to " + formattedPrice;
    }
}
