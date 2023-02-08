package com.java.class23;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//Write a program to find the duplicate elements from the array (The element should not be repeated in the output ) - Brainstorm to find the logic
//Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//Output: 45, 65, 85
        int nums[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Duplicate Numbers Are: ");
        int dupl[] = new int[10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dupl[j] = nums[j];
                    for (int k = j + 1; k < nums.length; k++) {
                        if (dupl[j] == nums[k]) {
                            dupl[j] = 0;
                            dupl[k] = nums[k];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < dupl.length; i++) {
            if (dupl[i] != 0) {
                System.out.println(dupl[i] + " ");
            }
        }
    }
}
