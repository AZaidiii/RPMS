public class EmergencyAlert {
    private double heartRate;
    private double temperature;
    private NotificationService notifier;

    public EmergencyAlert(NotificationService notifier) {
        this.notifier = notifier;
    }

    // Method for checking vitals
    public void checkVitals(double heartRate, double temperature) {
        this.heartRate = heartRate;
        this.temperature = temperature;
        System.out.println("[Vitals Check] HR: " + heartRate + ", Temp: " + temperature);
        if (heartRate > 100 || temperature > 38) {
            triggerAlert();
        }
    }

    // Method to trigger alert
    private void triggerAlert() {
        notifier.alert("jatoi@gmail.com", "[ALERT] Critical vitals detected! HR: " + heartRate + ", Temp: " + temperature);
    }
}