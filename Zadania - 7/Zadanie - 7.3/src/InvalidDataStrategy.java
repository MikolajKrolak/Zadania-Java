public class InvalidDataStrategy implements FileErrorStrategy {
    @Override
    public void handle(Exception e) {
        System.err.println("[BŁĘDNE DANE]: Plik zawiera błędy formatowania. Pomijam uszkodzone rekordy.");
    }
}
