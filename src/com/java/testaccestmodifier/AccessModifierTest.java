package com.java.testaccestmodifier;

import com.java.class32.ChaseBank;

public class AccessModifierTest extends ChaseBank {
    public static void main(String[] args) {
        ChaseBank cb =new ChaseBank();
        System.out.println(cb.balance);
        cb.deposit(500);
        cb.withdraw(500);
    }
}
