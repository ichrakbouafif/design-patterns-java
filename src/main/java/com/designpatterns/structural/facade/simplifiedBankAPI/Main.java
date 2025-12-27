package com.designpatterns.structural.facade.simplifiedBankAPI;

public class Main {
    public static void main(String[] args) {
        BankServiceFacade bankFacade = new BankServiceFacade();

        bankFacade.openAccount("Alice");
        bankFacade.applyLoan("Alice", 5000);
        bankFacade.transferMoney("Alice", "Bob", 1000);
    }
}
