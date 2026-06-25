import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public interface BATicketService {
    List<BATicket> getTicketInfo(Airport from, Airport to, Date when);
}

class BATicketServiceImpl implements BATicketService {
    @Override
    public List<BATicket> getTicketInfo(Airport from, Airport to, Date when) {
        List<BATicket> tickets = new ArrayList<>();
        tickets.add(new BATicket(LocalDateTime.now().plusHours(2), 450.0));
        tickets.add(new BATicket(LocalDateTime.now().plusHours(5), 250.0));
        return tickets;
    }
}