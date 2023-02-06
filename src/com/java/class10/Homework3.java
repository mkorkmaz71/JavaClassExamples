package com.java.class10;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how much you want to loan");
        int loan = input.nextInt();
        System.out.println("Please enter your credit score");
        int creditScore = input.nextInt();
        if (loan < 10000) {
            if (creditScore < 600) {
                System.out.println("Your interest rate is %15");
            } else {
                System.out.println("Your interest rate is %10");
            }
        } else {
            if (creditScore < 600) {
                System.out.println("Your interest rate is %12");
            } else {
                System.out.println("Your interest rate is %8");
            }
        }
    }
}
