package br.com.salomaotech.design.patterns.comportamental;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificacao implements EstoqueObserver {

    @Override
    public void receberNotificacao(ProdutoObserver produto) {

        List<String> emails = new ArrayList();
        emails.add("salomao1@salomaotech.com");
        emails.add("salomao2@salomaotech.com");
        emails.add("salomao3@salomaotech.com");
        emails.add("salomao4@salomaotech.com");

        for (String email : emails) {

            System.out.println("Notificando e-mail: " + email + " da chegada do produto " + produto.getNome());

        }

    }

}
