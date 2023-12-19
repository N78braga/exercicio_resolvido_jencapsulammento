package exercicios.heranca._04;

public class Estudante extends Pessoa{
 private String disciplina;

    public Estudante(String nome, int idade, String materia) {
        super(nome, idade);
        this.disciplina = materia;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void infarmandoDadosEstudante(){
        System.out.println("O nome do aluno: ".concat(getNome()));
        System.out.println("A idade do aluno é " + getIdade() + " anos");
        System.out.println("E sua disciplina será ".concat(getDisciplina()));
    }
}
