import java.util.Date;
import java.util.List;

public interface AirlineAdapter {
    List<FlightTicket> searchFlights(String from, String to, Date when);
}