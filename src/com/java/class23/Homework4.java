package com.java.class23;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//Write a program to sort array elements in ascending order
//Input: 5 2 8 7 1
//Output: 1 2 5 7 8
        int nums[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Numbers are in ascending order: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
