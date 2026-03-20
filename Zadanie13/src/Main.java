import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner zad13 = new Scanner(System.in);

        System.out.print("Wielkość tabeli: ");
        int n = zad13.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++){
            tab[i] = zad13.nextInt();
        }
        int najwieksza = NajwiekszaLiczba(tab[0], tab, 0, n);
        System.out.println("Wynik: " + najwieksza);

    }
    public static int NajwiekszaLiczba(int najw, int tab[], int pozycja, int n){
        if (pozycja == n){
            return najw;
        } else {
            if (tab[pozycja] > najw) {
                najw = tab[pozycja];
                return NajwiekszaLiczba(najw, tab, pozycja, n);
            } else {
                pozycja++;
                return NajwiekszaLiczba(najw, tab, pozycja, n);
            }
        }
    }
}
