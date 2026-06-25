public class OdwrotnaAukcja extends Auction {
    private double aktualnaCena;
    private User podgladajacyUser = null;

    public OdwrotnaAukcja(String nazwa, String opis, double cenaPoczatkowa, int czasTrwania, int minPunktyZaufania, User sprzedajacy) {
        super(nazwa, opis, cenaPoczatkowa, czasTrwania, minPunktyZaufania, sprzedajacy);
        this.aktualnaCena = cenaPoczatkowa;
    }

    @Override
    public void zlozOferte(User kupujacy, double kwota) {
        if (!mozeLicytowac(kupujacy)) return;

        aktualnaCena -= 1.0;
        podgladajacyUser = kupujacy;

        System.out.println("[Cena ukryta] Użytkownik " + kupujacy.getLogin() + " odsłonił kwotę: " + aktualnaCena + " zł");
    }

    public void kupPrzedmiot(User kupujacy) {
        if (zakonczona) return;

        if (kupujacy.equals(podgladajacyUser)) {
            wygrywajacy = kupujacy;
            zakonczona = true;
        } else {
            System.out.println("Musisz najpierw złożyć ofertę (obniżyć cenę o 1zł), by kupić!");
        }
    }

    @Override
    public void nastepnaRunda() {
        if (zakonczona) return;
        podgladajacyUser = null;

        if (aktualnaRunda >= czasTrwania) {
            zakonczona = true;
        } else {
            aktualnaRunda++;
        }
    }
}