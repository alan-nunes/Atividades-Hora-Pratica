package br.com.alura.desafios.desafio04;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        System.out.println("O valor em reais é: R$ " + valorDolar * 5.20);
    }
}
