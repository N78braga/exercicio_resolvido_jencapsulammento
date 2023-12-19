package exercicios.heranca._06;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
   final private String nome;
   final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome do Produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o valor do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        ProdutosEletronicos produtosEletronicos = new ProdutosEletronicos(nomeProduto,preco, quantidade);
        produtosEletronicos.informaNomePrecoQuantidade();

        System.out.print("Digite o nome do Produto: ");
        nomeProduto = scanner.nextLine();
        System.out.print("Digite o valor do produto: ");
        preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        quantidade = scanner.nextInt();

        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(nomeProduto, preco, quantidade);
        produtoAlimenticio.informaNomePrecoQuantidade();
        scanner.close();


    }
}

