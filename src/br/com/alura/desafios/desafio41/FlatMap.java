package br.com.alura.desafios.desafio41;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        );

        Stream<String> stream = list.stream()
                .flatMap(Collection::stream);

        stream.forEach(System.out::println);

    }
}

//O método flatMap é uma operação intermediária que é usada para transformar um Stream
//de coleções em um Stream de elementos. Aqui está um exemplo de como o flatMap é usado:
//
//        Neste exemplo, transformamos um Stream de List para um Stream de Strings.