package com.java.class07;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Delta Air Lines");
        System.out.println("Are you travelling from connecting flight (true/false)?");
        boolean connectingflight = input.nextBoolean();
        if (connectingflight) {
            System.out.println("Enjoy your flight");
        } else {
            System.out.println("Please proceed to the security check");
            System.out.println("Enjoy your flight");
        }
    }
}
