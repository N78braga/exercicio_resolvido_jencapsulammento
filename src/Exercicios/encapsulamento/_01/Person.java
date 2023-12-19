package Exercicios.encapsulamento._01;

import java.util.Locale;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private  String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public void informarNameAgeGender(){
        System.out.print("Your name is: ".concat(getName()));
        System.out.print(", You have ".concat(String.valueOf(getAge()).concat(" year, ")));
        System.out.println(" Your gender ".concat(getGender()));
    }


}
