package com.java.class14;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Homework 2:
        //Write a method that takes a string   returns a new string
        // made of 3 copies of the last 2 chars of the original string.
        // The string length will be at least 2.
        //extraEnd(“Hi”) → “HiHiHi”
        //extraEnd(“Hello”) → “lololo”
        //extraEnd(“ab”) → “ababab”
        System.out.println("Please enter a string at least two characters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() < 2) {
            System.out.println("Wrong Entry");
        } else {
            System.out.println(endsWith(str) + endsWith(str) + endsWith(str));
        }
    }

    public static String endsWith(String str) {
        return str.substring(str.length() - 2, str.length());
    }
}
