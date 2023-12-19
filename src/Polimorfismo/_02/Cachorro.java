package Polimorfismo._02;

public class Cachorro extends Animal {

    public Cachorro(String som, String caminha) {
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
