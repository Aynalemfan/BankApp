package com.example.bank_app;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private final double checkingOpeningDeposit;
    private final double savingsOpeningDeposit;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit){
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;
        //checkingBalance = checkingBalance + checkingOpeningDeposit;
        checkingBalance += checkingOpeningDeposit;
        //savingsBalance = checkingBalance + checkingOpeningDeposit;
        savingsBalance += savingsOpeningDeposit;
    }

    public double getCheckingBalance() {

        return checkingBalance;
    }

    public double getSavingsBalance() {

        return savingsBalance;
    }

    public void checkingWithdrawals(double withdrawalsAmount) {
        if(this.checkingBalance < withdrawalsAmount) {
            System.out.println("Insufficient Checking Balance");
        } else {
            this.checkingBalance -= withdrawalsAmount;
            System.out.println("Checking Account Balance after withdrawal: " + this.checkingBalance);
        }

    }
    public void savingsWithdrawals(double withdrawalsAmount) {
        if(this.savingsBalance < withdrawalsAmount) {
            System.out.println("Insufficient Savings Balance");
        } else {
            this.savingsBalance -= withdrawalsAmount;
            System.out.println("Savings Account Balance after withdrawal: " + this.savingsBalance);
        }

    }

    public void transferToChecking(double transferAmount) {
        if(this.savingsBalance < transferAmount) {
            System.out.println("Insufficient balance.");
        } else {
            this.savingsBalance -= transferAmount;
            this.checkingBalance += transferAmount;
            System.out.println("Transfer complete. Your current Checking Balance: " + this.checkingBalance + "\n" + "Your current Savings Balance: " + this.savingsBalance);
        }
    }

    public void transferToSavings(double transferAmount) {
        if(this.checkingBalance < transferAmount) {
            System.out.println("Insufficient balance.");
        } else {
            this.checkingBalance -= transferAmount;
            this.savingsBalance += transferAmount;
            System.out.println("Transfer complete. Your current Checking Balance: " + this.checkingBalance + "\n" + "Your current Savings Balance: " + this.savingsBalance);

        }
    }

    public void checkingDeposit(double depositAmount) {
        checkingBalance += depositAmount;
        System.out.println("Current Checking Balance is: " + this.checkingBalance);
   }
    public void savingsDeposit(double depositAmount) {
        savingsBalance += depositAmount;
        System.out.println("Current Savings Balance is: " + this.savingsBalance);

    }


}
