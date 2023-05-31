package br.com.salomaotech.design.patterns.comportamental.strategy;

public class FreteMoto implements CalculaFreteStrategy {

    @Override
    public double calcular(double distanciaKm) {

        double valorPorKm = 2.5;
        double valorDoFrete = (distanciaKm * valorPorKm);
        return valorDoFrete;

    }

}
