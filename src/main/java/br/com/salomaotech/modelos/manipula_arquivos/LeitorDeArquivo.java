package br.com.salomaotech.modelos.manipula_arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class LeitorDeArquivo {

    public String ler(String caminhoArquivo) {

        StringBuilder conteudo = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoArquivo), StandardCharsets.UTF_8))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                conteudo.append(linha);
                conteudo.append(System.lineSeparator());

            }

        } catch (IOException e) {

        }

        return conteudo.toString();

    }

}
