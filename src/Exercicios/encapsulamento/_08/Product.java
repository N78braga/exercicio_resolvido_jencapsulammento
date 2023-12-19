package Exercicios.encapsulamento._08;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Product(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void quantidadeProdutoEstoque() {
        System.out.print("Produto ".concat(this.nome));
        System.out.printf(" Custa: %.2f", this.preco);
        System.out.println(" E em estoque tem um total de " + this.quantidadeEstoque + " produtos");
    }
}

class ProductTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Cadastrar Produto: ");
        String produto = scanner.nextLine();

        System.out.print("Cadastre o valor do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Cadstre a quantidadedo produto em estoque: ");
        int qantidade = scanner.nextInt();

        Product product = new Product(produto, preco, qantidade);

        product.quantidadeProdutoEstoque();
    }
}
