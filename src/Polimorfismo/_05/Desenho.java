package Polimorfismo._05;

public class Desenho {
   private final String forma;

   public Desenho(String forma) {
      this.forma = forma;
   }

   public String getForma() {
      return forma;
   }

   public String desenhar(){
      return forma;
   }
}
class TestDesenho{
   public static void main(String[] args) {
      Desenho circulo = new Círculo("criculo", "bola");
      Desenho retangulo = new Retangulo("retângulo", "quadro");

      System.out.println("O desenho é da classe do "
              .concat(circulo.getForma())+ " e o desenho é ".concat(circulo.desenhar()));

      System.out.println("O desenho é da classe do "
              .concat(retangulo.getForma())+ " e o desenho é ".concat(retangulo.desenhar()));


   }
}