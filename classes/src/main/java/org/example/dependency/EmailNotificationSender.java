package org.example.dependency;

// EmailNotificationSender implementation of NotificationSender
public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        // Logic to send notification via email
        System.out.println("Sending email notification: " + message);
    }
}
