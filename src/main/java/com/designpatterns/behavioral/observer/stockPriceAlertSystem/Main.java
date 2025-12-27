package com.designpatterns.behavioral.observer.stockPriceAlertSystem;

public class Main {
    public static void main(String[] args) {

        Stock appleStock = new Stock("AAPL", 150.0);

        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);

        appleStock.setPrice(155.0);
        appleStock.setPrice(160.0);

        appleStock.removeObserver(investor1);
        appleStock.setPrice(165.0);
    }
}
