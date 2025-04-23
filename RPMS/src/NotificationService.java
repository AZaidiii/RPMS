public class NotificationService {
    private Notifiable notifier;

    public NotificationService(Notifiable notifier) {
        this.notifier = notifier;
    }

    public void alert(String recipient, String message) {
        notifier.sendNotification(recipient, message);
    }
}