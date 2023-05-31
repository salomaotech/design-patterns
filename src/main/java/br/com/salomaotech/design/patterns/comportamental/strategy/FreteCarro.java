package br.com.salomaotech.design.patterns.comportamental.strategy;

public class FreteCarro implements CalculaFreteStrategy {

    @Override
    public double calcular(double distanciaKm) {

        double valorPorKm = 5.5;
        double valorDoFrete = (distanciaKm * valorPorKm);
        return valorDoFrete;

    }

}
