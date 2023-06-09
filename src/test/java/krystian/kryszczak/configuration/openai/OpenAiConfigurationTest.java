package krystian.kryszczak.configuration.openai;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public final class OpenAiConfigurationTest {

    @Test
    public void tokenTest() {
        Map<String, Object> items = new HashMap<>();
        items.put("open-ai.token", "sk-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9SflKxwRJSMeKK");
        items.put("open-ai.gpt-model", "gpt-3.5-turbo");

        ApplicationContext ctx = ApplicationContext.run(items);
        OpenAiConfiguration openAiConfiguration = ctx.getBean(OpenAiConfiguration.class);

        String token = openAiConfiguration.getToken();
        String gptModel = openAiConfiguration.getGptModel();

        assertEquals("sk-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9SflKxwRJSMeKK", token);
        assertEquals("gpt-3.5-turbo", gptModel);

        ctx.close();
    }
}
