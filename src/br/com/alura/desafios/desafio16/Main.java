package br.com.alura.desafios.desafio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Titulo> listaTitulo = new ArrayList<Titulo>();

        listaTitulo.add(new Titulo("A"));
        listaTitulo.add(new Titulo("B"));
        listaTitulo.add(new Titulo("C"));

        Collections.sort(listaTitulo);

        for (Titulo titulo : listaTitulo) {
            System.out.println(titulo.getNome());
        }
    }
}

/*
Crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o
 método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
 */