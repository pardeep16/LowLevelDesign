package com.design.principles.dip.problematic;

// This class violates the Dependency Inversion Principle (DIP)
// because it directly depends on the concrete implementation of EmailService.
// This makes it difficult to change the notification method without modifying the NotificationService class.
// The NotificationService should depend on abstractions (interfaces) rather than concrete implementations.
public class NotificationService {
    EmailService emailService = new EmailService();

    public void sendEmailNotification(String message, String recipient) {
        // Logic to send notification
        System.out.println("Sending notification: " + message + " to " + recipient);
        emailService.sendEmail(message, recipient);
    }

    public void sendSMSNotification(String message, String recipient) {
        // Logic to send notification
        System.out.println("Sending notification: " + message + " to " + recipient);
        // Logic to send SMS
        System.out.println("Sending SMS: " + message + " to " + recipient);
    }
}
