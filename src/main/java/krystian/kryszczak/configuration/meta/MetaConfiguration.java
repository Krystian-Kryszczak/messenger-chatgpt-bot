package krystian.kryszczak.configuration.meta;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties("meta")
public class MetaConfiguration {
    private String appId;
    private String token;
}
