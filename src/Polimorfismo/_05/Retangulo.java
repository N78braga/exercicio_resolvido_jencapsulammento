package Polimorfismo._05;

public class Retangulo extends Desenho{
    private String tipoDesenho;

    public Retangulo(String forma, String tipoDesenho) {
        super(forma);
        this.tipoDesenho = tipoDesenho;
    }

    @Override
    public String desenhar(){
        return  this.tipoDesenho;
    }
}
