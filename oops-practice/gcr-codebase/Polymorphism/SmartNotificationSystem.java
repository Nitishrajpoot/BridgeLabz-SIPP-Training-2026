package Polymorphism;

package Polymorphism;

class Notification {
    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName +
                " : " + message);
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipientName +
                " : " + message);
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " +
                recipientName + " : " + message);
    }
}

public class SmartNotificationSystem {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Nitish", "Welcome Email"),
                new SMSNotification("Raj", "OTP Sent"),
                new PushNotification("Aman", "New Offer Available")
        };

        System.out.println("Sent Notifications:\n");

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}