package exercicios.heranca._05;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
   private double deposito;
   private double saque;

   public ContaBancaria(double deposito, double saque) {
      this.deposito = deposito;
      this.saque = saque;
   }

   public double getDeposito() {
      return deposito;
   }

   public double getSaque() {
      return saque;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.print("Digite o valor do deposito: R$ ");
      double deposito = scanner.nextDouble();

      System.out.print("Digite o valor do saque: R$ ");
      double saque = scanner.nextDouble();

      ContaCorrente contaCorrente = new ContaCorrente(deposito, saque);
      contaCorrente.sacarContaCorrete();

      System.out.print("Digite o valor do deposito: R$ ");
      deposito = scanner.nextDouble();

      System.out.print("Digite o valor do saque: R$ ");
      saque = scanner.nextDouble();
      ContaPoupanca contaPoupanca = new ContaPoupanca(deposito, saque);
      contaPoupanca.sacarContaPoupanca();

      scanner.close();
   }
}
