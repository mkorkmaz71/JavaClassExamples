package com.java.class07;

import java.util.Scanner;

public class IfElseStatement2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= input.nextInt();
        if (age>16) {
            System.out.println("You are eligible to drive");
        }
        if (age<=16) {
            System.out.println("You are NOT eligible to drive");
        }
    }
}
