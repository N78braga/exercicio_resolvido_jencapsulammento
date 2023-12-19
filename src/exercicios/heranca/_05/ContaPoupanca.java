package exercicios.heranca._05;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double deposito, double saque) {
        super(deposito, saque);
    }

    public void sacarContaPoupanca(){
        final double valorsacador = getDeposito() - getSaque();
        final double saldoAtual = valorsacador;
        System.out.printf("O valor do sacado é: R$ %.2f\n", valorsacador);
        System.out.printf("O valor atual total: R$ %.2f\n", saldoAtual);
    }
}
