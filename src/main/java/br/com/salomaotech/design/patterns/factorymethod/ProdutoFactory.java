package br.com.salomaotech.design.patterns.factorymethod;

public class ProdutoFactory {

    private Produto produto;

    public Produto getProduto(String nomeProduto) {

        switch (nomeProduto) {

            case "Mouse":
                produto = new Mouse("HP");
                break;

            case "Teclado":
                produto = new Teclado("Microsoft");
                break;

            case "Monitor":
                produto = new Monitor("Acer");
                break;

            case "Ssd":
                produto = new Ssd("Toshiba", 120);
                break;

        }

        return produto;

    }

}
