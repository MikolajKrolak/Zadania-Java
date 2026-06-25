import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class Cache {
    private static Cache instance;
    private final List<DictionaryItem> cachedItems = new CopyOnWriteArrayList<>();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final Map<Class<? extends Exception>, FileErrorStrategy> errorStrategies = new HashMap<>();

    private int updateCounter = 1;

    private Cache() {
        errorStrategies.put(FileNotFoundException.class, new MissingFileStrategy());
        errorStrategies.put(IOException.class, new FileLockedStrategy());
        errorStrategies.put(IllegalArgumentException.class, new InvalidDataStrategy());

        scheduler.scheduleAtFixedRate(this::refreshCache, 0, 5, TimeUnit.MINUTES);
    }

    public static synchronized Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    public void refreshCache() {
        System.out.println("\n--- Rozpoczeto odswiezanie cache ---");
        try {
            List<DictionaryItem> freshData = loadFromCsvFile("slownik.csv");
            cachedItems.clear();
            cachedItems.addAll(freshData);
            System.out.println("Sukces: Dane zaktualizowane do wersji v" + (updateCounter - 1));
        } catch (Exception e) {
            FileErrorStrategy strategy = errorStrategies.getOrDefault(e.getClass(), exception -> {
                System.err.println("Nieznany blad: " + exception.getMessage());
            });
            strategy.handle(e);
            System.out.println("Uwaga: Blad! Cache NIE zmienil sie (zostala poprzednia wersja).");
        }
        printCacheContents();
    }

    private List<DictionaryItem> loadFromCsvFile(String path) throws Exception {
        double random = Math.random();
        if (random < 0.25) {
            throw new FileNotFoundException();
        } else if (random < 0.50) {
            throw new IOException();
        } else if (random < 0.75) {
            throw new IllegalArgumentException();
        }

        List<DictionaryItem> data = new ArrayList<>();
        data.add(new DictionaryItem(1, 1, "POM", "Woj. Pomorskie v" + updateCounter, "Region"));
        data.add(new DictionaryItem(4, 1, "GD", "Gdansk v" + updateCounter, "City"));
        data.add(new DictionaryItem(9, 1, "ADM", "administrator v" + updateCounter, "UserType"));

        updateCounter++;
        return data;
    }

    public List<DictionaryItem> getCachedItems() {
        return Collections.unmodifiableList(cachedItems);
    }

    public void printCacheContents() {
        System.out.println("=== Zawartosc Cache ===");
        if (cachedItems.isEmpty()) {
            System.out.println("Cache jest pusty");
        } else {
            for (DictionaryItem item : cachedItems) {
                System.out.println("  " + item);
            }
        }
        System.out.println("=======================");
    }
}

