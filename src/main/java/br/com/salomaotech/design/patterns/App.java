package br.com.salomaotech.design.patterns;

import br.com.salomaotech.design.patterns.factorymethod.CalculaImposto;

public class App {

    public static void main(String[] args) {

        CalculaImposto calculaImposto = new CalculaImposto();
        System.out.println("Mouse: " + calculaImposto.calcular("Mouse"));
        System.out.println("Teclado: " + calculaImposto.calcular("Teclado"));
        System.out.println("Monitor: " + calculaImposto.calcular("Monitor"));
        System.out.println("SSD: " + calculaImposto.calcular("Ssd"));

    }

}
