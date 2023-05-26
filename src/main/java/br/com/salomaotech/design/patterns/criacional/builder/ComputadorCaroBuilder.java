package br.com.salomaotech.design.patterns.criacional.builder;

public class ComputadorCaroBuilder implements ComputadorBuilder {

    private String processador;
    private int memoriaRAM;
    private String placaVideo;
    private boolean possuiSSD;

    @Override
    public ComputadorBuilder adicionarProcessador() {
        processador = "Intel Core i7";
        return this;
    }

    @Override
    public ComputadorBuilder adicionarMemoriaRAM() {
        memoriaRAM = 16;
        return this;
    }

    @Override
    public ComputadorBuilder adicionarPlacaVideo() {
        placaVideo = "NVIDIA GeForce RTX 3080";
        return this;
    }

    @Override
    public ComputadorBuilder adicionarSsd() {
        possuiSSD = true;
        return this;
    }

    @Override
    public Computador construir() {

        Computador computador = new Computador(processador, memoriaRAM, placaVideo, possuiSSD);
        return computador;

    }

}
