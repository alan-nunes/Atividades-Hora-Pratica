package br.com.alura.desafios.desafio15;
/*
Crie uma classe Titulo com um atributo nome do tipo String. Implemente a
 interface Comparable na classe para que seja possível ordenar uma lista
  de objetos Titulo.
 */

public class Titulo implements Comparable<Titulo>{
    private String nome;

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }

}
