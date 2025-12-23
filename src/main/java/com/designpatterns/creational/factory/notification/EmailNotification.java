package com.designpatterns.creational.factory.notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String message){
        System.out.println("EMAIL notification: " + message);
    }
}
