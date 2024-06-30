package br.com.alura.desafios.desafio26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        try {
            if (senha.length() > 8) {
                System.out.println("Senha válida");
            } else {
                throw new SenhaInvalidaException("Senha invalida");
            }
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção
SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a
critérios específicos (por exemplo, ter pelo menos 8 caracteres).
 */


/*
try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
 */