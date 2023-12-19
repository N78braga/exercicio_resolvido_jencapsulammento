package list.exercicios._03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlfabetoEmOrdem {
    public static void main(String[] args) {

        List<String> listaStrings = new ArrayList<>();
        listaStrings.add("Maçã");
        listaStrings.add("Laranja");
        listaStrings.add("Abacaxi");
        listaStrings.add("Banana");

        // Ordenar a lista de strings em ordem reversa (ordem alfabética reversa)
        Collections.sort(listaStrings, Collections.reverseOrder());

        // Exibir a lista de strings ordenada em ordem reversa
        for (String listaString:listaStrings) {
            System.out.println(listaString);
        }
    }
}

