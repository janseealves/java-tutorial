package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userInput =  new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = userInput.nextDouble();
        x.b = userInput.nextDouble();
        x.c = userInput.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = userInput.nextDouble();
        y.b = userInput.nextDouble();
        y.c = userInput.nextDouble();

        System.out.printf("Triangle X area = %f /n", x.area());
        System.out.printf("Triangle Y area = %f /n", y.area());
    }
}