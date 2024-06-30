package br.com.alura.desafios.desafio28;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write("Dados gravados com sucesso");
            escrita.close();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}

/*
Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
"Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
 */