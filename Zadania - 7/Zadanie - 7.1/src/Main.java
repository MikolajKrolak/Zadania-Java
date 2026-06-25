import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UATicketService uaService = new UATicketServiceImpl();
        BATicketService baService = new BATicketServiceImpl();

        FlightSearchEngine searchEngine = new FlightSearchEngine();

        searchEngine.registerAirline(new UnitedAirlinesAdapter(uaService));
        searchEngine.registerAirline(new BritishAirwaysAdapter(baService));

        System.out.println("--- WSZYSTKIE DOSTĘPNE LOTY (SORTOWANE PO CENIE) ---");
        List<FlightTicket> resultsByPrice = searchEngine.search("WAW", "JFK", new Date(), null, null, null, "price");
        resultsByPrice.forEach(System.out::println);

        System.out.println("\n--- FILTROWANE LOTY (MAX 0 PRZESIADEK, SORTOWANE PO CZASIE TRWANIA) ---");
        List<FlightTicket> filteredResults = searchEngine.search("WAW", "JFK", new Date(), 500.0, 1, 200, "duration");
        filteredResults.forEach(System.out::println);
    }
}