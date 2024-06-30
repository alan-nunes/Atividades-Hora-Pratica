package br.com.alura.desafios.desafio33;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AprendendoStreams {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Alan", "Andri", "Lisle", "gildo");
        nomes.stream()
                .sorted()
                .limit(3)
                .filter(n -> n.startsWith("L"))
                .map(n-> n.toUpperCase())
                .forEach(System.out::println);


        /* **********************************************************************************
          * Filter: permite filtrar os elementos da stream com base em uma condição. Por exemplo, podemos filtrar
          * uma lista de números para retornar apenas os números pares.
        */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]



        /* ****************************************************************************
        * Map: permite transformar cada elemento da stream em outro tipo de dado. Por exemplo, podemos transformar
        * uma lista de strings em uma lista de seus respectivos tamanhos.
        * */
        List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediárias");

        List<Integer> tamanhos = palavras.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(tamanhos); // Output: [4, 6, 11, 17]



        /* ****************************************************************************
        As operações finais são aquelas que encerram a stream e retornam um resultado concreto. Algumas operações
         finais comuns são o forEach, collect e count.

        Vamos ver alguns exemplos de operações finais:

         ForEach: permite executar uma ação em cada elemento da stream. Por exemplo, podemos imprimir
         cada elemento da lista.
         */
        List<String> nomesL = Arrays.asList("João", "Maria", "Pedro", "Ana");

        nomesL.stream()
                .forEach(nome -> System.out.println("Olá, " + nome + "!"));


        /* **********************************************************************************
        Collect: permite coletar os elementos da stream em uma coleção ou em outro tipo de dado.
        Por exemplo, podemos coletar os números pares em um conjunto.
         */
        List<Integer> numerosL = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Set<Integer> numerosParesL = numerosL.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(numerosParesL); // Output: [2, 4, 6, 8, 10]

    }
}
