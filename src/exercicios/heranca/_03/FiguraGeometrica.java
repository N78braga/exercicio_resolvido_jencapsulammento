package exercicios.heranca._03;

import java.util.Locale;
import java.util.Scanner;

public class FiguraGeometrica {
    private double area;
    private double perimetro;

    public FiguraGeometrica(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public FiguraGeometrica(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o valor da área: ");
        double area = scanner.nextDouble();

        System.out.print("Digite o valor do perimetro: ");
        double perimetro = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(area, perimetro);

        retangulo.calcularAreaRetangulo();
        retangulo.calcularPerimetroRetangulo();
        System.out.println("-------------------------------------------------");

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);

        circulo.calcularAreaCirculo();
        circulo.calcularPerimetroCirculo();

        System.out.println("-------------------------------------------------");

        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        double primeiroLado = scanner.nextDouble();

        System.out.print("Digite o valor do segundo lado do triângulo: ");
        double segundoLado = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        double terceiroLado = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(primeiroLado, segundoLado, terceiroLado);

        triangulo.calcularAreaTriangulo();
        triangulo.calcularPerimetroTriangulo();
        scanner.close();


    }

}
