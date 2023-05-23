package br.com.salomaotech.design.patterns;

import br.com.salomaotech.design.patterns.criacional.ConexaoSingleton;

public class App {

    public static void main(String[] args) {

        ConexaoSingleton conexao1 = ConexaoSingleton.getConexaoSingleton();
        ConexaoSingleton conexao2 = ConexaoSingleton.getConexaoSingleton();
        ConexaoSingleton conexao3 = ConexaoSingleton.getConexaoSingleton();

        // Conexao conexao1 = new Conexao();
        //  Conexao conexao2 = new Conexao();
        //  Conexao conexao3 = new Conexao();
    }

}
