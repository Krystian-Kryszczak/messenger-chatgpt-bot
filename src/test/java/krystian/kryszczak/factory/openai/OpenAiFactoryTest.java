package krystian.kryszczak.factory.openai;

import com.theokanning.openai.service.OpenAiService;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public final class OpenAiFactoryTest {

    @Inject
    private OpenAiService openAiService;

    @Test
    public void openAiServiceInjectTest() {
        assertNotNull(openAiService);
    }
}
