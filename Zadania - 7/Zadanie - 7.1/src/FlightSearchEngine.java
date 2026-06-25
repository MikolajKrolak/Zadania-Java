import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private List<AirlineAdapter> adapters = new ArrayList<>();

    //dodawanie nowych linii
    public void registerAirline(AirlineAdapter adapter) {
        adapters.add(adapter);
    }

    public List<FlightTicket> search(String from, String to, Date when, Double maxPrice, Integer maxLayovers, Integer maxDurationMinutes, String sortBy) {

        //pobieranie biletow
        List<FlightTicket> allTickets = new ArrayList<>();
        for (AirlineAdapter adapter : adapters) {
            allTickets.addAll(adapter.searchFlights(from, to, when));
        }

        //filtr
        var stream = allTickets.stream();

        if (maxPrice != null) {
            stream = stream.filter(t -> t.getPrice() <= maxPrice);
        }
        if (maxLayovers != null) {
            stream = stream.filter(t -> t.getLayovers() <= maxLayovers);
        }
        if (maxDurationMinutes != null) {
            stream = stream.filter(t -> t.getDurationMinutes() <= maxDurationMinutes);
        }

        //sortow
        if (sortBy != null) {
            switch (sortBy.toLowerCase()) {
                case "price":
                    stream = stream.sorted(Comparator.comparingDouble(FlightTicket::getPrice));
                    break;
                case "layovers":
                    stream = stream.sorted(Comparator.comparingInt(FlightTicket::getLayovers));
                    break;
                case "duration":
                    stream = stream.sorted(Comparator.comparingInt(FlightTicket::getDurationMinutes));
                    break;
            }
        }

        return stream.collect(Collectors.toList());
    }
}