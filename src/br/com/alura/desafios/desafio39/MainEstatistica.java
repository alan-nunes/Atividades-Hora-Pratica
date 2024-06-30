package br.com.alura.desafios.desafio39;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static java.util.Arrays.*;

public class MainEstatistica {
    public static void main(String[] args) {

        List<Aluno> alunos = asList(
                new Aluno("Alice", LocalDate.of(2002, 10, 20)),
                new Aluno("Bob", LocalDate.of(1980, 8, 9)),
                new Aluno("Carlos", LocalDate.of(2001, 01, 28)),
                new Aluno("David", LocalDate.of(2003, 05, 12)),
                new Aluno("Eva", LocalDate.of(2005, 12, 03))
        );

        IntSummaryStatistics statistics = alunos.stream()
                .mapToInt(Aluno::getIdade)
                .summaryStatistics();

        System.out.println("Idade média: " + statistics.getMax());
        System.out.println("Idade mínima: " + statistics.getMin());
        System.out.println("Idade máxima: " + statistics.getAverage());
        System.out.println("Total de alunos: " + statistics.getCount());
    }
}
