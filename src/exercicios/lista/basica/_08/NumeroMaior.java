package exercicios.lista.basica._08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumeroMaior {

    public static int findGreatestValue(List<Integer> list) {
        return Collections.max(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(43);
        numbers.add(54);
        numbers.add(12);
        numbers.add(68);
        numbers.add(76);
        int numberGreatest = findGreatestValue(numbers);
        System.out.println("Valores da lista -> " + numbers);
        System.out.println("O maior número da lista é -> " + numberGreatest);
    }

}