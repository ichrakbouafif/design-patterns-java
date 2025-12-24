package com.designpatterns.structural.legacyPaymentGateway;

public class Main {
    public static void main(String[] args) {
        // Legacy gateway instance
        LegacyPaymentGateway legacyGateway = new LegacyPaymentGateway();

        // Adapter wraps the legacy gateway
        PaymentProcessor paymentProcessor = new PaymentAdapter(legacyGateway);

        // Client uses PaymentProcessor interface
        paymentProcessor.pay(49.99);  // $49.99
    }
}
