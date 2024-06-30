package br.com.alura.desafios.desafio37;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExemploFindAnyParallelStream {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        for(int i = 1; i < 100; i++){
            numeros.add(i);
        }

        // Utilizando parallelStream para encontrar um elemento qualquer em paralelo
        Optional<Integer> numeroQualquer = numeros.parallelStream()
                .filter(numero -> numero % 10 == 0)
                .findAny();

        if(numeroQualquer.isPresent()){
            System.out.println("Numero encontrado: " + numeroQualquer.get());
        } else{
            System.out.println("Nenhum número encontrado");
        }
    }
}
