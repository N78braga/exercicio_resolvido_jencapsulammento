package Polimorfismo._04;

public class Guerreiro extends Personagem{

    private final String ataque;

    public Guerreiro(String classe, String ataque) {
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
