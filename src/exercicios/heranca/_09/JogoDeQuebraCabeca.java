package exercicios.heranca._09;

public class JogoDeQuebraCabeca extends Jogo{
    private  String classe;

    public JogoDeQuebraCabeca(String nome, String genero, String classe) {
        super(nome, genero);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void descricaoDoJogo(){
        System.out.println("O nome do Jogo é ".concat(getNome()) + ", Ele do gênero ".concat(getGenero())
                + ", e Está cladsificado em ".concat(this.classe));
    }
}
