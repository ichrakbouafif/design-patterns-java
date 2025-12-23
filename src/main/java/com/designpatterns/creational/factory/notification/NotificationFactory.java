package com.designpatterns.creational.factory.notification;

public class NotificationFactory {
    private NotificationFactory() {
        // Prevent instantiation
    }
    public static Notification createNotification(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SMSNotification();
            case PUSH -> new PushNotification();
        };
    }
}
