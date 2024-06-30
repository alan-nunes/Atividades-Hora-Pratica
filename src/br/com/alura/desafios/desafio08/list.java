package br.com.alura.desafios.desafio08;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String elemento : list){
            System.out.println(elemento);
        }
    }
}
