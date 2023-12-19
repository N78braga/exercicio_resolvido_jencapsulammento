package Polimorfismo._04;

public class Mago extends Personagem{

    private final String ataque;

    public Mago(String classe, String ataque) {
        super(classe);
        this.ataque = ataque;
    }

    public String getAtaque() {
        return ataque;
    }

    @Override
    public String atacar(){

        return getAtaque();
    }
}
