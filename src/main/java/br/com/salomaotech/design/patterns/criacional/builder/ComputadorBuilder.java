package br.com.salomaotech.design.patterns.criacional.builder;

public interface ComputadorBuilder {

    public ComputadorBuilder adicionarProcessador();

    public ComputadorBuilder adicionarMemoriaRAM();

    public ComputadorBuilder adicionarPlacaVideo();

    public ComputadorBuilder adicionarSsd();

    public Computador construir();

}
