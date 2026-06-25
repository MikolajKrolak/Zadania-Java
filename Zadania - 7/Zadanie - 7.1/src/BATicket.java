import java.time.LocalDateTime;

public class BATicket {
    public LocalDateTime departureTime;
    public double ticketPrice;

    public BATicket(LocalDateTime departureTime, double ticketPrice) {
        this.departureTime = departureTime;
        this.ticketPrice = ticketPrice;
    }
}