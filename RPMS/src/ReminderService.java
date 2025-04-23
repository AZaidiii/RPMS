public class ReminderService {
    private Notifiable notifier;

    public ReminderService(Notifiable notifier) {
        this.notifier = notifier;
    }

    // Sends reminder
    public void sendReminder(String recipient, String message) {
        notifier.sendNotification(recipient, "[Reminder] " + message);
    }
}