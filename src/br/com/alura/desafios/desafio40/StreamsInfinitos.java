package br.com.alura.desafios.desafio40;

import java.util.stream.Stream;

public class StreamsInfinitos {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);

    }
}

//        Streams infinitos, ou “infinite Streams”, são streams que não têm um tamanho definido. Eles são
//úteis quando queremos gerar uma sequência de números ou valores. Aqui está um exemplo de como criamos
//um Stream infinito com o método iterate:
//
//No exemplo acima, começamos com o número 0 e adicionamos 1 a cada iteração para gerar uma sequência
//numérica. Utilizamos o método limit() para restringir o Stream infinito a 10 elementos e usamos
//forEach para imprimi-los.
