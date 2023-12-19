package exercicios.lista.basica._05;

import java.util.*;

public class OrdenacaoNumeroInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lists = new ArrayList<>();
        System.out.print("Adiacione um valor a lista: ");
        int valor = input.nextInt();
        lists.add(valor);

        while (valor != 0) {
            System.out.print("Deseja continuar digite um valor para sair digite [ 0 ]: ");
            valor = input.nextInt();
            if (valor == 0) {
                lists.remove(Integer.valueOf(0));
            } else {
                lists.add(valor);
            }
        }
        Collections.sort(lists);
        System.out.print("Os Valores da contido na lista é: ");
        for (Integer list : lists) {
            System.out.print(list + "  ");
        }
        input.close();
    }
}
