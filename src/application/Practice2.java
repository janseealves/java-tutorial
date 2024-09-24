package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Practice2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userInput = new Scanner(System.in);

        String name;
        double price;
        int quantity;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = userInput.nextLine();
        System.out.print("Price: ");
        price = userInput.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = userInput.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(userInput.nextInt());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(userInput.nextInt());

        System.out.println(product);
    }
}
