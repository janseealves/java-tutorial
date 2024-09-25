package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = userInput.nextLine();

        Account account = new Account(accountNumber, accountHolder);

        System.out.print("Is there an initial deposit (y/n)? ");
        String bool = userInput.nextLine();
        if(bool.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = userInput.nextDouble();
            userInput.nextLine();

            account.deposit(initialDeposit);
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
