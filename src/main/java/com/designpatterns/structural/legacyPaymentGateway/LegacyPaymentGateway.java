package com.designpatterns.structural.legacyPaymentGateway;

/**
 * Legacy payment gateway with an incompatible interface.
 */
public class LegacyPaymentGateway {

    public void makePayment(double amountInCents) {
        System.out.println("Processing payment of " + amountInCents + " cents via legacy gateway.");
    }
}