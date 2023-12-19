package Exercicios.encapsulamento._11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CreditCard {
    private String numeroCartao;
    private String validadeCartao;
    private double saldo;

    public CreditCard(String numeroCartao, String validadeCartao, double saldo) {
        this.numeroCartao = numeroCartao;
        this.validadeCartao = validadeCartao;
        this.saldo = saldo;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public  void  realizarPagamento(double pagamneto){
        if(this.saldo >= pagamneto && pagamneto > 0){
            this.saldo -= pagamneto;
            System.out.println("Pagamneto de $ " + String.format("%.2f",pagamneto) +
                    " Realizado com sucesso saldo restante: $" + String.format("%.2f",saldo));
        }
        else if(pagamneto <= 0){
            System.out.println("O pagamento não realizador porque tem que ser maior que zero.");
        }
        else{
            System.out.println("Saldo insuficiente para ser realizado o pagamento.");
            }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o número do cartão: ");
        String numeroCartão = scanner.nextLine();

        System.out.print("Digite a data do cartão: ");
        String dataCartão = scanner.nextLine();

        System.out.print("Digite o saldo do cartão: ");
        double saldo = scanner.nextDouble();

        CreditCard creditCard = new CreditCard(numeroCartão, dataCartão, saldo);

        System.out.print("Informe o valor do pamgamento: ");
        double pagamento = scanner.nextDouble();

        creditCard.realizarPagamento(pagamento);
    }
}
