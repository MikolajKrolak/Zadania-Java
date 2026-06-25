import java.util.ArrayList;
import java.util.List;

public class SystemAukcyjny {
    private List<Auction> aukcje = new ArrayList<>();

    public void dodajAukcje(Auction a) {
        aukcje.add(a);
    }

    //kolejna tura
    public void przejdzDoKolejnejTury() {
        for (Auction a : aukcje) {
            a.nastepnaRunda();
        }
    }

    //szukanie nie zakończonych aukcji
    public List<Auction> wyszukajNiezakonczone() {
        List<Auction> wynik = new ArrayList<>();
        for (Auction a : aukcje) {
            if (!a.isZakonczona()) wynik.add(a);
        }
        return wynik;
    }

    //szukanie zakończonych aukcji
    public List<Auction> wyszukajZakonczone() {
        List<Auction> wynik = new ArrayList<>();
        for (Auction a : aukcje) {
            if (a.isZakonczona()) wynik.add(a);
        }
        return wynik;
    }

    //szukanie aukcji usera
    public List<Auction> wyszukajAukcjeUzytkownika(String login) {
        List<Auction> wynik = new ArrayList<>();
        for (Auction a : aukcje) {
            if (a.getSprzedajacy().getLogin().equals(login)) wynik.add(a);
        }
        return wynik;
    }

    //punkt + i -
    public void ocenKupujacego(User sprzedajacy, User kupujacy, boolean czyDacPlus) {
        boolean transakcjaZaistniala = false;

        // czy wygrana
        for (Auction a : wyszukajZakonczone()) {
            if (a.getSprzedajacy().getLogin().equals(sprzedajacy.getLogin()) && a.getWygrywajacy() != null && a.getWygrywajacy().getLogin().equals(kupujacy.getLogin())) {
                transakcjaZaistniala = true;
                break;
            }
        }

        if (transakcjaZaistniala) {
            int pkt = kupujacy.getPunktyZaufania();
            kupujacy.setPunktyZaufania(czyDacPlus ? pkt + 1 : pkt - 1);
        } else {
            System.out.println("Odmowa: Ten użytkownik nic od Ciebie nie kupił.");
        }
    }
}