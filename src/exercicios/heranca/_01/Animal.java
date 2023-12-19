package exercicios.heranca._01;

import java.util.Scanner;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu animel: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do seu animal: ");
        int idade = scanner.nextInt();

        Cachorro cachorro = new Cachorro(nome, idade);

        System.out.println("O seu cachorro se chama: ".concat(cachorro.getNome()));
        System.out.println("O seu cachorro tem a idade de: " + cachorro.getIdade() + " anos");

        System.out.println("-----------------------------------------------");
        scanner.nextLine();
        System.out.print("Digite o nome do seu animel: ");
        nome = scanner.nextLine();


        System.out.print("Digite a idade do seu animal: ");
        idade = scanner.nextInt();

        Gato gato = new Gato(nome, idade);
        System.out.println("O seu gato se chama: ".concat(gato.getNome()));
        System.out.println("O seu gato tem a idade de: " + gato.getIdade() + " anos");
        scanner.close();

    }
}
