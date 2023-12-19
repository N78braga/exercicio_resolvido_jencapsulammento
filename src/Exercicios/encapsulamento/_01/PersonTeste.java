package Exercicios.encapsulamento._01;

import Exercicios.encapsulamento._01.Person;

import java.util.Locale;
import java.util.Scanner;

class PersonTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();

        Person person = new Person(name, age, gender);
        person.informarNameAgeGender();

    }

}
