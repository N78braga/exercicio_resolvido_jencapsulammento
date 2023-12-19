package exercicios.heranca._02;

import java.util.Scanner;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do veiculo: ");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        Carro carro = new Carro(marca, modelo);

        System.out.println("Seu veiculo é da marca: " .concat(carro.getMarca()));
        System.out.println("O seu veiculo é do modelo: ".concat(carro.getModelo()));

        System.out.println("----------------------------------------------");

        System.out.println("Digite a marca do veiculo: ");
        marca = scanner.nextLine();

        System.out.println("Digite o modelo do veiculo: ");
        modelo = scanner.nextLine();

        Moto moto = new Moto(marca, modelo);
        System.out.println("Seu veiculo é da marca: " .concat(moto.getMarca()));
        System.out.println("O seu veiculo é do modelo: ".concat(moto.getModelo()));

        scanner.close();


    }
}
