package com.java.class24;

public class Homework4 {
    public static void main(String[] args) {
//Write a program to sort array elements in ascending order using for-each loop
//Input: 5 2 8 7 1
//Output: 1 2 5 7 8
        int nums[] = {5, 2, 8, 7, 1};
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
        for (int num : nums) {
            System.out.print(num + "  ");
        }
    }
}
