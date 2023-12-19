package Exercicios.encapsulamento._02;

import java.util.Locale;
import java.util.Scanner;

public class BankcCount {
    private double deposito;
    private double saque;
    private double saldo;

    public BankcCount(double deposito, double saque) {
        this.deposito = deposito;
        this.saque = saque;
    }

    public double sacarValor() {
            double valor = deposito - (this.deposito - this.saque);
            //double  valorsacado = deposito - valor;
       return valor;
    }
    public double  saldoAtual(){
        return this.saldo =  this.deposito - this.saque;
    }

}



class BankcCountTeste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Infornme o valor do deposito: ");
        double deposito = scanner.nextDouble();
        System.out.print("Valor do saque: ");
        double saque = scanner.nextDouble();

        BankcCount bankcCount = new BankcCount(deposito, saque);
        System.out.println("Realizado saque de: " + bankcCount.sacarValor() + " reais.");

            System.out.println("Seu saldo é: " + bankcCount.saldoAtual() + " reais." );

        }

        }




