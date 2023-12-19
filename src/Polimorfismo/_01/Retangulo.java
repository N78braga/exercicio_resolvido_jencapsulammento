package Polimorfismo._01;

import java.text.Format;

public class Retangulo extends Forma{
    private double area;

    public Retangulo(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    @Override
    public double calcularArea(){
        return Math.pow(this.getArea(), 2);
    }
    @Override
    public double calcularPerimetro(){
        return (this.getArea() + this.getArea()) * 2;

    }
}

