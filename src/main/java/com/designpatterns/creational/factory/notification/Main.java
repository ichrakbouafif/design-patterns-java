package com.designpatterns.creational.factory.notification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter notification type (EMAIL, SMS, PUSH): ");
        String input = scanner.nextLine().toUpperCase();

        NotificationType type;
        try {
            type = NotificationType.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type! Defaulting to EMAIL.");
            type = NotificationType.EMAIL;
        }

        Notification notification = NotificationFactory.createNotification(type);

        notification.notifyUser("Congratulations! Your transaction was successful.");

        scanner.close();
    }
}
