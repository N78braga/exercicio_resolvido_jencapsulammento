package exercicios.lista.basica._01;

import java.util.ArrayList;
import java.util.List;

public class AdicionarElementoList {
    public  static void addElements(List<String> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Maria");
        lists.add("Pedro");
        lists.add("João");
        lists.add("Flavio");
        lists.add("Fabia");

        System.out.println("A lista possui [ " + lists.size() + " ] elementos.");
        addElements(lists);

        System.out.println("------------------------------");

        lists.add("Paulo");
        System.out.println("A lista possui antes 5 elementos e agora ela tem [ " + lists.size() + " ] elementos.");
        addElements(lists);
    }
}
