package Polimorfismo._10;

public class Trabalhador extends Pessoa{

    @Override
    public void trabalhar(){
        System.out.println("O Trabalhar as 7:00 da amanhã");

    }
    @Override
    public void descansar(){
        System.out.println("O tabalhador descansa do trabalhor as 10:00 da amanhã");
    }

}
