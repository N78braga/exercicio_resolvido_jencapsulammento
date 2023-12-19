package list.exercicios._02;

import java.util.*;

public class NumeroOrdem {
    private Integer numero;

    public NumeroOrdem(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Número em Ordem = " + numero;
    }
}
class numeroOrdemTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<NumeroOrdem> numeros = new ArrayList<>();


        System.out.print("Quanto número vai ser digitado: ");
        int valor = scanner.nextInt();


        for(int i = 0; i < valor; i++){

            System.out.print("Digite o " + (i+1) + "º valor:");
            int inputValor = scanner.nextInt();

            numeros.add(new NumeroOrdem(inputValor));

        }
        Collections.sort(numeros, Comparator.comparingDouble(NumeroOrdem::getNumero));

        for (NumeroOrdem numero: numeros) {
            System.out.println(numero);

        }

    }
}
