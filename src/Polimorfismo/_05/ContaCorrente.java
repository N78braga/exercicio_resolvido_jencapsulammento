package Polimorfismo._05;

public class ContaCorrente extends ContaBancaria {

    private double saque;

    public ContaCorrente(double numeroConta, double agencia, double saldo, double saque) {
        super(numeroConta, agencia, saldo);
        this.saque = saque;

    }

    public double getSaque() {
        return saque;
    }

    @Override
    public double calcularSaldo(){
        return super.getSaldo() - this.saque - 5.00;
    }

}
