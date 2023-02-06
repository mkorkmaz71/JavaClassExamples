package com.java.class08;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have Driving Licence?");
        String driverlicence = input.next();
        if (driverlicence.equalsIgnoreCase("yes")) {
            System.out.println("Enjoy your trip.");
        } else {
            System.out.println("Here is your ticket.");
        }
    }
}