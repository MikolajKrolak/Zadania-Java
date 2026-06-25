public class DictionaryItem {
    private final int id;
    private final int intKey;
    private final String stringKey;
    private final String value;
    private final String enumerationName;

    public DictionaryItem(int id, int intKey, String stringKey, String value, String enumerationName) {
        this.id = id;
        this.intKey = intKey;
        this.stringKey = stringKey;
        this.value = value;
        this.enumerationName = enumerationName;
    }

    public int getId() { return id; }
    public int getIntKey() { return intKey; }
    public String getStringKey() { return stringKey; }
    public String getValue() { return value; }
    public String getEnumerationName() { return enumerationName; }

    @Override
    public String toString() {
        return String.format("[%s] ID: %d, Key: %d/%s -> %s", enumerationName, id, intKey, stringKey, value);
    }
}