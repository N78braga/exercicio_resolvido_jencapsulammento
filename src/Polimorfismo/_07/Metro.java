package Polimorfismo._07;

public class Metro extends TransportePublico{
    private String passageiro;
    private double passagem;

    public Metro(String passageiro, double passagem) {
        this.passageiro = passageiro;
        this.passagem = passagem;
    }


    public String getPassageiro() {
        return passageiro;
    }

    public double getPassagem() {
        return passagem;
    }

    @Override
    public void pegarPassageiro() {
        System.out.println(this.getPassageiro().concat(" Pegou o metro, para o centro" +
                " de Jaboatão."));

    }

    @Override
    public void cobrarPassagem() {
        System.out.printf("O valor da passagem foi de %.2f \n", this.getPassagem());

    }
}
