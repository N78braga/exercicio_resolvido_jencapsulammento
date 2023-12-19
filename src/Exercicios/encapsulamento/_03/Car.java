package Exercicios.encapsulamento._03;

import java.util.Scanner;

public class Car {
    private  String marca;
    private String modelo;
    private int ano;

    public void obterMarca(String marca){
        this.marca = marca;
        System.out.println("A marca do veiculo é: " + this.marca);
    }
    public void obterModeloDoVeiculo(String modelo){
        this.modelo = modelo;
        System.out.println("O modelo do veiculo é: " + this.modelo);
    }
    public void anoDeFabricacaoDoVeiculo(int ano){
        this.ano = ano;
        System.out.println("O ano do veiculo é: " + this.ano);
    }

}

class CarTeste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca do veiculo: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe o ano do veiculo: ");
        int ano = scanner.nextInt();

        Car car = new Car();
        car.obterMarca(marca);
        car.obterModeloDoVeiculo(modelo);
        car.anoDeFabricacaoDoVeiculo(ano);
    }
}