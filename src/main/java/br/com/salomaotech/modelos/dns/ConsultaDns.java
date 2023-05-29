package br.com.salomaotech.modelos.dns;

import java.util.HashMap;
import java.util.Map;

public class ConsultaDns implements Dns {

    private final Map<String, String> mapaSites;

    private static int contador = 0;

    public ConsultaDns() {

        mapaSites = new HashMap<>();
        mapaSites.put("www.google.com", "216.58.222.46");
        mapaSites.put("www.facebook.com", "31.13.64.35");
        mapaSites.put("www.twitter.com", "104.244.42.1");
        mapaSites.put("www.youtube.com", "172.217.167.110");
        mapaSites.put("www.instagram.com", "34.81.116.47");
        mapaSites.put("www.linkedin.com", "108.174.10.10");
        mapaSites.put("www.github.com", "140.82.121.4");
        mapaSites.put("www.stackoverflow.com", "151.101.1.69");
        mapaSites.put("www.amazon.com", "176.32.108.166");
        mapaSites.put("www.netflix.com", "45.57.24.25");

    }

    @Override
    public String getIp(String dominio) {

        contador++;
        System.out.println("\nRequisição número:" + contador);

        return mapaSites.get(dominio);

    }

}
