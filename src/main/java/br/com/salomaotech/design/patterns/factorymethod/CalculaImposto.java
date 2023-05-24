package br.com.salomaotech.design.patterns.factorymethod;

public class CalculaImposto {

    private double calcularIss(double valorProduto) {

        return (valorProduto * 10) / 100;

    }

    private double calcularIpi(double valorProduto) {

        return (valorProduto * 30) / 100;

    }

    public double calcular(String nomeProduto) {

        double valorProduto = new ProdutoFactory().getProduto(nomeProduto).getValor();
        return calcularIss(valorProduto) + calcularIpi(valorProduto);

    }

}
