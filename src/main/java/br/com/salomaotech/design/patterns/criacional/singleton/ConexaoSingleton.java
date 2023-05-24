package br.com.salomaotech.design.patterns.criacional.singleton;

public class ConexaoSingleton {

    private static ConexaoSingleton conexaoSingleton;

    private ConexaoSingleton() {

        System.out.println("Conectado!");

    }

    public static ConexaoSingleton getConexaoSingleton() {

        if (conexaoSingleton == null) {

            conexaoSingleton = new ConexaoSingleton();

        }

        return conexaoSingleton;

    }

    public void fechar() {

        System.out.println("Conexao fechada!");
        
    }

}
