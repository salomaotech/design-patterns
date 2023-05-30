package br.com.salomaotech.modelos.manipula_arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvaArquivo {

    public void salvar(String caminhoArquivo, String conteudo) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {

            bw.write(conteudo);

        } catch (IOException e) {

        }

    }

}
