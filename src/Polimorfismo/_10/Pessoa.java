package Polimorfismo._10;

public abstract class  Pessoa {
    public void trabalhar(){

    }
    public void descansar(){

    }
}
class PessoaTest {
    public static void main(String[] args) {
        Pessoa estudante = new Estudante();
        Pessoa traabalahador = new Trabalhador();

        estudante.trabalhar();
        estudante.descansar();
        System.out.println(" ");
        traabalahador.trabalhar();
        traabalahador.descansar();
    }
}
