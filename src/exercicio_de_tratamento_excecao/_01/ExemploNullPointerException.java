package exercicio_de_tratamento_excecao._01;

public class ExemploNullPointerException {
    public static void main(String[] args) {
        try {
            // Criando uma referência de objeto nulo
            String texto = null;

            // Tentativa de acessar o método length() de um objeto nulo
            int tamanho = texto.length(); // Isso irá lançar NullPointerException

            // Esta linha não será alcançada se uma exceção for lançada acima
            System.out.println("O tamanho da string é: " + tamanho);
        } catch (NullPointerException e) {
            // Capturando e tratando a exceção NullPointerException
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
            System.out.println("Não é possível acessar um método ou atributo de um objeto nulo.");
        }
    }
}

