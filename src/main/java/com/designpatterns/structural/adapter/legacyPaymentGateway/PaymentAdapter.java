package com.designpatterns.structural.adapter.legacyPaymentGateway;

/**
 * Adapter to make the legacy gateway compatible with PaymentProcessor.
 */
public class PaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentGateway legacyGateway;

    public PaymentAdapter(LegacyPaymentGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void pay(double amount) {
        // Convert dollars to cents for legacy system
        double amountInCents = amount * 100;
        legacyGateway.makePayment(amountInCents);
    }
}