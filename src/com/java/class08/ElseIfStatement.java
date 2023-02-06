package com.java.class08;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have Driver's Licence?");
        String hasLicence = input.next();
        System.out.println("What is your speed?");
        int speed = input.nextInt();

        if (hasLicence.equalsIgnoreCase("yes") && speed < 80) {
            System.out.println("Have a safe Journey!");
        } else if (hasLicence.equalsIgnoreCase("yes") && speed >= 80) {
            System.out.println("Here is your speeding ticket!");
        } else if (hasLicence.equalsIgnoreCase("no") && speed < 80) {
            System.out.println("We have to tow your car!");
        } else if (hasLicence.equalsIgnoreCase("no") && speed >= 80) {
            System.out.println("You must appear in the court!");
        }

    }
}
