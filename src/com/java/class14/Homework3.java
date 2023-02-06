package com.java.class14;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Homework 3:
        //Given a string of any length, return a new string where
        // the last 2 chars, if present, are swapped, so “coding” yields “codign”.
        //lastTwo(“coding”) → “codign”
        //lastTwo(“cat”) → “cta”
        //lastTwo(“ab”) → “ba”
        System.out.println("Please enter any string at least two characters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() < 2) {
            System.out.println("Wrong Entry");
        } else {
            System.out.println(mixedEnd(str));
        }
    }

    public static String mixedEnd(String str) {
        return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
    }
}