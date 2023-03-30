package com.java.class25;

public class BankMainClass {
    public static void main(String[] args) {
        Bank tairaAccount=new Bank();
        Bank zarinaAccount=new Bank();

        tairaAccount.balance=1000;
        tairaAccount.accountName="Taira";

        zarinaAccount.balance=5000;
        zarinaAccount.accountName="Zarina";

        tairaAccount.withdraw(600);
        System.out.println(tairaAccount.balance);

    }
}
