package exercicios.lista.basica._03;

import java.util.ArrayList;
import java.util.List;

public class ElementoEspecifico {

    public static boolean checksSpecifcElements(List<String> list, String containsName){

        return list.contains(containsName);
    }

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Maria");
        lists.add("Pedro");
        lists.add("João");
        lists.add("Flavio");
        lists.add("Fabia");

       String elments = "Maria";

        if(checksSpecifcElements(lists, elments)){
            System.out.println("A lista contém o elemento ".concat(elments).concat("."));
        }
        else{
            System.out.println("A lista não contém o elemento ".concat(elments).concat("."));
        }
    }
}
