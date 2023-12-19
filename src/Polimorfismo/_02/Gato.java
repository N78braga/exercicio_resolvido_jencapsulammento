package Polimorfismo._02;

public class Gato extends Animal{


    public Gato(String som, String caminha) {
        super(som, caminha);
    }

    public String emitirSom(){
        return this.getSom();
    }
    @Override
    public String movimentar(){
        return this.getCaminha();
    }

}
