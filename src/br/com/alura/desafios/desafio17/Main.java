package br.com.alura.desafios.desafio17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("elemento 1");
        listaArrayList.add("elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("elemento 3");
        listaLinkedList.add("elemento 4");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

    }
}
/*
Crie uma lista utilizando a interface List e instancie-a tanto como
 ArrayList quanto como LinkedList. Adicione elementos e imprima a
 lista, mostrando que é possível trocar facilmente a implementação.
 */