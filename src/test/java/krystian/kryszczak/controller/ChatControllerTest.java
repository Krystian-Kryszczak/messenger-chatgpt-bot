package krystian.kryszczak.controller;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.rxjava3.http.client.Rx3HttpClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class ChatControllerTest {

    @Inject
    @Client("/")
    private Rx3HttpClient rx3HttpClient;

    @Test
    public void sendMessageTest() {
        final var response = rx3HttpClient.toBlocking()
                .<String, String>exchange(HttpRequest.POST("/", "Hello world!"));

        assertEquals(HttpStatus.OK, response.getStatus());
        assertNotNull(response.body());
    }

}
