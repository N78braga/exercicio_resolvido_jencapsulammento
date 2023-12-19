package exercicios.heranca._08;

public class MeioDeTransporte {
    final private int acelerar;
    final private String frear;

    public MeioDeTransporte(int acelerar, String frear) {
        this.acelerar = acelerar;
        this.frear = frear;
    }

    public int getAcelerar() {
        return acelerar;
    }

    public String getFrear() {
        return frear;
    }
}
