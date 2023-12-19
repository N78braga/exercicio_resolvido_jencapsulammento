package Polimorfismo._02;

public abstract class Animal {
    private String som;
    private String Caminha;

    public Animal(String som, String caminha) {
        this.som = som;
        Caminha = caminha;
    }

    public String getSom() {
        return som;
    }

    public String getCaminha() {
        return Caminha;
    }

    public String emitirSom() {
        return emitirSom();
    }

    public String movimentar() {
        return movimentar();
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("AoAoAo!!!!!", "Corre");
        Animal gato = new Gato("Mi, ao, Mi,ao!!!!!!", "Lento");

        System.out.println("O cachorro ele late (".concat(cachorro.emitirSom()).concat(")"));
        System.out.println("E ele caminha (".concat(cachorro.movimentar()).concat(")"));
        System.out.println("O gato ele (".concat(gato.emitirSom()).concat(")"));
        System.out.println("E ele caminha (".concat(gato.movimentar()).concat(")"));
    }
}

