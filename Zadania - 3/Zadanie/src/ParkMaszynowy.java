import java.util.ArrayList;
import java.util.List;

public class ParkMaszynowy {
    public static void main(String[] args) {
        List<Maszyna> lista = new ArrayList<>();

        //tworzenie obeieków
        Samochod s1 = new Samochod(segment.C, "WVWZZZ6NZ1Y269696", 140.0, 280.0, "Volkswagen", "Golf", 2.0, rodzajSilnika.DIESEL);
        Samochod s2 = new Samochod(segment.D, "WAUZZZ4G3JN010659", 190.0, 400.0, "Audi", "A6", 2.0, rodzajSilnika.DIESEL);
        Jednoslad j1 = new Jednoslad(typ.MOTOCYKL, 50.0, 80.0, "Yamaha", "MT-07", 0.689, rodzajSilnika.BENZYNOWY);
        Jednoslad j2 = new Jednoslad(typ.ROWER, "Kross", "Hexagon");
        Kosiarka k1 = new Kosiarka(true, false, 3, "Stiga", "Combi 48", 0.196, rodzajSilnika.BENZYNOWY);
        Kosiarka k2 = new Kosiarka(false, true, 5, "Husqvarna", "LC 348V", 0.196, rodzajSilnika.BENZYNOWY);
        Lokomotywa l1 = new Lokomotywa("SN-001", "towarowa", "Siemens", "Vectron", 6.4, rodzajSilnika.DIESEL);
        Lokomotywa l2 = new Lokomotywa("SN-002", "osobowa", "Bombardier", "TRAXX", 5.6, rodzajSilnika.ELEKTRYCZNY);
        Pojazd p1 = new Pojazd(1500.0, 4500.0, "UralVagon", "T-90", 12.0, rodzajSilnika.DIESEL);
        Pojazd p2 = new Pojazd(35.0, 200.0, "Toyota", "Forklift 8FGCU25", 0.0, rodzajSilnika.ELEKTRYCZNY);


        //dodawanie do listy
        lista.add(s1);
        lista.add(s2);
        lista.add(j1);
        lista.add(j2);
        lista.add(k1);
        lista.add(k2);
        lista.add(l1);
        lista.add(l2);
        lista.add(p1);
        lista.add(p2);

        //wyświetlanie
        for (Maszyna maszyna : lista) {
            maszyna.wyswietl();
            System.out.println("--------------------");
        }

        //test kosiarka
        k2.setCzyMelekser(true);
        k2.setCzyNaped(false);
        k2.setLiczbaOstrzy(4);
        System.out.println("Po zmianie stanu kosiarki:");
        k2.wyswietl();
    }
}
