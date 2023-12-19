package exercicios.lista.basica._10;

import java.util.ArrayList;
import java.util.List;

public class ProcessarElementosLista {
    public static void processElements(List<String> correctList){
        for(int i = 0; i < correctList.size(); i++){
            System.out.println((i+1) + "° nome da lista é " + correctList.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Maria");
        mylist.add("Pedro");
        mylist.add("João");
        mylist.add("Flavio");
        mylist.add("Fabia");

        processElements(mylist);

    }
}

