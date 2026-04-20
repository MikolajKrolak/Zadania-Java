public class Jednoslad extends Pojazd{
    private typ typ;

    public Jednoslad(typ typ, double moc, double momentObrotowy, String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika){
        super(moc, momentObrotowy, marka, nazwa, pojemnoscSilnika, rodzajSilnika);

        this.typ = typ;
    }

    public Jednoslad(typ typ, String marka, String nazwa) {
        super(0.0, 0.0, marka, nazwa, 0.0, null);

        this.typ = typ;
    }

    @Override
    public void wyswietl(){
        System.out.println("Pojazd ten jest jednośladem");
        System.out.println("Pojazd " + getNrPojazdu() + " z " + getMaxLiczbaPojazdow());
        if (getMarka() != null && !getMarka().isEmpty()){
            System.out.println("Pojazd ten jest marki " + getMarka());
        }
        if (getNazwa() != null && !getNazwa().isEmpty()){
            System.out.println("Pojazd ma nazwę " + getNazwa());
        }
        if (getRodzajSilnika() != null){
            System.out.println("Rodzajem silnika pojazdu jest " + getRodzajSilnika());
        }
        if (getPojemnoscSilnika() > 0){
            System.out.println("Pojemność silnika pojazdu to: " + getPojemnoscSilnika());
        }
        if (moc > 0){
            System.out.println("Moc pojazdu to: " + moc);
        }
        if (momentObrotowy > 0){
            System.out.println("Moment obrotowy pojazdu to: " + momentObrotowy);
        }
        if (typ != null){
            System.out.println("Pojazd ten zalicza jest typu " + typ);
        }
    }
}
