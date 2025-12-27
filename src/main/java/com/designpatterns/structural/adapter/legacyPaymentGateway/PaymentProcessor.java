package com.designpatterns.structural.adapter.legacyPaymentGateway;


/**
 * Target interface expected by the client.
 */
public interface PaymentProcessor {
    void pay(double amount);
}
