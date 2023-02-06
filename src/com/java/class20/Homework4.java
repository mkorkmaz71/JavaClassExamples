package com.java.class20;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//Write a program to print the greatest digit from the given number
//Example1
//Input - 86545
//Output - Greatest digit is 8
//Example2
//Input - 23561
//Output - Greatest digit is 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 0, big = 0;
        while (num > 0) {
            i = num % 10;
            if (big < i) {
                big = i;
            }
            num = num / 10;
        }
        System.out.print("Greatest digit is "+big);
    }
}
