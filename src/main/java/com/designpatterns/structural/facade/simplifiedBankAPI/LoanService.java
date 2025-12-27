package com.designpatterns.structural.facade.simplifiedBankAPI;

public class LoanService {
    public void applyLoan(String customerName, double amount) {
        System.out.println("Loan of $" + amount + " applied for " + customerName);
    }

    public void approveLoan(String customerName) {
        System.out.println("Loan approved for " + customerName);
    }
}
