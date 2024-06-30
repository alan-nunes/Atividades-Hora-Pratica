package br.com.alura.desafios.desafio12;

public class Circulo implements Forma{
    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
