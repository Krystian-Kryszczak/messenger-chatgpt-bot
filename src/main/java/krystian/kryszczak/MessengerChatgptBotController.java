package krystian.kryszczak;

import io.micronaut.http.annotation.*;

@Controller("/messengerChatgptBot")
public class MessengerChatgptBotController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}