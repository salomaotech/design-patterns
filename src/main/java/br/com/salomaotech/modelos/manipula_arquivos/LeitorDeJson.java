package br.com.salomaotech.modelos.manipula_arquivos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeitorDeJson {

    private final String urlApi;

    public LeitorDeJson(String urlApi) {
        this.urlApi = urlApi;
    }

    public Map<String, String> getConteudoJson() {

        Map<String, String> chaveValorMap = new HashMap<>();

        try {

            URL apiUrl = new URL(urlApi);
            HttpURLConnection conexao = (HttpURLConnection) apiUrl.openConnection();
            conexao.setRequestMethod("GET");

            if (conexao.getResponseCode() == HttpURLConnection.HTTP_OK) {

                try (BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream(), StandardCharsets.UTF_8))) {
                    String linha;

                    while ((linha = leitor.readLine()) != null) {

                        Pattern pattern = Pattern.compile("\"([^\"]+)\": \"([^\"]+)\"");
                        Matcher matcher = pattern.matcher(linha);

                        while (matcher.find()) {

                            String chave = matcher.group(1);
                            String valor = matcher.group(2);
                            chaveValorMap.put(chave, valor);

                        }

                    }

                }

            }

            conexao.disconnect();

        } catch (Exception ex) {

        }

        return chaveValorMap;

    }

}
