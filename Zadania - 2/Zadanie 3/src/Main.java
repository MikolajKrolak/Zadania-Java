import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int day = scanner.nextInt();
    int month = scanner.nextInt();
    int year = scanner.nextInt();

    MyDate data = new MyDate(day, month, year);

    data.displayDate();
}