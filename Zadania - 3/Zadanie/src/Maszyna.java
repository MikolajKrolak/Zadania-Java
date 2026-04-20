abstract class Maszyna {
    private String marka;
    private String nazwa;
    private double pojemnoscSilnika;
    private rodzajSilnika rodzajSilnika;

    protected Maszyna(String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika){
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getMarka() {
        return marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public rodzajSilnika getRodzajSilnika() {
        return rodzajSilnika;
    }

    public abstract void wyswietl();
}
