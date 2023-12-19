package exercicios.heranca._05;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(double deposito, double saque) {
        super(deposito, saque);
    }

    public void sacarContaCorrete(){
       final double valorsacador = getDeposito() - getSaque();
       final double saldoAtual = valorsacador - 5.00;
        System.out.printf("O valor do sacado é: R$ %.2f\n", valorsacador);
        System.out.printf("O valor atual total: R$ %.2f\n", saldoAtual);
    }


}
