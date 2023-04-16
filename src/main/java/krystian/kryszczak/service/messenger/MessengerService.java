package krystian.kryszczak.service.messenger;

public sealed interface MessengerService permits MetaMessengerService {
    void sendMessage(String receiverId, String content);
}
