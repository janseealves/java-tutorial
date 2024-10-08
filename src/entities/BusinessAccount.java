package entities;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount(){
    }

    public BusinessAccount(double loanLimit){
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(int number, String holder, double loanLimit){
        super(number, holder);
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(int number, String holder, double initialDeposit, double loanLimit){
        super(number, holder, initialDeposit);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit)
            balance += amount - 10.0;
    }
}
