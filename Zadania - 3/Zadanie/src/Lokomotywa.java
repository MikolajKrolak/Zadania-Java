public class Lokomotywa extends Maszyna{
    private String numerSeryjny;
    private String przeznaczenie;

    public Lokomotywa(String numerSeryjny, String przeznaczenie, String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika){
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);

        this.numerSeryjny = numerSeryjny;
        this.przeznaczenie = przeznaczenie;
    }

    @Override
    public void wyswietl(){
        System.out.println("Jest to lokomotywa marki " + getMarka() + " o nazwie " + getNazwa());
        System.out.println("Jej numer seryjny to: " + numerSeryjny);
        System.out.println("Rodzaj silnika to " + getRodzajSilnika() + " o pojemności/mocy " + getPojemnoscSilnika());
        System.out.println("Lokomotywy jest " + przeznaczenie);
    }
}
