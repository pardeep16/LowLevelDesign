package com.design.principles.dip.optimal;

// This code demonstrates the Dependency Inversion Principle (DIP) by using an interface to decouple the NotificationService from the concrete implementations of MessageService.
// The NotificationService depends on the abstraction (MessageService) rather than the concrete implementations (EmailService, SMSService).
// This allows for easy extension and modification of the notification methods without changing the NotificationService class.
// The NotificationService can now work with any implementation of the MessageService interface, making it flexible and adhering to the DIP.
public class NotificationService {
    MessageService messageService;
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String recipient) {
        // Logic to send notification
        System.out.println("Sending notification: " + message + " to " + recipient);
        messageService.sendMessage(message, recipient);
    }
}
