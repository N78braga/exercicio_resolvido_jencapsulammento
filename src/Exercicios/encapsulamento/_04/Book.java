package Exercicios.encapsulamento._04;

import java.util.Scanner;

public class Book {
    private  String titulo;
    private  String autor;
    private int numeroPaginas;

    public Book(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}

class CarTeste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o titulo do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Informe o Autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Informe quantiidade de paginas que o livro tem: ");
        int quantidadePaginas = scanner.nextInt();

        Book book = new Book(titulo, autor, quantidadePaginas);

        System.out.println("O titulo do livro é: " + book.getTitulo());
        System.out.println("O nome do autor do livro é: " + book.getAutor());
        System.out.println("O ano em que o livro foi escrito fooi: " + book.getNumeroPaginas());
    }
}
