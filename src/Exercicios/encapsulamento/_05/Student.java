package Exercicios.encapsulamento._05;



import java.util.Locale;
import java.util.Scanner;

public class Student {
    private double primeiraNota;
    private double segundaNota;
    private  double mediaAluno;

    public Student(double primeiraNota, double segundaNota) {
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void obterMediaNota(){
        this.mediaAluno = (this.primeiraNota + this.segundaNota)/2;
       /* if(this.mediaAluno >= 6){
            System.out.println("O aluno foi aprovado!");
        }else {
            System.out.println("O aluno foi reprovado!");
        }*/
        System.out.println((this.mediaAluno >= 6)? "Aluno aprovado obtever uma nota: "
                + this.mediaAluno:" Aluno reprovado obtever uma nota: " + this.mediaAluno);
    }
}
class StudentTeste{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();

        Student student = new Student(primeiraNota, segundaNota);

        student.obterMediaNota();


    }

}
