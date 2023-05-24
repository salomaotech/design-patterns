package br.com.salomaotech.design.patterns.factorymethod;

public class Ssd implements Produto {

    private final String marca;
    private final int capacidade;

    public Ssd(String marca, int capacidade) {
        this.marca = marca;
        this.capacidade = capacidade;
    }

    @Override
    public double getValor() {

        return 120;

    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidade() {
        return capacidade;
    }

}
