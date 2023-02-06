package com.java.class06;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age and hit enter");
        int age=input.nextInt();
        System.out.println("Your age is "+age);

        System.out.println("Please enter your credit score between 0-820 and hit enter");
        int creditscore=input.nextInt();
        System.out.println("Your creditscore is "+creditscore);

        System.out.println("Please enter your marital status(married/single) and hit enter");
        String maritalstatus =input.next();
        System.out.println("Your marital status is "+ maritalstatus);

        Boolean creditapproved= age>25 && creditscore>700 && maritalstatus.equalsIgnoreCase("married");
        System.out.println("Your Credit is approved: " + creditapproved);

    }
}
