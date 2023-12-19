package Polimorfismo._05;

import java.util.Locale;

public class ContaBancaria {
    private double numeroConta;
    private double agencia;
    private double saldo;

    public ContaBancaria(double numeroConta, double agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double calcularSaldo(){
        return this.saldo;
    }
}

class TestContaBancaria{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaBancaria contaPoupanca = new ContaPoupanca(123154, 123, 1000, 50.00);
        ContaBancaria contaCorrente = new ContaCorrente(31456721,231,1000,50.00);

        System.out.printf(" Foi Realazado um saque de %.2f\n", contaPoupanca.calcularSaldo());

        System.out.printf(" Foi Realazado um saque de %.2f\n", contaCorrente.calcularSaldo());
    }

}