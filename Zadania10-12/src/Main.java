import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        zad10();
//        System.out.println(zad11());
        /*
        *The quick brown fox jumps over the lazy dog
        *With tenure, Suzie’d have all the more leisure for yachting, but her publications are no good.
        * */
        zad12();

    }
    public static void zad10(){
        Scanner zad10 = new Scanner(System.in);

        if (!zad10.hasNextInt()){
            System.out.println("BŁĄD");
            return;
        }
        int a = zad10.nextInt();
        if (a <= 0){
            System.out.println("BŁĄD");
            return;
        }

        if (!zad10.hasNextInt()){
            System.out.println("BŁĄD");
            return;
        }
        int b = zad10.nextInt();
        if (b <= 0){
            System.out.println("BŁĄD");
            return;
        }

        int[][] tablica2d = new int[a][b];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++) {

                if (!zad10.hasNextInt()){
                    System.out.println("BŁĄD");
                    return;
                }
                tablica2d[i][j] = zad10.nextInt();

            }
        }
        for (int j = 0; j < b; j++){
            for (int i = 0; i < a; i++) {
                System.out.print(tablica2d[i][j] + " ");
            }
        }
    }
    public static boolean zad11(){
        Scanner zad11 = new Scanner(System.in);
        String tekst = zad11.nextLine();

        int[] znaki = new int[26];
        int unikalne = 0;

        for (int i = 0; i < tekst.length(); i++){
            char znak = Character.toLowerCase(tekst.charAt(i));

            for (int j = 0; j < 26; j++) {
                if (znaki[j] == znak) {
                    break;
                }
                if (znaki[j] == 0) {
                    znaki[j] = znak;
                    unikalne++;
                    break;
                }
            }
        }
        if (unikalne == 26){
            return true;
        } else {
            return false;
        }
    }
    public static void zad12(){
        Scanner zad12 = new Scanner(System.in);
        System.out.print("Wpisz sekundy: ");
        double sekundy = zad12.nextInt();
        double wynik = sekundy/31557600;

        System.out.println("Wybierz planetę: Ziemia, Merkury, Wenus, Mars, Jowisz, Sturn, Uran, Neptun");
        String planeta = zad12.next();

        switch (planeta.toLowerCase()) {
            case "ziemia":
                System.out.printf("%.2f",wynik);
                break;
            case "merkury":
                System.out.printf("%.2f",wynik / 0.2408467);
                break;
            case "wenus":
                System.out.printf("%.2f",wynik / 0.61519726);
                break;
            case "mars":
                System.out.printf("%.2f",wynik / 1.8808158);
                break;
            case "jowisz":
                System.out.printf("%.2f",wynik / 11.862615);
                break;
            case "saturn":
                System.out.printf("%.2f",wynik / 29.447498);
                break;
            case "uran":
                System.out.printf("%.2f",wynik / 84.016846);
                break;
            case "neptun":
                System.out.printf("%.2f",wynik / 164.79132);
                break;
            }
    }
}