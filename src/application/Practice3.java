package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userInput = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = userInput.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char bool = userInput.next().charAt(0);
        if(bool == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = userInput.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        }
        else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(userInput.nextDouble());

        System.out.println("Updated data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdraw(userInput.nextDouble());

        System.out.println("Updated data: ");
        System.out.println(account);
    }
}
