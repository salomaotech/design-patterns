package br.com.salomaotech.design.patterns.estrutural.proxy;

import br.com.salomaotech.modelos.manipula_arquivos.LeitorDeImagem;
import java.util.HashMap;
import java.util.Map;

public class LeitorDeImagemProxy extends LeitorDeImagem {

    private final LeitorDeImagem leitorDeImagem = new LeitorDeImagem();
    private final Map<String, byte[]> imagePathMap = new HashMap();

    @Override
    public byte[] getImagemBytes(String imagePath) {

        if (imagePathMap.containsKey(imagePath) == true) {

            System.out.println("Carregando da memória :-)");
            return imagePathMap.get(imagePath);

        } else {

            imagePathMap.put(imagePath, leitorDeImagem.getImagemBytes(imagePath));
            return imagePathMap.get(imagePath);

        }

    }

}
