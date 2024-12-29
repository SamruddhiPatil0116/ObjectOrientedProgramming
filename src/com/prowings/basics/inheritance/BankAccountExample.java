package com.prowings.basics.inheritance;

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000.0, 0.05);
        sa.displayBalance();
        sa.displayInterestRate();
    }
}
