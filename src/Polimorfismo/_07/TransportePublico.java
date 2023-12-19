package Polimorfismo._07;

import java.util.Locale;

public abstract class TransportePublico {

    public abstract void pegarPassageiro();
    public abstract void cobrarPassagem();
}

class TransportePublicoTeste{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        TransportePublico onibus = new Onibus("O Cidadão", 4.10);
        TransportePublico metro = new Metro("A Cidadã", 4.25);
        onibus.cobrarPassagem();
        onibus.pegarPassageiro();
        System.out.println("");
        metro.pegarPassageiro();
        metro.cobrarPassagem();
    }
}
