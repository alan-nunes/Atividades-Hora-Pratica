package br.com.alura.desafios.desafio06;

public class Livro implements Calculavel {
   private double precoLivro;

    @Override
    public double calcularPrecoFinal(double desconto, double taxasAdicionais) {
        return precoLivro + taxasAdicionais - taxasAdicionais;
    }
}
