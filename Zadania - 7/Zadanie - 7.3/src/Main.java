public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cache cache = Cache.getInstance();

        for (int i = 1; i <= 6; i++) {
            Thread.sleep(1000);
            System.out.println("\n[SYSTEM] --- CYKL TESTOWY NR " + i + " ---");
            cache.refreshCache();
        }

        System.out.println("\n[SYSTEM] Koniec testu");
        System.exit(0);
    }
}