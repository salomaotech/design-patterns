package br.com.salomaotech.design.patterns.estrutural.adapter;

import br.com.salomaotech.modelos.cep.Cep;

public interface ConsultarCepTarget {

    public Cep consultarCep(String cep);

}
