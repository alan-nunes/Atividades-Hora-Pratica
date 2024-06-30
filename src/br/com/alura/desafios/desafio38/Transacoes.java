package br.com.alura.desafios.desafio38;

public class Transacoes {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}
