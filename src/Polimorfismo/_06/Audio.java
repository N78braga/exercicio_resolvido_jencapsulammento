package Polimorfismo._06;

public class Audio extends Midia{
    private String radio;

    public Audio(String radio) {
        this.radio = radio;
    }

    public String getRadio() {
        return radio;
    }

    @Override
    public void reproduzir() {
        System.out.println("O rádio ele esta reproduzindo ".concat(this.getRadio()));

    }
}
