package exercicios.heranca._04;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
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

            System.out.print("Digite o nome do professor: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do professor: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Informe a materia que vai lecionar: ");
            String materia = scanner.nextLine();
            Professor professor = new Professor(nome, idade, materia);
            professor.informarDadosPrefessor();

            System.out.println(" ");
            System.out.print("Digite o nome do aluno: ");
            nome = scanner.nextLine();
            System.out.print("Digite a idade do aluno: ");
            idade = scanner.nextInt();

            Estudante estudante = new Estudante(nome, idade, professor.getMateria());
            estudante.infarmandoDadosEstudante();

            scanner.close();

    }
}

















