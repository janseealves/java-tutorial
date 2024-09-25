package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0 )
            balance += amount;
        else
            System.out.println("Error");
    }

    public void withdraw(double amount){
        if(amount > 0)
            balance -= (amount + 5.0);
        else
            System.out.println("Error");
    }

    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $%.2f\n", getNumber(), getHolder(), getBalance());
    }
}


