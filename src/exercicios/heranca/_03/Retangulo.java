package exercicios.heranca._03;

public class Retangulo extends FiguraGeometrica{

    public Retangulo(double area, double perimetro) {
        super(area, perimetro);
    }
    public void calcularAreaRetangulo(){
        double areaRetagulo = getArea() * getPerimetro();
        System.out.printf("O retângulo tem uma área de %.2f\n", areaRetagulo);
    }

    public void calcularPerimetroRetangulo(){
        double perimetroRetangulo = (getArea()+getPerimetro()) * 2;
        System.out.printf("O retângulo tem uma perímetro de %.2f\n", perimetroRetangulo);
    }
}
