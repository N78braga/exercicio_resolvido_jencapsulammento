package exercicios.heranca._10;

public class DispositovoEletronico {
    private boolean ligar;
    private boolean desligar;

    public DispositovoEletronico(boolean ligar, boolean desligar) {
        this.ligar = ligar;
        this.desligar = desligar;
    }

    public boolean isLigar() {
        return ligar;
    }

    public boolean isDesligar() {
        return desligar;
    }

    public static void main(String[] args) throws InterruptedException {
        boolean ligar = false;

        boolean desligar = true;
        Smartphone smartphone = new Smartphone(ligar, desligar);
        Tablet tablet = new Tablet(ligar,desligar);
        smartphone.statusDoAparelho();
        System.out.println(" ");
        System.out.println("-----------------------------------=");
        Thread.sleep(5 * 1000);
        tablet.statusDoAparelho();


    }
}
