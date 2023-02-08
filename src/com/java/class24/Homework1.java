package com.java.class24;

public class Homework1 {
    public static void main(String[] args) {
/*        Write a program to get two 2D arrays from the user and print the sum of it
        Input:
        Array 1
        1 1 1
        2 2 2
        3 3 3
        Array 2
        4 4 4
        2 2 2
        1 1 1
        Output:
        5 5 5
        4 4 4
        4 4 4
 */
        int nums1[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int nums2[][] = {{4, 4, 4}, {2, 2, 2}, {1, 1, 1}};
        int nums3[][] = new int[3][3];
        System.out.println("Sum of two 2D array elements is ");
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                nums3[i][j] = nums1[i][j] + nums2[i][j];
                System.out.print(nums3[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
