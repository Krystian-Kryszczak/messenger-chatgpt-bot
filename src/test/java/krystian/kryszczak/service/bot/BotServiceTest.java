package krystian.kryszczak.service.bot;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public final class BotServiceTest {
    @Inject
    private @Named("chatgpt") BotService botService;

    @Test
    public void test() {
        final String response = botService.sendMessage("Hi!")
                .blockingGet();

        assertNotNull(response);
    }
}
