package br.com.salomaotech.design.patterns.criacional.abstractfactory;

public class FabricaHp implements FabricaFactory {

    @Override
    public Mouse criarMouse() {

        Mouse mouse = new MouseHp();
        mouse.setMarca("HP");
        mouse.setModelo("Mouse Sem Fio HP 250");
        return mouse;

    }

    @Override
    public Teclado criarTeclado() {

        Teclado teclado = new TecladoHp();
        teclado.setMarca("HP");
        teclado.setModelo("Teclado Usb Hp K200");
        return teclado;

    }

}
