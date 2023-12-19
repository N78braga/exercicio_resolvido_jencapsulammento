package Polimorfismo._08;

public class JogoCartas extends Jogo{
    private String tipoDeJogo;

    public JogoCartas(String classificacao, String tipoDeJogo) {
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
