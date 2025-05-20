package com.design.patterns.factory;

// This class represents a message service that can send messages.
// It adheres to the Factory Design Pattern by providing a method to create different types of notifications.
// The class provides a static method to create notifications based on the type specified.
// This is useful for creating different types of notifications without exposing the instantiation logic to the client.
public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        }
        return null;
    }
}
