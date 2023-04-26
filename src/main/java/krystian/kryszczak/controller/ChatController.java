package krystian.kryszczak.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.reactivex.rxjava3.core.Maybe;
import krystian.kryszczak.service.bot.BotService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Secured(SecurityRule.IS_ANONYMOUS)
@Controller
public final class ChatController {
    private final BotService botService;

    @Post
    public Maybe<String> sendMessage(@Body String messageContent) {
        return botService.sendMessage(messageContent);
    }
}
