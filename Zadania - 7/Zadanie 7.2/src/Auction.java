import java.util.HashMap;
import java.util.Map;

public abstract class Auction {
    private String nazwa;
    private String opis;
    protected double cenaPoczatkowa;
    protected int czasTrwania; // w rundach
    private int minPunktyZaufania;
    private User sprzedajacy;

    protected int aktualnaRunda = 1;
    protected boolean zakonczona = false;
    protected User wygrywajacy = null;

    protected Map<User, Double> ofertyWRundzie = new HashMap<>();

    public Auction(String nazwa, String opis, double cenaPoczatkowa, int czasTrwania, int minPunktyZaufania, User sprzedajacy) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.cenaPoczatkowa = cenaPoczatkowa;
        this.czasTrwania = czasTrwania;
        this.minPunktyZaufania = minPunktyZaufania;
        this.sprzedajacy = sprzedajacy;
    }

    public boolean mozeLicytowac(User u) {
        if (zakonczona) return false;
        if (u.getLogin().equals(sprzedajacy.getLogin())) return false;
        return u.getPunktyZaufania() >= minPunktyZaufania;
    }

    public abstract void zlozOferte(User kupujacy, double kwota);
    public abstract void nastepnaRunda();

    public boolean isZakonczona() { return zakonczona; }
    public User getSprzedajacy() { return sprzedajacy; }
    public User getWygrywajacy() { return wygrywajacy; }

    public String getNazwa() { return nazwa; }
}