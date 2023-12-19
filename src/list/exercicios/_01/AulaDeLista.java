package list.exercicios._01;

import java.util.ArrayList;
import java.util.List;

public class AulaDeLista {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Marcos");
        listString.add("Junior");
        listString.add("Paulo");
        listString.add("Pedro");

        for (String stringList : listString) {
            System.out.println(stringList);

        }

    }
}



