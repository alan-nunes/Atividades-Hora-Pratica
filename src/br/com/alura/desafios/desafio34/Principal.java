package br.com.alura.desafios.desafio34;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
//        Você precisa exibir uma lista dos 10 melhores filmes lançados num determinado ano. Para isso,
//        você levará em consideração o total de visualizações, que deve ser maior ou igual a 10 mil,
//            e avaliação dos clientes, que deverá ser maior ou igual a 9.4. Considere a classe Filme abaixo:

        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Filme("Filme A", 2022, 1200, 9.5));
        filmes.add(new Filme("Filme B", 2022, 12000, 9.5));
        filmes.add(new Filme("Filme C", 2022, 1200, 9.5));
        filmes.add(new Filme("Filme D", 2022, 1200, 9.5));

        filmes.stream()
                .filter(filme -> filme.getAnoLancamento() == 2022)
                .filter(filme -> filme.getTotalVisualizacao() >= 10000 && filme.getAvaliacao() >= 9.4)
                .sorted(Comparator.comparing(Filme::getAvaliacao).reversed())
                .limit(10)
                .forEach(System.out::println);
    }
}
