package Exercicios.encapsulamento._09;

import java.util.Locale;
import java.util.Scanner;

public class Circle {
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }
      final public void calcularArea(){
          double areaCalculada =  Math.pow(raio, 2);
        //double areaCalculada = Math.pow(raio, 2) * Math.PI;
          System.out.printf("A área do raio é: %.2f", areaCalculada);
      }
      final public void calcularPerimetro(){
        double perimetroCalculado = Math.pow(raio, 2) * Math.PI;
          System.out.printf("O perimetro do raio é: %.2f", perimetroCalculado);
      }
}

class CircleTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o Raio: ");
        double raio = scanner.nextDouble();

        Circle circle = new Circle(raio);

        circle.calcularArea();
        circle.calcularPerimetro();
    }
}