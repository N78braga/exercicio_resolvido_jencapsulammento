package exercicios.lista.basica._02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerficalistaVazia {
    public static void removeElements(List<String> list) {
        list.clear();

    }

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Maria");
        lists.add("Pedro");
        lists.add("João");
        lists.add("Flavio");
        lists.add("Fabia");

        removeElements(lists);
        // lists.add("Paulo");

        if (lists.isEmpty()) {
            System.out.println("A lista esta vazia.");
        } else {
            System.out.println("A lista contem elementos." + lists);
        }
    }
}
