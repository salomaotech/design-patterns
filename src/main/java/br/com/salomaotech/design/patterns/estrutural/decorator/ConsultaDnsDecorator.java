package br.com.salomaotech.design.patterns.estrutural.decorator;

import br.com.salomaotech.modelos.dns.Dns;
import java.util.HashMap;
import java.util.Map;

public class ConsultaDnsDecorator implements Dns {

    private final Dns dns;
    private final Map<String, String> cachDns = new HashMap();

    public ConsultaDnsDecorator(Dns dns) {
        this.dns = dns;
    }

    @Override
    public String getIp(String dominio) {

        if (cachDns.containsKey(dominio)) {

            return cachDns.get(dominio);

        } else {

            System.out.println("Porque estou utilizando cache!!!!!");

            String ip = dns.getIp(dominio);
            cachDns.put(dominio, ip);
            return ip;

        }

    }

}
