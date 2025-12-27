package com.designpatterns.behavioral.observer.stockPriceAlertSystem;

public interface Observer {
    void update(String stockSymbol, double price);
}
