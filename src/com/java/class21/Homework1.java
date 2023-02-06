package com.java.class21;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//Write a program to count the number of vowels from the String (Ignoring Case)
//Example
//Input - Welcome to Java Class
//Output - Num of vowels=7
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        int numv = 0, num0 = 0;
        while (num0 < str.length()) {
            if (str.charAt(num0) == ('a') || str.charAt(num0) == 'e' ||
                    str.charAt(num0) == 'i' || str.charAt(num0) == 'o' ||
                    str.charAt(num0) == 'u' || str.charAt(num0) == ('A') ||
                    str.charAt(num0) == 'E' || str.charAt(num0) == 'I' ||
                    str.charAt(num0) == 'O' || str.charAt(num0) == 'U') {
                numv++;
            }
            num0++;
        }
        System.out.println("Total vowels in \"" + str + "\" is " + numv);
    }
}
