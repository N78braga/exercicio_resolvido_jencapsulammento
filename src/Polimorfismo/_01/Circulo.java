package Polimorfismo._01;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.getRaio(), 2);
    }
    @Override
    public double calcularPerimetro() {
        return Math.pow(this.getRaio(), 2) * Math.PI;
    }
}
