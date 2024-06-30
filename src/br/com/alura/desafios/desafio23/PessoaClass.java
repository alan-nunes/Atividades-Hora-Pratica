package br.com.alura.desafios.desafio23;

public class PessoaClass {
    private String nome;
    private String localidade;

    public PessoaClass(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public PessoaClass(PessoaJson pessoaJson) {
        this.nome = pessoaJson.nome();
        this.localidade = pessoaJson.localidade();
    }

    @Override
    public String toString() {
        return "Pessoa Consultada: " + "nome: " + nome + ", localidade: " + localidade ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
}
