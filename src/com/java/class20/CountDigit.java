package com.java.class20;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextLong();
        int counter = 0;
        while (num>0) {
           num=num/10;
           counter++;
            }
        System.out.print(counter + " digit number.");
    }
}
