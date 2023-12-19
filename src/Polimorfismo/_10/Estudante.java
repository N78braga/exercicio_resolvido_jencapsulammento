package Polimorfismo._10;

import java.sql.SQLOutput;

public class Estudante extends Pessoa{
    private  String estudar;

    @Override
    public void trabalhar(){
        System.out.println("O estudante ele sai para estudar as 6:40 da amanhã");

    }
    @Override
    public void descansar(){
        System.out.println("O estudante descansa dos estudos as 11:00 amanhã");
    }

}
