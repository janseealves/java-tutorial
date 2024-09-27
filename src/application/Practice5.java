package application;

import entities.Account;
import entities.SavingsAccount;

public class Practice5 {
    public static void main(String[] args) {
        Account x = new Account(1001, "Maria", 500.00);
        Account y = new SavingsAccount(1002, "Joana", 500.00, 0.01);

        x.withdraw(100);
        y.withdraw(100);

        //Apesar de pertencerem a memsa classe (Account), o método "withdraw" se comporta de maneira difernete nos objetos x e y.

        System.out.println(x);
        System.out.println(y);
    }
}
