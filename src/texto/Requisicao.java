package texto;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicao {

    Gson gson = new Gson();

    public double requisicao(String moedaOrigem, String moedaDestino) throws IOException, InterruptedException {

        String Link = "https://v6.exchangerate-api.com/v6/";
        String APIkey = "";
        String Comp = "/latest/";

        String url = Link + APIkey + Comp + moedaOrigem;

        HttpClient client = HttpClient.newHttpClient();

        int tentativas = 0;
        double Cambio = 0.0;

        while (tentativas < 3) {
            try {
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
                        url
                )).build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String responseBody = response.body();
                String json = responseBody;

                JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

                JsonObject cambio = jsonObject.getAsJsonObject("conversion_rates");

                Cambio = cambio.get(moedaDestino).getAsDouble();
                break;
            } catch (IOException e) {
                tentativas++;
                System.out.println("Erro ao realizar a requisição da API. Tentativa: " + tentativas);
                Thread.sleep(1000);
            }
        }
        return Cambio;
    }
}
