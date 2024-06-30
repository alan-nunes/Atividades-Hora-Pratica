package br.com.alura.desafios.desafio16;

public class Titulo implements Comparable<Titulo>{
  private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
