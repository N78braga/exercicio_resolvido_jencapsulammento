package exercicios.heranca._03;

public class Circulo extends FiguraGeometrica{

    public Circulo(double area) {
        super(area);
    }

    public void calcularAreaCirculo(){
        double areaCirculo = Math.pow(getArea(),2);
        System.out.printf("O Circulo tem um raio de %.2f\n",areaCirculo);
    }
    public void calcularPerimetroCirculo(){
        double calcularperimetro = Math.pow(getArea(), 2) * Math.PI;
        System.out.printf("O Circulo tem um perímetro de %.2f\n", calcularperimetro);
    }

}
