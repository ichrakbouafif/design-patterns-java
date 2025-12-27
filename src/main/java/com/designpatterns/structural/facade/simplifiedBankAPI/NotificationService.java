package com.designpatterns.structural.facade.simplifiedBankAPI;

public class NotificationService {
    public void sendNotification(String customerName, String message) {
        System.out.println("Notification to " + customerName + ": " + message);
    }
}
