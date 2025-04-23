public class VideoCall {
    public void startCall(String platform) {
        if (platform.equalsIgnoreCase("Google Meet")) {
            System.out.println("[VideoCall] Starting Google Meet: https://meet.google.com/xyz-abcd");
        } else if (platform.equalsIgnoreCase("Zoom")) {
            System.out.println("[VideoCall] Starting Zoom Meeting: https://zoom.us/j/123456789");
        } else {
            System.out.println("[VideoCall] Unsupported platform");
        }
    }
}