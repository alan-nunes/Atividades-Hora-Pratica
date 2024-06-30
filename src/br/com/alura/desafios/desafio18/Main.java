package br.com.alura.desafios.desafio18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listPolimofica;

        listPolimofica = new ArrayList<>();
        listPolimofica.add("Masculino");
        listPolimofica.add("Feminino");

        System.out.println("ArrayList: " + listPolimofica);

        listPolimofica = new LinkedList<>();
        listPolimofica.add("Homem");
        listPolimofica.add("Mulher");
        System.out.println("LinkedList: " + listPolimofica);
    }
}

/*
Modifique o Exercício 4 para declarar a variável de lista como
a interface List, demonstrando o uso de polimorfismo.
 */