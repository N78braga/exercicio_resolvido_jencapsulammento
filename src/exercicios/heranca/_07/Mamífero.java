package exercicios.heranca._07;

class Mamifero extends FormaDeVida {
    private String ordem;

    public Mamifero(String reino, String filo, String ordem) {
        super(reino, filo);
        this.ordem = ordem;
    }

    public String getOrdem() {
        return ordem;
    }

    public String descricao() {
        return "Este mamífero pertence ao reino " + getReino() + ", filo " + getFilo() + " e ordem " + ordem + ".";
    }
}
