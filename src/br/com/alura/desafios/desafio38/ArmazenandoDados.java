package br.com.alura.desafios.desafio38;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArmazenandoDados {
    public static void main(String[] args) {

        Transacoes transacoes1 = new Transacoes();

        transacoes1.setValor(10.000);
        transacoes1.setValor(2.000);
        transacoes1.setValor(6000);

        List<Transacoes> transacoes = new ArrayList<>();

        transacoes.add(transacoes1);

        transacoes.stream()
                .filter(t -> t.getValor() > 5000)
                .peek(System.out::println)
                .collect(Collectors.toSet()).stream()
                .findFirst();

    }
}

//Imagine que você é um analista de dados no Bytebank Banco Digital, você foi incumbido de monitorar o fluxo de transações bancárias
//realizadas. O banco utiliza o Java Stream API para processar esses dados. Durante o dia, uma infinidade de operações ocorrem, e todas
//são registradas em tempo real.
//
//Utilizando o Stream API e o conceito de Maps, peek, findFirst e demais recursos', como você criaria um fluxo que filtra
//as transações com valores superiores a 5000, imprime uma espécie de log com peek, busca a primeira destas transações encontradas
//e coleta os resultados em um Set?