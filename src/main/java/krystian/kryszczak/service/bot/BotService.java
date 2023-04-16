package krystian.kryszczak.service.bot;

import io.reactivex.rxjava3.core.Maybe;
import org.jetbrains.annotations.NotNull;

public sealed interface BotService permits ChatGptBotService {
    Maybe<String> sendMessage(@NotNull String message);
}
