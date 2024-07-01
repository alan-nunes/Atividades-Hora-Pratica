package br.com.alura.desafios.desafio23;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome para consulta");
        String nome = sc.next();

        String endereco = "https://servicodados.ibge.gov.br/api/v2/censos/nomes/" + nome;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        PessoaJson pessoaJson = gson.fromJson(response.body(), PessoaJson.class);

        PessoaClass pessoaClass = new PessoaClass(pessoaJson);
        System.out.println(pessoaClass);

    }
}

/*
Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando
uma pessoa em um objeto do tipo Pessoa.
 */

/* será necessario add a dependencia abaixo no arquivo maven

  <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.9</version>
    </dependency>
 */
