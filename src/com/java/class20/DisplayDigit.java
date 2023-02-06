package com.java.class20;

import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 0;
        while (num>0) {
            i=num%10;
            System.out.println(i);
            num=num/10;
        }
    }
}
