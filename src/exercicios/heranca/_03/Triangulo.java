package exercicios.heranca._03;

public class Triangulo extends FiguraGeometrica{

    private final double lado;

    public Triangulo(double area, double perimetro, double lado) {
        super(area, perimetro);
        this.lado = lado;
    }

    public void calcularAreaTriangulo(){
        double areaTriangulo = getArea() * getPerimetro()/2;
        System.out.printf("O Triângulo tem uma area de %.2f\n",areaTriangulo);
    }
    public void calcularPerimetroTriangulo(){
        double perimetroTriangulo = getPerimetro() + getArea() + this.lado;
        System.out.printf("O Triângulo tem uma perímetro de %.2f\n",perimetroTriangulo);

    }
}
