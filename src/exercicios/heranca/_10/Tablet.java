package exercicios.heranca._10;

public class Tablet extends DispositovoEletronico{

    public Tablet(boolean ligar, boolean desligar) {
        super(ligar, desligar);
    }
    public void statusDoAparelho() throws InterruptedException {
        if (isDesligar() != isLigar()) {
            System.out.println("O Tablet está desligado.");
        }
        Thread.sleep(5 * 1000);
        if (isLigar() != isDesligar()) {
            System.out.println("O Tablet está ligado.");
            Thread.sleep(5 * 1000);
        }
        if (isDesligar() != isLigar()) {
            System.out.println("O Tablet está desligado.");

        }

    }
}
