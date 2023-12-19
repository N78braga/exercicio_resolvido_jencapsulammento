package exercicios.lista.basica._09;

import java.util.ArrayList;
import java.util.List;

public class CalcularMediaListaInteiros {

    public static int calculateAverage(List<Integer> listaInteiros) {
        int mediaNumeroInterio = 0;
        for (Integer listainterio : listaInteiros) {

            mediaNumeroInterio += listainterio;
        }
        return mediaNumeroInterio / listaInteiros.size();
    }
    public static void main(String[] args) {
        List<Integer> listaNumeroInteiros = new ArrayList<>();
        listaNumeroInteiros.add(10);
        listaNumeroInteiros.add(30);
        listaNumeroInteiros.add(15);
        listaNumeroInteiros.add(29);
        listaNumeroInteiros.add(51);
        listaNumeroInteiros.add(102);

        System.out.println("A media da soma dos valores da lista é: "
                + calculateAverage(listaNumeroInteiros));
    }

}
