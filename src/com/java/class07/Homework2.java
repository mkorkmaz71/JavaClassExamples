package com.java.class07;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first positive integer number");
        int num1 = input.nextInt();
        System.out.println("Please enter second positive integer number");
        int num2 = input.nextInt();
        System.out.println("Please enter third positive integer number");
        int num3 = input.nextInt();
        int average= (num1+num2+num3)/3;
        System.out.println("Average of your numbers are "+average);
    }
}
