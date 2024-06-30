package br.com.alura.desafios.desafio01;

public class Produto implements Vendavel {

    private double preco;

    @Override
    public double precoTotal(int quantidade) {
        return quantidade * this.preco;
    }

    @Override
    public void aplicarDescontos(double desconto) {
        preco =- preco * (desconto / 100);
    }
}