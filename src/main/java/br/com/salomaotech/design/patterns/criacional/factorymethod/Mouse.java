package br.com.salomaotech.design.patterns.criacional.factorymethod;

public class Mouse implements Produto {

    private final String marca;

    public Mouse(String marca) {
        this.marca = marca;
    }

    @Override
    public double getValor() {

        return 50;

    }

    public String getMarca() {
        return marca;
    }

}
