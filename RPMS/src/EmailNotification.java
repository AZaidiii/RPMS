public class EmailNotification implements Notifiable {
    public void sendNotification(String recipient, String message) {
        System.out.println("[Email] To: " + recipient + " | Message: " + message);
    }
}
