package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userImput = new Scanner(System.in);

        final int N = 3;

        List<Employee> employees= new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.print("Outsourced (y/n)? ");
            char bool = userImput.next().charAt(0);
            userImput.nextLine();
            System.out.print("Name: ");
            String name = userImput.nextLine();
            System.out.print("Hours: ");
            int hours = userImput.nextInt();
            userImput.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = userImput.nextDouble();
            userImput.nextLine();

            if (bool == 'y') {
                System.out.print("Additional charge: ");
                double additional = userImput.nextDouble();
                userImput.nextLine();

                employees.add(new OutSourcedEmployee(name, hours, valuePerHour, additional));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("Payments: ");
        for (Employee employee : employees) {
            System.out.printf("%s - $ %.2f", employee.getName(), employee.payment());
        }
    }
}
