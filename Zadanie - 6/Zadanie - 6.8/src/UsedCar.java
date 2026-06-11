import java.util.List;

public class UsedCar {
    private String VIN;
    private String make;
    private int year;
    private int mileage;
    private double price;

    public UsedCar(String VIN, String make, int year, int mileage, double price) throws UsedCarException {
        if (VIN == null || VIN.length() != 4) {
            throw new UsedCarException(VIN);
        }

        List<String> validMakes = List.of("Ford", "Honda", "Toyota", "Chrysler", "Other");
        if (!validMakes.contains(make)) {
            throw new UsedCarException(VIN);
        }

        if (year < 1997 || year > 2017) {
            throw new UsedCarException(VIN);
        }

        if (mileage < 0 || price < 0) {
            throw new UsedCarException(VIN);
        }

        this.VIN = VIN;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "VIN: " + VIN + ", wytwórca: " + make + ", rok produkcji: " + year + ", mile: " + mileage + ", cena: " + price;
    }
}
