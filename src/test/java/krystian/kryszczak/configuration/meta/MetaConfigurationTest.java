package krystian.kryszczak.configuration.meta;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest
public class MetaConfigurationTest {

    @Test
    public void tokenTest() {
        Map<String, Object> items = new HashMap<>();
        items.put("messenger.token", "M826g0IqKeZ8WK6srpEIROJXgjTpM=Q5pUmHf3WBiDQrpFSEnavx");

        ApplicationContext ctx = ApplicationContext.run(items);
        MetaConfiguration metaConfiguration = ctx.getBean(MetaConfiguration.class);

        String token = metaConfiguration.getToken();

        assertNotNull(token);
        assertTrue(token.length() > 50);
        assertTrue(token.length() < 55);

        ctx.close();
    }
}
