package application;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class Employee{
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void salaryIncrease(double percentage){
        salary += salary * percentage;
    }
}

public class Practice8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner userImput = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = userImput.nextInt();
        userImput.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.printf("Employee #%d:\n", i);
            System.out.print("ID: ");
            int id = userImput.nextInt();
            userImput.nextLine();
            System.out.print("Name: ");
            String name = userImput.nextLine();
            System.out.print("Salary: ");
            double salary = userImput.nextDouble();
            userImput.nextLine();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = userImput.nextInt();
        userImput.nextLine();
        System.out.print("Enter the percentage: ");
        double percentage = userImput.nextDouble();
        userImput.nextLine();

        Employee employeeSalaryIncreased = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);

        if(employeeSalaryIncreased != null){
            employeeSalaryIncreased.salaryIncrease(percentage);
        }
        else {
            System.out.println("Error: Invalid ID!");
        }

        System.out.println("List of employees: ");
        for (Employee employee : employees) {
            System.out.printf("%d, %s, %.2f\n", employee.getId(), employee.getName(), employee.getSalary());
        }
    }
}
