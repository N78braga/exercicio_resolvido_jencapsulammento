package exercicios.heranca._09;

public class Jogo {
    private String nome;
    private String genero;

    public Jogo(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public static void main(String[] args) {
        JogoDeAcao jogoDeAcao = new JogoDeAcao("final fignt", "aventura e ação", "luta");
        JogoDeQuebraCabeca jogoDeQuebraCabeca = new JogoDeQuebraCabeca("quebra cabeça", "montagem", "raciocinio");

        jogoDeAcao.descricaoDoJogo();
        jogoDeQuebraCabeca.descricaoDoJogo();
    }
}
