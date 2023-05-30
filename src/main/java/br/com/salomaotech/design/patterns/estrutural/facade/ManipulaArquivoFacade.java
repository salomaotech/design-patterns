package br.com.salomaotech.design.patterns.estrutural.facade;

import br.com.salomaotech.modelos.manipula_arquivos.LeitorDeArquivo;
import br.com.salomaotech.modelos.manipula_arquivos.SalvaArquivo;
import java.io.File;

public class ManipulaArquivoFacade {

    private final LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
    private final SalvaArquivo salvarArquivo = new SalvaArquivo();

    public boolean salvar(String caminhoArquivo, String conteudo) {

        salvarArquivo.salvar(caminhoArquivo, conteudo);
        return new File(caminhoArquivo).exists();

    }

    public String ler(String caminhoArquivo) {

        return leitorDeArquivo.ler(caminhoArquivo);

    }

    public boolean copiar(String caminhoArquivoOrigem, String caminhoArquivoDestino) {

        salvarArquivo.salvar(caminhoArquivoDestino, leitorDeArquivo.ler(caminhoArquivoOrigem));
        return new File(caminhoArquivoDestino).exists();

    }

}
