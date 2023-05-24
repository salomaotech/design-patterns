package br.com.salomaotech.design.patterns.criacional.factorymethod;

public class Monitor implements Produto {

    private final String marca;

    public Monitor(String marca) {
        this.marca = marca;
    }

    @Override
    public double getValor() {

        return 400;

    }

    public String getMarca() {
        return marca;
    }

}
