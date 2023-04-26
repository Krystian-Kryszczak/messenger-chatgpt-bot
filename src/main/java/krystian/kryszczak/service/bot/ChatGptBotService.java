package krystian.kryszczak.service.bot;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;
import io.reactivex.rxjava3.core.Maybe;
import jakarta.inject.Singleton;
import krystian.kryszczak.configuration.openai.OpenAiConfiguration;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@AllArgsConstructor
@Singleton
public final class ChatGptBotService implements BotService {
    private final OpenAiService openAiService;
    private final OpenAiConfiguration openAiConfiguration;

    @Override
    public Maybe<String> sendMessage(@NotNull String message) {
        final var request = ChatCompletionRequest.builder()
            .messages(List.of(new ChatMessage("user", message)))
            .model(openAiConfiguration.getGptModel())
            .build();

        return Maybe.fromCallable(
            () -> openAiService.createChatCompletion(request).toString()
        );
    }
}
