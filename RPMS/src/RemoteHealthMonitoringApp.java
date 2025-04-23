import java.util.Scanner;

public class RemoteHealthMonitoringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Setting up notification system
        Notifiable email = new EmailNotification();
        Notifiable sms = new SMSNotification();

        NotificationService emailService = new NotificationService(email);
        NotificationService smsService = new NotificationService(sms);

        // Vital Check and Alert System
        EmergencyAlert emergency = new EmergencyAlert(emailService);
        System.out.print("Enter heart rate: ");
        double hr = scanner.nextDouble();
        System.out.print("Enter body temperature: ");
        double temp = scanner.nextDouble();
        emergency.checkVitals(hr, temp);

        // Panic Button
        System.out.print("Press panic button? (yes/no): ");
        scanner.nextLine();
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            PanicButton panic = new PanicButton(smsService);
            panic.press("emergency11@gmail.com");
        }

        // Chat
        ChatServer server = new ChatServer();
        ChatClient patient = new ChatClient("Ahmad", server);
        ChatClient doctor = new ChatClient("Dr. Jatoi", server);

        System.out.println("Start chat. Type 'exit' to end:");
        String input;
        while (true) {
            System.out.print("Patient: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            patient.sendMessage(input);

            System.out.print("Doctor: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            doctor.sendMessage(input);
        }
        server.displayChatLog();

        // Video Call
        System.out.print("Enter video platform (Zoom/Google Meet): ");
        String platform = scanner.nextLine();
        VideoCall call = new VideoCall();
        call.startCall(platform);

        // Reminders
        ReminderService reminder = new ReminderService(email);
        System.out.print("Enter email to send reminder: ");
        String emailAddr = scanner.nextLine();
        reminder.sendReminder(emailAddr, "Your appointment is at 4PM today.");

        scanner.close();
    }
}
