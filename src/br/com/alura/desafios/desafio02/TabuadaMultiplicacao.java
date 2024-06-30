package br.com.alura.desafios.desafio02;

public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero){
        for(int i=1;i <= 10 ;i++){
            System.out.println(i + "x" + numero + " = " + i*numero);
        }
    }
}
