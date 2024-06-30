package br.com.alura.desafios.desafio31;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       String endereco =  "https://v6.exchangerate-api.com/v6/1498912d731bd223d257ac9d/latest/EUR";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json =  response.body();
        System.out.println(json);
    }
}
