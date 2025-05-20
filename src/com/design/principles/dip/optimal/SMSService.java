package com.design.principles.dip.optimal;

// This code demonstrates the Dependency Inversion Principle (DIP) by using an interface to decouple the NotificationService from the concrete implementations of MessageService.
// The NotificationService depends on the abstraction (MessageService) rather than the concrete implementations (EmailService, SMSService).
// This allows for easy extension and modification of the notification methods without changing the NotificationService class.
// The NotificationService can now work with any implementation of the MessageService interface, making it flexible and adhering to the DIP.
public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message, String recipient) {
        // Logic to send SMS
        System.out.println("Sending SMS: " + message + " to " + recipient);
    }
}
