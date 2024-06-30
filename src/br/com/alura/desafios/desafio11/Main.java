package br.com.alura.desafios.desafio11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double precoTotal = 0;

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        Produto sabao = new Produto();
        sabao.setPreco(5.60);

        Produto sabonete = new Produto();
        sabonete.setPreco(3.60);

        produtos.add(sabao);
        produtos.add(sabonete);

        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();
        }

        System.out.println("Preço medio dos produtos: " + precoTotal / produtos.size() );
    }
}
