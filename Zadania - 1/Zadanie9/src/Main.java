import java.io.IOException;

public class Main {
    public static boolean Palindrom(char[] znaki, int dlugosc) {
        for (int i = 0; i < dlugosc / 2; i++) {
            if (znaki[i] != znaki[dlugosc - 1 - i]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        char[] znaki = new char[100];
        int dlugosc = 0;
        int odczyt;

//        while ((odczyt = System.in.read()) != -1 && dlugosc < 100) {
        while ((odczyt = System.in.read()) != '.' && dlugosc < 100) {
            znaki[dlugosc] = (char) odczyt;
            dlugosc++;
        }

        if (Palindrom(znaki, dlugosc)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
        //System.out.println(new String(znaki, 0, dlugosc));
    }
}