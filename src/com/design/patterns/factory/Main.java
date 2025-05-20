package com.design.patterns.factory;

public class Main {

    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification("SMS");
        smsNotification.notifyUser();
        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        emailNotification.notifyUser();

        // Uncommenting the following line will throw an exception
        //Notification defaultNotification = NotificationFactory.createNotification("UNKNOWN");
        //defaultNotification.notifyUser();
    }
}
