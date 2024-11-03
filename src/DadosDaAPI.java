import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DadosDaAPI {

    public static String converteMoeda(String moeda1, String moeda2, Double valor) {
        String apiKey = "7262a9affb095c6c678fe89a";
        URI url = URI.create(String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", apiKey, moeda1, moeda2));
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

//            System.out.println("API Response: " + response.body());

            JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);

            if (jsonResponse.has("error-type")) {
                return "Erro na API: " + jsonResponse.get("error-type").getAsString();
            }

            if (jsonResponse.has("conversion_rate")) {
                double conversionRate = jsonResponse.get("conversion_rate").getAsDouble();
                double conversionResult = valor * conversionRate;

                return String.format("A cotação da moeda atual é %.4f. O valor de %.2f %s convertido para a moeda selecionada é %.2f %s.",
                        conversionRate, valor, moeda1, conversionResult, moeda2);
            } else {
                return "Erro ao obter a conversão. Tente novamente.";
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro na API: " + e.getMessage());
        }
    }
}
