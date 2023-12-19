package exercicios.heranca._04;

public class Professor extends Pessoa{
    private  String materia;


    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public  void  informarDadosPrefessor(){
        System.out.println("O professor se chama: ".concat(getNome()));
        System.out.println("A sua idade é " + getIdade() + " anos.");
        System.out.println("E lecionar a materia: ".concat(getMateria()));
    }
}
