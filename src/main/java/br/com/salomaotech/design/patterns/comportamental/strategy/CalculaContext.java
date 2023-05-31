package br.com.salomaotech.design.patterns.comportamental.strategy;

public class CalculaContext {

    private final CalculaFreteStrategy calculaFreteStrategy;

    public CalculaContext(CalculaFreteStrategy calculaFreteStrategy) {
        this.calculaFreteStrategy = calculaFreteStrategy;
    }

    public double fazerCalculo(double distanciaKm) {

        return calculaFreteStrategy.calcular(distanciaKm);

    }

}
