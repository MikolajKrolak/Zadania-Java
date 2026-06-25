public class Main {
    public static void main(String[] args) {
        SystemAukcyjny system = new SystemAukcyjny();

        //uzytkownicy
        User sprzedawcaJan = new User("Jan", "Kowalski", "jann", "jan@mail.com", 10);
        User kupujacyPiotr = new User("Piotr", "Nowak", "piotrr", "piter@mail.com", 5);
        User kupujacyAnna  = new User("Anna", "Kiepska", "aniaa", "ania@mail.com", 1);

        //fabryka - nowe aukcje
        Auction prosta = AuctionFactory.stworzAukcje(
                "prosta", "Rower", "Dobry", 500.0, 2, 0, sprzedawcaJan
        );
        Auction wydluzana = AuctionFactory.stworzAukcje(
                "wydluzana", "PS 5", "Nowa", 1800.0, 2, 0, kupujacyPiotr
        );
        Auction odwrotna = AuctionFactory.stworzAukcje(
                "odwrotna", "RTX 4060", "Używana", 1200.0, 5, 0, sprzedawcaJan
        );

        system.dodajAukcje(prosta);
        system.dodajAukcje(wydluzana);
        system.dodajAukcje(odwrotna);

        System.out.println("--- RUNDA 1: LICYTACJE ---");

        //aukcja prosta - piotr, rower
        prosta.zlozOferte(kupujacyPiotr, 600.0);

        //wydluzona - anna, ps5
        wydluzana.zlozOferte(kupujacyAnna, 1900.0);

        //piotr placi 1zl
        odwrotna.zlozOferte(kupujacyPiotr, 0);
        //piotr kończy aukcje
        ((OdwrotnaAukcja) odwrotna).kupPrzedmiot(kupujacyPiotr);


        System.out.println("\n[System] Wywołuję: przejście do tury 2...");
        system.przejdzDoKolejnejTury();

        //2 tura nic
        //tura 3
        System.out.println("[System] Wywołuję: przejście do tury 3...");
        system.przejdzDoKolejnejTury();

        //prosta , 2 rundy piotr -> rower
        //odwrotna rtx piotra kupił 1 runda
        //wydlużona ps5 2 rundy + 1 od anny


        System.out.println("\n=== SPRAWDZENIE METOD SYSTEMU (KROPKI Z ZADANIA) ===");

        //niezakończone aukcje
        System.out.println("\n1. Lista NIEZAKOŃCZONYCH aukcji:");
        for (Auction a : system.wyszukajNiezakonczone()) {
            System.out.println(" -> " + a.getNazwa());
        }

        //zakończone aukcje
        System.out.println("\n2. Lista ZAKOŃCZONYCH aukcji:");
        for (Auction a : system.wyszukajZakonczone()) {
            String zwyciezca = (a.getWygrywajacy() != null) ? a.getWygrywajacy().getLogin() : "Brak chętnych";
            System.out.println(" -> " + a.getNazwa() + " (Wygrał: " + zwyciezca + ")");
        }

        //aukcje userów
        System.out.println("\n3. Aukcje wystawione przez usera '" + sprzedawcaJan.getLogin() + "':");
        for (Auction a : system.wyszukajAukcjeUzytkownika("jann")) {
            System.out.println(" -> " + a.getNazwa());
        }

        //ocenianie
        System.out.println("\n4. Test wystawiania opinii:");
        System.out.println("Punkty zaufania Piotra przed oceną: " + kupujacyPiotr.getPunktyZaufania());

        //jan ocenia piotra - może
        system.ocenKupujacego(sprzedawcaJan, kupujacyPiotr, true);

        System.out.println("Punkty zaufania Piotra po ocenie: " + kupujacyPiotr.getPunktyZaufania());

        //anna ocenia piotra - niemoże
        System.out.print("Próba nielegalnej oceny: ");
        system.ocenKupujacego(kupujacyAnna, kupujacyPiotr, false);
    }
}