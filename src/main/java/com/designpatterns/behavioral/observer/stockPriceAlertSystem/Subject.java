package com.designpatterns.behavioral.observer.stockPriceAlertSystem;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
