package Exercicios.encapsulamento._10;

import java.util.Locale;
import java.util.Scanner;

public class PasswordManager {
    private String senha;

    public PasswordManager(String senha) {
        this.senha = senha;
    }


    public void salvarSenha(){
        if(this.senha.length() > 12){
            System.out.println("A senha não pode tem mais de 12 caracteres.");
        }else {
            System.out.println("Senha cadastrada com sucesso.");
        }
    }
}

class PasswordManagerTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        PasswordManager passwordManager = new PasswordManager(senha);

        passwordManager.salvarSenha();
    }
}