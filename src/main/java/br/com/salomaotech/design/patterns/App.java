package br.com.salomaotech.design.patterns;

import br.com.salomaotech.design.patterns.criacional.factorymethod.CalculaImposto;
import br.com.salomaotech.design.patterns.criacional.singleton.ConexaoSingleton;

public class App {

    private static void singleton() {

        /* só haverá uma instância de conexão por mais que eu tente criar conexões */
        ConexaoSingleton conexaoSingleton1 = ConexaoSingleton.getConexaoSingleton();
        ConexaoSingleton conexaoSingleton2 = ConexaoSingleton.getConexaoSingleton();
        ConexaoSingleton conexaoSingleton3 = ConexaoSingleton.getConexaoSingleton();

    }

    private static void factoryMethod() {

        /* o responsável por criar produtos será ProdutoFactory */
        CalculaImposto calculaImposto = new CalculaImposto();
        System.out.println("Mouse: " + calculaImposto.calcular("Mouse"));
        System.out.println("Teclado: " + calculaImposto.calcular("Teclado"));
        System.out.println("Monitor: " + calculaImposto.calcular("Monitor"));
        System.out.println("SSD: " + calculaImposto.calcular("Ssd"));

    }

    public static void main(String[] args) {

        /* singleton */
        singleton();

        /* factory method */
        factoryMethod();

    }

}
