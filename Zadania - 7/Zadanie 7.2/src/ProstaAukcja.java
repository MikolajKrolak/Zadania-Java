public class ProstaAukcja extends Auction {
    private double aktualnaNajwyzszaCena;

    public ProstaAukcja(String nazwa, String opis, double cenaPoczatkowa, int czasTrwania, int minPunktyZaufania, User sprzedajacy) {
        super(nazwa, opis, cenaPoczatkowa, czasTrwania, minPunktyZaufania, sprzedajacy);
        this.aktualnaNajwyzszaCena = cenaPoczatkowa;
    }

    @Override
    public void zlozOferte(User kupujacy, double kwota) {
        if (!mozeLicytowac(kupujacy)) return;

        if (kwota > aktualnaNajwyzszaCena) {
            ofertyWRundzie.put(kupujacy, kwota);
            aktualnaNajwyzszaCena = kwota;
            wygrywajacy = kupujacy;
        }
    }

    @Override
    public void nastepnaRunda() {
        if (zakonczona) return;

        if (aktualnaRunda >= czasTrwania) {
            zakonczona = true;
        } else {
            ofertyWRundzie.clear();
            aktualnaRunda++;
        }
    }
}