package br.com.alura.desafios.desafio07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Produto p01 = new Produto();
       p01.setNome("CELULAR");

       Produto p02 = new Produto();
       p02.setNome("Fone");

        Produto p03 = new Produto("USB", 15.95, 5);

        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(p01);
        listaProduto.add(p02);

        System.out.println("Tamanho do lista: " + listaProduto.size());
        System.out.println("Produto 1: " + listaProduto.get(0));

        System.out.println("Lista produtos: " + listaProduto);

        ProdutoPerecivel p04 = new ProdutoPerecivel("Bateria", 15.00, 2, "2024-05-01");
        System.out.println(p04);
    }
}
