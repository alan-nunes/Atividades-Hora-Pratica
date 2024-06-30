package br.com.alura.desafios.desafio29;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        Gson gson = new Gson();

        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}

/*
Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que
instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */