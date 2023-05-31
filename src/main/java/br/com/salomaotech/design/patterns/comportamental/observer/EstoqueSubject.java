package br.com.salomaotech.design.patterns.comportamental.observer;

import java.util.ArrayList;
import java.util.List;

public class EstoqueSubject {

    private final List<EstoqueObserver> estoqueObserver = new ArrayList();
    private final List<ProdutoObserver> produtos = new ArrayList();

    public void addObserver(EstoqueObserver observador) {

        estoqueObserver.add(observador);

    }

    public void remObserver(EstoqueObserver observador) {

        estoqueObserver.remove(observador);

    }

    public void addProduto(ProdutoObserver produto) {

        produtos.add(produto);
        notificar(produto);

    }

    public void remProduto(ProdutoObserver produto) {

        produtos.remove(produto);

    }

    private void notificar(ProdutoObserver produto) {

        for (EstoqueObserver interessado : estoqueObserver) {

            interessado.receberNotificacao(produto);

        }

    }

}
