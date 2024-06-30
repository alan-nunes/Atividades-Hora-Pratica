package br.com.alura.desafios.desafio24;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Alan\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        //Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        PessoaTeste pessoaTeste = new PessoaTeste(pessoa);
        System.out.println(pessoaTeste);
    }
}
