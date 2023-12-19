package Polimorfismo._03;

public class Bicicleta implements Veiculo{
    private String andar;
    private String freio;
    private String corre;

    public Bicicleta(String andar, String freio, String corre) {
        this.andar = andar;
        this.freio = freio;
        this.corre = corre;
    }

    public String getAndar() {
        return andar;
    }

    public String getFreio() {
        return freio;
    }

    public String getCorre() {
        return corre;
    }

    @Override
    public String ligar() {
        return this.getAndar();
    }

    @Override
    public String desligar() {
        return this.getFreio();
    }

    @Override
    public String acelerar() {
        return this.getCorre();
    }
}
