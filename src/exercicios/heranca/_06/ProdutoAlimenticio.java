package exercicios.heranca._06;

public class ProdutoAlimenticio extends Produto{

    final private int quantidade;

    public ProdutoAlimenticio(String nome, double preco, int quantidade) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void informaNomePrecoQuantidade(){
        System.out.print("Nome do produto " .concat(getNome()));
        System.out.print(" O produto custa R$ %.2f" + getPreco());
        System.out.println(" E no estoque tem  uma quantidade de " + getQuantidade() + " Produtos");
    }
}
