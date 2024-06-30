package br.com.alura.desafios.desafio32;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2022);
        carro.setPreco(75000.00);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);

        // Imprima o JSON resultante
        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }
}

/*
Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que
instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */