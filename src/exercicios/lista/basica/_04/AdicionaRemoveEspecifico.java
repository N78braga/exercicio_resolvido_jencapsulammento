package exercicios.lista.basica._04;

import java.util.ArrayList;
import java.util.List;

public class AdicionaRemoveEspecifico {
    public static <T> int checksElementsPosition(List<T> list, T elements){
        return list.indexOf(elements);
    }
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Maria");
        lists.add("Pedro");
        lists.add("João");
        lists.add("Flavio");
        lists.add("Fabia");
        String elementsPosition = "Maria";
        int nome = checksElementsPosition(lists, elementsPosition);
        System.out.println(lists);
        if (nome != -1) {
            lists.remove(nome);
           // System.out.println(nome);
        }
        for (String lista : lists) {
            System.out.println(" Os elemento que contem na lista é " + lista);

        }

    }
}
