package com.java.class25;

public class Bank {
    boolean isSavingAccount;
    double balance;
    String accountName;

    void deposit(double amount){
        balance=balance+amount;
    }
    void withdraw(double amount){
        balance=balance-amount;
    }
}
