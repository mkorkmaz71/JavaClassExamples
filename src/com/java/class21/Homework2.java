package com.java.class21;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Write a program to print reverse of the given String
        //Example
        //Input - Wedevx
        //Output - xvedeW
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        int num = str.length() - 1;
        String newString = "";
        while (num >= 0) {
            newString = newString + str.charAt(num);
            num--;
        }
        System.out.println("The reverse of \"" + str + "\" is " + newString);
    }
}
