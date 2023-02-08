package com.java.class10;

import java.util.Scanner;

public class NestedIfStatementRecap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose one of them");
        System.out.println("1. com.java.class01.Main Course");
        System.out.println("2. Appetizer");
        System.out.println("3. Drinks");
        String choice1 = input.next();
        if (choice1.equalsIgnoreCase("main course") || choice1.equals("1")) {
            System.out.println("Choose one of them");
            System.out.println("1. Lagman");
            System.out.println("2. NewYork Ribeye Steak");
            String choice2 = input.next();
            if (choice2.equalsIgnoreCase("lagman") || choice2.equals("1")) {
                System.out.println("Lagman Ingredients");
            } else if (choice2.equalsIgnoreCase("NewYork Ribeye Steak") || choice2.equals("2")) {
                System.out.println("NewYork Ribeye Steak Ingredients");
            } else {
                System.out.println("Invalid com.java.class01.Main Course Choice");
            }
        } else if (choice1.equalsIgnoreCase("appetizer") || choice1.equals("2")) {
            System.out.println("Choose one of them");
            System.out.println("1. Spring Rolls");
            System.out.println("2. Egg Rolls");
            String choice2 = input.next();
            if (choice2.equalsIgnoreCase("spring rolls") || choice2.equals("1")) {
                System.out.println("Spring Rolls Ingredients");
            } else if (choice2.equalsIgnoreCase("egg rolls") || choice2.equals("2")) {
                System.out.println("Egg Rolls Ingredients");
            } else {
                System.out.println("Invalid Appetizer Choice");
            }
        } else if (choice1.equalsIgnoreCase("drinks") || choice1.equals("3")) {
            System.out.println("Choose one of them");
            System.out.println("1. Orange Juice");
            System.out.println("2. Apple Juice");
            System.out.println("3. Pineapple Juice");
            String choice2 = input.next();
            if (choice2.equalsIgnoreCase("Orange Juice") || choice2.equals("1")) {
                System.out.println("Orange Juice Ingredients");
            } else if (choice2.equalsIgnoreCase("Apple Juice") || choice2.equals("2")) {
                System.out.println("Apple Juice Ingredients");
            } else if (choice2.equalsIgnoreCase("Pineapple Juice") || choice2.equals("3")) {
                System.out.println("Pineapple Juice Ingredients");
            } else {
                System.out.println("Invalid Drinks Choice");
            }
        } else {
            System.out.println("Invalid Choice");
        }
    }
}