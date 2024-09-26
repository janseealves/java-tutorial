package entities;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(int number, String holder, double interestRate) {
        super(number, holder);
        this.interestRate = interestRate;
    }

    public SavingsAccount(int number, String holder, double initialDeposit, double interestRate) {
        super(number, holder, initialDeposit);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0)
            balance -= amount;
        else
            System.out.println("Error");
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
}
