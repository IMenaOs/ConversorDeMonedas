import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangerateAPI {
    public Monedas tipoDeMoneda(String base_code, String target_code, double amount){
        String apiKey = "80f4a7b9edde7965809e410e";
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+base_code+"/"+target_code+"/"+amount;

        URI direccion = URI.create(url_str);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
