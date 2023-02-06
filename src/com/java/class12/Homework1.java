package com.java.class12;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meters");
        double heightInMeters = input.nextDouble();
        int result = (int) heightInFeet(heightInMeters);
        double result1 = heightInInches(heightInMeters);
        System.out.println("Your height is " + result + " feet " + result1 + " inches.");
    }

    public static double heightInFeet(double heightInMeters) {
        int height=(int) (heightInMeters/0.3048);
        return height;
    }

    public static double heightInInches(double heightInMeters) {
        double inches=(heightInMeters/0.3048-(int)(heightInMeters/0.3048))*12;
        return inches;
    }
}
