package br.com.salomaotech.design.patterns;

import br.com.salomaotech.design.patterns.criacional.abstractfactory.FabricaFactory;
import br.com.salomaotech.design.patterns.criacional.abstractfactory.FabricaHp;
import br.com.salomaotech.design.patterns.criacional.abstractfactory.FabricaMicrosoft;
import br.com.salomaotech.design.patterns.criacional.abstractfactory.Mouse;
import br.com.salomaotech.design.patterns.criacional.abstractfactory.Teclado;
import br.com.salomaotech.design.patterns.criacional.builder.Computador;
import br.com.salomaotech.design.patterns.criacional.builder.Diretor;
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

    private static void abstractfactory() {

        /* HP */
        FabricaFactory fabricaHp = new FabricaHp();
        Mouse mouseHp = fabricaHp.criarMouse();
        Teclado tecladoHp = fabricaHp.criarTeclado();

        System.out.println("Produtos da HP::::::::::::::");
        System.out.println("Marca Mouse: " + mouseHp.getMarca());
        System.out.println("Modelo Mouse: " + mouseHp.getModelo());
        System.out.println("Marca Teclado: " + tecladoHp.getMarca());
        System.out.println("Modelo Teclado: " + tecladoHp.getModelo());
        System.out.println("\n\n");

        /* Microsoft */
        FabricaFactory fabricaMicrosoft = new FabricaMicrosoft();
        Mouse mouseMicrosoft = fabricaMicrosoft.criarMouse();
        Teclado tecladoMicrosoft = fabricaMicrosoft.criarTeclado();

        System.out.println("Produtos da Microsoft::::::::::::::");
        System.out.println("Marca Mouse: " + mouseMicrosoft.getMarca());
        System.out.println("Modelo Mouse: " + mouseMicrosoft.getModelo());
        System.out.println("Marca Teclado: " + tecladoMicrosoft.getMarca());
        System.out.println("Modelo Teclado: " + tecladoMicrosoft.getModelo());
        System.out.println("\n\n");

    }

    public static void main(String[] args) {

        Diretor diretor = new Diretor();
        Computador computador = diretor.construir("caro");
      //  System.out.println(computador.toString());

    }

}
