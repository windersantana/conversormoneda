import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class APIconversor {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner moneda = new Scanner(System.in);
        System.out.println("Modena a convertir:");
        var busqueda = moneda.nextInt();

        String direccion = "https://v6.exchangerate-api.com/v6/71e909fc5aede2414102e35e"+busqueda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("direccion"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(response.body());

/*        Gsonn gson = new Gson();
        Modena tipoMoneda = gson.fromJson(json, TituloMoneda.class); // cambiar por mondeda
        System.out.println(miTitulo.getNombre());*/
    }

}
