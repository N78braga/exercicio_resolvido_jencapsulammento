package Polimorfismo._08;

public class JogoTabuleiro extends Jogo{

    private String tipoDeJogo;

    public JogoTabuleiro(String classificacao, String tipoDeJogo) {
        super(classificacao);
        this.tipoDeJogo = tipoDeJogo;
    }

    public String getTipoDeJogo() {
        return tipoDeJogo;
    }

    @Override
    public String jogar() {
        return "Jogar, ".concat(this.getClassificacao())
                .concat(" é bom este jogo é considerado um jogo de ").concat(this.getTipoDeJogo());
    }
}
