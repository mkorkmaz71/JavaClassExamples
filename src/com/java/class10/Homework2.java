package com.java.class10;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter weight of your item in lbs");
        double weight = input.nextDouble();
        System.out.println("Please enter shipping country");
        String country = input.next();
        if (weight < 2 && (country.equalsIgnoreCase("United States") || country.equalsIgnoreCase("US"))) {
            System.out.println("Your shipping cost is $5");
        } else if (weight >= 2 && (country.equalsIgnoreCase("United States") || country.equalsIgnoreCase("US"))) {
            double cost = 0.00;
            cost = weight * 0.5;
            System.out.println("Your shipping cost is $" + cost);
        } else {
            double cost = 0.00;
            cost = weight * 1.5;
            System.out.println("Your shipping cost is $" + cost);
        }
    }
}

