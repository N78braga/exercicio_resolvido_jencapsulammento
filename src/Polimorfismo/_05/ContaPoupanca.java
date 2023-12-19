package Polimorfismo._05;

public class ContaPoupanca extends ContaBancaria {

    private double saque;

    public ContaPoupanca(double numeroConta, double agencia, double saldo, double saque) {
        super(numeroConta, agencia, saldo);
        this.saque = saque;
    }
    public double getSaque() {
        return saque;
    }

    @Override
    public double calcularSaldo(){
        return super.getSaldo() - this.saque;
    }
}
