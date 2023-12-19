package Polimorfismo._04;

public class Personagem {
    private String Classe;

    public Personagem(String classe) {
        Classe = classe;
    }

    public String getClasse() {
        return Classe;
    }

    public String atacar() {

        return "Ataque com as mãos";
    }
}
class TestPersonagem{
    public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro("Gladiador", "Espada");
        Personagem mago = new Mago("Fada", "bola de água");

        System.out.println("O pesonagem é da classe de ".concat(guerreiro.getClasse()
                .concat(" e ele luta com ".concat(guerreiro.atacar()))));

        System.out.println("O pesonagem é da classe de ".concat(mago.getClasse()
                .concat(" e ele luta com o feitiço de ".concat(mago.atacar()))));
    }
}