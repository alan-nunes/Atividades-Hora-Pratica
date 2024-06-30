package br.com.alura.desafios.desafio12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(8);

        ArrayList<Forma> listFormas = new ArrayList<>();
        listFormas.add(circulo);
        listFormas.add(quadrado);

        for(Forma forma : listFormas){
            System.out.println("Area: " + forma.calcularArea());
        }
    }
}
