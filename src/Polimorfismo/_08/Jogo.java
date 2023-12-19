package Polimorfismo._08;

public abstract class Jogo {
    private String classificacao;

    public Jogo(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public abstract String jogar();
}
class JogoTeste{
    public static void main(String[] args) {
        Jogo  jogoTaboleiro = new JogoTabuleiro("Damas", "Jogo de taboleiro");
        Jogo jogoCartas = new JogoCartas("baralho", "Jogo de Cartas");

        System.out.println(jogoTaboleiro.jogar());
        System.out.println(jogoCartas.jogar());
    }
}
