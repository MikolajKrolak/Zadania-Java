public class PersonalLoan extends Loan{

    public PersonalLoan(int loanNumber, String lastName, double loanAmount, int term, double primeRate){
        super(loanNumber, lastName, loanAmount, term);

        this.interestRate = primeRate + 0.02;
    }
}
