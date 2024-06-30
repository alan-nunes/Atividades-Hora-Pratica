package br.com.alura.desafios.desafio14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);

        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);
    }
}
