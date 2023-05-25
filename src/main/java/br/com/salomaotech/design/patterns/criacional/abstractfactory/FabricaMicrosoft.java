package br.com.salomaotech.design.patterns.criacional.abstractfactory;

public class FabricaMicrosoft implements FabricaFactory {

    @Override
    public Mouse criarMouse() {

        Mouse mouse = new MouseMicrosoft();
        mouse.setMarca("Microsoft");
        mouse.setModelo("Mouse Sem Fio Mobile Microsoft 1850");
        return mouse;

    }

    @Override
    public Teclado criarTeclado() {

        Teclado teclado = new TecladoMicrosoft();
        teclado.setMarca("Microsoft");
        teclado.setModelo("Teclado Microsoft Usb Wired 600");
        return teclado;

    }

}
