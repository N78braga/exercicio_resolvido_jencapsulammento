package Exercicios.encapsulamento._06;

import java.util.Scanner;

public class Customer {
    private String nome;
    private String endereco;
    private  String numeroTelefone;

    public Customer(String nome, String endereco, String numeroTelefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

}

class CustomerTest{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o número do seu telefone: ");
        String telefone = scanner.nextLine();

        Customer customer = new Customer(nome, endereco, telefone);

        System.out.println("O seu nome é " + customer.getNome());
        System.out.println("Você mora na " + customer.getEndereco());
        System.out.println("O seu telefone é: " + customer.getNumeroTelefone());


    }
}
