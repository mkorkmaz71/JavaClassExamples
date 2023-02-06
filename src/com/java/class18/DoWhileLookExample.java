package com.java.class18;

import java.util.Scanner;

public class DoWhileLookExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter a number; ");

            int n = sc.nextInt();
            System.out.println("Square of " + n + " is " + (n * n));
            System.out.println("Would you like to enter more numbers?(yes/no)");
            choice= sc.next();
        } while(choice.equalsIgnoreCase("yes"));
    }
}
