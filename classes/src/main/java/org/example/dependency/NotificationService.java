package org.example.dependency;

// NotificationService that depends on NotificationSender (Dependency Injection)
public class NotificationService {
    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        // Delegate the notification sending to the injected NotificationSender
        notificationSender.sendNotification(message);
    }
}