package org.example.dependency;

// SMSNotificationSender implementation of NotificationSender
public class SMSNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        // Logic to send notification via SMS
        System.out.println("Sending SMS notification: " + message);
    }
}
