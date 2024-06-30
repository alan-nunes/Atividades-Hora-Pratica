package br.com.alura.desafios.desafio26;

public class SenhaInvalidaException extends  RuntimeException{

    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }


}
