// BritishAirwaysAdapter.java
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BritishAirwaysAdapter implements AirlineAdapter {
    private BATicketService baService;

    public BritishAirwaysAdapter(BATicketService baService) {
        this.baService = baService;
    }

    @Override
    public List<FlightTicket> searchFlights(String from, String to, Date when) {
        Airport fromAirport = new Airport(from);
        Airport toAirport = new Airport(to);

        return baService.getTicketInfo(fromAirport, toAirport, when).stream().map(ba -> new FlightTicket(from, to, ba.departureTime, ba.ticketPrice, 1, 190)).collect(Collectors.toList());
    }
}