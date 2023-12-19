package Polimorfismo._03;

public interface Veiculo {

    public  String ligar();
    public String desligar();
    public String acelerar();

}
class VeiculoTes{
    public static void main(String[] args) {
        Veiculo carro = new Carro("Chave", "Freio", "fundo");
        Veiculo bicicleta = new Bicicleta("Pedalando", "Freiando", "Rápido");

        System.out.println("Ligando o carro girando a ".concat(carro.ligar()));
        System.out.println("Desligando o carro usando o ".concat(carro.desligar()));
        System.out.println("E acelerando o carro pisando ".concat(carro.acelerar()));
        System.out.println();
        System.out.println("Acionando a bicicleta ".concat(bicicleta.ligar()));
        System.out.println("Parando a bicicleta usando o ".concat(bicicleta.desligar()));
        System.out.println("Acelerando a bicicleta pedalando ".concat(bicicleta.acelerar()));

    }
}