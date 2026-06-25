public class User {
    private String imie;
    private String nazwisko;
    private String login;
    private String email;
    private int punktyZaufania;

    public User(String imie, String nazwisko, String login, String email, int punktyZaufania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.email = email;
        this.punktyZaufania = punktyZaufania;
    }

    public String getLogin() { return login; }
    public int getPunktyZaufania() { return punktyZaufania; }
    public void setPunktyZaufania(int punktyZaufania) { this.punktyZaufania = punktyZaufania; }
}