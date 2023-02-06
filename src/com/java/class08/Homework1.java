package com.java.class08;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
//Input - 0,  Output - Sunday
//Input - 1,  Output - Monday
//Input - 2,  Output - Tuesday
//Input - 3,  Output - Wednesday
//Input - 4,  Output - Thursday
//Input - 5,  Output - Friday
//Input - 6,  Output - Saturday
//Input - 7,  Output - Invalid Input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number (0-6)");
        int day = input.nextInt();
        if (day == 0 ) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("You entered wrong number, should be 0-6");
        }
    }
}
