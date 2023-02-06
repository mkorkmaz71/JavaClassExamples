package com.java.class11;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the name of today:");
        String day = input.next();
        switch (day) {
            case "monday":
                System.out.println("You have 5 days to the weekend");
                break;
            case "tuesday":
                System.out.println("You have 4 days to the weekend");
                break;
            case "wednesday":
                System.out.println("You have 3 days to the weekend");
                break;
            case "thursday":
                System.out.println("You have 2 days to the weekend");
                break;
            case "friday":
                System.out.println("You have 1 day to the weekend");
                break;
            case "saturday":
            case "sunday":
                System.out.println("You are enjoying the weekend");
                break;
            default:
                System.out.println("Wrong input! Please try again.");
        }
    }
}
