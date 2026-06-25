// UnitedAirlinesAdapter.java
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UnitedAirlinesAdapter implements AirlineAdapter {
    private UATicketService uaService;

    public UnitedAirlinesAdapter(UATicketService uaService) {
        this.uaService = uaService;
    }

    @Override
    public List<FlightTicket> searchFlights(String from, String to, Date when) {
        return uaService.getTicketInfo(from, to, when).stream().map(ua -> new FlightTicket(ua.from, ua.to, ua.dateTime, ua.price, 0, 130)).collect(Collectors.toList());
    }
}