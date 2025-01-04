package cotacaodolarsite.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CotacaoDolar {

    private static final String API_KEY = "";
    private static final String URL_API = "http://api.currencylayer.com/live?access_key=" + API_KEY + "&currencies=USD,BRL&source=USD&format=1";

    public String cotacaoDolar() {
        String responseString = "";
        try {
            URL url = new URL(URL_API);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                responseString = response.toString();
            }

            JSONObject jsonResponse = new JSONObject(responseString);
            if (jsonResponse.has("quotes")) {
                JSONObject quotes = jsonResponse.getJSONObject("quotes");
                double cotacaoDolar = quotes.getDouble("USDBRL");

                return String.format("A cotação do dólar é R$%.2f", cotacaoDolar);
            } else {
                return "Erro: A resposta da API não contém cotações válidas.";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter a cotação do dólar.";
        }
    }
}
