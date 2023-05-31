package br.com.salomaotech.design.patterns.comportamental;

import java.util.ArrayList;
import java.util.List;

public class WhatsappNotificacao implements EstoqueObserver {

    @Override
    public void receberNotificacao(ProdutoObserver produto) {

        List<String> whatsapp = new ArrayList();
        whatsapp.add("62 0000-0000");
        whatsapp.add("62 0000-0001");
        whatsapp.add("62 0000-0002");
        whatsapp.add("62 0000-0003");

        for (String whats : whatsapp) {

            System.out.println("Notificando whatsapp: " + whats + " da chegada do produto " + produto.getNome());

        }

    }

}
