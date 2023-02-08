package com.java.class23;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
//Program to print the elements of an array present in the odd position
//Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//Output: 65, 24, 85, 65, 85
        int nums[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Numbers are in the odd positions: ");
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
