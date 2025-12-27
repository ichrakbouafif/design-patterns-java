package com.designpatterns.behavioral.observer.stockPriceAlertSystem;

public class Investor implements Observer{
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Investor " + name + " notified: " + stockSymbol + " price changed to $" + price);
    }
}
