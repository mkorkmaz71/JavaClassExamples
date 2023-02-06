package com.java.class14;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //Homework 1:
        //Write a method that takes a string and returns true if the
        // string starts with “hi” and false otherwise.
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (startsWith(str)) {
            System.out.println("Your entry starts with hi");
        } else {
            System.out.println("Your entry doesn't start with hi");
        }
    }

    public static Boolean startsWith(String str) {
        return (str.substring(0, 2).equals("hi"));
    }
}
