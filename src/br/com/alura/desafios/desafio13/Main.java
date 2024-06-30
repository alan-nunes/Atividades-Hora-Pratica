package br.com.alura.desafios.desafio13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double maiorSaldo = 0.0;

        ContaBancaria conta01 = new ContaBancaria();
        conta01.setSaldo(100.00);

        ContaBancaria conta02 = new ContaBancaria();
        conta02.setSaldo(200.00);

        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
        contasBancarias.add(conta01);
        contasBancarias.add(conta02);

        for (ContaBancaria conta : contasBancarias) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }

        System.out.println("Maior saldo: " + maiorSaldo);
    }
}
