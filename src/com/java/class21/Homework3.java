package com.java.class21;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Write a program to check given number is palindrome or not
//Example1
//Input - 1221
//Output - Palindrome
//Example2
//Input - 122321
//Output - Not Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 0, newNum = 0;
        int num1 = num;
        while (num1 > 0) {
            i = num1 % 10;
            newNum = newNum * 10 + i;
            num1 = num1 / 10;
        }
        if (newNum == num) {
            System.out.print(num + " is Palindrome");
        } else {
            System.out.print(num + " is not Palindrome");
        }
    }
}
