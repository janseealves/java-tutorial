package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;

public class Practice4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account acc = new Account(1001, "Alex");
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 500.0);

        //Upcasting!
        Account acc2 = bacc;
        Account acc3 = new BusinessAccount(1003, "Bob", 0.0, 500.0);

        //Downcasting!
        BusinessAccount acc4 = (BusinessAccount) acc2; //casting manual!
        acc4.loan(200.0);

        //Verificação com instanceof para fazer o casting manual de forma segura!
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
