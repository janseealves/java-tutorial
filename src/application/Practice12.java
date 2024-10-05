package application;

import entities.CompanyTaxPayer;
import entities.IndividualTaxPayer;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userImput = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = userImput.nextInt();
        userImput.nextLine();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or company (i/c)? ");
            char bool = userImput.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = userImput.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = userImput.nextDouble();
            userImput.nextLine();

            if (bool == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = userImput.nextDouble();
                userImput.nextLine();
                taxPayers.add(new IndividualTaxPayer(name, annualIncome, healthExpenditures));
            }
            else {
                System.out.print("Numbers of employees: ");
                int numbersOfEmployees = userImput.nextInt();
                userImput.nextLine();
                taxPayers.add(new CompanyTaxPayer(name, annualIncome, numbersOfEmployees));
            }
        }

        System.out.println("-----------------------------------");
        double totalTaxes = 0;
        System.out.println("Taxes Paid:");
        for (TaxPayer taxPayer : taxPayers) {
            totalTaxes += taxPayer.tax();
            System.out.printf("%s: $%.2f\n", taxPayer.getName(), taxPayer.tax());
        }

        System.out.println("-----------------------------------");
        System.out.printf("Total Taxes: $ %.2f\n", totalTaxes);
    }
}
