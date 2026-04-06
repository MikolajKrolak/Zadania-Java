import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
//    zad1();
//    zad2();
//    zad3();
//    zad4();
//    zad5();
//    zad6();
//    zad7();
    zad8();

  }
  public static void zad1() {
    //zad1
    double a = 2;
    double b = 2;

    System.out.println(a + b);
  }
  public static void zad2() {
    //zad2
    double wynik = (pow(PI, 2));
    System.out.printf("%.2f",wynik);
  }
  public static void zad3() {
    //zad3
    Scanner zad3 = new Scanner(System.in);

    System.out.println("Podaj dwa wyrazy oddzielone spacją");
    String napis1 = zad3.next();
    String napis2 = zad3.next();

    System.out.println('%' + napis2 + ' ' + napis1 + '%');
  }
  public static void zad4() {
    //zad4
    Scanner zad4 = new Scanner(System.in);

    System.out.println("Podaj bok a: ");
    int a = zad4.nextInt();
    System.out.println("Podaj bok b: ");
    int b = zad4.nextInt();
    System.out.println("Podaj bok c: ");
    int c = zad4.nextInt();

    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("BŁĄD");
    } else if (a + b > c && a + c > b && b + c > a) {
      System.out.println("TAK");
    } else {
      System.out.println("NIE");
    }
  }
  public static void zad5() {
    //zad5
    Scanner zad5 = new Scanner(System.in);
    System.out.println("Podaj liczbę od 1 do 12");
    int miesiac = zad5.nextInt();

    String[] miesiace = {
            "Styczeń: 31 dni",
            "Luty: 28 dni",
            "Marzec: 31 dni",
            "Kwiecień: 30 dni",
            "Maj: 31 dni",
            "Czerwiec: 30 dni",
            "Lipiec: 31 dni",
            "Sierpień: 31 dni",
            "Wrzesień: 30 dni",
            "Październik: 31 dni",
            "Listopad: 30 dni",
            "Grudzień: 31 dni"
    };

    System.out.println(miesiace[miesiac-1]);
  }
  public static void zad6() {
    //zad6
    DecimalFormat df = new DecimalFormat("0.000000");
    double[] malejaco = new double[3];
    Scanner zad6 = new Scanner(System.in);

    System.out.println("Podaj a: ");
    double a = zad6.nextInt();
    System.out.println("Podaj b: ");
    double b = zad6.nextInt();
    System.out.println("Podaj c: ");
    double c = zad6.nextInt();

    if (a < b && a < c){
      System.out.println(df.format(a));
      malejaco[2] = a;
      if (b < c){
        System.out.println(df.format(b));
        malejaco[1] = b;
        System.out.println(df.format(c));
        malejaco[0] = c;
      } else {
        System.out.println(df.format(c));
        malejaco[1] = c;
        System.out.println(df.format(b));
        malejaco[0] = a;
      }
    } else if (b < a && b < c){
      System.out.println(df.format(b));
      malejaco[2] = b;
      if (a < c){
        System.out.println(df.format(a));
        malejaco[1] = a;
        System.out.println(df.format(c));
        malejaco[0] = c;
      } else {
        System.out.println(df.format(c));
        malejaco[1] = c;
        System.out.println(df.format(a));
        malejaco[0] = a;
      }
    } else {
      System.out.println(df.format(c));
      malejaco[2] = c;
      if (a < b){
        System.out.println(df.format(a));
        malejaco[1] = a;
        System.out.println(df.format(b));
        malejaco[0] = b;
      } else {
        System.out.println(df.format(b));
        malejaco[1] = b;
        System.out.println(df.format(a));
        malejaco[0] = a;
      }
    }
    System.out.println(df.format(malejaco[0]));
    System.out.println(df.format(malejaco[1]));
    System.out.println(df.format(malejaco[2]));
  }
  public static void zad7() {
    //zad7
    int suma = 0;
    Scanner zad7 = new Scanner(System.in);

//sprawdzenie czy wejście to int oraz warunaek aby tablica miała wielkość
    if (!zad7.hasNextInt()){
      System.out.println("BŁĄD");
      return;
    }
    int n = zad7.nextInt();
    if (n <= 0){
      System.out.println("BŁĄD");
      return;
    }

    //tak samo jak wyżej
    if (!zad7.hasNextInt()){
      System.out.println("BŁĄD");
      return;
    }
    int m = zad7.nextInt();
    if (m != n){
      System.out.println("BŁĄD");
      return;
    }

    int[] tab1 = new int[n];
    int[] tab2 = new int[m];

    for(int i = 0; i < n; i++){
      //sprawdzenie czy wejście to int
      if (!zad7.hasNextInt()) {
        System.out.println("BŁĄD");
        return;
      }
      tab1[i] = zad7.nextInt();
    }
    for(int i = 0; i < m; i++){
      //tak samo
      if (!zad7.hasNextInt()) {
        System.out.println("BŁĄD");
        return;
      }
      tab2[i] = zad7.nextInt();
      suma = suma + (tab1[i] * tab2[i]);
    }
    System.out.println(suma);

  }
  public static void zad8() {
    Scanner zad8 = new Scanner(System.in);

    if (!zad8.hasNextInt()){
      System.out.println("BŁĄD");
      return;
    }
    int n = zad8.nextInt();
    if (n < 0){
      System.out.println("BŁĄD");
      return;
    }
    //trójkąt rosnący
    for (int i = 0; i < n; i++) {
      int j = 0;
      do {
        System.out.print('*');
        j++;
      } while (j <= i);
      System.out.println();
    }
    //trójkąt malejący
    for (int i = n; i > 0; i--) {
      int j = i;
      do {
        System.out.print('*');
        j--;
      } while (j > 0);
      System.out.println();
    }
    //trójkąt malejący spacje
    /*
     * s = 0
     * g = 3
     *
     * s = 1
     * g = 2
     *
     * s = 2
     * g = 1
     *
     * */
    int s = 0;
    int g = n;
    for (int i = 0; i < n; i++) {
      if (s > 0 && s < n) {
        for (int z = 0; z < s; z++){
          System.out.print(' ');
        }
      }
      s++;
      int x = 0;
      do {
        System.out.print('*');
        x++;
      } while (x < g);
      System.out.println();
      g--;
    }
    /*
     * s = n - 1 [2]
     * g = 1
     *
     * s-- [1]
     * g++ [2]
     *
     *
     * s-- [0]
     * g++ [3]
     * */
    //trójkąt rosnący spacje
    s = n - 1;
    g = 1;
    for (int i = 0; i < n; i++) {
      int x = 0;
      if(s > 0){
        do {
          System.out.print(' ');
          x++;
        } while (x < s);
      }
      s--;

      for (int j = 0; j < g; j++) {
        System.out.print('*');
      }
      g++;
      System.out.println();
    }
  }
}