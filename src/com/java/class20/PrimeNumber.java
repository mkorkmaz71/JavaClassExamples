package com.java.class20;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int counter = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.print(num + " is a prime number.");
        } else {
            System.out.print(num + " is not a prime number.");
        }
    }
}
