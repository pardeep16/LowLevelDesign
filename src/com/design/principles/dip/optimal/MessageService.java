package com.design.principles.dip.optimal;

// This code demonstrates the Dependency Inversion Principle (DIP) by using an interface to decouple the NotificationService from the concrete implementations of MessageService.
// The NotificationService depends on the abstraction (MessageService) rather than the concrete implementations (EmailService, SMSService).
// This allows for easy extension and modification of the notification methods without changing the NotificationService class.
// The NotificationService can now work with any implementation of the MessageService interface, making it flexible and adhering to the DIP.
public interface MessageService {
    void sendMessage(String message, String recipient);
}
