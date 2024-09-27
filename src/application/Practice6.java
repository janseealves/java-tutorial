package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userImput = new Scanner(System.in);

        final int N = 3;

        Employee[] employees = new Employee[N];
        Employee employee;

        char bool;
        String name;
        int hours;
        double valuePerHour;
        double additional;


        for(int i = 0; i < N; i++) {
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.print("Outsourced (y/n)? ");
            bool = userImput.next().charAt(0);
            userImput.nextLine();
            System.out.print("Name: ");
            name = userImput.nextLine();
            System.out.print("Hours: ");
            hours = userImput.nextInt();
            userImput.nextLine();
            System.out.print("Value per hour: ");
            valuePerHour = userImput.nextDouble();
            userImput.nextLine();

            if (bool == 'y') {
                System.out.print("Additional charge: ");
                additional = userImput.nextDouble();
                userImput.nextLine();

                employees[i] = new OutSourcedEmployee(name, hours, valuePerHour, additional);
            } else {
                employees[i] = new Employee(name, hours, valuePerHour);
            }
        }

        System.out.println("Payments: ");
        for(int i = 0; i < N; i++){
            System.out.printf("%s - $ %.2f\n", employees[i].getName(), employees[i].payment());
        }
    }
}
