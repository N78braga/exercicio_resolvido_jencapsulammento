package Polimorfismo._05;

public class Círculo extends  Desenho{
    private String tipoDesenho;

    public Círculo(String forma, String tipoDesenho) {
        super(forma);
        this.tipoDesenho = tipoDesenho;
    }

    @Override
    public String desenhar(){
        return  this.tipoDesenho;
    }
}
