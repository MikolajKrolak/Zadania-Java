import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // <-- WAŻNE: Dodaj ten import na samej górze!

public class FlightTicket {
    private String from;
    private String to;
    private LocalDateTime departureTime;
    private double price;
    private int layovers;
    private int durationMinutes;

    public FlightTicket(String from, String to, LocalDateTime departureTime, double price, int layovers, int durationMinutes) {
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.price = price;
        this.layovers = layovers;
        this.durationMinutes = durationMinutes;
    }

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public double getPrice() { return price; }
    public int getLayovers() { return layovers; }
    public int getDurationMinutes() { return durationMinutes; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String formattedDate = departureTime.format(formatter);

        return String.format("Lot z %s do %s | Cena: %.2f zł | Przesiadki: %d | Czas: %d min | Odlot: %s", from, to, price, layovers, durationMinutes, formattedDate);
    }
}