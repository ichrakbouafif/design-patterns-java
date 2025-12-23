package com.designpatterns.creational.factory.notification;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("SMS notification: " + message);
    }
}
