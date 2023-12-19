package Exercicios.encapsulamento._07;

import java.util.Locale;
import java.util.Scanner;

public class Employee {
    private double salario;
    private String cargo;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe o cargo que ocupa: ");
        String cargo = scanner.nextLine();

        Employee employee = new Employee();

        employee.setSalario(salario);
        employee.setCargo(cargo);
        System.out.printf("O fucionario recebe: %.2f\n", employee.getSalario());
        System.out.println("E ocupa o cargo de: ".concat(employee.getCargo()));
    }
}