package com.design.patterns.factory;

// This class represents a message service that can send messages.
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
