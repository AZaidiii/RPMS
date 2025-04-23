public class ChatClient {
    private ChatServer server;
    private String name;

    // Constructor
    public ChatClient(String name, ChatServer server) {
        this.name = name;
        this.server = server;
    }

    // Sned message method
    public void sendMessage(String message) {
        server.receiveMessage(message, name);
    }
}
