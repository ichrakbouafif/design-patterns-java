package com.designpatterns.creational.factory.notification;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("PUSH notification: " + message);
    }
}
