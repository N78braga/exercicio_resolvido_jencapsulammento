package exercicio_de_tratamento_excecao._02;

import java.util.Scanner;

public class ExemploArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] name = {"Maria", "João", "Pedro", "Flavio"};

        System.out.print("Digite a posição e veja o valor dela: ");
        int position = input.nextInt();
        overflowsArrayError(name, position);

    }

    public static void overflowsArrayError(String[] name, int position) {
        try {
            String positionName = "";
            for (int i = 0; i < name.length; i++) {
                positionName = name[position];
            }
            System.out.println("Valor do indice " + position + " é: " + positionName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
            System.out.println("Tentativa de acessar um índice inválido no array.");
        }
    }
}
