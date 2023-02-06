package com.java.class19;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Write a program to count the number of divisors of the given numbers
        //For example - Number 6 has 4 divisors & 12 has 6 divisors
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
