package Polimorfismo._09;

public class Violao implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando Violão");

    }

    @Override
    public void afinar() {
        System.out.println("Afinado o Violão");

    }
}
