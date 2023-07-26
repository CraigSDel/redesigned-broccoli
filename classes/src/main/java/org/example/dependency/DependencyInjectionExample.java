package org.example.dependency;

public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create instances of the NotificationSender implementations
        NotificationSender emailSender = new EmailNotificationSender();
        NotificationSender smsSender = new SMSNotificationSender();

        // Inject the dependencies into the NotificationService
        NotificationService emailService = new NotificationService(emailSender);
        NotificationService smsService = new NotificationService(smsSender);

        // Send notifications using the NotificationService with Dependency Injection
        emailService.sendNotification("Hello, this is an email notification.");
        smsService.sendNotification("Hello, this is an SMS notification.");
    }
}
