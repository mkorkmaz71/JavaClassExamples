package com.java.class09;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your salary");
        int salary = input.nextInt();
        System.out.println("Enter your total loan");
        int loan = input.nextInt();
        if (age < 18 || salary <= 1000 || loan > 20000) {
            System.out.println("you are not eligible");
        } else if (loan < 5000) {
            if (salary > 10001) {
                System.out.println("Your Credit Card limit will be $50000 without any deduction");
            } else if (salary > 5001 && salary <= 10000) {
                System.out.println("Your Credit Card limit will be $20000 without any deduction");
            } else {
                System.out.println("Your Credit Card limit will be $10000 without any deduction");
            }
        } else if (salary > 10001) {
            System.out.println("Your Credit Card limit will be $25000 with half deduction");
        } else if (salary > 5001 && salary <= 10000) {
            System.out.println("Your Credit Card limit will be $10000 with half deduction");
        } else {
            System.out.println("Your Credit Card limit will be $5000 with half deduction");
        }
    }
}
