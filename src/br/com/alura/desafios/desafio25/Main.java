package br.com.alura.desafios.desafio25;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;

        try{
            double resultado = num1 / num2;
            System.out.println("Resuldado da divisão: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Impossivel dividir por zero");
        }


    }
}
 /*
 Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
 Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
  */