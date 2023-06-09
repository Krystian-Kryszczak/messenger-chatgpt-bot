package krystian.kryszczak.configuration.meta;

import io.micronaut.context.ApplicationContext;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class MetaConfigurationTest {

    @Test
    public void tokenTest() {
        Map<String, Object> items = new HashMap<>();
        items.put("meta.app-id", "1111");
        items.put("meta.token", "M826g0IqKeZ8WK6srpEIROJXgjTpM=Q5pUmHf3WBiDQrpFSEnavx");

        ApplicationContext ctx = ApplicationContext.run(items);
        MetaConfiguration metaConfiguration = ctx.getBean(MetaConfiguration.class);

        String appId = metaConfiguration.getAppId();
        String token = metaConfiguration.getToken();

        assertEquals("1111", appId);
        assertEquals("M826g0IqKeZ8WK6srpEIROJXgjTpM=Q5pUmHf3WBiDQrpFSEnavx", token);

        ctx.close();
    }
}
