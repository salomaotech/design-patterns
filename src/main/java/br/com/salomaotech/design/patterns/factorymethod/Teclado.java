package br.com.salomaotech.design.patterns.factorymethod;

public class Teclado implements Produto {

    private final String marca;

    public Teclado(String marca) {
        this.marca = marca;
    }

    @Override
    public double getValor() {

        return 75;

    }

    public String getMarca() {
        return marca;
    }

}
