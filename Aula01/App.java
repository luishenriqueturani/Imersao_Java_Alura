import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        String urlMain = "https://pokeapi.co/api/v2/pokemon/?offset=0&limit=493";

        SenderRequests sr = new SenderRequests();

        JSONParser parser = new JSONParser();

        List<Map<String, String>> l = parser.parse( sr.getRequest(urlMain) );

        for (Map<String, String> pokemon: l) {

            System.out.println( pokemon.get("name") );
        }


    }


}
