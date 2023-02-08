package com.java.class24;

public class Homework2 {
    public static void main(String[] args) {
//Write a program to find the sum of array elements using for-each loop
//Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//Output: 55
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.print("Sum of the array elements is " + sum);
    }
}
