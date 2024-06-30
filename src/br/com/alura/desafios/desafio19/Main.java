package br.com.alura.desafios.desafio19;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;
        while(sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();

            System.out.println("Digite o valor do compra: ");
            double valor = sc.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(cartao.getCompras());

        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra.getDescricao() + ": " + compra.getValor());
        }

        System.out.println("***********************");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
    }
}

/*
1. Estrutura de Dados: computação na prática com Java (gratuito, português, artigo)

Este artigo contém as principais estruturas de dados na prática com Java: listas, listas ligadas, listas duplamente ligadas, pilhas e filas. Ele oferece exemplos valiosos sobre como implementar e utilizar estruturas de dados eficientes para otimizar o desempenho de seus programas.

2. Algoritmos e estrutura de dados - Hipsters #186 (gratuito, português, podcast)

No episódio #186 do podcast Hipsters.tech, os hosts discutem algoritmos e estruturas de dados. Além disso, entra em pauta a questão: será que você realmente precisa saber algoritmos e estruturas de dados para trabalhar com programação?

3. Estruturas de dados: uma introdução (gratuito, português, artigo)

Este artigo da Alura oferece uma introdução abrangente às estruturas de dados. Ele explora os conceitos fundamentais por trás dessas estruturas, fornecendo uma base sólida para entender como escolher e implementar a estrutura de dados adequada para diferentes cenários.

4. Java e orientação a objetos > COLLECTIONS FRAMEWORK (gratuito, português, apostila)

Parte da apostila "Java e Orientação a Objetos" da Alura, este capítulo foca no Collections Framework. Ele explora as coleções disponíveis no Java, como Listas e Mapas, proporcionando uma compreensão prática de como utilizar essas estruturas de dados na programação orientada a objetos em Java.
 */