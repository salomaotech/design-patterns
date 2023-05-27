package br.com.salomaotech.modelos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class LeitorDeXml {

    private final String urlApi;

    public LeitorDeXml(String urlApi) {
        this.urlApi = urlApi;
    }

    public Map<String, String> getConteudoXml() {

        Map<String, String> chaveValorMap = new HashMap<>();

        try {

            URL url = new URL(urlApi);

            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {

                StringBuilder conteudoXml = new StringBuilder();
                String linhaDeConteudo;

                while ((linhaDeConteudo = bufferedReader.readLine()) != null) {

                    conteudoXml.append(linhaDeConteudo);

                }

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document documentoXml = builder.parse(url.openStream());

                NodeList nodeList = documentoXml.getDocumentElement().getElementsByTagName("*");

                for (int i = 0; i < nodeList.getLength(); i++) {

                    Element element = (Element) nodeList.item(i);
                    String chave = element.getNodeName();
                    String valor = element.getTextContent();
                    chaveValorMap.put(chave, valor);

                }

            }
        } catch (Exception e) {

        }

        return chaveValorMap;

    }

}
