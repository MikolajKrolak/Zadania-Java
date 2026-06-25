public class AuctionFactory {
    public static Auction stworzAukcje(String typ, String nazwa, String opis, double cena, int czas, int minPkt, User sprzedawca) {
        switch (typ.toLowerCase()) {
            case "prosta":
                return new ProstaAukcja(nazwa, opis, cena, czas, minPkt, sprzedawca);
            case "wydluzana":
                return new WydluzanaAukcja(nazwa, opis, cena, czas, minPkt, sprzedawca);
            case "odwrotna":
                return new OdwrotnaAukcja(nazwa, opis, cena, czas, minPkt, sprzedawca);
            default:
                throw new IllegalArgumentException("Nie ma takiego typu aukcji!");
        }
    }
}