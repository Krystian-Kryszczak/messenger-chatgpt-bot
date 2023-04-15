package krystian.kryszczak.configuration.messenger;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties("messenger")
public class MessengerConfiguration {
    private String token;
}
