package Polimorfismo._09;

public class Flauta implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando Flauta");
    }

    @Override
    public void afinar() {
        System.out.println("Afiando a Flauta");

    }
}
