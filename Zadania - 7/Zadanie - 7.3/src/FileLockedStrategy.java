public class FileLockedStrategy implements FileErrorStrategy {
    @Override
    public void handle(Exception e) {
        System.err.println("[PLIK ZABLOKOWANY]: Plik zajęty. Zachowuję poprzedni stan cache i ponowię próbę za 5 minut.");
    }
}
