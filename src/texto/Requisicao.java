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
        String APIkey = "0af3d81119af8258856e3aef";
        String Comp = "/latest/";

        String url = Link + APIkey + Comp + moedaOrigem;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
                url
        )).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();
        String json = responseBody;

        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        JsonObject cambio = jsonObject.getAsJsonObject("conversion_rates");

        return(cambio.get(moedaDestino).getAsDouble());
    }
}
