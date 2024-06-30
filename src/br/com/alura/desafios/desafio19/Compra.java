package br.com.alura.desafios.desafio19;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compras: " +
                " descricao: " + this.descricao  +
                " valor: " + this.valor;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}
