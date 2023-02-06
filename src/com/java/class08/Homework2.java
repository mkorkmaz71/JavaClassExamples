package com.java.class08;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Beverly Hills");
        System.out.println("Are you traveling first time here(true/false)?");
        boolean firsttravel = input.nextBoolean();
        if (firsttravel) {
            System.out.println("Enjoy your stay");
        } else {
            System.out.println("You have got a 10% discount on your stay");
            System.out.println("Enjoy your stay");
        }
    }
}
