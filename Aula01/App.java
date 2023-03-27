import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        String urlMain = "https://pokeapi.co/api/v2/pokemon/?offset=0&limit=493";

        URI uri = URI.create(urlMain);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();

        HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());

        String body = res.body();

        System.out.println(body);

    }
}
