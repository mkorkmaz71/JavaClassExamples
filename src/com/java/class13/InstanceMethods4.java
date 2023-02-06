package com.java.class13;

import java.util.Scanner;

public class InstanceMethods4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=0;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        InstanceMethods4 var = new InstanceMethods4();
        System.out.println(var.tenOrSumTen(a, b));
    }

    public boolean tenOrSumTen(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        }
        return false;
    }
}
