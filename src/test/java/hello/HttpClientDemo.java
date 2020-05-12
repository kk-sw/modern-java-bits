package hello;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.Test;

import static java.net.http.HttpClient.newHttpClient;
import static java.net.http.HttpRequest.newBuilder;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HttpClientDemo {

    @Test
    void showHttpClientUsage() throws Exception {
        HttpRequest request = newBuilder()
                .GET()
                .uri(URI.create("https://www.google.com/"))
                .build();

        HttpResponse<String> response = newHttpClient().send(request, BodyHandlers.ofString());

        assertThat(response.statusCode(), is(200));
        System.out.println(response.body());
    }
}
