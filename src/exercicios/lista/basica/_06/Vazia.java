package exercicios.lista.basica._06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vazia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lists = new ArrayList<>();
        System.out.print("Entre com o primeiro nome: ");
        String firstName = input.nextLine();
        lists.add(firstName);

        System.out.print("Digite  [ S ] para continuar  ou [ N ] para sair:");
        String opcao = String.valueOf(Character.toUpperCase(input.next().charAt(0)));
        input.nextLine();

        if (!opcao.equalsIgnoreCase("S") && !opcao.equalsIgnoreCase("N")) {
            System.out.println();
            System.out.println("Opção inválida digite uma opção válida: ");
            System.out.println();
            System.out.print("Digite  [ S ] para continuar  ou [ N ] para sair:");
            opcao = String.valueOf(Character.toUpperCase(input.next().charAt(0)));
            input.nextLine();

            while (opcao.equalsIgnoreCase("S")) {
                System.out.print("Entre com o primeiro nome: ");
                firstName = input.nextLine();
                lists.add(firstName);
                System.out.print("Digite  [ S ] para continuar  ou [ N ] para sair:");
                opcao = String.valueOf(Character.toUpperCase(input.next().charAt(0)));
                input.nextLine();

                while (!opcao.equalsIgnoreCase("S") && !opcao.equalsIgnoreCase("N")) {
                    System.out.println();
                    System.out.println("Opção inválida digite uma opção válida: ");
                    System.out.println();
                    System.out.print("Digite  [ S ] para continuar  ou [ N ] para sair:");
                    opcao = String.valueOf(Character.toUpperCase(input.next().charAt(0)));
                    input.nextLine();

                }
            }

        } else {
            while (opcao.equalsIgnoreCase("S")) {
                System.out.print("Entre com o primeiro nome: ");
                firstName = input.nextLine();
                lists.add(firstName);
                System.out.print("Digite  [ S ] para continuar  ou [ N ] para sair:");
                opcao = String.valueOf(Character.toUpperCase(input.next().charAt(0)));
                input.nextLine();

                while (!opcao.equalsIgnoreCase("S") && !opcao.equalsIgnoreCase("N")) {
                    System.out.println();
                    System.out.println("Opção inválida digite uma opção válida: ");
                    System.out.println();
                    System.out.print("Digite  [ S ] para continuar  ou [ N ] para sair:");
                    opcao = String.valueOf(Character.toUpperCase(input.next().charAt(0)));
                    input.nextLine();

                }
            }
        }
        System.out.println();
        System.out.println("A lista com todos os elemento: ".concat(lists.toString()));
        System.out.println();
        lists.clear();
        System.out.println("Foi realizado a remoção de todos os elementos da lista: "
                .concat(lists.toString()));

        input.close();
    }
}
