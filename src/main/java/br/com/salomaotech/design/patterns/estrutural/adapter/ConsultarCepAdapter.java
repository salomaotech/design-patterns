package br.com.salomaotech.design.patterns.estrutural.adapter;

import br.com.salomaotech.modelos.cep.Cep;
import br.com.salomaotech.modelos.manipula_arquivos.LeitorDeJson;
import br.com.salomaotech.modelos.manipula_arquivos.LeitorDeXml;
import java.util.Map;

public class ConsultarCepAdapter implements ConsultarCepTarget {

    @Override
    public Cep consultarCep(String cep) {

        Cep cepObjeto = new Cep();

        /* urls das apis */
        String urlApiXml = "https://viacep.com.br/ws/" + cep + "/xml/";
        String urlApiJson = "https://viacep.com.br/ws/" + cep + "/json/";

        /* objetos que consultam as apis */
        LeitorDeXml leitorDeXml = new LeitorDeXml(urlApiXml);
        LeitorDeJson leitorDeJson = new LeitorDeJson(urlApiJson);

        /* dados da API */
        Map<String, String> dadosXml = leitorDeXml.getConteudoXml();

        if (!dadosXml.isEmpty()) {

            cepObjeto.setCodigoPostal(dadosXml.get("cep"));
            cepObjeto.setCidade(dadosXml.get("localidade"));
            cepObjeto.setEstado(dadosXml.get("uf"));
            
        } else {

            Map<String, String> dadosJson = leitorDeJson.getConteudoJson();

            if (!dadosJson.isEmpty()) {

                cepObjeto.setCodigoPostal(dadosJson.get("cep"));
                cepObjeto.setCidade(dadosJson.get("localidade"));
                cepObjeto.setEstado(dadosJson.get("uf"));

            }

        }

        return cepObjeto;

    }

}
