package com.java.class20;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Write a program to print the sum of each digit from the given number
//Example1
//Input - 3521
//Output - 11
//Example2
//Input - 5390
//Output - 17
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 0, sum = 0;
        while (num > 0) {
            i = num % 10;
            sum=sum+i;
            num = num / 10;
        }System.out.print(sum);
    }
}