public class Pojazd extends Maszyna{
    protected double moc;
    protected double momentObrotowy;

    private int nrPojazdu = 0;
    static int maxLiczbaPojazdow = 0;

    public Pojazd(double moc, double momentObrotowy, String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika){
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);

        maxLiczbaPojazdow = maxLiczbaPojazdow + 1;
        nrPojazdu = maxLiczbaPojazdow;

        this.moc = moc;
        this.momentObrotowy = momentObrotowy;
    }

    public int getNrPojazdu() {
        return nrPojazdu;
    }

    public static int getMaxLiczbaPojazdow() {
        return maxLiczbaPojazdow;
    }

    @Override
    public void wyswietl(){
        System.out.println("Pojazd " + nrPojazdu + " z " + maxLiczbaPojazdow);
        System.out.println("Pojazd ten jest marki " + getMarka() + " i ma nazwę " + getNazwa());
        System.out.println("Rodzajem silnika jest " + getRodzajSilnika() + " o pojemności " + getPojemnoscSilnika() + " który ma moc " + moc + " oraz moment obrotowy wynoszący " + momentObrotowy);
    }

}
