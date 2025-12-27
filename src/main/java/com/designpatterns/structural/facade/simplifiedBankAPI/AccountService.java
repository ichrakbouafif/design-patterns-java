package com.designpatterns.structural.facade.simplifiedBankAPI;

public class AccountService {
    public void openAccount(String customerName) {
        System.out.println("Account opened for " + customerName);
    }

    public void closeAccount(String customerName) {
        System.out.println("Account closed for " + customerName);
    }
}
