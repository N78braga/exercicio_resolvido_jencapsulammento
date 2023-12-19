package Polimorfismo._03;

public class Carro implements Veiculo {
    private String ingnicao;
    private String desacionar;
    private String corre;

    public Carro(String ingnicao, String desacionar, String corre) {
        this.ingnicao = ingnicao;
        this.desacionar = desacionar;
        this.corre = corre;
    }

    public String getIngnicao() {
        return ingnicao;
    }

    public String getDesacionar() {
        return desacionar;
    }

    public String getCorre() {
        return corre;
    }

    @Override
    public String ligar() {
        return this.getIngnicao();
    }

    @Override
    public String desligar() {
        return this.getDesacionar();
    }

    @Override
    public String acelerar() {
        return this.getCorre();
    }
}
