package exercicios.heranca._06;

public class ProdutosEletronicos extends Produto{
    final int quantidadeProduto;

    public ProdutosEletronicos(String nome, double preco, int quantidade) {
        super(nome, preco);
        this.quantidadeProduto = quantidade;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void informaNomePrecoQuantidade(){
        System.out.print("Nome do produto " .concat(getNome()));
        System.out.print(" O produto custa R$ %.2f" + getPreco());
        System.out.println(" E no estoque tem  uma quantidade de " + getQuantidadeProduto() + " Produtos");
    }
}
