import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public interface UATicketService {
    List<UATicketInfo> getTicketInfo(String from, String to, Date when);
}

class UATicketServiceImpl implements UATicketService {
    @Override
    public List<UATicketInfo> getTicketInfo(String from, String to, Date when) {
        List<UATicketInfo> tickets = new ArrayList<>();
        tickets.add(new UATicketInfo(from, to, LocalDateTime.now().plusHours(1), 300.0));
        tickets.add(new UATicketInfo(from, to, LocalDateTime.now().plusHours(4), 600.0));
        return tickets;
    }
}