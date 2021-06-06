package com.example.bank_app;

public class BankApp {

    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(100, 600);
        System.out.println(customerAcct.getCheckingBalance());
        System.out.println(customerAcct.getSavingsBalance());

        customerAcct.checkingDeposit(200);
        customerAcct.savingsDeposit(200);

        customerAcct.checkingWithdrawals(50);
        customerAcct.savingsWithdrawals(100);
        customerAcct.transferToChecking(200);
        customerAcct.transferToSavings(400);


    }
}