public class PanicButton {
    private NotificationService notifier;

    public PanicButton(NotificationService notifier) {
        this.notifier = notifier;
    }

    // Button press button method
    public void press(String contact) {
        System.out.println("[Panic Button] Pressed by patient.");
        notifier.alert(contact, "[EMERGENCY] Panic button triggered by patient!");
    }
}