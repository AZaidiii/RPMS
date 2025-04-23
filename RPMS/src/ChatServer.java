import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    // Chat log arraylist
    private List<String> chatLog = new ArrayList<>();

    // Method for receiving message
    public void receiveMessage(String message, String sender) {
        String log = sender + " says: " + message;
        chatLog.add(log);
        System.out.println("[Chat] " + log);
    }

    // Method for displaying chat log
    public void displayChatLog() {
        System.out.println("\n[Chat Log History]");
        for (String entry : chatLog) {
            System.out.println(entry);
        }
    }
}