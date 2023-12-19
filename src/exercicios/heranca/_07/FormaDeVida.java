package exercicios.heranca._07;

public class FormaDeVida {
    final private String reino;
    final private String filo;

    public FormaDeVida(String reino, String filo) {
        this.reino = reino;
        this.filo = filo;
    }

    public String getReino() {
        return reino;
    }

    public String getFilo() {
        return filo;
    }

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Animalia", "Chordata", "Primates");
        Ave ave = new Ave("Animalia", "Chordata", "Aves");

        System.out.println(mamifero.descricao());
        System.out.println(ave.descricao());
    }
}
