public class ThrowUsedCarException {
    public static void main(String[] args) {
        UsedCar[] cars = new UsedCar[7];
        int successfulCount = 0;

        //dobre, zły vin, zła marka, zła data, zły milage, zła cena, dobre
        String[] vins =     {"1234", "99",   "5678", "4444", "4321", "8888", "5555"};
        String[] makes =    {"Ford", "Honda", "BMW",  "Toyota", "Chrysler", "Other", "Honda"};
        int[] years =       {2005,   2010,   2012,   1990,   2015,   2016,   2017};
        int[] mileages =    {100000, 50000,  30000,  200000, -10,    40000,  12000};
        double[] prices =   {15000,  20000,  25000,  5000,   12000,  -500,   18000};

        System.out.println("=== Próba rejestracji pojazdów ===");

        for (int i = 0; i < 7; i++) {
            try {
                //tworzenie proba
                UsedCar car = new UsedCar(vins[i], makes[i], years[i], mileages[i], prices[i]);

                //dodanie do tablicy jesli można
                cars[successfulCount] = car;
                successfulCount++;
                System.out.println("Sukces: Zapisanego samochód z VIN: " + vins[i]);

            } catch (UsedCarException e) {
                //złe dane
                System.out.println("Błąd walidacji -> " + e.getMessage());
            }
        }

        System.out.println("\n=== Lista tylko poprawnie utworzonych samochodów ===");
        for (int i = 0; i < successfulCount; i++) {
            System.out.println(cars[i]);
        }
    }
}