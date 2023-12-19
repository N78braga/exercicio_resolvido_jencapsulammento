package Polimorfismo._09;

public interface InstrumentoMusical {
    void  tocar();
    void  afinar();
}
class InstrumentoMusicalTeste{
    public static void main(String[] args) {
        InstrumentoMusical flauta = new Flauta();
        InstrumentoMusical violao = new Violao();
        flauta.afinar();
        flauta.tocar();
        violao.afinar();
        violao.tocar();

    }
}