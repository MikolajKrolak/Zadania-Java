public class MissingFileStrategy implements FileErrorStrategy {
    @Override
    public void handle(Exception e) {
        System.err.println("[BRAK PLIKU]: Plik nie istnieje! Tworzę pustą bazę cache lub loguję krytyczny błąd: " + e.getMessage());
    }
}
