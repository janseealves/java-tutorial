package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Practice11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1001, "Alex", 500, 0.01));
        accounts.add(new BusinessAccount(1002, "Maria", 1000, 400));
        accounts.add(new SavingsAccount(1004, "Bob", 300, 0.01));
        accounts.add(new BusinessAccount(1005, "Anna", 500, 500));

        double sum = 0.0;
        for (Account account : accounts) {
            sum += account.getBalance();
        }

        System.out.println(sum);
    }
}
