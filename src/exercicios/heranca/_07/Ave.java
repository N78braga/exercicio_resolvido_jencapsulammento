package exercicios.heranca._07;

class Ave extends FormaDeVida {
    private String classe;

    public Ave(String reino, String filo, String classe) {
        super(reino, filo);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public String descricao() {
        return "Esta ave pertence ao reino " + getReino() + ", filo " + getFilo() + " e classe " + classe + ".";
    }
}