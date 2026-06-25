import java.time.LocalDateTime;

public class UATicketInfo {
    public String from;
    public String to;
    public LocalDateTime dateTime;
    public double price;

    public UATicketInfo(String from, String to, LocalDateTime dateTime, double price) {
        this.from = from;
        this.to = to;
        this.dateTime = dateTime;
        this.price = price;
    }
}