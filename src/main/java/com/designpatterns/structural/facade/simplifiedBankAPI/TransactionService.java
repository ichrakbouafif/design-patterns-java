package com.designpatterns.structural.facade.simplifiedBankAPI;

public class TransactionService {
    public void transfer(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferred $" + amount + " from " + fromAccount + " to " + toAccount);
    }

    public void deposit(String account, double amount) {
        System.out.println("Deposited $" + amount + " into " + account);
    }

    public void withdraw(String account, double amount) {
        System.out.println("Withdrew $" + amount + " from " + account);
    }
}
