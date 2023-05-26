package br.com.salomaotech.design.patterns.criacional.builder;

public class Diretor {

    private ComputadorBuilder computadorBuilder;

    public Computador construir(String tipo) {

        Computador computador = null;

        if (tipo.equals("barato")) {

            computadorBuilder = new ComputadorBaratoBuilder();

            computadorBuilder.adicionarProcessador();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

            computadorBuilder.adicionarMemoriaRAM();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

            computadorBuilder.adicionarPlacaVideo();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

            computadorBuilder.adicionarSsd();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

        }

        if (tipo.equals("caro")) {

            computadorBuilder = new ComputadorCaroBuilder();

            computadorBuilder.adicionarProcessador();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

            computadorBuilder.adicionarMemoriaRAM();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

            computadorBuilder.adicionarPlacaVideo();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

            computadorBuilder.adicionarSsd();
            computador = computadorBuilder.construir();
            System.out.println(computador.toString());

        }

        return computador;

    }

}
