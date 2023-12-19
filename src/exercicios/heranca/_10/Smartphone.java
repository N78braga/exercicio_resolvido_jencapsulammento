package exercicios.heranca._10;

public class Smartphone extends DispositovoEletronico {

    public Smartphone(boolean ligar, boolean desligar) {
        super(ligar, desligar);
    }

    public void statusDoAparelho() throws InterruptedException {
        if (isDesligar() != isLigar()) {
            System.out.println("O Smartphone está desligado.");
        }
        Thread.sleep(5 * 1000);
        if (isLigar() != isDesligar()) {
            System.out.println("O Smartphone está ligado.");
            Thread.sleep(5 * 1000);
        }
        if (isDesligar() != isLigar()) {
            System.out.println("O aparelho está desligado.");

        }

    }
}
