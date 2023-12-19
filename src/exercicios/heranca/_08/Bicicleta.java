package exercicios.heranca._08;

public class Bicicleta extends MeioDeTransporte{
    private String pedajar;

    public Bicicleta(int acelerar, String frear, String pedajar) {
        super(acelerar, frear);
        this.pedajar = pedajar;
    }

    public String getPedajar() {
        return pedajar;
    }
    public void andarDeBicicleta(){

    }
}
