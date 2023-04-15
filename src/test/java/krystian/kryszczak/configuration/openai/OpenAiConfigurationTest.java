package krystian.kryszczak.configuration.openai;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
public final class OpenAiConfigurationTest {

    @Test
    public void tokenTest() {
        Map<String, Object> items = new HashMap<>();
        items.put("open-ai.token", "sk-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9SflKxwRJSMeKK");

        ApplicationContext ctx = ApplicationContext.run(items);
        OpenAiConfiguration openAiConfiguration = ctx.getBean(OpenAiConfiguration.class);

        String token = openAiConfiguration.getToken();

        assertNotNull(token);
        assertTrue(token.startsWith("sk-"));
        assertTrue(token.length() > 50);
        assertTrue(token.length() < 55);

        ctx.close();
    }
}
