package exercicios.lista.basica._07;

import java.util.ArrayList;
import java.util.List;

public class ListaVazio {
    public static void removingElements(List<String> list){
        while (!list.isEmpty()){
            list.remove(0);
        }
    }
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Amanda");
        lists.add("Bruno");
        lists.add("Carlos");
        lists.add("Daniel");
        lists.add("Emerson");
        lists.add("Fernanda");


        removingElements(lists);
       // lists.add("Fernanda");
        String statusList = lists.isEmpty() ? "A lista está vazia.": ("A lista contém o elemento " + lists);
        System.out.println(statusList);



    }
}
