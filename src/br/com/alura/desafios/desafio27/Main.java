package br.com.alura.desafios.desafio27;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        var name = sc.nextLine();

        String endereco = "https://api.github.com/users/" + name;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado");
            }

            String json =  response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}
