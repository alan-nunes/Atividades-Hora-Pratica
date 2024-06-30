package br.com.alura.desafios.desafio42;

import java.util.List;
import java.util.Optional;

public class ReduçãoStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers.stream().reduce(Integer::sum);
        result.ifPresent(System.out::println); //prints 15

    }
}

//Stream.reduce() é uma operação terminal que é utilizada para reduzir o conteúdo de um Stream
//para um único valor.
//
//No exemplo acima, somamos todos os números da lista usando o método reduce().