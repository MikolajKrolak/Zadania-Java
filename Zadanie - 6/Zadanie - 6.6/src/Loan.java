public abstract class Loan implements LoanConstants{
    protected int loanNumber;
    protected String lastName;
    protected double loanAmount;
    protected double interestRate;
    protected int term;

    public Loan(int loanNumber, String lastName, double loanAmount, int term){
        this.loanNumber = loanNumber;
        this.lastName = lastName;
        this.loanAmount = loanAmount;
        this.term = term;

        if (loanAmount > max_loan_amount) {
            this.loanAmount = max_loan_amount;
        } else {
            this.loanAmount = loanAmount;
        }

        if (term == short_term || term == medium_term || term == long_term) {
            this.term = term;
        } else {
            this.term = short_term;
        }
    }

    @Override
    public String toString() {
        return "Pożyczka nr: " + loanNumber + ", nazwisko: " + lastName + ", oprocentowanie: " + String.format("%.1f%%", interestRate * 100) + ", okres: " + term;
    }
}
