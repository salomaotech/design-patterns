package br.com.salomaotech.design.patterns.criacional.builder;

public class ComputadorBaratoBuilder implements ComputadorBuilder {

    private String processador;
    private int memoriaRAM;
    private String placaVideo;
    private boolean possuiSSD;

    @Override
    public ComputadorBuilder adicionarProcessador() {
        processador = "Intel Core i3";
        return this;
    }

    @Override
    public ComputadorBuilder adicionarMemoriaRAM() {
        memoriaRAM = 8;
        return this;
    }

    @Override
    public ComputadorBuilder adicionarPlacaVideo() {
        placaVideo = "NVIDIA GeForce GTX 1650";
        return this;
    }

    @Override
    public ComputadorBuilder adicionarSsd() {
        possuiSSD = false;
        return this;
    }

    @Override
    public Computador construir() {

        Computador computador = new Computador(processador, memoriaRAM, placaVideo, possuiSSD);
        return computador;

    }

}
