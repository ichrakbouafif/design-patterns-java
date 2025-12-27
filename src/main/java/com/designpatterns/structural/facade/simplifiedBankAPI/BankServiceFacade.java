package com.designpatterns.structural.facade.simplifiedBankAPI;

public class BankServiceFacade {
    private final AccountService accountService;
    private final LoanService loanService;
    private final TransactionService transactionService;
    private final NotificationService notificationService;

    public BankServiceFacade() {
        this.accountService = new AccountService();
        this.loanService = new LoanService();
        this.transactionService = new TransactionService();
        this.notificationService = new NotificationService();
    }

    public void openAccount(String customerName) {
        accountService.openAccount(customerName);
        notificationService.sendNotification(customerName, "Your account has been opened.");
    }

    public void applyLoan(String customerName, double amount) {
        loanService.applyLoan(customerName, amount);
        loanService.approveLoan(customerName);
        notificationService.sendNotification(customerName, "Your loan has been approved.");
    }

    public void transferMoney(String fromAccount, String toAccount, double amount) {
        transactionService.transfer(fromAccount, toAccount, amount);
    }
}
