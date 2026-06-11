import java.util.ArrayList;
import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podstawowa stopa oprocentowania: ");
        double prime_interest_rate = scanner.nextDouble();
        prime_interest_rate = prime_interest_rate / 100;

        Loan[] loans = new Loan[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Pożyczka nr: " + (i + 1));

            System.out.println("Typ pożyczki (1 - Biznesowa, 2 - Indywidualna): ");
            int loan_type = scanner.nextInt();

            System.out.println("Numer pożyczki: ");
            int loan_number = scanner.nextInt();
            System.out.println("Nazwisko: ");
            String last_name = scanner.next();
            System.out.println("Kwota pożyczki: ");
            double loan_amount = scanner.nextDouble();
            System.out.println("Okres(Short - 1, Medium - 3, Long - 5): ");
            int term = scanner.nextInt();

            if (loan_type == 1) {
                loans[i] = new BusinessLoan(loan_number, last_name, loan_amount, term, prime_interest_rate);
            } else if (loan_type == 2) {
                loans[i] = new PersonalLoan(loan_number, last_name, loan_amount, term, prime_interest_rate);
            }
        }

        for (Loan loan : loans){
            System.out.println(loan);
        }

    }
}