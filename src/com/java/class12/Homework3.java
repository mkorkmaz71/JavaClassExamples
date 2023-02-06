package com.java.class12;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You are member of Loyalty Program (true/false)");
        boolean memberOfLP = input.nextBoolean();
        System.out.println("Please enter your cost of purchase");
        double costOfPurchase = input.nextDouble();
        double finalCost = finalCostOfPurchase(costOfPurchase, memberOfLP);
        System.out.println("Your final cost of purchase is $" + finalCost);
    }

    public static double finalCostOfPurchase(double costOfPurchase, boolean memberOfLP) {
        if (memberOfLP) {
            return (costOfPurchase - costOfPurchase * 0.10);
        } else {
            return (costOfPurchase);
        }
    }
}
