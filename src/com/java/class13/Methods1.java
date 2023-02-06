package com.java.class13;

import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the first number: ");
         a= sc.nextInt();
        System.out.print("Please enter the second number: ");
         b= sc.nextInt();

        System.out.println(sumOfTwo(a, b));
    }

    public static int sumOfTwo(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }
}
