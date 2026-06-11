import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pizza[] pizzas = new Pizza[40];

        //40 pizz
        for (int i = 0; i < 40; i++) {
            double calories = 300.0 + (i * 25);
            double price = 20.0 + (i * 1.5); // Różne ceny, żeby sortowanie miało sens

            // i % 3 da nam na zmianę wyniki: 0, 1, 2, 0, 1, 2...
            if (i % 3 == 0) {
                pizzas[i] = new PizzaDeluxe(calories, "Delux pizzka " + i, price);
                ((PizzaDeluxe) pizzas[i]).setSauceType("czosnkowy " + i);
            } else if (i % 3 == 1) {
                pizzas[i] = new PizzaSpecial(calories, "Specjalna pizza" + i, price, "serowy", i % 2 == 0, 5);
            } else {
                pizzas[i] = new PizzaWoogy(calories, "Woogy Boogy " + i, price);
            }
        }

        //sortowanie
        Arrays.sort(pizzas);

        System.out.println("=== POSORTOWANE PIZZE (OD NAJTAŃSZEJ DO NAJDROŻSZEJ) ===");
        for (Pizza p : pizzas) {
            System.out.println(p);
            System.out.println("------------------------------------------------");
        }
    }
}