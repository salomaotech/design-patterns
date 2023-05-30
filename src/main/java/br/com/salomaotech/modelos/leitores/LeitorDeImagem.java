package br.com.salomaotech.modelos.leitores;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class LeitorDeImagem {

    public byte[] getImagemBytes(String imagePath) {

        try {

            System.out.println("Acessando disco para carregar imagem. Isto consome recursos!");

            BufferedImage bufferedImage = ImageIO.read(new File(imagePath));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();

        } catch (IOException e) {

        }

        return null;

    }
}
