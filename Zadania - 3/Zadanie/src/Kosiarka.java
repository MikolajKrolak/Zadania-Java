public class Kosiarka extends Maszyna{
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(boolean czyMelekser, boolean czyNaped, int liczbaOstrzy, String marka, String nazwa, double pojemnoscSilnika, rodzajSilnika rodzajSilnika){
        super(marka, nazwa, pojemnoscSilnika, rodzajSilnika);

        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    @Override
    public void wyswietl(){
        System.out.println("Jest to kosiarka marki " + getMarka() + " o nazwie " + getNazwa());
        System.out.println("Kosiarka ta ma silnik " + getRodzajSilnika() + " o pojemności " + getPojemnoscSilnika());
        System.out.println("Liczba ostrzy kosiarki wynosi " + liczbaOstrzy);
        if (czyNaped){
            System.out.println("Kosiarka ta posiada również napęd");
        } else {
            System.out.println("Kosiarka ta nie posiada napędu");
        }
        if (czyMelekser){
            System.out.println("Kosiarka ta ma również melekser");
        } else {
            System.out.println("Kosiarka ta nie ma meleksera");
        }
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}
