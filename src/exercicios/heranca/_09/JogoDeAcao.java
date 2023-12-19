package exercicios.heranca._09;

public class JogoDeAcao extends Jogo{
    private String tipoDoJogo;

    public JogoDeAcao(String nome, String genero, String tipoDoJogo) {
        super(nome, genero);
        this.tipoDoJogo = tipoDoJogo;
    }

    public String getTipoDoJogo() {
        return tipoDoJogo;
    }
    public void descricaoDoJogo(){
        System.out.println("O nome do Jogo é ".concat(getNome()) + ", Ele do gênero ".concat(getGenero())
        + ", e Está cladsificado em ".concat(tipoDoJogo));
    }
}







