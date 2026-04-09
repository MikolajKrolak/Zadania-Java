public class Student {
    private String imie;
    private String nazwisko;
    private String numerIndeksu;
    private double obecnosc;
    private int ocena;

    public Student() {
        this.imie = "Unknown";
        this.nazwisko = "Unknown";
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
        if (obecnosc < 50) {
            this.ocena = 2;
        }
    }

    public void setImie(String imie){
        if (!imie.isEmpty()) {
            this.imie = imie;
        }
    }
    public void setNazwisko(String nazwisko){
        if (!nazwisko.isEmpty()) {
            this.nazwisko = nazwisko;
        }
    }

    public void setNumerIndeksu(String numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public void setObecnosc(double obecnosc) {
        this.obecnosc = obecnosc;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public double getObecnosc() {
        return obecnosc;
    }

    public int getOcena() {
        return ocena;
    }
}
