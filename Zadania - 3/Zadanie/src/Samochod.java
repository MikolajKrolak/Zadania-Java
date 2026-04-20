public class Samochod extends Pojazd{
    private segment segment;
    private String VIN;

    public Samochod(segment segment, String VIN, double moc, double momentObrotowy, String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika){
        super(moc, momentObrotowy, marka, nazwa, pojemnoscSilnika, rodzajSilnika);

        this.segment = segment;
        this.VIN = VIN;
    }


    @Override
    public void wyswietl(){
        System.out.println("Pojazd ten jest samochodem");
//        System.out.println("Pojazd " + getNrPojazdu() + " z " + getMaxLiczbaPojazdow());
//        System.out.println("Pojazd ten jest marki " + getMarka() + " i ma nazwę " + getNazwa());
//        System.out.println("Rodzajem silnika jest " + getRodzajSilnika() + " o pojemności " + getPojemnoscSilnika() + " który ma moc " + moc + " oraz moment obrotowy wynoszący " + momentObrotowy);
        super.wyswietl();
        System.out.println("Pojazd ten zalicza się do segmentu " + segment);
        System.out.println("Numer VIN tego pojazdu to: " + VIN);
    }

}
