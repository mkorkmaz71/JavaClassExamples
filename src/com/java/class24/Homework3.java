package com.java.class24;

public class Homework3 {
    public static void main(String[] args) {
//Program to print the sum of the smallest and greatest number from the array using for-each loop
//Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
//Output: 124 (100 + 24)
        int nums[] = {45, 65, 85, 24, 45, 85, 34, 65, 100};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Greatest is "+max);
        System.out.println("Smallest is "+min);
        System.out.print("Sum of greatest and smallest is " + (min + max));
    }
}
