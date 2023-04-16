package krystian.kryszczak.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import krystian.kryszczak.service.bot.BotService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/")
public class ChatController {
    private final BotService botService;

    @Get
    public String index() {
        // TODO
        return "Example Response";
    }
}
