package exercicios.heranca._08;

public class CarroEsportivo extends MeioDeTransporte{
    final private String ligar;


    public CarroEsportivo(int acelerar, String frear, String ligar) {
        super(acelerar, frear);
        this.ligar = ligar;

    }

    public String getLigar() {
        return ligar;
    }

    public void passearComCarro(){
        System.out.print("Entra no carro ligar o carro ".concat(getLigar())
                .concat("passar machar") + getAcelerar() + getFrear());

    }
}
