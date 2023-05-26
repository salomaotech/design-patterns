package br.com.salomaotech.design.patterns.criacional.builder;

public class Computador {

    private final String processador;
    private final int memoriaRAM;
    private final String placaVideo;
    private final boolean possuiSSD;

    public Computador(String processador, int memoriaRAM, String placaVideo, boolean possuiSSD) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaVideo = placaVideo;
        this.possuiSSD = possuiSSD;
    }

    @Override
    public String toString() {

        StringBuilder retorno = new StringBuilder();

        retorno.append("Processador: ");
        retorno.append(processador);
        retorno.append("\n");
        retorno.append("Memória RAM: ");
        retorno.append(memoriaRAM);
        retorno.append("\n");
        retorno.append("Placa de vídeo: ");
        retorno.append(placaVideo);
        retorno.append("\n");
        retorno.append("SSD: ");

        if (possuiSSD) {

            retorno.append("SSD");

        } else {

            retorno.append("HD");

        }

        retorno.append("\n");

        return retorno.toString();

    }

}
