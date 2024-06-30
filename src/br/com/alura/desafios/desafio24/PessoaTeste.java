package br.com.alura.desafios.desafio24;

public class PessoaTeste {
    private String nome;
    private String cidade;
    private int idade;

    public PessoaTeste (Pessoa pessoa){
        this.nome = pessoa.nome();
        this.cidade = pessoa.cidade();
        this.idade = pessoa.idade();
    }

    @Override
    public String toString() {
        return "PessoaTeste: " +
                "nome: " + nome +
                ", cidade:" + cidade +
                ", idade: " + idade ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
