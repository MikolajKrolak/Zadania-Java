public class MyDate {
    private int month, day, year;


    public MyDate(int day, int month, int year) {
        if (day < 0 || day > 31 || month < 0 || month > 12 || year < 1990 || year > 2050) {
            throw new IllegalArgumentException("BŁĄD");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate(){
        System.out.println(String.format("%02d/%02d/%d", day, month, year));
    }

}
