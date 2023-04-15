package krystian.kryszczak.controller;

import com.theokanning.openai.service.OpenAiService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/test")
public class BotController {
    private final OpenAiService service;

    @Get
    public String index() {
        // TODO
        return "Example Response";
    }
}
