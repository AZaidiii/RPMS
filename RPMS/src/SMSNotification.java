public class SMSNotification implements Notifiable {
    public void sendNotification(String recipient, String message) {
        System.out.println("[SMS] To: " + recipient + " | Message: " + message);
    }
}