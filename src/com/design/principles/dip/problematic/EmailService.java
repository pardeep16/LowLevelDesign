package com.design.principles.dip.problematic;

// This class violates the Dependency Inversion Principle (DIP)
// because it directly depends on the concrete implementation of EmailService.
// This makes it difficult to change the notification method without modifying the NotificationService class.
// The NotificationService should depend on abstractions (interfaces) rather than concrete implementations.
public class EmailService {

    public void sendEmail(String message, String recipient) {
        // Logic to send email
        System.out.println("Sending email: " + message + " to " + recipient);
    }
}
