package com.java.class13;

import java.util.Scanner;

public class InstanceMethods2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=0;
        System.err.println("Enter first number");
        a=sc.nextInt();
        System.err.println("Enter second number");
        b=sc.nextInt();
        InstanceMethods2 var = new InstanceMethods2();
        System.err.println(var.sameLastDigit(a, b));
    }

    public boolean sameLastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
