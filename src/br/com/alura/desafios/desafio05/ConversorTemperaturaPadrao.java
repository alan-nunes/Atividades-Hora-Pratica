package br.com.alura.desafios.desafio05;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double temperatura) {
        return (temperatura * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperatura) {
        return  (temperatura - 32) * 5 / 9;
    }
}
